package visitor_pattern.visitor_example.activity;

import lombok.Getter;
import visitor_pattern.visitor_example.visitor.Visitor;

@Getter
public class Weights implements Activity{

    private int weight;
    private int reps;

    public Weights(int weight, int reps) {
        this.weight = weight;
        this.reps = reps;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
