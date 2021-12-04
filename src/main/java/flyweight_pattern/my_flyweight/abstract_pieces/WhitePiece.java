package flyweight_pattern.my_flyweight.abstract_pieces;

import flyweight_pattern.my_flyweight.repositories.Color;
import flyweight_pattern.my_flyweight.repositories.ColorRepository;

public abstract class WhitePiece extends ChessPiece{

    protected Color color;

    public WhitePiece() {
        this.color = ColorRepository.whitePiece();
    }
}
