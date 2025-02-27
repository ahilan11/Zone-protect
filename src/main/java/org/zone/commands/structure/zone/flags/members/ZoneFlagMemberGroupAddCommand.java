package org.zone.commands.structure.zone.flags.members;

import net.kyori.adventure.identity.Identity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.entity.living.player.server.ServerPlayer;
import org.spongepowered.api.profile.GameProfile;
import org.zone.commands.system.ArgumentCommand;
import org.zone.commands.system.CommandArgument;
import org.zone.commands.system.NotEnoughArgumentsException;
import org.zone.commands.system.arguments.operation.ExactArgument;
import org.zone.commands.system.arguments.source.UserArgument;
import org.zone.commands.system.arguments.zone.ZoneArgument;
import org.zone.commands.system.arguments.zone.ZoneGroupArgument;
import org.zone.commands.system.context.CommandContext;
import org.zone.region.Zone;
import org.zone.region.group.DefaultGroups;
import org.zone.region.group.Group;
import org.zone.region.group.key.GroupKeys;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ZoneFlagMemberGroupAddCommand implements ArgumentCommand {

    public static final ZoneArgument ZONE = new ZoneArgument("zoneId",
            new ZoneArgument.ZoneArgumentPropertiesBuilder().setLevel(GroupKeys.OWNER));
    public static final ZoneGroupArgument GROUP = new ZoneGroupArgument("groupId", ZONE);
    public static final UserArgument USER = new UserArgument("user");

    @Override
    public List<CommandArgument<?>> getArguments() {
        return Arrays.asList(
                new ExactArgument("zone"),
                new ExactArgument("member"),
                ZONE,
                new ExactArgument("set", false, "set", "change", "apply", "add"),
                USER,
                GROUP);
    }

    @Override
    public Component getDescription() {
        return Component.text("Add a member to a group");
    }

    @Override
    public Optional<String> getPermissionNode() {
        return Optional.empty();
    }

    @Override
    public CommandResult run(CommandContext commandContext, String... args) throws NotEnoughArgumentsException {
        Zone zone = commandContext.getArgument(this, ZONE);
        Group group = commandContext.getArgument(this, GROUP);
        GameProfile profile = commandContext.getArgument(this, USER);

        this.addToGroup(commandContext, zone, group, profile);
        return CommandResult.success();
    }

    private void addToGroup(CommandContext context, Zone zone, Group group, GameProfile profile) {
        Group previous = zone.getMembers().getGroup(profile.uniqueId());
        if (!previous.equals(DefaultGroups.VISITOR)) {
            zone.getMembers().removeMember(profile.uniqueId());
        }
        context.getCause().sendMessage(Identity.nil(),
                Component.text("Moved " + profile.name() + " from " + previous.getName() + " to " + group.getName()));
        if (Sponge.isServerAvailable()) {
            Optional<ServerPlayer> opPlayer =
                    Sponge
                            .server()
                            .onlinePlayers()
                            .stream()
                            .filter(p -> p.uniqueId().equals(profile.uuid()))
                            .findAny();
            opPlayer.ifPresent(player ->
                    player.sendMessage(Identity.nil(),
                            Component.text("You have been moved in '" + zone.getName() + "' from '" + previous.getName() + "' to '" + group.getName() +
                                    "'")));
        }

        zone.getMembers().addMember(group, profile.uniqueId());
        try {
            zone.save();
        } catch (IOException e) {
            context.getCause().sendMessage(Identity.nil(), Component.text("Could not save zone. Console log will show" +
                    " more " +
                    "info on " +
                    "why").color(NamedTextColor.RED));
        }
    }
}
