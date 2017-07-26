package Hospital.Client;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client extends Person{
    private Pet pet;

    public Client(String firstName, String lastName, Pet pet) {
        super(firstName, lastName);
        this.pet = pet;
    }

    public Client(String[] strings){
        super(strings[1], strings[2]);
        Class<?>       c;
        Class<?>[]     args;

        args = new Class[1];
        args[0] = String.class;
        strings[3] = formatClassName(strings[3]);
        try {
            c = Class.forName("Hospital.Client." + strings[3]);
            Constructor<?> constructor = c.getDeclaredConstructor(args);
            this.pet = (Pet) constructor.newInstance(strings[4]);
        } catch (ClassNotFoundException e) {
            System.out.println("No place to hold " + strings[3]);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
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
