package visitor_pattern.my_visitor.visitor;

import visitor_pattern.my_visitor.object.Animal;
import visitor_pattern.my_visitor.object.Person;
import visitor_pattern.my_visitor.object.Shipment;

public class NameTransportVisitor implements TransportVisitor{
    @Override
    public void visit(Animal animal) {
        System.out.println("Transport " + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Transport " + person.getFirstName() + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Transport " + shipment.getPrefix() + shipment.getSerialNumber());
    }
}
