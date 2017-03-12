package cardgame;

public class Card{

private NumberType number;
private SuitType suit;

public Card(NumberType number, SuitType suit) {
  this.number = number;
  this.suit = suit;
  }


public NumberType getNumber(){
  return this.number;
}

public void setNumberType(NumberType number){
  this.number = number;
}

public SuitType getSuit(){
  return this.suit;
  // could just return suit
}

public void setSuit(){
  this.suit = suit;
}

public String toString(){
  return number + " of " + suit;
}

}