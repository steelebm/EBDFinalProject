package application;
	
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Main extends Application implements Initializable{
	@FXML Button submitButton;
	@FXML TextField menuTextField;
	@FXML TextArea customerNameArea;
	@FXML TextArea customerOrderArea;
	@FXML TextField customerNameField;
	@FXML TextField customerOrderField;
	@FXML Button customerNameButton;
	@FXML Button customerOrderButton;
	@FXML TextArea textArea;
	@FXML Button exitButton;
	@FXML Button firstSandwichEntry;
	String customerName;
	int numberOfOrders;
	ArrayList<String> mainMenu;
	Potato potato = new Potato();
	//potato.addPotatos();
	Salad salad = new Salad();
	//salad.addSalads();
	Sandwich sandwich = new Sandwich();
	//sandwich.addSandwich();
	Item items = new Item();
	Order order = new Order();
	Customer customer = new Customer();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("arbitrary.fxml"));
			Scene scene = new Scene(root);//,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	private void handleButtonAction(ActionEvent event) throws FileNotFoundException
	{
		//menuTextField
		if(menuTextField.getText().contains("1"))
		{
			sandwich.addSandwich();
			textArea.appendText("\n");
            for(int i = 0; i<sandwich.size();i++)
            {
                textArea.appendText(i+1 + ". " + sandwich.get_index(i) + "\n");
            }
		
			textArea.appendText("\n");
			textArea.appendText("Which sandwich would you like?");
		}	
		else if(menuTextField.getText().contains("2"))
		{
			salad.addSalads();
			textArea.appendText("\n");
			for(int i = 0 ; i<salad.size(); i++)
			{
				textArea.appendText(i+1 + ". " + salad.get_index(i) + "\n");
			}
			textArea.appendText("\n");
			textArea.appendText("Which salad would you like?");
		}
		else if(menuTextField.getText().contains("3"))
		{
			potato.addPotatos();
			textArea.appendText("\n");
			for(int i = 0 ; i < potato.size(); i++)
			{
				textArea.appendText(i+1 + ". " + potato.get_index(i) + "\n");
			}
			textArea.appendText("\n");
			textArea.appendText("Which potato would you like?");
		}
		else if(menuTextField.getText().contains("4"))
		{
			textArea.appendText("\n");
			//all done
		}
		else if(menuTextField.getText().contains("5"))
		{
			textArea.appendText("\n");
			//remove item
		}
		menuTextField.clear();	
		submitButton.setVisible(false);
		firstSandwichEntry.setVisible(true);
	}
	
	@FXML
	private void handleSandwichEntryButtonAction(ActionEvent event)
	{
		int choice2 = Integer.parseInt(menuTextField.getText());
		if (choice2 <= sandwich.size())
        {
            items.add_item(sandwich.get_index(choice2 - 1));
        }  
    }
	
	@FXML
	private void handleCustomerNameButtonAction(ActionEvent event)
	{
		customerName = customerNameField.getText();
		customerNameField.setVisible(false);
		customerNameArea.setVisible(false);
		customerNameButton.setVisible(false);
		customerOrderField.setVisible(true);
		customerOrderArea.setVisible(true);
		customerOrderButton.setVisible(true);
		
	}
	
	@FXML
	private void handleCustomerOrderButtonAction(ActionEvent event)
	{
		int numberOfOrders = Integer.parseInt(customerOrderField.getText());
		customerOrderField.setVisible(false);
		customerOrderArea.setVisible(false);
		customerOrderButton.setVisible(false);
		menuTextField.setVisible(true);
		textArea.setVisible(true);
		submitButton.setVisible(true);
		textArea.appendText(customerName + " enter in your " + numberOfOrders + " order(s):\n");
		textArea.appendText("1. Sandwich\n");
		textArea.appendText("2. Salad\n");
		textArea.appendText("3. Potato\n");
		textArea.appendText("4. All Done!\n");
		textArea.appendText("5. Remove an item.\n");
		
	}
	
	
	@FXML
	private void handleExitButtonAction(ActionEvent event)
	{
		System.exit(0);
	}
	
	public void initialize(java.net.URL location, java.util.ResourceBundle resources)
	{
		//set orders to be invisible
		//name is visible
		//if name is inivisible, ordes is visible
		submitButton.setVisible(false);
		menuTextField.setVisible(false);
		customerOrderArea.setVisible(false);
		customerOrderField.setVisible(false);
		customerOrderButton.setVisible(false);
		textArea.setVisible(false);
	}
	
	public static void main(String[] args) throws FileNotFoundException {

    	
        ArrayList<String> mainMenu = new ArrayList<String>();
        mainMenu.add("Sandwich"); //0
        mainMenu.add("Salad"); //1
        mainMenu.add("Potato"); //2
        mainMenu.add("All done!"); //3
        mainMenu.add("Remove an item"); //4
    	
    	
    	

    	    

        
        
        
		launch(args);
	}
}
