package services;

public interface Service {

    /**
     * Starts the service.
     * Describes how a service starts.
     */
    void startService();

    /**
     * Stops the service.
     * Describes how a service stops.
     */
    void stopService();

    /**
     * Gets the name of the service.
     * Describes how a service provides its service.
     */
    void handleRequest();
}
