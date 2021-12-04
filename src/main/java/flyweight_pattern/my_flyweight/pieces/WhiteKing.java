package flyweight_pattern.my_flyweight.pieces;

import flyweight_pattern.my_flyweight.abstract_pieces.WhitePiece;
import flyweight_pattern.my_flyweight.repositories.Position;
import flyweight_pattern.my_flyweight.repositories.PositionRepository;

public class WhiteKing extends WhitePiece {

    private Position position;


    public WhiteKing() {
        this.position = PositionRepository.getWhiteKingPosition();
    }

    @Override
    public String toString() {
        return "WhiteKing{" +
                "position=" + position +
                '}';
    }
}
