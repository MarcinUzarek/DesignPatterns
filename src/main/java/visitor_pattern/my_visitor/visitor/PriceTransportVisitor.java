package visitor_pattern.my_visitor.visitor;

import visitor_pattern.my_visitor.object.Animal;
import visitor_pattern.my_visitor.object.Person;
import visitor_pattern.my_visitor.object.Shipment;

public class PriceTransportVisitor implements TransportVisitor{
    @Override
    public void visit(Animal animal) {
        System.out.println("Cena za km: zwierzecia " + (animal.getWeight()*0.2));
    }

    @Override
    public void visit(Person person) {
        if (person.isRegularCustomer()) {
            System.out.println("Cena za km czlowieka: 3");
        } else {
            System.out.println("Cena za km czlowieka: 6");
        }
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;
        if (shipment.isLarge()) {
            price *= 3;
        }
        System.out.println("Cena za km paczki to: " + price);
    }
}
