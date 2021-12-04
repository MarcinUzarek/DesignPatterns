package flyweight_pattern.my_flyweight.abstract_pieces;

import flyweight_pattern.my_flyweight.repositories.Color;
import flyweight_pattern.my_flyweight.repositories.ColorRepository;
import flyweight_pattern.my_flyweight.repositories.Position;
import flyweight_pattern.my_flyweight.repositories.PositionRepository;

public abstract class BlackPiece extends ChessPiece {

    protected Color color;

    public BlackPiece() {
        this.color = ColorRepository.blackPiece();
    }
}
