package app;

/**
 * The Person class represents a person with a first name,
 * Last name, and age. It also includes behaviors such as
 * walking and running, and supports comparison for sorting.
 * @author Deveir Cockett
 */

public class Person implements PersonInterface, Comparable<Person> {

    /** The person's first name */
    private String firstName;

    /** The person's last name */
    private String lastName;

    /** The person's age */
    private int age;

    /** Tracks if the person is currently walking */
    private boolean walking;

    /** Tracks if the person is currently running */
    private boolean running;

    // Non-default constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.walking = false;
        this.running = false;
    }

    // Constructor with age
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.walking = false;
        this.running = false;
    }

    // Copy constructor
    public Person(Person other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.age = other.age;
        this.walking = other.walking;
        this.running = other.running;
    }

    /**
     * Gets the first name of the person.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the last name of the person.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the age of the person.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age the new age value
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Makes the person start walking.
     * Updates movement state and prints a message.
     */
    @Override
    public void walk() {
        walking = true;
        running = false;
        System.out.println(firstName + " " + lastName + " is walking.");
    }

    // Interface method
    @Override
    public void run() {
        running = true;
        walking = false;
        System.out.println(firstName + " " + lastName + " is running.");
    }

    // Interface method
    @Override
    public boolean isRunning() {
        return running;
    }

    // Comparable method - compare by last name first
    @Override
    public int compareTo(Person other) {
    	 return this.firstName.compareToIgnoreCase(other.firstName);
    }

    /**
     * Compares two Person objects for equality.
     * Two persons are equal if both first and last names match.
     *
     * @param other the object to compare
     * @return true if both objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (!(other instanceof Person)) {
            return false;
        }

        Person otherPerson = (Person) other;

        return this.firstName.equals(otherPerson.firstName)
                && this.lastName.equals(otherPerson.lastName);
    }

    /**
     * Returns a string representation of the Person.
     *
     * @return formatted string with name and age
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + " age: " + age;
    }
}