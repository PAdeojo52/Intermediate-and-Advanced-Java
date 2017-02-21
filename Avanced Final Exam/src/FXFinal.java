import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Class: FXFinal.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: May 5, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the FXFinal.java
 * 
 *  Purpose: – ******
 */

public class FXFinal  extends Application
{
	
	

	@Override
	public void start(Stage primaryStage) throws Exception
	{
			 // Create a pane and set its properties
	    GridPane pane = new GridPane();
	    pane.setAlignment(Pos.CENTER);
	    pane.setPadding(new Insets(15.5, 12.5, 13.5, 14.5));
	    pane.setHgap(10.5);
	    pane.setVgap(10.5);
	    
	    
	    //These are the ending buttons
	    Button btSave = new Button("Button 1 Pushed");
	    pane.add(btSave, 0, 0);
	    GridPane.setHalignment(btSave, HPos.LEFT);
	    
	    Button btCancel = new Button("Button 2 Pushed");
	    pane.add(btCancel, 0, 4);
	    GridPane.setHalignment(btSave, HPos.LEFT);
	    
	    Text t = new Text();
		t.setText("No Button Pushed");
		pane.add(t, 0, 1);
		

		btSave.setOnMousePressed(e -> 
		{
			if(e.getButton() == MouseButton.PRIMARY)
			{
				
				t.setText("Button 1 Pushed");

			}
		});
		
		btCancel.setOnMousePressed(e -> 
		{
			if(e.getButton() == MouseButton.PRIMARY)
			{
				
				t.setText("Button 2 Pushed");

			}
	    
			
		});
			
	    
  //Now the Scene
	    
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("Final");
	    primaryStage.setScene(scene);
	    primaryStage.show();

		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		launch(args);

	}


}
