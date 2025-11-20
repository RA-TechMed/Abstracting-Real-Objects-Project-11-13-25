public class Gondola {
    private String name; 
    private int length;
    private boolean isWood;
    private int maximumOccupancy;
    private int lifeSpan; 
    private double boatSpeed;
    private int currentPassengers;

//CONSTRUCTOR 
    public Gondola (String theName, int theLength, boolean wood, int maxOccup, int theLifeSpan, double speed, int theCurrentPassengers){
        name = theName;
        length = theLength; 
        isWood = wood;
        maximumOccupancy = maxOccup;
        lifeSpan = theLifeSpan;
        boatSpeed = speed;
        currentPassengers = 0;
    }
//DEFAULT CONSTRUCTOR - Make a specific Gondola
    public Gondola () { 
        name = "Gondola"; 
        length = 11; //meters long
        isWood = true; //Gondola is made of wood  
        maximumOccupancy = 5; //people (not including the driver)
        lifeSpan = 15; // years
        boatSpeed = 5; // miles per hour
        currentPassengers = 0;
    }

//METHODS - Behavior methods

    public void pickup_passengers() {
        int seatsAvailable = maximumOccupancy - currentPassengers;

        if (seatsAvailable <= 0) {
            System.out.println("Gondola is full, wait for next one. Total passengers: " + currentPassengers);
            return; // Exit the method if full
        }

        // Add remaining passengers up to max capacity
        for (int i = 0; i < seatsAvailable; i++) { //"int" because i is going to be a number
            currentPassengers++;
            System.out.println("Passenger boarded. Current count: " + currentPassengers);
        }

        System.out.println("Gondola is now full. Total passengers: " + currentPassengers);
    }
    
    public void dropoff_passengers() {
        currentPassengers = 0;
        System.out.println("All passengers dropped off. Gondola is empty.");
    }
    public void replace_boat(){
    if (lifeSpan > 15)
        System.out.println("Time for replacement!");
    else
        System.out.println("Not time to replace boat yet!");
    }
    public void speed_up(){
    if (boatSpeed > 5)
        System.out.println("Boat is speeding up!");
    else
        System.out.println("Boat remains same speed!");
    }
    public double getBoatSpeed() {
        return boatSpeed;
    }
    
    public int getCurrentPassengers() {
        return currentPassengers;
    }
    
    public void setBoatSpeed(double speed) {
        boatSpeed = speed;
        System.out.println("The boat is " + speed + "miles per hour!" );
    } 
    
    public void setCurrentPassengers(int passengers) {
        currentPassengers = passengers;
        System.out.println("There is " + passengers + "on the Gondola!");
    }

    
}