package Hospital;

import Hospital.Client.Client;
import Hospital.Client.Dog;

import java.util.Scanner;

public class Hospital {
    private Client[]    clients;
    private int         emptyPlaces;

    public Hospital(int maxPlaces) {
        usage();
        this.clients = new Client[maxPlaces];
        this.emptyPlaces = maxPlaces;
    }

    private void addClient(Client client){
        if (emptyPlaces > 0){
            clients[emptyPlaces - clients.length] = client;
            emptyPlaces--;
        }else {
            System.out.println("Sorry, no place to left the pet");
        }
    }

    public void start(Scanner scanner){
        String  readStr;

        while (true){
            readStr = scanner.nextLine();
            if (readStr.matches("q"))
                break;
            else if (readStr.startsWith("add"))
                clientWriter(readStr);
            else if (readStr.startsWith("find"))
                clientFinder(readStr);
            else {
                System.out.println("WRONG FORMAT");
                usage();
            }
        }
    }

    private void clientWriter(String str){

        addClient();
    }

    private String clientFinder(String str){

    }

    private void usage(){
        System.out.println("To add Client type: 'add [clientFirstName] [clientLastName] [petType] [petName]' ");
        System.out.println("To find Client or pet type: 'find [name]' ");
        System.out.println("To exit type: 'q' ");
        System.out.println("Places to left a pet: " + emptyPlaces);
    }
}
