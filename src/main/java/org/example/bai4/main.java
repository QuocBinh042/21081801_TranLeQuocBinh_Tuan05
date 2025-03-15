package org.example.bai4;

public class main {
    public static void main(String[] args) {
        BookNotifier notifier = new BookNotifier();

        Observer staff1 = new LibraryStaff("s1","Alice");
        Observer user1 = new SubscribedUser("u1","Bob");

        notifier.registerObserver(staff1);
        notifier.registerObserver(user1);

        notifier.newBookAdded("Design Patterns in Java");

        notifier.bookExpired("Old Book");
    }
}
