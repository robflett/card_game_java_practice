// package cardgame;

import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import cardgame.*;


public class PlayerTest {

  Player player1;
  CardDeck deck1;
  Card card1;
  Card card2;
  Card card3;

@Before
public void before() {
  player1 = new Player("Player 1");
  deck1 = new CardDeck();
  card1 = new Card(NumberType.TWO, SuitType.SPADES);
  card2 = new Card(NumberType.SEVEN, SuitType.HEARTS);
  card3 = new Card(NumberType.TEN, SuitType.DIAMONDS);
}

@Test
public void canGetNumber(){
  assertEquals(NumberType.TWO, card1.getNumber() );
}

@Test
public void canGetSuit(){
  assertEquals(SuitType.HEARTS, card2.getSuit() );
}


@Test
public void canAddCard(){
  player1.addCard(card1);
  player1.addCard(card2);
  player1.addCard(card3);
  assertEquals(3, player1.countCard() );
}

@Test
public void cardDeckReturnsCards(){
  System.out.println(deck1.returnGameDeck());
  // assertEquals([], );
  }
  
}