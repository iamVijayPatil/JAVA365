public class Car {
    int noOfWheels;
    String Color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;

    public void drive(){
        System.out.println("car is driving");
        currentFuelInLitres--;
    }
    public void addFuel(float fuel){
        currentFuelInLitres += fuel;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLitres;
    }

}