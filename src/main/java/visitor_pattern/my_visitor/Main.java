package visitor_pattern.my_visitor;

import visitor_pattern.my_visitor.object.Animal;
import visitor_pattern.my_visitor.object.Person;
import visitor_pattern.my_visitor.object.Shipment;
import visitor_pattern.my_visitor.object.Transportable;
import visitor_pattern.my_visitor.visitor.NameTransportVisitor;
import visitor_pattern.my_visitor.visitor.PriceTransportVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);

        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        transportableList.forEach(name -> name.accept(new NameTransportVisitor()));
        System.out.println("---------------------");
        transportableList.forEach(price -> price.accept(new PriceTransportVisitor()));

    }
}
