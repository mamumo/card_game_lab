package shopping_basket;

public class Item {
// Encapsulation - hiding info from rest of the program so that no changes get made to it.
  private String description;
  private float cost;
  private boolean bogofItem;

  public Item(String description, float cost, boolean bogofItem) {
    this.description = description;
    this.cost = cost;
    this.bogofItem = bogofItem;
  }

  public String getItemDescription() {
    return this.description;
  }

  public void setItemDescription(String newDescription) {
    this.description = newDescription;
  }

  public float getItemCost() {
    return this.cost;
  }

  public void setItemCost(int newCost) {
    this.cost = newCost;
  }

  public boolean itemHasBogof() {
    return this.bogofItem;
  }
  
}