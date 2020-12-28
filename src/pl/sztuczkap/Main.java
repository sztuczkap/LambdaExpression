package pl.sztuczkap;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

/*        // wyrazenie wypisze Hello from lambda
        () -> System.out.println("Hello from lambda");

        // wyrazenie wypisze pazyste liczby od 0-10
        () -> {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        };*/

        // wyrazenie zwracajace roznice dlugosci znakow dla 2 zmiennych typu String
        Comparator<String> comparator = (first, second) -> first.length() - second.length();
        System.out.println(comparator.compare("pierwszy", "drugi"));
    }
}
