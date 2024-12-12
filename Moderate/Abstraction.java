abstract class Animal {
    protected String color; // Make the field protected

    Animal() {
        color = "Brown";
        System.out.println("In Animal constructor: color initialized to " + color);
    }

    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    @Override
    void walk() {
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal {
    @Override
    void walk() {
        System.out.println("Walks on two legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse H = new Horse();
        H.eat();
        H.walk();
        System.out.println("Horse color: " + H.color);

        Chicken C = new Chicken();
        C.eat();
        C.walk();
        System.out.println("Chicken color: " + C.color);
    }
}

