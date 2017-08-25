package board.pieces;

import java.awt.*;
import java.util.ArrayList;
import board.Square;

/**
 * Created by James on 8/24/2017.
 */
public abstract class Piece {
    Square loc;
    Color c;
    public Piece(){
        c=Color.white;
        loc=new Square(0,0);
    }
    public Piece(Color c, Square loc){
        this.c=c;
        this.loc=loc;
    }
    abstract public ArrayList<Square> getMoves(Piece[][] board);
    public void move(int x, int y){
        loc.setX(x);
        loc.setY(y);
    }
    public void move(Square m){
        loc.setSquare(m);
    }
    public Square getSquare(){
        return loc;
    }
    public Color getColor(){
        return c;
    }
}
