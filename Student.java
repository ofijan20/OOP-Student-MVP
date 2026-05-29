// Inheritance
public class Student extends Person {

    private String studentId;
    private double grade;

    // Constructor
    public Student(String name, int age, String studentId, double grade) {
        super(name, age);
        this.studentId = studentId;
        this.grade = grade;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }

    // Method Overriding (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
    }
}