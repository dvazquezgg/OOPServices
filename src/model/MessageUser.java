package model;

public class MessageUser extends User {

    public MessageUser(Person person, AuthCredentials authCredentials) {
        super(person, authCredentials);
    }

    @Override
    public String toString() {
        return "MessageUser{" +
                "person=" + person +
                ", authCredentials=" + authCredentials +
                '}';
    }
}
