package org.example.bai3;

import java.util.List;

public interface SearchStrategy {
    List<Book> search(String query, List<Book> books);
}
