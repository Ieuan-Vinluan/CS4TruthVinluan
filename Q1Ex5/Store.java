package StoreSimulator;

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
	  this.itemList = new ArrayList<>();
	  
    // add 'this' store to storeList
	  Store.storeList.add(this);
  }

  public String getName(){
	  return name;
  }
  public double getEarnings(){
	  return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get StoreSimulator.Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
	  if (index < itemList.size()) {
		  earnings += itemList.get(index).getCost();
		  System.out.printf("\n%s was sold for %f.\n", itemList.get(index).getName(), itemList.get(index).getCost());
	  } else {
		  System.out.printf("\nThere are only %d items in the store.\n", itemList.size());
	  }
  }
  public void sellItem(String name){
    // check if StoreSimulator.Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get StoreSimulator.Item from itemList and add its cost to getEarnings
    // print statement indicating the sale
	  int index = 0;
	  for (Item i : itemList) {
		  if (i.getName().equals(name)) {
			  earnings += i.getCost();
			  System.out.printf("\n%s was sold for %f.\n", i.getName(), i.getCost());
		  } else {
			  index += 1;
		  }
	  }
	  if (index == itemList.size()) System.out.printf("\nThis store does not sell %s.\n", name);
  }
  public void sellItem(Item i){
    // check if StoreSimulator.Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get StoreSimulator.Item i from itemList and add its cost to getEarnings
    // print statement indicating the sale
	  if (itemList.contains(i)) {
		  earnings += i.getCost();
		  System.out.printf("\n%s was sold for %f.\n", i.getName(), i.getCost());
	  } else {
		  System.out.printf("\nThis store does not sell %s.\n", i.getName());
	  }
  }
  public void addItem(Item i){
    // add StoreSimulator.Item i to store's itemList
	  itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
	  System.out.printf("\nItems of type %s:\n", type);
	  for (Item i : itemList) {
		  if (i.getType().equals(type)) {
			  System.out.println(i.getName());
		  }
	  }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
	  System.out.printf("\nItems with a cost <= %f:\n", maxCost);
	  for (Item i : itemList) {
		  if (i.getCost() <= maxCost) System.out.println(i.getName());
	  }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
	  System.out.printf("\nItems with a cost >= %f:\n", minCost);
	  for (Item i : itemList) {
		  if (i.getCost() >= minCost) System.out.println(i.getName());
	  }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'StoreSimulator.Store.java'
	  System.out.println("\nStores and Earnings");
	  for (Store s : storeList) System.out.printf("\n%s: %f", s.getName(), s.getEarnings());
  }
}
