import static org.junit.Assert.*;
import org.junit.*;
import cardGame.*;
import java.util.*;

public class GameTest {

  Player player;
  ArrayList<Card> cards;
  Deck deck;
  Card card1;

  @Before
  public void before(){
    player1 = new Player("Mary");
    cards = new ArrayList<Card>();
    deck = new Deck(cards);
    card1 = new Card(Q,SuitType.DIAMONDS);
  
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

  @Test
  public void printShuffledDeck(){
    deck.createDeck();
    deck.shuffle();
    ArrayList cards = deck.getDeck();
    for(Object object : cards){
         Card original = (Card) object;
         System.out.println(original.getCard());
       }
  }




}


