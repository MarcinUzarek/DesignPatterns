package flyweight_pattern.my_flyweight.repositories;

public class PositionRepository {

    private static final Position whiteQueen = new Position(1, 'D', "Queen");
    private static final Position whiteKing = new Position(1, 'E', "King");
    private static final Position blackQueen = new Position(8, 'D', "Queen");
    private static final Position blackKing = new Position(8, 'E', "King");

    public static Position getWhiteQueenPosition() {
        return whiteQueen;
    }
    public static Position getWhiteKingPosition() {
        return whiteKing;
    }
    public static Position getBlackQueenPosition() {
        return blackQueen;
    }
    public static Position getBlackKingPosition() {
        return blackKing;
    }
}
