package Hospital.Client;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    public Cat(){
        super("catkin");
    }

    public void makeSound() {
        System.out.println("May, may");
    }
}
