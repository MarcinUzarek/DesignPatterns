package flyweight_pattern.my_flyweight.pieces;

import flyweight_pattern.my_flyweight.abstract_pieces.BlackPiece;
import flyweight_pattern.my_flyweight.repositories.Color;
import flyweight_pattern.my_flyweight.repositories.Position;
import flyweight_pattern.my_flyweight.repositories.PositionRepository;

public class BlackQueen extends BlackPiece {

    private Position position;
    private Color color;


    public BlackQueen() {
        this.position = PositionRepository.getBlackQueenPosition();
    }

    @Override
    public String toString() {
        return "BlackQueen{" +
                "position=" + position +
                '}';
    }
}
