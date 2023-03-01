package model;

public abstract class User {

    Person person;
    AuthCredentials authCredentials;

    public User(Person person, AuthCredentials authCredentials) {
        this.person = person;
        this.authCredentials = authCredentials;
    }

    public Person getPerson() {
        return person;
    }

    public AuthCredentials getAuthCredentials() {
        return authCredentials;
    }
}
