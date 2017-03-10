// package cardgame;

import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import cardgame.*;


public class PlayerTest {

  Player player;
  CardDeck card1;
  CardDeck card2;
  CardDeck card3;

@Before
public void before() {
  player = new Player("Player 1");
  card1 = new CardDeck(NumberType.TWO, SuitType.SPADES);
  card2 = new CardDeck(NumberType.SEVEN, SuitType.HEARTS);
  card3 = new CardDeck(NumberType.TEN, SuitType.DIAMONDS);
}

@Test
public void canAddCard(){
  player.addCard(card1);
  player.addCard(card2);
  player.addCard(card3);
  asserEquals(3, player.countCard() );
}
  
}