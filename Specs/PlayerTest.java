// package cardgame;

import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import cardgame.*;


public class PlayerTest {

  Player player1;
  Player player2;
  CardDeck deck1;
  Card card1;
  Card card2;
  Card card3;

@Before
public void before() {
  player1 = new Player("Player 1");
  player2 = new Player("Player 2");
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
  assertNotSame("[QUEEN of DIAMONDS, SIX of HEARTS, ACE of CLUBS, TEN of SPADES, SEVEN of SPADES, ACE of SPADES, EIGHT of CLUBS, THREE of SPADES, FOUR of HEARTS, EIGHT of SPADES, FOUR of SPADES, KING of SPADES, THREE of CLUBS, FIVE of SPADES, ACE of DIAMONDS, QUEEN of HEARTS, EIGHT of DIAMONDS, KING of CLUBS, TWO of SPADES, JACK of CLUBS, FIVE of HEARTS, FIVE of CLUBS, ACE of HEARTS, SIX of CLUBS, NINE of HEARTS, TWO of DIAMONDS, JACK of HEARTS, TWO of CLUBS, SIX of DIAMONDS, THREE of HEARTS, FIVE of DIAMONDS, FOUR of CLUBS, THREE of DIAMONDS, TWO of HEARTS, TEN of HEARTS, SIX of SPADES, NINE of DIAMONDS, NINE of CLUBS, NINE of SPADES, QUEEN of SPADES, SEVEN of DIAMONDS, TEN of DIAMONDS, KING of HEARTS, TEN of CLUBS, KING of DIAMONDS, EIGHT of HEARTS, FOUR of DIAMONDS, QUEEN of CLUBS, SEVEN of HEARTS, JACK of DIAMONDS, SEVEN of CLUBS, JACK of SPADES]", deck1.returnGameDeck() );
  }

  // @Test
  // public void handHasCards(){
  //   player1.addCard(card3);
    
  //   assertEquals("TEN of DIAMONDS", player1.showHand());
  // }
  
}