package visitor_pattern.visitor_example.activity;

import visitor_pattern.visitor_example.visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);
}
