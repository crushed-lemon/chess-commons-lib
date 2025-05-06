package com.crushedlemon.chess.commons.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@JsonDeserialize(builder = Move.MoveBuilder.class)
public class Move {
    Piece movedPiece;
    Color playerColor;
    String startingSquare;
    String endingSquare;
    String moveName;
    Long timestamp;

    @JsonPOJOBuilder(withPrefix = "")
    public static class MoveBuilder {}
}
