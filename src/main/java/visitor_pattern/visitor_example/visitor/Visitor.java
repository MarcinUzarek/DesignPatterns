package visitor_pattern.visitor_example.visitor;

import visitor_pattern.visitor_example.activity.Squash;
import visitor_pattern.visitor_example.activity.Treadmill;
import visitor_pattern.visitor_example.activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
}
