import java.util.*;
public class Lab2b_VectorDemo {
    public static void main(String args[]){
        // Creating an empty vector
        Vector<String> vec_tor = new Vector<String>();
        
        // Use add() method to add elements in the vector
        vec_tor.add("God");
        vec_tor.add("is");
        vec_tor.add("Great");
        vec_tor.add("10");
        vec_tor.add("20");
        
        // Output the present vector
        System.out.println("The vector is: " + vec_tor);
        
        // Adding new elements to the end
        vec_tor.add("Last");
        vec_tor.add("Element");
        
        // Printing the new vector
        System.out.println("The new Vector is: " + vec_tor);
    }
}
