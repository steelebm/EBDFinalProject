package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * Class that contains the salads at East Bay Deli
 * 
 */
public class Salad extends Item
{
    private ArrayList<String> salad;
    
    /**
     * Constructor for objects of class Salad
     */
    public Salad()
    {
    	this.salad = new ArrayList<String>();
    }
    /**
     * Gets salad from index
     * 
     * @param the index salad that we are looking for
     * 
     * @return the salad at int index
     */
    public String get_index(int index)
    {
        return salad.get(index);
    }
    /**
     * Gets size of the salad ArrayList
     * 
     * @return the size of the salad ArrayList
     */
    public int size()
    {
    	return salad.size();
    }
    /**
     * Add a salad to the ArrayList
     * 
     * @param the String of the salad being added
     */
    public void add_salad(String newSalad)
    {
        salad.add(newSalad);
    }
    /**
     * Removes a salad from the ArrayList.
     * 
     * @param the String of the salad being removed
     */
    public void remove_salad(String newSalad)
    {
    	salad.remove(newSalad);
    }
    /**
     * Reads in from a file, the list of the salads on the menu.
     * 
     * @throws FileNotFoundException if the file is not in the designated directory.
     */
    public void addSalads() throws FileNotFoundException
    {
    	Scanner s = new Scanner(new File("/Users/briansteele/Documents/workspace/EBD/src/application/salad.txt"));
		while (s.hasNext())
		{
		    salad.add(s.next());
		}
		s.close();
    }
}

