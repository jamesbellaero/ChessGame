package board;

/**
 * Created by James on 8/24/2017.
 */
public class Square {
    int x,y;
    public Square(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setSquare(Square other){

    }
}
