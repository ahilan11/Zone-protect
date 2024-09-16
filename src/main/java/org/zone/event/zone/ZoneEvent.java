package org.zone.event.zone;

import org.jetbrains.annotations.NotNull;
import org.zone.event.ZonesEvent;
import org.zone.region.Zone;

public interface ZoneEvent extends ZonesEvent {

    @NotNull Zone getZone();
}
