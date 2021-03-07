package pattern.visitor.creditcard;

import pattern.visitor.offer.Visitor;

public class PlatinumCard implements CreditCard {
    @Override
    public String cardType() {
        return "Platinum";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPlatinumCard(this);
    }
}
