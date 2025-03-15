package org.example.bai4;

public class SubscribedUser implements Observer{
    private String id;
    private String username;

    public SubscribedUser() {
    }

    public SubscribedUser(String id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println(" Subscribed User " + username + " received notification: " + message);
    }
}
