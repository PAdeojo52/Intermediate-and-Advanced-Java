import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Class: NameStage.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Apr 24, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the NameStage.java
 * 
 *  Purpose: – Creates the side pane in order to add in animals
 */

public class NameStage extends Stage
{

	Animal q;
	public NameStage(AnimalCircle parent)
	{
		
		 /**
	     * Name:  NameStage
	     * 
	     * Creates basic attributes of page
	     * 
	     * @param parent
	     */
		//String regexForNumber = "d[0-9]";

		//sets u pane
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);


		//sets name field
		TextField name = new TextField();
		// Place nodes in the pane
		pane.add(new Label("Name:"), 0, 0);
		pane.add(name, 1, 0);


		//sets up for breed
		TextField breed = new TextField();
		// Place nodes in the pane
		pane.add(new Label("Breed:"), 0, 1);
		pane.add(breed, 1, 1);

		//sets up for age
		TextField animalAge = new TextField();
		// Place nodes in the pane
		pane.add(new Label("Age:"), 0, 2);
		pane.add(animalAge, 1, 2);

		//sets up for num in zoo
		TextField numInZoo = new TextField();
		// Place nodes in the pane
		pane.add(new Label("# in Zoo:"), 0, 3);
		pane.add(numInZoo, 1, 3);

		//sets up button
		Button btAdd = new Button("Add Animal");
		pane.add(btAdd, 1, 4);
		GridPane.setHalignment(btAdd, HPos.RIGHT);

		//sets up animal object to put in



		//sets name var to place in animal object
		
		


		btAdd.setOnAction(e-> 
		{
			String namevar = name.getText();
			//sets up breed to put into animal object
			String breedvar = breed.getText();

			//sets up animalAge object

			String Agevae = animalAge.getText();

			//places num in zoo
			String numInZoovar = numInZoo.getText();

			double doubleAnimalAge = Double.parseDouble(Agevae);
			int integerNumberInZoo = Integer.parseInt(numInZoovar);





			parent.addAName(q = new Animal(namevar,breedvar,doubleAnimalAge,integerNumberInZoo));
			// end pane
			this.close();
		});



		Scene scene = new Scene(pane);
		this.setTitle("Add a Animal"); // Set the stage title
		this.setScene(scene); // Place the scene in the stage
		this.show(); // Display the stage

	}

}
