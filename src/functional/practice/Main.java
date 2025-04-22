package functional.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car("Volkswagen", "Amarok", 25000),
                new Car("Volkswagen", "Taos", 32000),
                new Car("Chevrolet", "Onix", 22000),
                new Car("Chevrolet", "Tracker", 30000),
                new Car("Fiat", "Cronos", 21000),
                new Car("Fiat", "Pulse", 24000),
                new Car("Toyota", "Corolla", 28000),
                new Car("Toyota", "Yaris", 23000),
                new Car("Renault", "Stepway", 20000),
                new Car("Renault", "Duster", 27000),
                new Car("Nissan", "Versa", 25000)
        );

        // Sort the list of vehicles by price from lowest to highest and print the result to the screen.
        List<Car> sortedByPrice = new ArrayList<>(cars);
        sortedByPrice.sort(Comparator.comparing(Car::getPrice)); // using method reference
        sortedByPrice.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");

        // Sort simultaneously by both brand and price (both criteria) and print the result to the screen.
        cars.stream()
                .sorted(Comparator.comparing(Car::getBrand).thenComparing(Car::getPrice))
                .forEach(System.out::println); // using streams

        System.out.println("-----------------------------------------------------------");

        // Extract a list of all vehicles whose price does not exceed 23000.
        cars.stream()
                .filter(car -> car.getPrice() <= 23000)
                .forEach(System.out::println); // using streams

        System.out.println("-----------------------------------------------------------");

        // Filter only the vehicles of the Chevrolet and Volkswagen brands.
        cars.stream()
                .filter(car -> car.getBrand().equals("Chevrolet") || car.getBrand().equals("Volkswagen"))
                .forEach(System.out::println); // using streams

        System.out.println("-----------------------------------------------------------");

        // Show all cars whose model contains at least one letter "a".
        cars.stream()
                .filter(car -> car.getModel().toLowerCase().contains("a"))
                .forEach(System.out::println); // using streams
    }
}
