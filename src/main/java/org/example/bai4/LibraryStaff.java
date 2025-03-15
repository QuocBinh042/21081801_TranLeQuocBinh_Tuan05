package org.example.bai4;

public class LibraryStaff implements Observer{
    private String id;
    private String name;

    public LibraryStaff() {
    }

    public LibraryStaff(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Library Staff " + name + " received notification: " + message);
    }
}
