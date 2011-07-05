package jdominion.factory;

import jdominion.Player;
import jdominion.card.CardMerchant;
import jdominion.state.ActionPhaseState;
import jdominion.state.BuyPhaseState;

/**
 * Created by IntelliJ IDEA.
 * User: jonathan
 * Date: 3/5/11
 * Time: 10:38 PM
 * To change this template use File | Settings | File Templates.
 */
public interface StateFactory  {

    public ActionPhaseState createActionPhaseState(Player currentPlayer, CardMerchant cardMerchant);

    public BuyPhaseState createBuyPhaseState(Player currentPlayer, CardMerchant cardMerchant);
//
//    public FinishedState createFinishedState();

}
