package cardgame;

import java.util.*;

public class CardDeck {

  private ArrayList gamedeck;

  public CardDeck (){
    
    this.gamedeck = new ArrayList();
    // setting up a new arraylist to house the enitre deck
    for (int i=0; i<13; i++){

      NumberType number = NumberType.values()[i];

      for (int j=0; j<4; j++){
        Card card = new Card(number, SuitType.values()[j]);
        this.gamedeck.add(card);
      }

      // calling the values method here on the array SuitType will return the values within the SuitType enum - same with the array NumberType

    }



  }

  // public Card deal(){
  //   return gamedeck.remove( 0 );
  // }


  public void shuffle(){
    Collections.shuffle(gamedeck);
  }

  public ArrayList returnGameDeck(){
    return gamedeck;
  }

  

}