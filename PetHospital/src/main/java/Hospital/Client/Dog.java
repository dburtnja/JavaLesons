package Hospital.Client;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("doggy");
    }

    public void makeSound() {
        System.out.println("Wof, wof");
    }
}
