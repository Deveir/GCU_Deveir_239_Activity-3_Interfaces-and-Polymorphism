package app;

import java.util.Arrays;

/**
 * The Test class is used to demonstrate and verify
 * the functionality of the Person class.
 * 
 * It test object comparison, copy constructor, interface methods and
 * sorting using comparable.
 * @author Deveir Cockett
 */

public class Test {
	
	/**
	 * Main method that runs all test for the person class.
	 * 
	 * @param args command line arguments
	 */
	
    public static void main(String[] args) {
        // Create 2 Person objects with the same first and last name
        Person person1 = new Person("Sarah", "Hall");
        Person person2 = new Person("Sarah", "Hall");

        // Create a 3rd Person object using the copy constructor
        Person person3 = new Person(person1);

        // Compare person1 and person2 using ==
        System.out.println("person1 == person2: " + (person1 == person2));

        // Compare person1 and person2 using equals()
        System.out.println("person1.equals(person2): " + person1.equals(person2));

        // Compare person1 and person3 using equals()
        System.out.println("person1.equals(person3): " + person1.equals(person3));

        // Print all Person objects using toString()
        System.out.println("person1: " + person1.toString());
        System.out.println("person2: " + person2.toString());
        System.out.println("person3: " + person3.toString());

        // Test interface methods
        System.out.println("\n=== Testing PersonInterface Methods ===");
        Person runner = new Person("Sarah", "Hall", 28);
        runner.walk();
        System.out.println("Is running? " + runner.isRunning());
        runner.run();
        System.out.println("Is running? " + runner.isRunning());

        // Test Comparable by age
        System.out.println("\n=== Sorting by Age ===");

        Person[] people = new Person[5];
        people[0] = new Person("Emily", "Smith", 22);
        people[1] = new Person("John", "Anderson", 35);
        people[2] = new Person("Aaron", "Smith", 30);
        people[3] = new Person("Brianna", "Clark", 19);
        people[4] = new Person("Zach", "Brown", 27);

        System.out.println("Before sorting:");
        printPeople(people);

        Arrays.sort(people);

        System.out.println("\nAfter sorting by age:");
        printPeople(people);
    }
    
    /**
     * Helper method to print all person objects in an array.
     * 
     * @param people array of person objects
     */

    public static void printPeople(Person[] people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}