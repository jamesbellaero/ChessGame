package board.pieces;

import board.Square;

import java.util.ArrayList;

/**
 * Created by James on 8/24/2017.
 */
public class Queen extends Piece {
    public ArrayList<Square> getMoves(Piece[][] board){
        ArrayList<Square> moves = new ArrayList<>();
        //vertical
        int i = loc.getX();
        for(int j=loc.getY();j<8;j++){
            if(board[i][j]==null){//empty square
                moves.add(new Square(i,j));
            }
            else if(!board[i][j].getColor().equals(c)){//piece of different color
                moves.add(new Square(i,j));
                break;
            }
            else{//same color
                break;
            }
        }
        for(int j=loc.getY();j>=0;j--){
            if(board[i][j]==null){//empty square
                moves.add(new Square(i,j));
            }
            else if(!board[i][j].getColor().equals(c)){//piece of different color
                moves.add(new Square(i,j));
                break;
            }
            else{//same color
                break;
            }
        }
        //horizontal
        int j = loc.getY();
        for(i=loc.getX();i<8;i++){
            if(board[i][j]==null){//empty square
                moves.add(new Square(i,j));
            }
            else if(!board[i][j].getColor().equals(c)){//piece of different color
                moves.add(new Square(i,j));
                break;
            }
            else{//same color
                break;
            }
        }
        for(i=loc.getX();i>=0;i--){
            if(board[i][j]==null){//empty square
                moves.add(new Square(i,j));
            }
            else if(!board[i][j].getColor().equals(c)){//piece of different color
                moves.add(new Square(i,j));
                break;
            }
            else{//same color
                break;
            }
        }
        //diagonal 1
        i = loc.getX();
        j = loc.getY();
        for(int iter=loc.getX();Math.max(i,j)+iter<8;iter++){
            if(board[i+iter][j]==null){//empty square
                moves.add(new Square(i,j));
            }
            else if(!board[i][j].getColor().equals(c)){//piece of different color
                moves.add(new Square(i,j));
                break;
            }
            else{//same color
                break;
            }
        }
        for(int iter=0;Math.max(i,j)-iter>=0;iter--){
            if(board[i][j]==null){//empty square
                moves.add(new Square(i,j));
            }
            else if(!board[i][j].getColor().equals(c)){//piece of different color
                moves.add(new Square(i,j));
                break;
            }
            else{//same color
                break;
            }
        }
        //diagonal 2
        return moves;
    }
}