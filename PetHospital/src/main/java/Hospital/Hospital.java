package Hospital;

import Hospital.Client.Client;
import Hospital.Client.Dog;

import java.util.Scanner;

public class Hospital {
    private Client[]    clients;
    private int         emptyPlaces;

    public Hospital(int maxPlaces) {
        this.clients = new Client[maxPlaces];
        this.emptyPlaces = maxPlaces;
        usage();
    }

    private void addClient(Client client){
        if (emptyPlaces > 0){
            clients[clients.length - emptyPlaces] = client;
            emptyPlaces--;
        }else {
            System.out.println("Sorry, no place to left the pet");
        }
    }

    public void start(Scanner scanner){
        String  readStr;

        while (scanner.hasNext()){
            readStr = scanner.nextLine();
            if (readStr.matches("q"))
                break;
            else if (readStr.startsWith("add"))
                clientWriter(readStr);
            else if (readStr.startsWith("find"))
                System.out.println(clientFinder(readStr).toString());
            else if (readStr.startsWith("print"))
                printAll();
            else if (readStr.startsWith("remove"))
                removeClient(readStr, scanner);
            else if (!readStr.matches("")){
                System.out.println("WRONG FORMAT");
                usage();
            }
        }
    }

    private void clientWriter(String str){
        Client      newClient;
        String[]    strings;

        strings = str.split(" ");
        if (strings.length == 5){
            newClient = new Client(strings);
            addClient(newClient);
        } else {
            System.out.println("Bad adding string!");
            usage();
        }
    }

    private Client clientFinder(String str){
        String[]    strings;

        strings = str.split(" ");
        for (Client client : clients){
            if (client != null && client.toString().contains(strings[1]))
                return client;
        }
        return new Client("-", "-", new Dog("-"));
    }

    private void printAll(){
        for (Client client : clients) {
            if (client != null)
                System.out.println(client.toString());
        }
    }

    private void removeClient(String string, Scanner scanner){
        String[]    strings;
        Client      removeClient;

        strings = string.split(" ");
        removeClient = clientFinder(strings[1]);
        System.out.println(removeClient.toString());
        System.out.println("Remove client: y/n ?");
        if (scanner.nextLine().equals("y")){
            for (int i = 0; i < clients.length; i++){
                if (removeClient == clients[i])
                    clients[i] = null;
            }
        }
    }

    private void usage(){
        System.out.println("usage:");
        System.out.println("    To add Client type: 'add [clientFirstName] [clientLastName] [petType] [petName]' ");
        System.out.println("    To find Client or pet type: 'find [name]' ");
        System.out.println("    To exit type: 'q' ");
        System.out.println("    Places to left a pet: " + emptyPlaces);
    }
}
