package visitor_pattern.my_visitor.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import visitor_pattern.my_visitor.visitor.NameTransportVisitor;
import visitor_pattern.my_visitor.visitor.PriceTransportVisitor;

@AllArgsConstructor
@Getter
public class Animal implements Transportable {

    private String kind;
    private int weight;

    @Override
    public void accept(PriceTransportVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void accept(NameTransportVisitor visitor) {
        visitor.visit(this);
    }
}
