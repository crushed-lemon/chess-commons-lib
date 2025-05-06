package com.crushedlemon.chess.commons.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Game {
    String gameId;
    GameSettings gameSettings;
    String whitePlayerId;
    String blackPlayerId;
    String whiteConnectionId;
    String blackConnectionId;
    GameState gameState;
    Long startTime;
    Board board;
    Integer flags;
    GameType gameType;
}
