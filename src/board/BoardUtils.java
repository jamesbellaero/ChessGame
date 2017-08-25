package board;

/**
 * Created by James on 8/24/2017.
 */
public class BoardUtils {
    public static String getNotation(Square square){
        return ""+((char)(97+square.getY()))+""+(square.getX()+1);
    }
}
