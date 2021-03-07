package pattern.visitor.creditcard;

import pattern.visitor.offer.Visitor;

public class GoldCard implements CreditCard {
    @Override
    public String cardType() {
        return "Gold";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGoldCard(this);
    }
}
