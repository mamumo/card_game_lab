package cardGame;

public class Card {

  public SuitType suit;
  public RankType rank;

public Card(SuitType suit, RankType rank) {
  this.suit = suit;
  this.rank = rank;
}

public SuitType getSuit(){
  return this.suit;
}

public RankType getRank(){
  return this.rank;
}
}