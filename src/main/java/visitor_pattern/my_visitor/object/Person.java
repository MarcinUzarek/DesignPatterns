package visitor_pattern.my_visitor.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import visitor_pattern.my_visitor.visitor.NameTransportVisitor;
import visitor_pattern.my_visitor.visitor.PriceTransportVisitor;

@AllArgsConstructor
@Getter
public class Person implements Transportable {

    private String firstName;
    private String lastName;
    private boolean isRegularCustomer;

    @Override
    public void accept(PriceTransportVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void accept(NameTransportVisitor visitor) {
        visitor.visit(this);
    }
}
