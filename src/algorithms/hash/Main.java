package algorithms.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static List<Integer> findMissingElements(int[] first, int[] second) {
        List<Integer> missingElements = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x : second) {
            hashSet.add(x);
        }
        for (int x : first) {
            if (!hashSet.contains(x)) {
                missingElements.add(x);
            }
        }
        return missingElements;
    }

    public static void displayFreqOfEachElement(int[] array) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int x : array) {
            if (!freqMap.containsKey(x)) {
                freqMap.put(x, 1);
            } else {
                freqMap.put(x, freqMap.get(x) + 1);
            }
        }
        freqMap.forEach((k, v)-> System.out.println(k + " : " + v));
    }

    public static void main(String[] args) {
        Employee first = new Employee("Bryan", 1, "development");
        Employee second = new Employee("Alexander", 2, "marketing");
        Employee third = new Employee("Bryan", 3, "sales");

        HashMap<Integer, Employee> employeesById = new HashMap<>();
        employeesById.put(first.id, first);
        employeesById.put(second.id, second);
        employeesById.put(third.id, third);

        Employee retrievedEmployee = employeesById.get(2);
        System.out.printf("Name: %s, Department: %s%n", retrievedEmployee.name, retrievedEmployee.department);

        /*----------------------------------------------*/

        int[] firstArray = new int[]{1, 2, 3, 4, 5};
        int[] secondArray = new int[]{2, 8, 4, 10};

        findMissingElements(firstArray, secondArray).forEach(System.out::println);

        /*----------------------------------------------*/

        displayFreqOfEachElement(new int[]{1,1,1,2,2,5,8,8,8,9,10});
    }
}
