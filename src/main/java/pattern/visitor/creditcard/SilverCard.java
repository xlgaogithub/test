package pattern.visitor.creditcard;

import pattern.visitor.offer.Visitor;

public class SilverCard implements CreditCard {
    @Override
    public String cardType() {
        return "Silver";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSilverCard(this);
    }
}
