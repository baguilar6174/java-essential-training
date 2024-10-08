package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
         * Popular implementations of sets are:
         * - HasSet
         * - LinkHashSet
         * - TreeSets
         */

        Set<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println(fruits); // [banana, apple, lemon]
        System.out.println("Have lemon? " + fruits.contains("lemon")); // Have lemon? true
        fruits.remove("lemon");
        System.out.println("Elements after removing lemon: " +fruits.size()); // Elements after removing lemon: 2

        Set<String> moreFruits = Set.of("pear", "raising", "cherry");

        System.out.println(moreFruits); // [pear, raising, cherry]

        // ----------------------------------------------------------------------------------

        /*
         * Popular implementations of lists are:
         * - ArrayList
         * - LinkedList
         * - Stack
         * - Vector
         */

        List<String> objects = new ArrayList<>();

        objects.add("pen");
        objects.add("table");
        objects.add("mouse");
        objects.add("keyboard");
        objects.add("pen");

        System.out.println(objects); // [pen, table, mouse, keyboard, pen]
        System.out.println(objects.get(2)); // mouse

        objects.set(2, "laptop");

        System.out.println(objects); // [pen, table, laptop, keyboard, pen]
        System.out.println("Index of first pen is: " + objects.indexOf("pen")); // Index of first pen is: 0
        System.out.println("Index of last pen is: " + objects.lastIndexOf("pen")); // Index of last pen is: 4

        objects.remove(4); // remove an object by index

        List<String> moreObjects = List.of("bed", "ball", "carpet", "plant");

        // ----------------------------------------------------------------------------------

        /*
         * Popular implementations of queues are:
         * - LinkedList
         * - PriorityQueue
         */

        Queue<String> animals = new LinkedList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("lion");
        animals.add("bird");
        animals.add("bird");

        System.out.println(animals); // [dog, cat, lion, bird, bird]

        var removed = animals.remove();

        System.out.println(animals + " Removed element: " + removed); // [cat, lion, bird, bird] Removed element: dog
        System.out.println("head of queue: " + animals.peek()); // head of queue: cat

        // ----------------------------------------------------------------------------------

        /*
        * Popular implementations of maps are:
        * - HasMap
        * - TreeMap
        * - LinkedHasMap
        */

        Map<String, Integer> foodCalories = new HashMap<String, Integer>();

        foodCalories.put("apple", 95);
        foodCalories.put("lemon", 20);
        foodCalories.put("banana", 105);
        foodCalories.put("orange", 45);

        foodCalories.put("lemon", 25); // overrides existing value

        foodCalories.putIfAbsent("orange", 52); // not overrides because orange exists

        System.out.println(foodCalories); // {banana=105, orange=45, apple=95, lemon=20}
        System.out.println("banana: " + foodCalories.get("banana")); // banana: 105

        foodCalories.remove("apple");

        System.out.println(foodCalories); // {banana=105, orange=45, lemon=25}

        var containsApple = foodCalories.containsKey("apple");
        var containsValue = foodCalories.containsValue(45);

        System.out.println("Exists apple? "+ containsApple + " Exists value 45? " + containsValue); // Exists apple? false Exists value 45? true

        Set<Map.Entry<String, Integer>> mapEntries = foodCalories.entrySet();
        Set<String> mapKeys = foodCalories.keySet();
        Collection<Integer> values = foodCalories.values();

        System.out.println(mapEntries); // [banana=105, orange=45, lemon=25]
        System.out.println(mapKeys); // [banana, orange, lemon]
        System.out.println(values); // [105, 45, 25]

        // ----------------------------------------------------------------------------------
    }
}