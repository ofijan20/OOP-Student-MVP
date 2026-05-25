public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters (Encapsulation)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method (for testing later)
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}