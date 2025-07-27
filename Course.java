import java.util.ArrayList;

public class Course {
    private int CourseId;
    private String CourseName;
    private double creditHour;
    private static int nextCourseid = 100;
    private ArrayList <Student> studentsEnrollInCourse;

    public Course(String CourseName,double creditHour){
        this.CourseName = CourseName;
        this.creditHour = creditHour;
        this.CourseId = nextCourseid++;
        studentsEnrollInCourse = new ArrayList<>();
    }

    public int getCourseId (){
        return this.CourseId;
    }

    public double getCreditHour(){
        return creditHour;
    }

    public void setCreditHour(double credit){
        this.creditHour = credit;
    }

    public String getCourseName(){
        return CourseName;
    }

    public void setCourseName(String courseName){
        this.CourseName = courseName;
    }

    public ArrayList<Student> getStudentsEnrollInCourse(){
        return studentsEnrollInCourse;
    }

    public String toString(){
        return "[" + getCourseId() + "] " + "Course Name : " + getCourseName()
                + " Cr.Hrs : " + getCreditHour();
    }

}
