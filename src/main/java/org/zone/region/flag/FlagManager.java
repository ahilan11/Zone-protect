package org.zone.region.flag;

import org.zone.Identifiable;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class FlagManager {

    private final Collection<FlagType<?>> flags = new TreeSet<>(Comparator.comparing(Identifiable::getId));
    private final DefaultFlagFile defaultFlags = new DefaultFlagFile();

    public FlagManager() {
        this.flags.add(FlagTypes.PREVENT_MONSTER);
        this.flags.add(FlagTypes.MEMBERS);
        this.flags.add(FlagTypes.DOOR_INTERACTION);
        this.flags.add(FlagTypes.BLOCK_BREAK);
    }

    public Collection<FlagType<?>> getRegistered() {
        return Collections.unmodifiableCollection(this.flags);
    }

    public void register(FlagType<?> type) {
        this.flags.add(type);
    }

    public DefaultFlagFile getDefaultFlags() {
        return this.defaultFlags;
    }


}
