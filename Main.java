import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        int choice;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Student Managment System");
            System.out.println("1. View All Students");
            System.out.println("2. View All Courses");
            System.out.println("3. Add Course ");
            System.out.println("4. Add Student");
            System.out.println("5. Remove Student");
            System.out.println("6. Remove Course");
            System.out.println("7.View Total Student Enroll in one Course(id)");
            System.out.println("8.View Total Courses Enrolled By one student(id)");
            System.out.println("9. Enroll Student in Course ");
            System.out.println("10. Drop the Student from Course");
            System.out.println("11. Check Student Credit Hour");
            System.out.println("0. Exit");
            choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case  1:
                    manager.ViewAllStudent();
                    break;

                case 2:
                    manager.ViewAllCourse();
                    break;

                case 3:
                    System.out.println("Enter the Course Name");
                    String name = input.nextLine();
                    System.out.println("Enter the Credit Hour");
                    double Credit = input.nextDouble();
                    manager.AddCourse(name,Credit);
                    break;

                case 4:
                    System.out.println("Enter the Student Name ");
                    String name2 = input.nextLine();
                    manager.AddStudent(name2);
                    break;

                case 5:
                    System.out.println("Enter the Student id");
                    int stdid = input.nextInt();
                    manager.RemoveStudent(stdid);
                    break;

                case 6:
                    System.out.println("Enter the Course id");
                    int cid = input.nextInt();
                    manager.RemoveCourse(cid);
                    break;

                case 7:
                    System.out.println("Enter the course id");
                    int cid2 = input.nextInt();
                    manager.TStdEnrOCourse(cid2);
                    break;

                case 8:
                    System.out.println("Enter the student id");
                    int std2 = input.nextInt();
                    manager.TCourse1StudentEnroll(std2);
                    break;

                case 9:
                    System.out.println("Enter the student id");
                    int std3= input.nextInt();
                    System.out.println("Enter the Course id");
                    int cd3 = input.nextInt();
                    manager.EnrollStinCourse(std3,cd3);
                    break;

                case 10:
                    System.out.println("Enter the student id");
                    int hehe1 = input.nextInt();
                    System.out.println("Enter the Course id");
                    int hehe2 = input.nextInt();
                    manager.DropStudentFromCourse(hehe1,hehe2);
                    break;

                case 11:
                    System.out.println("Enter Student id");
                    int idst = input.nextInt();
                    double value = manager.getStudentCreditHour(idst);
                    System.out.println(value);
                    break;
                case 0:
                    break;
            }
        }while (choice!=0);
    }
}