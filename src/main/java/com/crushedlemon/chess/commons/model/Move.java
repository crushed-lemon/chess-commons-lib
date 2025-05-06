package com.crushedlemon.chess.commons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Move {
    Piece movedPiece;
    Color playerColor;
    String startingSquare;
    String endingSquare;
    String moveName = "";
    Long timestamp;
}
