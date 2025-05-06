package com.crushedlemon.chess.commons.model;

public enum Piece {
    // No piece is indicated by X
    X,
    // Uppercase pieces are white pieces
    K,
    Q,
    R,
    B,
    N,
    P,
    // Lowercase pieces are black pieces
    k,
    q,
    r,
    b,
    n,
    p;

    public int getEpStartingRank() {
        if(P.equals(this)) {
            return 2;
        }
        if(p.equals(this)) {
            return 7;
        }
        return 0;
    }

    public int getEpEndingRank() {
        if(P.equals(this)) {
            return 4;
        }
        if(p.equals(this)) {
            return 5;
        }
        return 0;
    }

    public int getEpResultingRank() {
        if(P.equals(this)) {
            return 3;
        }
        if(p.equals(this)) {
            return 6;
        }
        return 0;
    }
}
