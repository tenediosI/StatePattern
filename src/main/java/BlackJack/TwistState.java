package BlackJack;

import CardGame.Deck;
import Player.Player;

public class TwistState implements PlayerState {

    public static TwistState uniqueInstance = null;
    public static TwistState getInstance(){
        if (uniqueInstance == null){
            uniqueInstance =  new TwistState();
        }
        return uniqueInstance;
    }

    public void setState(BlackJack game, Player player, BlackJackAction action) {
        Deck deck = game.getDeck();
        player.getHand().add(deck.playACard());
        if (game.getScore(player.getHand()) <= game.maxScore) {
        	game.setPlayerState(new ReadyToPlayState(),  player, action);
        }
        else {
        	game.setPlayerState(new EndState(),  player, action);
        }
    }
    public BlackJackAction getState(){
        return BlackJackAction.TWIST;
    }

}
