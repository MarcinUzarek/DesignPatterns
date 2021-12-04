package flyweight_pattern.my_flyweight.pieces;

import flyweight_pattern.my_flyweight.abstract_pieces.WhitePiece;
import flyweight_pattern.my_flyweight.repositories.Position;
import flyweight_pattern.my_flyweight.repositories.PositionRepository;

public class WhiteQueen extends WhitePiece {

    private Position position;


    public WhiteQueen() {
        this.position = PositionRepository.getWhiteQueenPosition();
    }

    @Override
    public String toString() {
        return "WhiteQueen{" +
                "position=" + position +
                '}';
    }
}
