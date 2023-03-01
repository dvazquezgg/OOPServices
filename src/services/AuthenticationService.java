package services;

import model.User;

/**
 * services.AuthenticationService.java
 * Defines the basic methods that all authentication services should have.
 *
 */
public interface AuthenticationService {
    public User authenticateUser(String username, String password);
    public void authorizeUser(User user);
}