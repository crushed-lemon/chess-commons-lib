package com.crushedlemon.chess.commons.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import static com.crushedlemon.chess.commons.utils.CommonUtils.*;

@AllArgsConstructor
public class Board {

    @Getter
    private List<Character> pieces;

    Board() {
        List<Character> pieces = new ArrayList<>();
        for(int i = 0; i < 64; i++) {
            pieces.add('X');
        }
    }

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

    /**
     * Gets a new board after playing a move. The board adjusts its pieces according to the move.
     * @param move The move to be played. Note that there are no validations, the move will be made in the board.
     * @return A modified board with updated pieces.
     */
    public Board getNewBoardByPlayingMove(Move move) {
        Piece movedPiece = move.getMovedPiece();
        String startingSquare = move.getStartingSquare();
        String endingSquare = move.getEndingSquare();

        List<Character> newPieces = new ArrayList<>(List.copyOf(this.pieces));
        newPieces.set(toCoordinate(startingSquare), 'X');
        newPieces.set(toCoordinate(endingSquare), getCharacterFromPiece(movedPiece));

        return new Board(newPieces);
    }
}
