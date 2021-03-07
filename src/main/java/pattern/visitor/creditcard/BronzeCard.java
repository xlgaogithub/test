package pattern.visitor.creditcard;

import pattern.visitor.offer.Visitor;

public class BronzeCard implements CreditCard {
    @Override
    public String cardType() {
        return "Bronze";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBronzeCard(this);
    }
}
