package model;

public class MessageUser {

    Person person;
    AuthCredentials authCredentials;

    public MessageUser(Person person, AuthCredentials authCredentials) {
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
