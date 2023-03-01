import data.CSVFileReader;
import model.*;
import services.MessagingService;
import util.IBIO;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("OOP Services");

        Product product = new Glasses("Ray-Ban", 100, 10);
        Glasses glasses = new Glasses("Ray-Ban", 80, 5);
        Product anotherProduct = new Bottle(10, 10);
        Bottle bottle = new Bottle(1.5,8, 5);

        Product[] bunchOfProducts = new Product[4];
        bunchOfProducts[0] = product;
        bunchOfProducts[1] = glasses;
        bunchOfProducts[2] = anotherProduct;
        bunchOfProducts[3] = bottle;

        for (Product p : bunchOfProducts) {
            System.out.println(p);
            if(p instanceof Bottle){
                Bottle b = (Bottle) p;
                System.out.println("Capacity: " + b.getCapacity());
            } else if(p instanceof Glasses){
                Glasses g = (Glasses) p;
                System.out.println("Brand: " + g.getBrand());
            }
        }
        IBIO.output("Compare glasses to bottle: ");
        IBIO.output(glasses.compareTo(bottle));

        IBIO.output("Compare bottle to bottle: ");
        IBIO.output(bottle.compareTo((Bottle) anotherProduct));

        ArrayList<Person> persons = loadPersons();
        for(Person person : persons){
            System.out.println(person);
        }
        ArrayList<AuthCredentials> authCredentials = loadAuthCredentials();
        for(AuthCredentials authCredential : authCredentials){
            System.out.println(authCredential);
        }
        ArrayList<MessageUser> messageUsers = mergeData(persons, authCredentials);
        for(MessageUser messageUser : messageUsers){
            System.out.println(messageUser);
        }

        MessagingService messagingService = new MessagingService(messageUsers);
        User user1 = messagingService.authenticateUser("MAGPAD","0sst7tqbzIDh");
        User user2 = messagingService.authenticateUser("MARWIL","vwk2kbDpGKT");
        User user3 = messagingService.authenticateUser("WINBAS","8m3vQI6VW");

        messagingService.sendMessage((MessageUser) user1, (MessageUser) user2, "Hello");
        messagingService.sendMessage((MessageUser) user2, (MessageUser) user3, "Hello Again");
        messagingService.sendMessage((MessageUser) user3, (MessageUser) user1, "Hello Yet Again");

        messagingService.receiveMessage((MessageUser) user1);
        messagingService.receiveMessage((MessageUser) user2);
        messagingService.receiveMessage((MessageUser) user3);





    }

    private static ArrayList<Person> loadPersons() {
        ArrayList<Person> persons = CSVFileReader.readPersonFile("StudentData.csv", false);
        return persons;
    }

    private static ArrayList<AuthCredentials> loadAuthCredentials() {
        ArrayList<AuthCredentials> authCredentials = CSVFileReader.readCredentials("AuthCred.csv", false);
        return authCredentials;
    }

    private static ArrayList<MessageUser> mergeData(ArrayList<Person> persons, ArrayList<AuthCredentials> authCredentials){
        ArrayList<MessageUser> messageUsers = new ArrayList<MessageUser>();
        for(Person person : persons){
            for(AuthCredentials authCredential : authCredentials){
                if(person.getEmail().equals(authCredential.getEmail())){
                    messageUsers.add(new MessageUser(person, authCredential));
                }
            }
        }
        return messageUsers;
    }
}
