package flyweight_pattern.my_flyweight.repositories;

public class PieceParameterRepository {

    private final static PieceParameter whiteQueen = new PieceParameter(1, 'D', "Queen");
    private final static PieceParameter blackQueen = new PieceParameter(8, 'D', "Queen");
    private final static PieceParameter whiteKing = new PieceParameter(1, 'E', "King");
    private final static PieceParameter blackKing = new PieceParameter(8, 'E', "King");

    public static PieceParameter getWhiteQueen() {
        return whiteQueen;
    }

    public static PieceParameter getBlackQueen() {
        return blackQueen;
    }

    public static PieceParameter getWhiteKing() {
        return whiteKing;
    }

    public static PieceParameter getBlackKing() {
        return blackKing;
    }
}
