package application;

import java.util.ArrayList;

/**
 * Customer class creates an ArrayList from Order class.
 * This class can contain multiple ArrayLists
 * 
 * @author Brian Steele 
 * 
 */
public class Customer
{
    private ArrayList<String> customerOrder;
    /**
     * Constructor for class ArrayList
     */
    public Customer()
    {
        this.customerOrder = new ArrayList<String>();
    }
    /**
     * Gets index of customerOrder ArrayList
     * 
     * @param the index of the order
     * 
     * @return index of customerOrder
     */
    public String get_index(int index)
    {
        return customerOrder.get(index);
    }
    /**
     * Adds an order to the customerOrder ArrayList
     * 
     * @param the Order that is being added to customerOrder
     */
    public void add_order(Order order)
    {
    	for(int j = 0 ; j <= order.size() - 1; j++)
    	{
    		customerOrder.add(order.get(j));
    	}
    }
    /**
     * Removes an order from customerOrder ArrayList
     * 
     * @param String of the order
     */
    public void remove_order(String newCustomerOrder)
    {
    	customerOrder.remove(newCustomerOrder);
    }
    /**
     * Takes customerOrder and converts it to string type.
     * 
     * @return string of customerOrder
     */
    public String toString()
    {
    	String orderList = "";
    	for(int i = 0 ; i < this.customerOrder.size(); i ++)
    	{
    		orderList = orderList + this.customerOrder.get(i) + ", ";
    	}
    	return orderList;
    }
	
}
