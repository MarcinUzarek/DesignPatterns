package flyweight_pattern.my_flyweight.pieces;

import flyweight_pattern.my_flyweight.abstract_pieces.ChessPiece;
import flyweight_pattern.my_flyweight.repositories.Color;
import flyweight_pattern.my_flyweight.repositories.PieceParameter;
import flyweight_pattern.my_flyweight.repositories.PieceParameterRepository;

public class King extends ChessPiece {

    private PieceParameter piece;
    private Color color;

    public King(Color color) {
        this.color = color;
        if (color.equals(Color.BLACK)) {
            this.piece = PieceParameterRepository.getBlackKing();
        }
        if (color.equals(Color.WHITE)) {
            this.piece = PieceParameterRepository.getWhiteKing();
        }
    }

    @Override
    public String toString() {
        return "King{" +
                "piece=" + piece +
                ", color=" + color +
                '}';
    }
}
