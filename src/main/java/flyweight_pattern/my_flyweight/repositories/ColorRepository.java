package flyweight_pattern.my_flyweight.repositories;

public class ColorRepository {

    private static final Color white = new Color(0,0,0);
    private static final Color black = new Color(255,255,255);

    public static Color whitePiece(){
        return white;
    }
    public static Color blackPiece(){
        return black;
    }

}
