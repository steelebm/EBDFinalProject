package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * Class that contains the favorite sandwiches at East Bay Deli
 * 
 */
public class Sandwich extends Item
{
    private ArrayList<String> sandwich;
    
    /**
     * Constructor for objects of class Sandwich
     */
    public Sandwich()
    {
        this.sandwich = new ArrayList<String>();
    }
    /**
     * Gets sandwich from index
     * 
     * @param int index of the sandwich
     * 
     * @return the sandwich at int index
     */
    public String get_index(int index)
    {
        return sandwich.get(index);
    }
    /**
     * Gets size of the sandwich ArrayList
     * 
     * @return the size of the sandwich ArrayList
     */
    public int size()
    {
    	return sandwich.size();
    }
    /**
     * Adds a sandwich to the ArrayList
     * 
     * @param String of the sandwich being added
     */
    public void add_sandwich(String newSandwich)
    {
        sandwich.add(newSandwich);
    }
    /**
     * Removes a sandwich to the ArrayList
     * 
     * @param the String of the sandwich being removed
     */
    public void remove_sandwich(String newSandwich)
    {
    	sandwich.remove(newSandwich);
    }
    /**
     * Reads in from a file, the list of sandwiches on the menu.
     * 
     * @throws FileNotFoundException if the file is not in the designated directory.
     */
    public void addSandwich() throws FileNotFoundException
    {
    	
    	Scanner s = new Scanner(new File("/Users/briansteele/Documents/workspace/EBD/src/application/sandwich.txt"));
		while (s.hasNext())
		{
		    sandwich.add(s.next());
		}
		s.close();
    }
}
