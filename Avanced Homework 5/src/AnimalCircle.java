import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Class: AnimalCircle.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Apr 23, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the AnimalCircle.java
 * 
 *  Purpose: – To create the main GUI to show animals names and their associated 
 *  colors
 */

public class AnimalCircle extends Application
{
	
	

	//To put in main gui
	ObservableList<Animal> obNameList;

	//main hashmap
	HashMap<Animal, Color> animalHashMap = new HashMap<Animal, Color>(20);

	//Sets up my arraylist for my animals
	Set<Animal> animalList = new HashSet<Animal>();

	//This will be used for the pure hash code to be taken
	ArrayList<Integer> hashNumber = new ArrayList<Integer>();
	
	//list of arrays
	Color[]colorArray = {Color.BLUE,Color.RED,Color.GREEN,Color.YELLOW,
			Color.PURPLE,Color.BLACK,Color.BROWN,Color.MAGENTA,Color.BEIGE.brighter()
			,Color.CYAN};
	
	//Set up for name of animal
	List<Animal>animalNames = new ArrayList();

	
	
	ListView<Animal>animalListViewer;
	
	int placerNumber = 0 ;
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		 /**
	     * Name:  start
	     * 
	     * This is the starting point of the GUI
	     *
	     * 
	     * @param primaryStage
	     */
		
		
		
		
		// TODO Auto-generated method stub
		//Colors are placed into Array for use.
		//I couldn't see the beige so i made it brighter
		
		//colorArray[0]= Color.BLUE;




		// open animal.dat for reading

		//creates object outt stream
		ObjectInputStream input = null;
		try
		{//This is gonna read  for the animal.dat file
			input = new ObjectInputStream(new FileInputStream("animal.dat"));
		} catch (IOException e)
		{
			//exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		// now read from the file- get an animal and print it
		try
		{
			while (true)
			{
				//checks animal a input reader
				Animal a = (Animal)input.readObject();
				// Places animals in a list
				//places animal into animal arraylist
				animalList.add(a);


				//I'm editing out for optimization
				/*//This prints out hash code for animal
				System.out.println(Math.abs(a.hashCode()% 10));

				//adds pure hash number to list
				hashNumber.add(a.hashCode());*/

			}

		}
		//Exception caputures
		catch (EOFException e)
		{
			// file ended done reading - do nothing

		}
		catch (IOException e)
		{
			System.out.println("Problem reading from file");
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e)
		{
			System.out.println("Corrupted file - regenerate");
			e.printStackTrace();
		}





		//Creation of my Hash Map



		int index;

		for (Animal element : animalList) 
		{
			//System.out.println(element);
			index = element.hashCode()%9;

			if(index<0)
			{
				index = - index;
			}

			hashNumber.add(index);


			/*animalHashMap.put(element, colorArray[index]);*/


		}

		//System.out.println(hashNumber);

		//constructed to check orgin stats in console

		/*int checkerNumber = 0;
		for(Integer checker : hashNumber)
		{
			System.out.println(animalList.get(checkerNumber));
			System.out.println(hashNumber.get(checkerNumber));
			checkerNumber++;
		}*/

		//plaace into hashmap
		
		for(Animal placer : animalList)
		{
			animalHashMap.put(placer, colorArray[hashNumber.get(placerNumber)]);
			//System.out.println(placer + " " + colorArray[hashNumber.get(placerNumber)]);
			//Key holds animals
			//System.out.println(animalHashMap.keySet());
			//value holds color
			//System.out.println(animalHashMap.values());
			placerNumber++;
		}
		//System.out.println(animalHashMap.keySet());

		// From this point n its GUI construction

	




		//loop names in animal names
		for(Animal element : animalList)
		{
			animalNames.add(element);
		}

		//place in observe
		obNameList = FXCollections.observableArrayList(animalNames);

		//create scroll pane
		ScrollPane scrollP;

		//Now create the listView

		animalListViewer = new ListView<>(obNameList);


		//set customs on list view
		animalListViewer.setPrefSize(400, 400);
		animalListViewer.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

		//add view into scroll pane
		scrollP = new ScrollPane(animalListViewer);


		//create pane to hold circle
		FlowPane imagePane = new FlowPane(10, 10);
		BorderPane pane = new BorderPane();
		pane.setLeft(scrollP);
		pane.setCenter(imagePane);

		//set and add circle
		Circle c = new Circle(20, 20, 50);
		imagePane.getChildren().add(c);


		//now add listner for main gui

		//Animal q ;

		animalListViewer.getSelectionModel().selectedItemProperty().addListener(e ->{


			Color filler = animalHashMap.get(animalListViewer.getSelectionModel().getSelectedItem());
			//Color filler = animalHashMap.get(animalHashMap.keySet().iterator().next().getAnimalName().equals(animalNames) );

			/*	//inside listner

			//create color variable without all the hassle 
			String animalListNames = animalListViewer.getSelectionModel().getSelectedItem();
			//System.out.println(animalListNames);
			Color filler = null;

			while(animalHashMap.keySet().iterator().hasNext())
			{

				if(animalHashMap.keySet().iterator().next().getAnimalName() == animalListNames)
				{
					System.out.println(animalHashMap.get(animalHashMap.keySet().iterator().next()));
					//System.out.println(animalHashMap.keySet().iterator().next().getAnimalName());
				}
			}*/

			c.setFill(filler);
			//Test till works


		});



		// add button
		Button addButton = new Button("Add a Animal");

		pane.setBottom(addButton);

		addButton.setOnAction(e -> launchNewStage());






		//sets scene and stuff
		Scene scene = new Scene(pane, 600, 170);
		primaryStage.setTitle("Assignment 5"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage


	}

	private void launchNewStage()
	{
		new NameStage(this);
		
		 /**
	     * Name:  launchNewStage
	     * 
	     * launches sub-gui
	     * 
	     * @param args
	     */
	}

	public void addAName(Animal n)
	{
		 /**
	     * Name:  addAName
	     * 
	     * adds in new name
	     * 
	     * @param n
	     */
		int holderColot = n.hashCode()%9;
		animalHashMap.put(n, colorArray[holderColot]);
		obNameList.add(n);
	}


	public static void main(String[] args)
	{
		
		 /**
	     * Name:  main
	     * 
	     * This is the starting point of the program.
	     * 
	     * @param args
	     */
		// TODO Auto-generated method stub
		launch(args);

	}



}
