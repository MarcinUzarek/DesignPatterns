package visitor_pattern.visitor_example.activity;

import lombok.Getter;
import visitor_pattern.visitor_example.visitor.Visitor;

@Getter
public class Squash implements Activity{

    private int minutesPlayed;

    public Squash(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
