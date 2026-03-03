package Mammals;

public class Dog extends Mammal {

    private String name;

    /**
     * Constructor for dog object.
     * 
     * @param name is the dogs name.
     */
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Vuf");
    }

    public void sniffButt() {
        System.out.println("Sniffs butt");
    }
}
