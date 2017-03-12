package cardgame;

import java.util.*;

public class Game {

  
  private int turnCount;
  // ArrayList<CardDeck> gamedeck;
  ArrayList<Player> players;


  public Game(CardDeck deck) {
    // this.gamedeck = new ArrayList<CardDeck>();
    this.turnCount = 0;
    this.players = new ArrayList<Player>();
  }

  public void addPlayer(Player player){
    players.add(player);

  }

  public boolean nextTurn(){
    int result = 
     // gamedeck.shuffle();
    this.turnCount++;
    return result > 2;
  }

  public int getTurnCount(){
    return this.turnCount;
  }

  // public ArrayList returnGameDeck(){
  //   return gamedeck;
  // }
}