package flyweight_pattern.my_flyweight;

import flyweight_pattern.my_flyweight.abstract_pieces.ChessPiece;
import flyweight_pattern.my_flyweight.pieces.King;
import flyweight_pattern.my_flyweight.pieces.Queen;
import flyweight_pattern.my_flyweight.repositories.Color;

public class Main {

    public static void main(String[] args) {

        ChessPiece blackQueen = new Queen(Color.BLACK);
        ChessPiece whiteQueen = new Queen(Color.WHITE);
        ChessPiece whiteKing = new King(Color.WHITE);
        ChessPiece blackKing = new King(Color.BLACK);

        System.out.println(blackQueen);
        System.out.println(whiteQueen);
        System.out.println(whiteKing);
        System.out.println(blackKing);

    }
}
