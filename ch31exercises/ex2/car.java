import java.util.*;

class Car {

	// instance variables
  double startMiles, gallons, curMiles;   // Stating odometer reading

  // constructor
  Car(double start){
    startMiles = start;
  }

  // methods
  double calculateMPG() {
    return  (curMiles - startMiles)/ gallons;
  }

  boolean gasHog() {
    return (calculateMPG() < 15.0);
  }

  boolean economyCar() {
    return (calculateMPG() > 30.0);
  }

  void fillUp(int miles, double gallons) {
    System.out.println("Filling Station Visit " ); 
    System.out.println("Enter odometer reading: ");
    curMiles = scan.nextDouble();
    System.out.println("Gallons to fill tank");
    gallons = 
    System.out.println( "Miles per gallon: " + calculateMPG() );
    System.out.println((gasHog) ? "Gas Hog!" : (economyCar) ? "Economy Car!" : "");
  }



}