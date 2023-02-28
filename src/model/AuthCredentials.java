package model;

import java.util.Date;

public class AuthCredentials {
    private int id;
    private String username;
    private String password;
    private Date registrationDate;
    private String email;

    public AuthCredentials(int id, String username, String password, String email, Date registrationDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
}

