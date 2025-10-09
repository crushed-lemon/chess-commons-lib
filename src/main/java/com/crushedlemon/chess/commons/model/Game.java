package com.crushedlemon.chess.commons.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Game {
    String gameId;
    GameSettings gameSettings;
    String whitePlayerId;
    String blackPlayerId;
    @Deprecated
    String whiteConnectionId;
    @Deprecated
    String blackConnectionId;
    // 0 for White, 1 for black
    Integer currentPlayer;
    // Start time of the game
    Long startTime;
    // Describes which squares have which pieces
    Board board;
    // Flags store castling rights and en-passant rights
    Integer flags;
    // Currently only classical
    GameType gameType;
    // ONGOING, NOT_STARTED, or ENDED
    GameState gameState;
    // Result is only set if game is ENDED, and is UNKNOWN otherwise
    GameResult gameResult;
    String winnerId;
}
