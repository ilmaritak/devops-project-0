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

    /**
     * Mammal required method implementation.
     */
    public void makeSound() {
        System.out.println(name + " says vuf.");
    }

    /**
     * Dog specific method.
     */
    public void peeOnTree() {
        System.out.println(name + " pees on a tree.");
    }
}
