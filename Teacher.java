/*
------------------------------------------------
Child Class: Teacher
Demonstrates:
1. Inheritance
2. Method Overriding
------------------------------------------------
*/

public class Teacher extends Person {

    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {

        // Calling parent constructor
        super(name, age);

        this.subject = subject;
    }

    // Getter
    public String getSubject() {
        return subject;
    }

    // Setter
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /*
    Method Overriding
    */
    @Override
    public void displayInfo() {

        System.out.println("\n===== Teacher Information =====");
        System.out.println("Name    : " + getName());
        System.out.println("Age     : " + getAge());
        System.out.println("Subject : " + subject);
    }
}
