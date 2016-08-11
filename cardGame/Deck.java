package cardGame;
import java.util.*;

public class Deck {


  public ArrayList<Card> cards;

  public Deck(ArrayList<Card> cards) {
    this.cards = cards;
}

  public boolean isEmpty(){
    if(cards.size() == 0) {
      return true;
    } else {
      return false;
    }

  }

  public Card createCard(){
    Card card1 = new Card(SuitType.DIAMONDS, RankType.J);
    return card1;
  }

  public void createDeck(){
    // Card card1 = new Card(SuitType.DIAMONDS, RankType.J);
    // Card card2 = new Card(SuitType.CLUBS, RankType.Q);
    // Card card3 = new Card(SuitType.HEARTS, RankType.K);
    int count = 0;
    for (SuitType suit : SuitType.values()) {
       for (RankType rank : RankType.values()) {
           if (count < 52) {
               cards.add(new Card(suit, rank));
           }
       }
    }
  }

  public ArrayList<Card> getDeck(){
    return this.cards;
  }

  public void shuffle(){
    Collections.shuffle(cards);
  }


}