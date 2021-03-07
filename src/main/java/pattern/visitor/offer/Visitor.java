package pattern.visitor.offer;

import pattern.visitor.creditcard.BronzeCard;
import pattern.visitor.creditcard.GoldCard;
import pattern.visitor.creditcard.PlatinumCard;
import pattern.visitor.creditcard.SilverCard;

public interface Visitor {
    void visitGoldCard(GoldCard goldCard);
    void visitSilverCard(SilverCard silverCard);
    void visitBronzeCard(BronzeCard bronzeCard);
    void visitPlatinumCard(PlatinumCard platinumCard);
}
