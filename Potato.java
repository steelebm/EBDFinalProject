package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * Class that contains the potatoes at East Bay Deli
 * 
 */
public class Potato extends Item
{
    private ArrayList<String> potato;
    
    /**
     * Constructor for objects of class Potato
     */
    public Potato()
    {
        this.potato = new ArrayList<String>();
    }
    /**
     * Gets potato from index
     * 
     * @param the index of the potato we are looking for //starwars
     * 
     * @return the potato at int index
     */
    public String get_index(int index)
    {
        return potato.get(index);
    }
    /**
     * Gets size of the potato ArrayList
     * 
     * @return the size of the potato ArrayList
     */
    public int size()
    {
    	return potato.size();
    }
    /**
     * Adds a potato to the ArrayList
     * 
     * @param String of the potato being added to the ArrayList
     */
    public void add_potato(String newPotato)
    {
        potato.add(newPotato);
    }
    /**
     * Removes a potato from the ArrayList
     * 
     * @param String of the potato being removed.
     */
    public void remove_potato(String newPotato)
    {
    	potato.remove(newPotato);
    }
    /**
     * Reads in from a file, the list of potatoes on the menu.
     * 
     * @throws FileNotFoundException if the file is not in the designated location
     */
    public void addPotatos() throws FileNotFoundException
    {
    	
    	Scanner s = new Scanner(new File("/Users/briansteele/Documents/workspace/fileIOtest/src/application/potato.txt"));
		while (s.hasNext())
		{
		    potato.add(s.next());
		}
		s.close();
    }
}

