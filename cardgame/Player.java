package cardgame;


import java.util.*;


public class Player{

  String name;
  private ArrayList<Card> hand;
  // private int cardsInHand = 1;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<Card>();
  }

 

  public void addCard(Card card) {
    hand.add(card);
}

  public String showHand(){
    System.out.println(hand);
}

  public int countCard() {
    return hand.size();
}


  public int compareHands(){
    if(player1.showHand() == player2.showHand()) {
          System.out.println("Both hands are the same");
              return;
          } 
    if(player1.showHand() > player2.showHand() ){
              System.out.println("Player1 wins!!");
        } else {
              System.out.println("Player2 wins!!");
          }
  // the above shoudl work regardless of how many cards are in the hand array
}

}