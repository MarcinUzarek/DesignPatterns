package flyweight_pattern.my_flyweight;

import flyweight_pattern.my_flyweight.abstract_pieces.BlackPiece;
import flyweight_pattern.my_flyweight.abstract_pieces.ChessPiece;
import flyweight_pattern.my_flyweight.abstract_pieces.WhitePiece;
import flyweight_pattern.my_flyweight.pieces.BlackKing;
import flyweight_pattern.my_flyweight.pieces.BlackQueen;
import flyweight_pattern.my_flyweight.pieces.WhiteKing;
import flyweight_pattern.my_flyweight.pieces.WhiteQueen;

public class Main {

    public static void main(String[] args) {

        ChessPiece blackQueen = new BlackQueen();
        WhitePiece whiteKing = new WhiteKing();
        WhitePiece whiteQueen = new WhiteQueen();
        BlackPiece blackKing = new BlackKing();

        System.out.println(blackQueen);
        System.out.println(blackKing);
        System.out.println(whiteKing);
        System.out.println(whiteQueen);
    }
}
