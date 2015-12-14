package application;

import java.util.ArrayList;


/**
 * Item class has an ArrayList that consists of Sandwiches, Salads, and Potatos
 * 
 * @author Brian Steele 
 */
public class Item extends Order
{
    private ArrayList<String> item;
    /**
     * Constructor for objects of class Item
     */
    public Item()
    {
        this.item = new ArrayList<String>();
    }
    /**
     * Gets index of Item ArrayList
     * 
     * @param the index of the item
     * 
     * @return the index of the item in ArrayList item
     */
    public String get_index(int index)
    {
        return item.get(index);
    }
    /**
     * Gets the size of ArrayList items.
     * 
     * @return the size of items.
     */
    public int size()
    {
    	return item.size();
    }
    /**
     * Adds an item to the ArrayList
     * 
     * @param String value of the item being added
     */
    public void add_item(String newItem)
    {
        item.add(newItem);
    }
    /**
     * Removes an item from the ArrayList
     * 
     * @param index of the item being removed
     */
    public void remove_item(int newItem)
    {
    	item.remove(newItem);
    }
    /**
     * Gets items and returns strings
     * 
     * @returns a string of items (not ArrayList of)
     */
    public String toString()
    {
    	String items = "";
    	for(int i = 0 ; i < this.item.size(); i ++)
    	{
    		items = items + this.item.get(i) + ", ";
    	}
    	return items;
    }
}
