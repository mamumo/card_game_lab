package shopping_basket;
import java.util.*;


public class Basket {

  public String name;
  public ArrayList<Item> items;

public Basket(String name) {
  this.name = name;
  this.items = new ArrayList<Item>();

}

public String getName(){
  return this.name;
}

public int numberOfItemsInBasket() {
  return items.size();
}

public void addToBasket(Item item) {
  items.add(item);
}

public void removeItemFromBasket(Item item) {
  items.remove(item);
}

public void emptyBasket() {
   items.clear();
}


}

