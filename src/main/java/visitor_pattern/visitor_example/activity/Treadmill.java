package visitor_pattern.visitor_example.activity;


import lombok.Getter;
import visitor_pattern.visitor_example.visitor.Visitor;

@Getter
public class Treadmill implements Activity {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
