package com.crushedlemon.chess.commons.model;

public enum GameDuration {

    ONE_MINUTE (60),
    THREE_MINUTES (60 * 3),
    FIVE_MINUTES (60 * 5),
    TEN_MINUTES (60 * 10),
    FIFTEEN_MINUTES (60 * 15),
    THIRTY_MINUTES (60 * 30),
    SIXTY_MINUTES (60 * 60),
    NINETY_MINUTES (60 * 90),
    TWO_HOURS (60 * 120);

    private int durationInSeconds;

    GameDuration(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }
}
