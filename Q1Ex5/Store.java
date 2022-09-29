import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
	  this.name = name;
	  this.earnings = 0;
	  
    // Initialize itemList as a new ArrayList
	  this.itemList = new ArrayList<Item>();
	  
    // add 'this' store to storeList
	  storeList.add(this);
  }

  public String getName(){
    return name;
  }
//  public int getEarnings(){
  public double getEarnings() {
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
	  if (index < itemList.size()) {
		  earnings += itemList.get(index).getCost();
		  System.out.printf("\n%s has been sold for %f.", itemList.get(index).getName(), itemList.get(index).getCost());
	  } else {
		  System.out.printf("\nSorry, but there are only %d items in the store.", storeList.size());
	  }
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
	  double originalEarnings = earnings;
	  itemList.forEach((i) -> {
		  if (i.getName().equalsIgnoreCase(name)) {
			  earnings += i.getCost(); // ??
			  System.out.printf("\n%s has been sold for %f.", i.getName(), i.getCost());
		  }
	  });
	  
	  // checks if an item has been sold
	  if (earnings == originalEarnings) {
		  System.out.printf("\nSorry, but this store does not sell %s.", name);
	  }
	  	
//    for (Item item : itemList) {
//    	if (name.equalsIgnoreCase(item.getName())) {
//    		earnings += item.getCost(); // ???
//    		System.out.printf("\n%s has been sold for %d.", item.getName(), item.getCost());
//    	} else {
//    		System.out.printf("\nSorry, but this store does not sell %s.", name);
//    	}
//    }
	  // get Item from itemList and add its cost to getEarnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
	  if (itemList.contains(i)) {
		  earnings += i.getCost(); // ???
		  System.out.printf("\n%s has been sold for %f.", i.getName(), i.getCost());
	  } else {
		  System.out.printf("\nSorry, but this store does not sell %s.", i.getName());
	  }
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to getEarnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
	  itemList.add(i);
    // add Item i to store's itemList
  }
  public void filterType(String type){
	  System.out.println("Type: " + type);
	  for (Item item : itemList) {
		  if (item.getType().equalsIgnoreCase(type)) {
			  System.out.println(item.getName());
		  }
	  }
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
	  System.out.println("\nItems with a cost lower than or equal to " + maxCost + "\n-----------------------------------------------");
	  for (Item item : itemList) {
		  if (item.getCost() <= maxCost) {
			  System.out.println(item.getName());
		  }
	  }
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
	  System.out.println("\nItems with a cost greater than or equal to " + minCost + "\n-----------------------------------------------");
	  for (Item item : itemList) {
		  if (item.getCost() >= minCost) {
			  System.out.println(item.getName());
		  }
	  }
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
	  System.out.println("\n\nStore and Earnings\n-------------------------");
	  for (Store store : storeList) {
		  System.out.printf("%s : %f\n", store.getName(), store.getEarnings());
	  }

  }
}
