import com.sun.corba.se.pept.transport.EventHandler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DisplayUSMap extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    City[] vertices = {new City("Seattle", 75, 50),
      new City("San Francisco", 50, 210),
      new City("Los Angeles", 75, 275), new City("Denver", 275, 175),
      new City("Kansas City", 400, 245),
      new City("Chicago", 450, 100), new City("Boston", 700, 80),
      new City("New York", 675, 120), new City("Atlanta", 575, 295),
      new City("Miami", 600, 400), new City("Dallas", 408, 325),
      new City("Houston", 450, 360), new City("Charlotte", 600, 285) };
    //charlotte is 12

    // Edge array for graph in Figure 28.1
    int[][] edges = {
      {0, 1}, {0, 3}, {0, 5}, {1, 0}, {1, 2}, {1, 3},
      {2, 1}, {2, 3}, {2, 4}, {2, 10},
      {3, 0}, {3, 1}, {3, 2}, {3, 4}, {3, 5},
      {4, 2}, {4, 3}, {4, 5}, {4, 7}, {4, 8}, {4, 10},
      {5, 0}, {5, 3}, {5, 4}, {5, 6}, {5, 7},
      {6, 5}, {6, 7}, {7, 4}, {7, 5}, {7, 6}, {7, 8},
      {8, 4}, {8, 7}, {8, 9}, {8, 10}, {8, 11},
      {9, 8}, {9, 11}, {10, 2}, {10, 4}, {10, 8}, {10, 11},
      {11, 8}, {11, 9}, {11, 10},
      {12,9},{12,8}, {12,11} };
    
    Button btnBFS = new Button("BFS");

    
   // Graph<String> mapGraph = new UnweightedGraph<>();
    
 
    Graph<City> mapGraph = new UnweightedGraph<>(vertices, edges);
    
    AbstractGraph.Tree bfs = mapGraph.bfs(mapGraph.getIndex(vertices[12]));
    btnBFS.setOnAction(e ->
    {
    	 java.util.List<Integer> searchOrders = bfs.getSearchOrder();
    	 System.out.println();
    	    System.out.println(bfs.getNumberOfVerticesFound() +
    	      " vertices are searched in this order:");
    	    for (int i = 0; i < searchOrders.size(); i++)
    	      System.out.println(mapGraph.getVertex(searchOrders.get(i)).name);

    	    for (int i = 0; i < searchOrders.size(); i++)
    	      if (bfs.getParent(i) != -1)
    	        System.out.println("parent of " + mapGraph.getVertex(i).name + 
    	          " is " + mapGraph.getVertex(bfs.getParent(i)).name);
    	
    	
    	
    });

    // Create a scene and place it in the stage
   BorderPane pane = new BorderPane();
    pane.setBottom(btnBFS);
    pane.setCenter(new GraphView(mapGraph));
    
    Scene scene = new Scene(pane, 750, 450);
    primaryStage.setTitle("DisplayUSMap"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  static class City implements Displayable {
    private int x, y;
    private String name;
    
    City(String name, int x, int y) {
      this.name = name;
      this.x = x;
      this.y = y;
    }
    
    @Override 
    public int getX() {
      return x;
    }
    
    @Override 
    public int getY() {
      return y;
    }
    
    @Override 
    public String getName() {
      return name;
    }
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
