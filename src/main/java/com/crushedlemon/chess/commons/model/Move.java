package com.crushedlemon.chess.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class Move {
    Piece movedPiece;
    Color playerColor;
    String startingSquare;
    String endingSquare;
    String moveName = "";
    Long timestamp;
}
