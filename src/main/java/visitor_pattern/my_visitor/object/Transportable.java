package visitor_pattern.my_visitor.object;

import visitor_pattern.my_visitor.visitor.NameTransportVisitor;
import visitor_pattern.my_visitor.visitor.PriceTransportVisitor;

public interface Transportable {

    void accept(PriceTransportVisitor visitor);
    void accept(NameTransportVisitor visitor);
}
