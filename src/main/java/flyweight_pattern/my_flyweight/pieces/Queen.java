package flyweight_pattern.my_flyweight.pieces;

import flyweight_pattern.my_flyweight.abstract_pieces.ChessPiece;
import flyweight_pattern.my_flyweight.repositories.Color;
import flyweight_pattern.my_flyweight.repositories.PieceParameter;
import flyweight_pattern.my_flyweight.repositories.PieceParameterRepository;

public class Queen extends ChessPiece {

    private PieceParameter piece;
    private Color color;

    public Queen(Color color) {
        this.color = color;
        if (color.equals(Color.BLACK)) {
            this.piece = PieceParameterRepository.getBlackQueen();
        }
        if (color.equals(Color.WHITE)) {
            this.piece = PieceParameterRepository.getWhiteQueen();
        }
    }

    @Override
    public String toString() {
        return "Queen{" +
                "piece=" + piece +
                ", color=" + color +
                '}';
    }
}
