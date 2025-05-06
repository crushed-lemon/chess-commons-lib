package com.crushedlemon.chess.commons.model;

import lombok.AllArgsConstructor;
import java.util.List;

import static com.crushedlemon.chess.commons.utils.CommonUtils.getPieceFromCharacter;

@AllArgsConstructor
public class Board {

    private List<Character> pieces;

    /**
     * @param position : in modern chess notation eg "a2", "c5"
     * @return Piece present at that position
     */
    public Piece getPieceAt(String position) {
        return getPieceAt(position.charAt(0), position.charAt(1) - '0');
    }

    /**
     * @param file : file name [a-h]
     * @param rank : rank number [1-8]
     * @return Piece present at file, rank
     */
    public Piece getPieceAt(Character file, Integer rank) {
        return getPieceAt(file - 'a' + 1, rank);
    }

    /**
     * @param y : 1-indexed y coordinate [1-8]
     * @param x : 1-indexed x coordinate [1-8]
     * @return Piece present at y,x
     */
    public Piece getPieceAt(Integer y, Integer x) {
        int position = ((x - 1) * 8) + (y -1);
        return getPieceFromCharacter(pieces.get(position));
    }
}
