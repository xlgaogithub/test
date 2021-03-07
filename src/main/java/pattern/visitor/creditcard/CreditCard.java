package pattern.visitor.creditcard;

import pattern.visitor.offer.Visitor;

public interface CreditCard {

    String cardType();

    void accept(Visitor visitor);
}
