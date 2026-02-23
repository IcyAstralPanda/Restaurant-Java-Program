import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Instantiate an ArrayList to hold Restaurant Objects
        ArrayList<Restaurant> restaurantArrayList = new ArrayList<>();

        // Take User Input using JOptionPane and store in a variable
        String name = JOptionPane.showInputDialog("Please enter the name of desired Restaurant: ");
        int waitTime = Integer.parseInt(JOptionPane.showInputDialog("Please enter Restaurant Wait Time in # of Minutes. ---> i.e (30): "));
        double rating = Double.parseDouble(JOptionPane.showInputDialog("Please enter the Restaurant's rating i.e --> (4.3): "));
        double avgPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the average price of the Restaurant i.e --->(12.50): "));
        double distance = Double.parseDouble(JOptionPane.showInputDialog("Please enter the distance of the Restaurant in Miles i.e ---> (5.7): "));
        String hoursOpen = JOptionPane.showInputDialog("Please enter the hours of operation for the Restaurant, and please include holiday hours. i.e ---> (09:00am - 10:00pm)");


        // Instantiate Restaurant object with those variables
        Restaurant userRestaurant = new Restaurant(name, waitTime, rating, avgPrice, distance, hoursOpen);
        System.out.println(userRestaurant);


        // Add Users Restaurant Object to the ArrayList
        restaurantArrayList.add(userRestaurant);
    }
}



