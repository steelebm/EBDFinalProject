package application;

import java.util.ArrayList;


/**
 * Order class has an ArrayList of Items
 * 
 * @author Brian Steele
 */
public class Order
{
    	private ArrayList<String> order;
        /**
         * Constructor for objects of class Order
         */
        public Order()
        {
            this.order = new ArrayList<String>();
        }
        /**
         * Gets index of Order ArrayList
         * 
         * @param the index of the order
         * 
         * @return the index of the order in ArrayList order
         */
        public String get(int index)
        {
            return order.get(index);
        }
        /**
         * Adds an order to the ArrayList
         * 
         * @param items is an Item class Arraylist of items added
         */
        public void add_order(Item items)
        {
        	for(int i = 0 ; i <= items.size() - 1; i ++)
        	{
        		order.add(items.get_index(i));
        	}
        }
        /**
         * Removes an order from the ArrayList
         * 
         * @param String value of customers Order being removed
         */
        public void remove_order(String customerName)
        {
        	order.remove(customerName);
        }
        /**
         * Gets the size of the order
         * 
         * @return the size of the order
         */
        public int size()
        {
        	return order.size();
        }
    }
