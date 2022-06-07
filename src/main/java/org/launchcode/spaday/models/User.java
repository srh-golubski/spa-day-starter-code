package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
    @NotBlank(message="Username is required")
    @Size(min=5, max=15, message="Username must be between 5 and 15 characters")
    private String username;

    @Email(regexp=".+@.+\\..+||null", message="Invalid email. Try again.")
    private String email;

    @NotBlank(message="Password is required")
    @Min(value=6, message="Password must be at least 6 characters long")
    private String password;

    @NotBlank(message="Verify is required")
    private String verify;

    private static int nextId = 1;
    private int id;

    public User() {
        this.id = nextId;
        nextId++;
    }

    public User(String username, String email, String password, String verify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }
}
