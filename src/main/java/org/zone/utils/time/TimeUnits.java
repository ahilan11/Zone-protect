package org.zone.utils.time;

import org.jetbrains.annotations.NotNull;
import org.zone.utils.time.tick.TickTime;

import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * A enum of units of time that works on minecraft server
 */
public enum TimeUnits {

    TICKS(TickTime.TICK),
    SECONDS(ChronoUnit.SECONDS),
    MINUTES(ChronoUnit.MINUTES),
    HOURS(ChronoUnit.HOURS),
    DAYS(ChronoUnit.DAYS),
    WEEKS(ChronoUnit.WEEKS),
    MONTHS(ChronoUnit.MONTHS),
    YEARS(ChronoUnit.YEARS);

    private final @NotNull TemporalUnit unit;

    TimeUnits(@NotNull TemporalUnit unit) {
        this.unit = unit;
    }

    /**
     * Gets the temporal unit
     *
     * @return the unit of time
     */
    public @NotNull TemporalUnit getUnit() {
        return this.unit;
    }
}
