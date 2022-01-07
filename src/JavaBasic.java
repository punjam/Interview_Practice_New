import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaBasic {

    //Create below variable to store the student name based on id.
    private Map<Integer, String> store = new HashMap<>();


    private final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        JavaBasic  javaBasic = new JavaBasic();

        while (true) {
            javaBasic.printOption();
        }
    }

    private void printOption() {
        System.out.println("1. Add Student");
        System.out.println("2. Find Student");

        System.out.println("Enter the number? ");
        int num = input.nextInt();

        if (num == 1) {
            addStudent();
        } else if (num == 2) {
            findStudent();
        }
    }

    public void addStudent() {
        System.out.println("Enter ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        store.put(id, name);// add student id and name
        System.out.println("Student Added");
    }

    public void findStudent() {
        System.out.println("Enter Student ID: ");
        int studentId = input.nextInt();
        input.nextLine();
        String name = store.get(studentId);// get student id and name based on id and store in name variable.

        if (name != null) {
            System.out.println(studentId + " " + name);
        } else {
            System.out.println("Student not found ");

        }

    }

}
