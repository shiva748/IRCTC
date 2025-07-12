package org.entities;

import java.util.UUID;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

public class User {
    private String name;
    private String hashedPassword;
    private List<String> ticketsBooked;
    private String userId;

    User(String name, String Password) {
        this.name = name;
        this.hashedPassword = BCrypt.hashpw(Password, BCrypt.gensalt());
        this.userId = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public List<String> getBookedTickets() {
        return ticketsBooked;
    }

    public String getUserId() {
        return userId;
    }

    public Boolean checkPassword(String password) {
        return BCrypt.checkpw(password, this.hashedPassword);
    }
}
