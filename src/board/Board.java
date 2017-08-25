package board;

import board.pieces.Piece;

/**
 * Created by James on 8/24/2017.
 *
 * Contains a matrix of the pieces. Query the board for a list of board.pieces/locations, for a specific square, etc. To move
 * the piece, issue a command returned by the query.
 *
 */
public class Board {
    Piece[][] board;
    public Board(){
        board = new Piece[8][8];
    }
    public Board(int squares){
        board= new Piece[squares][squares];
    }
}
