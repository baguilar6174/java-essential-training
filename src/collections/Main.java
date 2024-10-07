package collections;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println("Have lemon? " + fruits.contains("lemon"));
        fruits.remove("lemon");
        System.out.println("Elements after removing lemon: " +fruits.size());

        Set<String> moreFruits = Set.of("pear", "raising", "cherry");

        System.out.println(moreFruits);
    }
}