package com.kodilla.testing.collection;
import java.util.ArrayList;

class OddNumbersExterminator {
    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbersWithoutOdds = new ArrayList<>();
        for(Integer entry :numbers) {
            if(entry % 2 == 0) {
                numbersWithoutOdds.add(entry);
            }
        }
        return (ArrayList<Integer>)numbersWithoutOdds;
    }
}

