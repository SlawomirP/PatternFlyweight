package FlyweightPattern;

public class ColorRepository {

    static Color white = new Color(0,0,0);
    static Color black = new Color(255,255,255);

    public static Color getWhite(){
        return white;
    }

    public static Color getBlack(){
        return black;
    }
}
