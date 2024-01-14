package org.example;


 class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
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
}

 class LoginController {
    public boolean verifyCredentials(String username, String password) {

        return false;
    }
}


public class StudentRepository {
    public void saveStudent(Student student) {

    }
}

