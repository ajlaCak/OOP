package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface cansendmessage{}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@interface requirespermission{
    int value() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface userperimision{
    int value () default 0;
}
@userperimision(value=1)
class User {
    String username;

    public User(String username) {
        this.username = username;
    }
}
@userperimision(value=1)
class Admin {
    String username;

    public Admin(String username) {
        this.username = username;
    }
}
 class MessagingSystem {

@requirespermission(value=1)
    public static void sendMessage(User user, String message) {
        System.out.println("User " + user.username + " sent a message: " + message);
    }

@requirespermission(value=2)
    public static void sendMessage(Admin admin, String message) {
        System.out.println("Admin " + admin.username + " sent a message: " + message);
    }}

