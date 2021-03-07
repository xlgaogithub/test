package pattern.visitor;

import pattern.visitor.creditcard.BronzeCard;
import pattern.visitor.creditcard.GoldCard;
import pattern.visitor.creditcard.PlatinumCard;
import pattern.visitor.creditcard.SilverCard;
import pattern.visitor.offer.GasRebateVisitor;
import pattern.visitor.offer.GroceryRebateVisitor;

public class Runner {
    public static void main(String[] args) {
        GoldCard gold = new GoldCard();
        SilverCard silver = new SilverCard();
        BronzeCard bronze  = new BronzeCard();
        PlatinumCard platinumCard  = new PlatinumCard();

        GasRebateVisitor gasRebateVisitor = new GasRebateVisitor();
        gasRebateVisitor.visitPlatinumCard(platinumCard);
        gasRebateVisitor.visitGoldCard(gold);
        gasRebateVisitor.visitSilverCard(silver);
        gasRebateVisitor.visitBronzeCard(bronze);

        GroceryRebateVisitor groceryRebateVisitor = new GroceryRebateVisitor();
        groceryRebateVisitor.visitPlatinumCard(platinumCard);
        groceryRebateVisitor.visitGoldCard(gold);
        groceryRebateVisitor.visitSilverCard(silver);
        groceryRebateVisitor.visitBronzeCard(bronze);
    }
}
