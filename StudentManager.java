public class StudentManager {

    private Admin admin;

    public StudentManager(){
        admin = new Admin();
    }

    public void AddCourse(String CourseName,double credit){
        Course course = new Course(CourseName,credit);
        admin.AddCourses(course);
    }

    public void AddStudent(String StudentName){
        Student student = new Student(StudentName);
        admin.AddStudent(student);
    }

    public void ViewAllCourse(){
        admin.ViewAllCourse();
    }

    public void ViewAllStudent(){
        admin.ViewAllStudents();
    }

    public void RemoveStudent(int studentid){
        admin.RemoveStudent(studentid);
    }

    public void RemoveCourse(int courseid){
        admin.RemoveCourse(courseid);
    }

    public void TStdEnrOCourse(int cid){
        admin.TStdEnrOCourse(cid);
    }

    public void TCourse1StudentEnroll(int sid){
        admin.TCourse1StudentEnroll(sid);
    }


    public void EnrollStinCourse(int stid,int cid){
        admin.EnrollStinCourse(stid,cid);
    }

    public void DropStudentFromCourse(int stdid,int courseid){
        admin.DropStudentFromCourse(stdid,courseid);
    }


    public double getStudentCreditHour(int stdid){
      double value =  admin.getStudentCreditHour(stdid);
      return value;
    }
}
