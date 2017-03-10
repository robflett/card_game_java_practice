package cardgame;


import java.util.*;


public class Player{

  String name;
  ArrayList<CardDeck> hand;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<CardDeck>();
  }


  public void addCard(CardDeck card) {
    hand.add(card);
}

  public void countCard(CardDeck card) {
    return hand.size();
}


}