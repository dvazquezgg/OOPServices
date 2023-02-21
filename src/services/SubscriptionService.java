package services;

// services.SubscriptionService.java
public class SubscriptionService extends BaseService {
    public SubscriptionService(String name, String description) {
        super(name, description);
    }

    public void startService() {
        System.out.println(getName() + " service started.");
    }

    public void stopService() {
        System.out.println(getName() + " service stopped.");
    }

    public void subscribe() {
        // code to handle subscriptions
    }

    public void unsubscribe() {
        // code to handle unsubscriptions
    }
}
