package cardgame;

public class Card implements CardDeck{

private NumberType number;
private SuitType suit;

public Card(NumberType number, SuitType suit) {
  this.number = number;
  this.suit = suit;
  }


public NumberType getNumber(){
  return this.number;
}

public SuitType getSuit(){
  return this.suit;
}

}