package org.example.bai3;

import java.util.List;
import java.util.stream.Collectors;

public class CategorySearchStrategy implements SearchStrategy{
    @Override
    public List<Book> search(String query, List<Book> books) {
        return books.stream()
                .filter(book -> book.getCategory().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }
}
