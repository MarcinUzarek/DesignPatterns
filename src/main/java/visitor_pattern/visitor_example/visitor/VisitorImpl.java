package visitor_pattern.visitor_example.visitor;

import visitor_pattern.visitor_example.activity.Squash;
import visitor_pattern.visitor_example.activity.Treadmill;
import visitor_pattern.visitor_example.activity.Weights;
import visitor_pattern.visitor_example.visitor.Visitor;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Calories burned running on treadmill: " + treadmill.getDistance() * 3);
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories burned playing squash: " + squash.getMinutesPlayed() * 20);
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories burned lifting weights: " +  weights.getWeight()* weights.getReps()*0.1);
    }
}
