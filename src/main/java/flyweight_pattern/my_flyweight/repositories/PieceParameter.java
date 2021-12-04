package flyweight_pattern.my_flyweight.repositories;

public class PieceParameter {

    private int numberPosition;
    private char letterPosition;
    private String name;

    public PieceParameter(int numberPosition, char letterPosition, String name) {
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PieceParameter{" +
                "numberPosition=" + numberPosition +
                ", letterPosition=" + letterPosition +
                ", name='" + name + '\'' +
                '}';
    }
}
