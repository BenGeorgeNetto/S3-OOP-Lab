public class SingleInheritance {
    public static void main(String[] args) {
        Tesla S = new Tesla("Model S");
        S.printDetails();
    }
}

class Car {
    String itemType;
    String itemClass;
    int noOfWheels = 4;

     Car() {
         itemType = "Vehicle";
         itemClass = "Car";
     }

    void printDetails() {
        System.out.println("Item Type: " + itemType);
        System.out.println("Item Class: " + itemClass);
        System.out.println("No of wheels: " + noOfWheels);
    }
}

class Tesla extends Car {
    String model;
    String company = "Tesla";
    String fuel;

    Tesla(String model) {
        this.model = model;
        fuel = "Electric";
    }

    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuel);
    }
}