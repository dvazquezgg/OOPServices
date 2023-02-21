package services;

/**
 * services.BaseService.java
 * Defines the basic methods that all services should have.
 *
 */
public abstract class BaseService implements Service{
    private String name;
    private String description;
    private boolean isActive;

    public BaseService(String name, String description) {
        this.name = name;
        this.description = description;
        this.isActive = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void activate() {
        isActive = true;
        System.out.println(name + " is now active.");
    }

    public void deactivate() {
        isActive = false;
        System.out.println(name + " is now inactive.");
    }

    /**
     * This method is abstract because it is not the same for all services.
     */
    public abstract void startService();

    /**
     * This method is abstract because it is not the same for all services.
     */
    public abstract void stopService();

    /**
     * Describes how the service handles incoming requests.
     */
    public void handleRequest(){}

    /**
     * Describes how the service logs incoming requests.
     */
    public void logRequests(){}
}
