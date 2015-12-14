------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: East Bay Deli Menu (WITH GITHUB!!!)
PURPOSE OF PROJECT: To allow customers to order food from the menu
VERSION or DATE: 0.5
HOW TO START THIS PROJECT: Main2.java
AUTHORS: Brian Steele
USER INSTRUCTIONS: Run Main2.java, it contains the current working version. although it still has bugs

FileIO included in Main2.java, submitted for regrading
UML Scaffolding included as UpdatedUMLDiagram.jpeg, submitted for regrading

File list should include: application.css
			  arbitrary.fxml
			  Main.java
			  Customer.java
			  Item.java
			  Order.java
			  Potato.java
			  Salad.java
			  Sandwich.java
			  Main2.java
			  sandwich.txt
			  potato.txt
			  salad.txt
			  UpdatedUMLDiagram.jpeg
			  realArbitrary.fxml
			  header_ebd_logo copy.jpeg
			  customerorders.txt

My GUI is broken. Main.java is my best try with implementing graphics, the current status of Main.java is starting up, asking for the customer name, and the number of orders, then clears the screen and displays the main menu, the first three main menu items have been coded to display the appropriate ArrayLists associated with them, beyond their appending to the textArea there are no more features that are functional with graphics. I tried but with the deadline I was unable to finish, to compensate I added an additional .fxml file to show an East Bay Deli logo with a button to exit the stage and finish the program via console. I could not get the picture to appear on the stage, but the button that closes the stage and reverts to the console is functional.

This added feature is functional in Main.java, NOT NOT NOT Main2.java. Main2.java is submitted to show how far I got with my original graphics implementation.

sandwich.txt, potato.txt, and salad.txt are text files that the program reads from to populate their pairing ArrayLists.

customerorders.txt is a file that is created when the finished order is written to a file.

In my “functional” Main.java, the program works with the shortcoming of Customer having multiple orders, when taking this route I could not get an ArrayList of ArrayLists to work so right now it is one ArrayList with the Order ArrayList added to it, so duplicate menu items appear when they were not ordered. This is not a bug but a semantics(?) error on my part.

In general:
Sandwich, Potato, and Salad are classes of ArrayLists that are read from a file
	These ArrayLists contain menu items
Items is a class with an ArrayList that is populated by menu items of the customers choice
	One list of items per Order
Order is a class that takes a finished Item ArrayList
Customer is a class that takes however many Orders the customer wants as an ArrayList
The finished customer’s order is then printed at the end of the program.


GitHub repository: https://github.com/steelebm/EBDFinalProject

JavaDocs have been associated with every class besides the Main classes, with every function within.
	There is a FileNotFoundException that is thrown in Sandwich.java, Potato.java, and Salad.java
	There is a try/catch with Main2.java when instantiating the GUI.

Tried my best! I worked on this everyday after work for 2 hours and I could not get the GUI down pat, too many holes in my knowledge of it, but I tried my darnest!!!!



