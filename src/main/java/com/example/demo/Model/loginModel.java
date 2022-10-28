package com.example.demo.Model;


public class loginModel {
    
    private String username; //thsi variables should as input tag name attributer check Startpage.jsp
    private String password;

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

    public loginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
