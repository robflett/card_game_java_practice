import java.util.*;

public class Game {

  
  private int turnCount;
  ArrayList<CardDeck> deck;
  ArrayList<Player> player;


  public Game(CardDeck deck) {
    this.deck = deck;
    this.turnCount = 0;
    this.player = players;
  }

  public void addPlayer(Player player){
    players.add(player);

  }

  public boolean nextTurn(){
    int result = dice.roll();
    this.turnCount++;
    return result > 2;
  }

  public int getTurnCount(){
    return this.turnCount;
  }
}