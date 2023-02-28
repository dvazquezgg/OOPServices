package services;

// services.MessagingService.java
public class MessagingService extends BaseService implements AuthenticationService {
    public MessagingService(String name, String description) {
        super(name, description);
    }

    public void startService() {
        System.out.println(getName() + " service started.");
    }

    public void stopService() {
        System.out.println(getName() + " service stopped.");
    }

    public void sendMessage() {
        // code to send a message
    }

    public void receiveMessage() {
        // code to receive a message
    }

    @Override
    public void authenticateUser() {

    }

    @Override
    public void authorizeUser() {

    }
}