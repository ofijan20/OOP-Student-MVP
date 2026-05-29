import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    // Constructor
    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Show all students
    public void showStudents() {

        if(students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for(Student student : students) {
            System.out.println("-------------------");
            student.displayInfo();
        }
    }

    // Search student by ID
    public Student searchStudent(String id) {

        // Loop through all students
        for(Student student : students) {

            // Compare IDs
            if(student.getStudentId().equalsIgnoreCase(id)) {

                // Return matching student
                return student;
            }
        }

        // If no student found
        return null;
    }
}
