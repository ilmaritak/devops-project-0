package Mammals;

public class Human extends Mammal {

    /**
     * Human constructor. Calls super
     * constructor.
     *
     * @param name name of human.
     */
    public Human(String name) {
        super(name);
    }

    /**
     * Inherited method makeSound
     * implementation in human.
     */
    public void makeSound() {
        System.out.println("Heipähei!");
    }
}
