package BlackJack;

import Player.Player;

public class EndState implements PlayerState{
    
    public void setState(BlackJack game, Player player, BlackJackAction action){
    	game.showPlayers();
    	game.determineWinner(game.players);
        if ( action != BlackJackAction.END) {
        	game.resetPlayers();
        	game.getDeck().shuffleDeck();
        	game.dealCards();
        	game.setPlayerState(new ReadyToPlayState(),player,action);
        }
    }

    public BlackJackAction getState(){
        return BlackJackAction.END;
    }
}
