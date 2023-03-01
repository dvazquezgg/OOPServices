package services;

import model.MessageUser;
import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// services.MessagingService.java
public class MessagingService extends BaseService implements AuthenticationService {

    private static final String name = "Messaging Service";
    private static final String description = "This service handles all messaging requests.";
    private boolean isRunning;
    private boolean isAuthenticating;
    ArrayList<MessageUser> serviceUsers = new ArrayList<>();

    Map<String, String> messageMap = new HashMap<>();

    public MessagingService(ArrayList<MessageUser> serviceUsers) {
        super(name, description);
        this.serviceUsers = serviceUsers;
    }

    public void startService() {
        System.out.println(getName() + " service started.");
    }

    public void stopService() {
        System.out.println(getName() + " service stopped.");
    }

    public void sendMessage(MessageUser sender, MessageUser receiver, String message) {
        // code to send a message
        if(sender.getAuthCredentials().isLogged() && receiver.getAuthCredentials().isLogged()) {
            messageMap.put(sender.getAuthCredentials().getUsername(), message);
            System.out.println("Message sent.");
        } else {
            System.out.println("User not authenticated.");
        }
    }

    public void receiveMessage(MessageUser receiver) {
        // code to receive a message
        if(receiver.getAuthCredentials().isLogged()) {
            System.out.println("Message received: " + messageMap.get(receiver.getAuthCredentials().getUsername()));
        } else {
            System.out.println("User not authenticated.");
        }
    }

    @Override
    public User authenticateUser(String username, String password) {
        // code to authenticate a user
        for(MessageUser user : serviceUsers) {
            if (user.getAuthCredentials().getUsername().equals(username) && user.getAuthCredentials().getPassword().equals(password)) {
                System.out.println("User authenticated.");
                authorizeUser(user);
                return user;
            }
        }
        System.out.println("User not authenticated.");
        return null;
    }

    @Override
    public void authorizeUser(User user) {
        user.getAuthCredentials().setLogged(true);
    }
}