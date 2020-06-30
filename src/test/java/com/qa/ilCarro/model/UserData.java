package com.qa.ilCarro.model;

public class UserData {
    private String fName;
    private String lName;
    private String email;
    private String password;

    public UserData withfName(String fName) {
        this.fName = fName;
        return this;
    }

    public UserData withlName(String lName) {
        this.lName = lName;
        return this;
    }

    public UserData withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserData withPassword(String password) {
        this.password = password;
        return this;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
