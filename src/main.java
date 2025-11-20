public class main {
    public static void main(String[] args)
    {
    Gondola myGondola = new Gondola();
    // Print the object in Gondola
    System.out.println("Gondola details: " + myGondola);
    // Construct a Gondola object using the parameterized constructor
    Gondola customGondola = new Gondola("Venetian Gondola", 12, true, 6, 16, 6.5, 0);
    //Print the custom object 
    System.out.println("Custom Gondola details: " + customGondola);
   
    // Behavior Methods
    myGondola.pickup_passengers();
    myGondola.dropoff_passengers();
    myGondola.replace_boat();
    myGondola.speed_up();
    
    // Using of Getter Methods 
    System.out.println("Current boat speed: " + myGondola.getBoatSpeed() + " mph");
    System.out.println("Current number of passengers: " + myGondola.getCurrentPassengers());
    
    // Setter Methods - change boat speed and passenger count
    myGondola.setBoatSpeed(8.0);
    myGondola.setCurrentPassengers(3);
    
    // Display updated values using getter methods
    System.out.println("Updated boat speed: " + myGondola.getBoatSpeed() + " mph");
    System.out.println("Updated number of passengers: " + myGondola.getCurrentPassengers());
     
    // Print the object after updates
    System.out.println("Gondola after updates: " + myGondola);
    
    }
}