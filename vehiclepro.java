class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
 class vehiclepro {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();
        myCar.drive(); 
        Vehicle myPolymorphicCar = new Car();
        myPolymorphicCar.drive(); 
    }
}
