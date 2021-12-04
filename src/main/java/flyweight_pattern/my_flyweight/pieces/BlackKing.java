package flyweight_pattern.my_flyweight.pieces;

import flyweight_pattern.my_flyweight.abstract_pieces.BlackPiece;
import flyweight_pattern.my_flyweight.abstract_pieces.ChessPiece;
import flyweight_pattern.my_flyweight.repositories.Position;
import flyweight_pattern.my_flyweight.repositories.PositionRepository;

public class BlackKing extends BlackPiece {

    private Position position;


    public BlackKing() {
        this.position = PositionRepository.getBlackKingPosition();
    }

    @Override
    public String toString() {
        return "BlackKing{" +
                "position=" + position +
                '}';
    }
}
