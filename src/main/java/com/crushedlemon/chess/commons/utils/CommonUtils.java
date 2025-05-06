package com.crushedlemon.chess.commons.utils;

import com.crushedlemon.chess.commons.model.Piece;

public class CommonUtils {

    public static Piece getPieceFromCharacter(Character data) {
        for (Piece p : Piece.values()) {
            if (p.toString().charAt(0) == data) {
                return p;
            }
        }
        return Piece.X;
    }

    public static Character getCharacterFromPiece(Piece piece) {
        return piece.toString().charAt(0);
    }
}
