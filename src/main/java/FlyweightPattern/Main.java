package FlyweightPattern;

public class Main {
    public static void main(String[] args) {

        ChessPiece whiteQueen = new WhiteQueen("White Queen");
        ChessPiece whitePawn = new WhitePiece("White Piece", "2", "a");

        System.out.println(whitePawn.getColor() == whiteQueen.getColor());
    }
}
