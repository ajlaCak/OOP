package org.example;

import java.util.ArrayList;
import java.util.Optional;

public class catalog {
private ArrayList<lib> l;
public catalog(ArrayList<lib> ll){this.l=ll;}

    public Optional<Boolean> imal(String title){
    return l.stream()
            .filter(book -> book.title().equals(title))
            .findFirst()
            .map(lib::available);

    }
    public Optional<lib> firstod(String author){
    return l.stream()
            .filter(i->i.author().equals(author) && i.available())
            .findFirst();
    }
    public boolean updateAvailability(String title, boolean newAvailability) {
        Optional<lib> optionalBook = l.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst();

        if (optionalBook.isPresent()) {
            lib book = optionalBook.get();
            book = new lib(book.title(), book.author(), book.year(), newAvailability);
            return true;
        }

        return false;
    }
}
