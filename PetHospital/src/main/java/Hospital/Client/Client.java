package Hospital.Client;

public class Client extends Person{
    private Pet pet;

    public Client(String firstName, String lastName, Pet pet) {
        super(firstName, lastName);
        this.pet = pet;
    }

    public Client(String[] strings){
        super(strings[1], strings[2]);
        Class   c;

        strings[3] = formatClassName(strings[3]);
        try {
            c = Class.forName("Hospital.Client." + strings[3]);
            this.pet = (Pet) c.newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("No place to hold " + strings[3]);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private String formatClassName(String name){
        String  firstLetter;
        String  rest;

        firstLetter = name.substring(0, 1).toUpperCase();
        rest = name.substring(1).toLowerCase();
        return firstLetter + rest;
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-15s | %-10s", firstName, lastName, pet.getName());
    }
}
