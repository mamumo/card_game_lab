import static org.junit.Assert.*;
import org.junit.*;
import cardGame.*;
import java.util.*;

public class GameTest {

  Player player;
  ArrayList<Card> cards;
  Deck deck;

  @Before
  public void before(){
    player = new Player("Mary");
    cards = new ArrayList<Card>();
    deck = new Deck(cards);
  
  }

  @Test 
  public void canGetName(){
    assertEquals("Mary", player.getName());
  }

  @Test 
  public void isDeckEmpty(){
    assertEquals(true, deck.isEmpty());
  }

  // @Test
  // public void canGetSuit(){
  //   assertEquals(SuitType.DIAMONDS, deck.createCard().getSuit());
  // }

  // @Test
  // public void canGetRank(){
  //   assertEquals(RankType.J, deck.createCard().getRank());
  // }

  @Test
  public void canGetRank(){
    deck.createDeck();
    assertEquals(RankType.TWO, deck.getDeck().get(0).getRank());
  }

  @Test
  public void canGetSuit(){
    deck.createDeck();
    assertEquals(SuitType.SPADES, deck.getDeck().get(51).getSuit());
  }
}


