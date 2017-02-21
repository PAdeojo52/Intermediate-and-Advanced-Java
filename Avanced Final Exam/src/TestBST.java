public class TestBST {
  public static void main(String[] args) {
    // Create a BST
    BST<String> tree = new BST<String>();
    tree.insert("George");
    tree.insert("Michael");
    tree.insert("Tom");
    tree.insert("Adam");
    tree.insert("Jones");
    tree.insert("Peter");
    tree.insert("Daniel");

  
    System.out.println("\nThe number of nodes in first tree is " + tree.getSize());
    
    System.out.println("\nThe non-leaves in the first tree are : ");
    tree.printNonLeaves();

   

    Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
    BST<Integer> intTree = new BST<Integer>(numbers);
    System.out.print("\nThe number of nodes in second tree is " +intTree.getSize());
    System.out.println("\nThe non-leaves in the second tree are : ");
   intTree.printNonLeaves();
    

  }
}
