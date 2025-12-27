package com.bunker;

/**
 * Centralized constants for game balance and configuration.
 */
public final class BunkerConstants {
    private BunkerConstants() {}

    // Energy System
    public static final int SOLAR_GEN_FE = 40;
    public static final int SOLAR_MAX_FE = 50000;
    public static final int SKY_LIGHT_THRESHOLD = 12;

    // Morale System
    public static final int MORALE_DEATH = -2;
    public static final int MORALE_DARKLESP = -1;
    public static final int MORALE_NO_FOOD = -1;
    public static final int MORALE_LIE_REVEALED = -1;
    public static final int MORALE_MIN = 0;
    public static final int MORALE_MAX = 10;
    public static final int MORALE_CRITICAL_DURATION_TICKS = 600; // 30 seconds
    public static final int MORALE_PHANTOM_COUNT = 3;

    // Vote System
    public static final int VOTE_DURATION_TICKS = 1200; // 60 seconds
    public static final int VOTE_TOKENS_PER_PLAYER = 1;

    // Event System
    public static final int EVENT_INTERVAL_TICKS = 12000; // 1 Minecraft day

    // Baggage System
    public static final int BAGGAGE_MAX_SPACE = 27; // Standard chest size
    public static final int BAGGAGE_WEAKNESS_AMPLIFIER = 1; // Weakness I

    // Bunker System
    public static final int DEFAULT_BUNKER_CAPACITY = 10;
    public static final int DEFAULT_ROUNDS = 5;
}