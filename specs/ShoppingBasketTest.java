import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;
import java.util.*;


public class ShoppingBasketTest {

Basket basket;
ArrayList<Item> items;
Item item;
Item item2;



  @Before
  public void before(){
  basket = new Basket("mandy");
  item = new Item("milk", 2 , true);
  item2 = new Item("bread", 2 , true);
  }

  @Test 
  public void canGetDescriptionOfItem(){
    assertEquals("milk", item.getItemDescription());
  }

  @Test 
  public void itemHasBogof(){
    assertEquals(true, item.itemHasBogof());
  }

  @Test 
  public void basketHasName(){
    assertEquals("mandy", basket.getName());
  }

  @Test 
  public void basketHasItems(){
    basket.addToBasket(item);
    basket.addToBasket(item2);
    assertEquals(2, basket.numberOfItemsInBasket());
  }

  @Test 
  public void removeItemFromBasket(){
    basket.addToBasket(item);
    basket.addToBasket(item2);
    basket.removeItemFromBasket(item2);
    assertEquals(1, basket.numberOfItemsInBasket());
  }

  @Test 
  public void clearBasket(){
    basket.addToBasket(item);
    basket.addToBasket(item2);
    basket.emptyBasket();
    assertEquals(0, basket.numberOfItemsInBasket());
  }



 }


