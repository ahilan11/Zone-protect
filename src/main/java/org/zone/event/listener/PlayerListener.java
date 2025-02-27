package org.zone.event.listener;

import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleTypes;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.MoveEntityEvent;
import org.spongepowered.api.event.filter.Getter;
import org.spongepowered.math.vector.Vector3d;
import org.spongepowered.math.vector.Vector3i;
import org.zone.ZonePlugin;
import org.zone.region.ZoneBuilder;
import org.zone.region.regions.BoundedRegion;
import org.zone.region.regions.Region;
import org.zone.region.regions.type.PointRegion;

import java.util.Optional;
import java.util.function.Consumer;

public class PlayerListener {

    @Listener
    public void onPlayerRegionCreateMove(MoveEntityEvent event, @Getter("entity") Player player) {
        if (event.originalPosition().toInt().equals(event.destinationPosition().toInt())) {
            return;
        }

        Optional<ZoneBuilder> opRegionBuilder = ZonePlugin
                .getZonesPlugin()
                .getMemoryHolder()
                .getZoneBuilder(player.uniqueId());
        if (opRegionBuilder.isEmpty()) {
            return;
        }
        ZoneBuilder regionBuilder = opRegionBuilder.get();
        Region region = regionBuilder.getRegion();
        if (!(region instanceof PointRegion r)) {
            return;
        }

        r.setPointTwo(event.destinationPosition().toInt());
        runOnOutside(r, (int) (event.destinationPosition().y() + 3), vector -> player.spawnParticles(ParticleEffect
                .builder()
                .velocity(new Vector3d(0, 0, 0))
                .type(ParticleTypes.SMOKE)
                .scale(2.0)
                .build(), vector.toDouble()), regionBuilder.getParentId() != null);

    }

    public static void runOnOutside(BoundedRegion region, int y, Consumer<? super Vector3i> consumer, boolean showHeight) {
        Vector3i min = region.getMin();
        Vector3i max = region.getMax();
        for (int x = min.x(); x <= max.x(); x++) {
            for (int z = min.z(); z <= max.z(); z++) {
                if (min.z() == z) {
                    consumer.accept(new Vector3i(x, y, z));
                }
                if (min.x() == x) {
                    consumer.accept(new Vector3i(x, y, z));
                }
                if (max.z() == z) {
                    consumer.accept(new Vector3i(x, y, z));
                }
                if (max.x() == x) {
                    consumer.accept(new Vector3i(x, y, z));
                }
                if (showHeight) {
                    for (int usingY = min.y(); usingY <= max.y(); usingY++) {
                        if (min.y() == usingY && (min.x() == x || min.z() == z)) {
                            consumer.accept(new Vector3i(x, usingY, z));
                        }
                        if (max.y() == usingY && (max.x() == x || max.z() == z)) {
                            consumer.accept(new Vector3i(x, usingY, z));
                        }
                    }
                }
            }
        }
    }
}
