package com.crushedlemon.chess.commons.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Move {
    Piece movedPiece;
    Color playerColor;
    String startingSquare;
    String endingSquare;
    String moveName = "";
    Long timestamp;
}
