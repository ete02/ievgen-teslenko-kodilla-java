package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserMap = new ArrayList<>();

    public Forum() {
        theUserMap.add(new ForumUser(1, "Jan Kowalski",
                'M', LocalDate.of(1979, 10, 16), 19));
        theUserMap.add(new ForumUser(2, "Anna Szpak",
                'F', LocalDate.of(1989, 9, 30), 7));
        theUserMap.add(new ForumUser(3, "Andrzej Rydz",
                'M', LocalDate.of(1990, 1, 20), 75));
        theUserMap.add(new ForumUser(4, "Michal Szpak",
                'M', LocalDate.of(2010, 10, 16), 0));
        theUserMap.add(new ForumUser(5, "Justyna Grabowska",
                'F', LocalDate.of(1961, 8, 3), 15));
        theUserMap.add(new ForumUser(6, "Olga Nowak",
                'F', LocalDate.of(1985, 10, 16), 18));
        theUserMap.add(new ForumUser(7, "Michał Wiśniewski",
                'M', LocalDate.of(2005, 10, 16), 10));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserMap);
    }
}
