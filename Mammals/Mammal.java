package Mammals;

public abstract class Mammal {

    /**
     * The name of the mammal.
     */
    private String name;

    public Mammal(final String name) {
        setName(name);
    }

    /**
     * A setter method for Mammals name.
     *
     * @param name is the name given to the mammal.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter method for Mammal name.
     *
     * @return the mammals name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Abstract method for derivative classes
     * to implement.
     */
    public abstract void makeSound();
}
