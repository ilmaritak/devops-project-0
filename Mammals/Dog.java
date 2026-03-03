package Mammals;

public class Dog extends Mammal {

    private String name;

    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Vuf");
    }
}
