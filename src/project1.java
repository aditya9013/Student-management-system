import java.util.ArrayList;
import java.util.Scanner;

// project 1
class student{
    int id;
    String name;
    int age;

    // constructor
    student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // display method
    void display(){
        System.out.println("id: " + id + ", name: " + name + ", age: " + age);
    }
}
public class project1 {
    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println(" student management system");
            System.out.println("1 . Add students");
            System.out.println("2 . view students");
            System.out.println("3.  delete students");
            System.out.println("4. search student by id");
            System.out.println("5. Update student");
            System.out.println("5.  exit");
            System.out.println("Enter choice");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(" Enter id");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println(" Enter name");
                    String name = sc.nextLine();

                    System.out.println(" Enter age");
                    int age = sc.nextInt();

                    students.add(new student(id, name, age));
                    System.out.println(" student added!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println(" No students found");
                    } else {
                        for (student s : students) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println(" Enter id to Delete");
                    int deleteId = sc.nextInt();
                    boolean found = false;
                    for (student s : students) {
                        if (s.id == deleteId) {
                            students.remove(s);
                            found = true;
                            System.out.println(" student deleted");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(" students not found");
                    }
                    break;

                case 4:
                    System.out.println(" Enter Id to search");
                    int searchId = sc.nextInt();
                    boolean foundSearch = false;

                    for (student s : students) {
                        if (s.id == searchId) {
                            s.display();
                            foundSearch = true;
                            break;
                        }
                    }
                    if (!foundSearch) {
                        System.out.println(" studrent not found");
                    }
                    break;
                case 5:
                    System.out.println(" Enter id to update");
                    int updateId = sc.nextInt();
                    boolean Found = false;
                    sc.nextLine();
                    for (student s : students) {
                        if (s.id == updateId) {
                            System.out.println(" enter new name");
                        }
                        s.name = sc.nextLine();

                        System.out.println(" enter new age");
                        s.age = sc.nextInt();

                        System.out.println(" student updated");
                        Found = true;
                        break;
                    }
                    if (!Found) {
                        System.out.println(" no student found");
                    }
                    break;
            }
        }
    }
}