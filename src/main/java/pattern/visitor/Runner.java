package pattern.visitor;

import pattern.visitor.creditcard.BronzeCard;
import pattern.visitor.creditcard.GoldCard;
import pattern.visitor.creditcard.SilverCard;
import pattern.visitor.offer.GasRebateVisitor;

public class Runner {
    public static void main(String[] args) {
        GoldCard gold = new GoldCard();
        SilverCard silver = new SilverCard();
        BronzeCard bronze  = new BronzeCard();

        GasRebateVisitor gasRebateVisitor = new GasRebateVisitor();
        gasRebateVisitor.visitGoldCard(gold);
        gasRebateVisitor.visitSilverCard(silver);
        gasRebateVisitor.visitBronzeCard(bronze);
    }
}
