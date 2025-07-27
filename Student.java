import java.util.ArrayList;

public class Student {
    private int StudentID;
    private static int nextid = 500;
    private String studentName;
    ArrayList<Course> EnrolledCoursesList;
    private String CurrentAddress;

    public Student(String studentName){
        this.StudentID = nextid++;
        this.studentName = studentName;
        EnrolledCoursesList = new ArrayList<>();
    }

    public int getStudentID(){
        return StudentID;
    }
    public String getStudentName(){
        return studentName;
    }


    public ArrayList<Course> getEnrolledCoursesList(){
        return EnrolledCoursesList;
    }

    public String toString(){
        return "[" + StudentID + " ] " + "Student Name : " + studentName ;
    }

    public String getCurrentAddress(){
        return CurrentAddress;
    }


    public void SetAddress(){
        this.CurrentAddress = CurrentAddress;
    }

}
