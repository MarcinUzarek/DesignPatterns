package visitor_pattern.visitor_example;

import visitor_pattern.visitor_example.visitor.VisitorImpl;
import visitor_pattern.visitor_example.activity.Activity;
import visitor_pattern.visitor_example.activity.Squash;
import visitor_pattern.visitor_example.activity.Treadmill;
import visitor_pattern.visitor_example.activity.Weights;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        VisitorImpl visitor = new VisitorImpl();

//        treadmill.accept(visitor);
//        squash.accept(visitor);
//        weights.accept(visitor);

        List<Activity> activityList = Arrays.asList(treadmill, squash, weights);

        activityList.forEach(activity -> activity.accept(visitor));
    }
}
