package visitor_pattern.my_visitor.visitor;

import visitor_pattern.my_visitor.object.Animal;
import visitor_pattern.my_visitor.object.Person;
import visitor_pattern.my_visitor.object.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);
}
