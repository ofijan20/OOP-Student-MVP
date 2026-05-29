public class StudentManagerTest {

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student s1 = new Student(1, "John", "CS");
        manager.addStudent(s1);

        if (manager == null) {
            System.out.println("Test Failed: Manager is null");
        } else {
            System.out.println("Test Passed: Manager created");
        }

        System.out.println("Basic Test Completed");
    }
}
