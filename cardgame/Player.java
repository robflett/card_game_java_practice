package cardgame;


import java.util.*;


public class Player{

  String name;
  private ArrayList<Card> hand;
  private int cardsInHand = 1;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<Card>();
  }

  public showHand(){
    System.out.println(hand);
  }

  public void addCard(Card card) {
    hand.add(card);
}

  public int countCard() {
    return hand.size();
}


}