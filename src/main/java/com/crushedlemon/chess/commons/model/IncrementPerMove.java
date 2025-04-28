package com.crushedlemon.chess.commons.model;

public enum IncrementPerMove {

    ONE_SECOND (1),
    THREE_SECONDS (3),
    FIVE_SECONDS (5),
    TEN_SECONDS (10),
    FIFTEEN_SECONDS (15),
    THIRTY_SECONDS (30);

    int incrementInSeconds;

    IncrementPerMove(int incrementInSeconds) {
        this.incrementInSeconds = incrementInSeconds;
    }

}
