package cardgame;

import java.util.*;

public class Game {

  
  private int turnCount;
  ArrayList<CardDeck> deck;
  ArrayList<Player> players;


  public Game(CardDeck deck) {
    this.deck = new ArrayList<CardDeck>();
    this.turnCount = 0;
    this.players = new ArrayList<Player>();
  }

  public void addPlayer(Player player){
    players.add(player);

  }

  public boolean nextTurn(){
    int result = 
    // cardDeck.shuffle();
    this.turnCount++;
    return result > 2;
  }

  public int getTurnCount(){
    return this.turnCount;
  }
}