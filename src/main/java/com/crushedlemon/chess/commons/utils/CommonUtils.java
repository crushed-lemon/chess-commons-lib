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

    public static int toCoordinate(String position) {
        int y = position.charAt(0) - 'a' + 1;
        int x = position.charAt(1) - '0';
        return ((x - 1) * 8) + (y - 1);
    }
}
