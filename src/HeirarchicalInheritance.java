public class HeirarchicalInheritance {
    public static void main(String[] args) {
        GreenLays G = new GreenLays(50);
        G.printElements();
        System.out.println();
        OrangeLays O = new OrangeLays(30);
        O.printElements();
        System.out.println();
        BlackPringles B = new BlackPringles();
        B.printElements();
    }
}

class PotatoChip {
    String name;
    String ingredients;
    String foodType;
    String flavor;
    String parentCompany;
    String color;
    int introduced;
    int price;
    int weight;

    PotatoChip() {
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

class LaysChips extends PotatoChip {
    LaysChips() {
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

class GreenLays extends LaysChips {
    GreenLays(int price) {
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

class OrangeLays extends LaysChips {
    OrangeLays(int price) {
        this.price = price;
        name = "Orange Lays";
        color = "Orange";
        flavor = "Hot n Sweet Chilli";
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

class Pringles extends PotatoChip {
    Pringles() {
        name = "Pringles";
        parentCompany = "Kellogg's";
        introduced = 1968;
    }

    @Override
    void printElements() {
        super.printElements();
        System.out.println("Parent Company = " + parentCompany);
        System.out.println("Introduced = " + introduced);
    }
}

class BlackPringles extends Pringles {
    BlackPringles() {
        name = "Black Pringles";
        price = 200;
        color = "Black";
        flavor = "Hot and Spicy";
        weight = 165;
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