package services;

/**
 * services.AuthenticationService.java
 * Defines the basic methods that all authentication services should have.
 *
 */
public interface AuthenticationService {
    public void authenticateUser();
    public void authorizeUser();
}