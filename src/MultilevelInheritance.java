public class MultilevelInheritance {
    public static void main(String[] args) {
        GreenLays G = new GreenLays(50);
        G.printElements();
    }
}

class PotatoChips {
    String name;
    String ingredients;
    String foodType;

    PotatoChips() {
        name = "Potato Chips";
        ingredients = "Potato";
        foodType = "Chips";
    }

    void printElements() {
        System.out.println("Name = " + name);
        System.out.println("Food Type = " + foodType);
        System.out.println("Ingredients = " + ingredients);
    }
}

class Lays extends PotatoChip {
    String flavor;
    String parentCompany;
    int introduced;

    Lays() {
        name = "Lays";
        parentCompany = "PepsiCo";
        introduced = 1980;
    }

    @Override
    void printElements() {
        super.printElements();
        System.out.println("Parent Company = " + parentCompany);
        System.out.println("Introduced = " + introduced);
    }
}

class Green extends LaysChips {
    int price;
    int weight;
    String color;

    Green(int price) {
        this.price = price;
        name = "Green Lays";
        color = "Green";
        flavor = "Sour Cream and Onion";
        switch (price) {
            case 10 -> weight = 28;
            case 20 -> weight = 52;
            case 30 -> weight = 90;
            case 50 -> weight = 130;
            default -> System.out.println("\nInvalid choice...");
        }
    }

    @Override
    void printElements() {
        super.printElements();
        System.out.println("Color = " + color);
        System.out.println("Flavor = " + flavor);
        System.out.println("Price = " + price);
        System.out.println("Weight = " + weight);
    }
}