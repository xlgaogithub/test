package pattern.visitor.offer;

import pattern.visitor.creditcard.BronzeCard;
import pattern.visitor.creditcard.GoldCard;
import pattern.visitor.creditcard.PlatinumCard;
import pattern.visitor.creditcard.SilverCard;

public class GasRebateVisitor implements Visitor {

    @Override
    public void visitGoldCard(GoldCard goldCard) {
        System.out.println("Gas Cashback rate for " + goldCard.cardType() + " card: 5%");
    }

    @Override
    public void visitSilverCard(SilverCard silverCard) {
        System.out.println("Gas Cashback rate for " + silverCard.cardType() + " card: 2%");
    }

    @Override
    public void visitBronzeCard(BronzeCard bronzeCard) {
        System.out.println("Gas Cashback rate for " + bronzeCard.cardType() + " card: 1%");
    }

    @Override
    public void visitPlatinumCard(PlatinumCard platinumCard) {
        System.out.println("Gas Cashback rate for " + platinumCard.cardType() + " card: 10%");
    }
}
