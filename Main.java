import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter name: ");
                    String name = input.nextLine();

                    System.out.print("Enter age: ");
                    int age = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter student ID: ");
                    String id = input.nextLine();

                    System.out.print("Enter grade: ");
                    double grade = input.nextDouble();

                    Student student = new Student(name, age, id, grade);

                    manager.addStudent(student);

                    break;

                case 2:
                    manager.showStudents();
                    break;
                    
                case 3:

                    System.out.print("Enter student ID to search: ");

                    String searchId = input.nextLine();

                    Student foundStudent = manager.searchStudent(searchId);

                    if(foundStudent != null) {

                        System.out.println("\nStudent Found:");
                        foundStudent.displayInfo();

                    } else {

                        System.out.println("Student not found.");
                    }

                    break;
      
                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 4);

        input.close();
    }
}
