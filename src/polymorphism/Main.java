package polymorphism;

public class Main {
    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch(); // fetch is fun!
        rocky.makeSound(); // woof

        Animal sasha = new Dog();
        sasha.makeSound(); // woof
        sasha = new Cat();
        sasha.makeSound(); // meow

        ((Cat)sasha).scratch(); // I scratch things!

        boolean isDog = sasha instanceof Animal; // true
        boolean isAnimal = sasha instanceof Dog; // false
        boolean isCat = sasha instanceof Cat; // false

        Animal pit = new Dog(); // implicit up cast
        Dog pitTheDog = (Dog)pit;
    }
}