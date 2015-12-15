package application;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class Main2 extends Application
{
	@FXML ImageView logoPic;
	@FXML Button continueButton;
	Stage stage;
	
	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		try {
			Parent root = FXMLLoader.load(getClass().getResource("realArbitrary.fxml"));
			Scene scene = new Scene(root);//,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void initialize(java.net.URL location, java.util.ResourceBundle resources)
	{
		logoPic.setVisible(true);
	}
	
	@FXML
	private void handleExit(ActionEvent event)
	{
		Platform.exit();
	}
	
	
    public static void main(String[] args) throws IOException
    {
		launch(args);
		

    	Potato potato = new Potato();
    	potato.addPotatos();
    	Salad salad = new Salad();
    	salad.addSalads();
    	Sandwich sandwich = new Sandwich();
    	sandwich.addSandwich();
    	Item items = new Item();
    	Order order = new Order();
    	    
        ArrayList<String> mainMenu = new ArrayList<String>();
        mainMenu.add("Sandwich"); //0
        mainMenu.add("Salad"); //1
        mainMenu.add("Potato"); //2
        mainMenu.add("All done!"); //3
        mainMenu.add("Remove an item"); //4
        
        System.out.println("Enter customer name: ");
        Scanner input5 = new Scanner(System.in);
        String customerName = input5.nextLine();
    	Customer customer = new Customer();
    	System.out.println(customerName + " how many orders do you have?");
    	Scanner input6 = new Scanner(System.in);
    	int numberOfOrders = input6.nextInt();
    	
    	//Menu for orders
    	int orderCount = 0;
    	while(orderCount < numberOfOrders)
    	{
	    		
	    	
	        
	        int breakCounter = 0;
	        while(breakCounter == 0)
	        {
	        	System.out.println("Order some items!");
	            System.out.println();
	            System.out.println("What would you like to see?");
	            for(int i = 0; i < mainMenu.size(); i++)
	            {
	                System.out.println(i+1 + ". " + mainMenu.get(i));
	            }
	            Scanner input1 = new Scanner(System.in);
	            int choice1 = input1.nextInt();
	            if(choice1 < 1 || choice1 > 5)
	            {
	            	throw new IllegalArgumentException("Invalid number, pick from 1-4");
	            }
	            if(choice1 == 1)
	            {
	                System.out.println();
	                for(int i = 0; i<sandwich.size();i++)
	                {
	                    System.out.println(i+1 + ". " + sandwich.get_index(i));
	                }
	                int sandwichBreaker = 0;
	                while (sandwichBreaker == 0)
	                {
	                    System.out.println();
	                    System.out.println("Which sandwich would you like?");
	                    Scanner input2 = new Scanner(System.in);
	                    int choice2 = input2.nextInt();
	                    if (choice2 <= sandwich.size())
	                    {
	                        items.add_item(sandwich.get_index(choice2 - 1));
	                        sandwichBreaker ++;
	                    }
	                    else
	                    {
	                        System.out.println();
	                        System.out.println("Error. Invalid number, try again.");
	                        System.out.println();
	                    }
	                }
	                System.out.println();
	                System.out.println("Your updated list of items:");
	                System.out.println(items);
	            }
	            else if(choice1 == 2)
	            {
	                System.out.println();
	                for(int i = 0; i<salad.size();i++)
	                {
	                    System.out.println(i+1 + ". " + salad.get_index(i));
	                }
	                
	                int saladBreaker = 0;
	                while (saladBreaker == 0)
	                {
	                    System.out.println();
	                    System.out.println("Which salad would you like?");
	                    Scanner input3 = new Scanner(System.in);
	                    int choice3 = input3.nextInt();
	                    if (choice3 <= salad.size())
	                    {
	                        items.add_item(salad.get_index(choice3 - 1));
	                        saladBreaker ++;
	                    }
	                    else
	                    {
	                        System.out.println();
	                        System.out.println("Error. Invalid number, try again.");
	                        System.out.println();
	                    }
	                }
	                System.out.println();
	                System.out.println("Your updated list of items:");
	                System.out.println(items);
	            }
	            else if(choice1 == 3)
	            {
	                System.out.println();
	                for(int i = 0; i<potato.size();i++)
	                {
	                    System.out.println(i+1 + ". " + potato.get_index(i));
	                }
	                
	                int potatoBreaker = 0;
	                while (potatoBreaker == 0)
	                {
	                    System.out.println();
	                    System.out.println("Which potato would you like?");
	                    Scanner input4 = new Scanner(System.in);
	                    int choice4 = input4.nextInt();
	                    if(choice4 < 1 || choice1 > potato.size())
	    	            {
	    	            	throw new IllegalArgumentException("Invalid number, pick from 1-" + potato.size());
	    	            }
	                    if (choice4 <= potato.size())
	                    {
	                        items.add_item(potato.get_index(choice4 - 1));
	                        potatoBreaker ++;
	                    }
	                    else
	                    {
	                        System.out.println();
	                        System.out.println("Error. Invalid number, try again.");
	                        System.out.println();
	                    }
	                }
	                System.out.println();
	                System.out.println("Your updated list of items:");
	                System.out.println(items);
	            }
	            
	            else if(choice1 == 4)
	            {
	                breakCounter++;
	            }
	            
	            else if(choice1 == 5)
	            {
	                System.out.println();
	                System.out.println("This is what you have so far:");
	                for(int i = 0; i<items.size();i++)
	                {
	                    System.out.println(i+1 + ". " + items.get_index(i));
	                }
	                int removeBreaker = 0;
	                while (removeBreaker == 0)
	                {
	                    System.out.println("What would you like to remove?");
	                    Scanner input7 = new Scanner(System.in);
	                    int choice7 = input7.nextInt();
	                    if(choice7 < 1 || choice1 > items.size())
	    	            {
	    	            	throw new IllegalArgumentException("Invalid number, pick from 1" + items.size());
	    	            }
	                    if (choice7 <= items.size())
	                    {
	                        items.remove_item(choice7 - 1);
	                        removeBreaker ++;
	                    }
	                    else
	                    {
	                        System.out.println();
	                        System.out.println("Error. Invalid number, try again.");
	                        System.out.println();
	                    }
	                }
	                
	                System.out.println();
	                System.out.println("Your updated list of items:");
	                System.out.println(items);
	                
	                
	            }
	        }
	        
    
	        System.out.println();
	        System.out.println("Your completed order:");
	        System.out.println(items);
	        order.add_order(items);
	        orderCount ++;
    		
    	}
    	customer.add_order(order);
    	System.out.println();
    	System.out.println(customerName + ": Your completed orders:");
    	System.out.println(customer.toString());
    	FileWriter outFile = new FileWriter("/Users/briansteele/Documents/workspace/EBD/src/application/customerorders.txt);
        BufferedWriter outStream = new BufferedWriter(outFile);
        for (int i = 0; i < order.size(); i++)
            outStream.write(order.get(i) + "\n");   
        outStream.close();
    }
}
