    import java.util.ArrayList;

    public class Admin {
        ArrayList<Course> CoursesList;
        ArrayList<Student> StudentsList;

        public Admin() {
            CoursesList = new ArrayList<>();
            StudentsList = new ArrayList<>();
        }

        public void AddCourses(Course course) {
            CoursesList.add(course);
            System.out.println("new Course is added");
        }

        public void AddStudent(Student student) {
            StudentsList.add(student);
            System.out.println("Student is added");
        }

        public void RemoveStudent(int Studentid) {
            Student st1 = findStudent(Studentid);
            if (st1 != null) {
                if (st1.getEnrolledCoursesList().size() > 0) {
                    System.out.println(st1.toString());
                    System.out.println("Student ALready Enrolled Please Complete the Courses First");

                } else {
                    System.out.println(st1.toString());
                    System.out.println("Student Removed");
                    StudentsList.remove(st1);
                }
            }
        }

        public void RemoveCourse(int courseId) {
            Course c1 = findCourse(courseId);
            if (c1 != null) {
                if (c1.getStudentsEnrollInCourse().size() > 0) {
                    System.out.println(c1.toString());
                    System.out.println(c1.getStudentsEnrollInCourse().size() +
                            " : are already In this Course"
                    );
                    System.out.println("Unable to Remove the course");
                } else {
                    System.out.println(c1.getStudentsEnrollInCourse().size() +
                            " : students are enrolled In this Course"
                    );
                    CoursesList.remove(c1);
                }
            }
        }


        public void EnrollStinCourse(int stid, int cid) {
            Student s1 = findStudent(stid);
            Course c1 = findCourse(cid);
            if (s1 != null) {
                if (c1 != null) {
                    if (c1.getStudentsEnrollInCourse().size() < 50) {
                        for (Student students : c1.getStudentsEnrollInCourse()) {
                            if (students.getStudentID() == stid) {
                                System.out.println("Student Already Registerd In the COurse");
                                return;
                            }
                        }
                        c1.getStudentsEnrollInCourse().add(s1);
                        s1.getEnrolledCoursesList().add(c1);
                        System.out.println("Student Enrolled in the course");
                    } else {
                        System.out.println("Student Limit Exceded Try Next Semseter");
                    }
                } else {
                    System.out.println("Course id not found");
                }
            } else {
                System.out.println("Student id Not found");
            }

        }

        public void DropStudentFromCourse(int stdid, int courseid) {
            Student std1 = findStudent(stdid);
            Course c1 = findCourse(courseid);
            if (std1 != null && c1 != null) {
                System.out.println("Course details");
                System.out.println(c1);
                c1.getStudentsEnrollInCourse().remove(std1);
                std1.getEnrolledCoursesList().remove(c1);
                System.out.println("Student Dropped from the Course Succesfully");
                System.out.println("Student enrroled in the " +
                        "COurse" + c1.getStudentsEnrollInCourse().size());

            } else {
                System.out.println("Course Or Student Id is empty not found");
            }

        }


        // total students Enroll in One Course

        public void TStdEnrOCourse(int cid) {
            Course c1 = findCourse(cid);
            if (c1 != null) {
                System.out.println("Course is found");
                System.out.println(c1);
                System.out.println("Total Students Enrolled in this Course :"
                        + c1.getStudentsEnrollInCourse().size()
                );

                for (Student s1 : c1.getStudentsEnrollInCourse()) {
                    s1.toString();
                }
            } else {
                System.out.println("Invalid Id Course is not found");
            }
        }


        // total courses  in which 1 student enrolled
        public void TCourse1StudentEnroll(int stdid) {
            Student s1 = findStudent(stdid);
            if (s1 != null) {
                System.out.println("Total Course List of Student" + s1.getStudentID() +
                        "enrooled in are " + s1.getEnrolledCoursesList().size()
                );
                for (Course c1 : s1.getEnrolledCoursesList()) {
                    System.out.println(c1);

                }
            } else {
                System.out.println("Ivalid Student ID");
            }
        }


        public Student findStudent(int id) {
            for (Student st : StudentsList) {
                if (st.getStudentID() == id) {
                    return st;
                }
            }
            return null;
        }

        public Course findCourse(int id) {
            for (Course cs : CoursesList) {
                if (cs.getCourseId() == id) {
                    return cs;
                }
            }
            return null;
        }

        public void ViewAllCourse() {
            System.out.println("All Courses : " + CoursesList.size());
            for (Course c1 : CoursesList) {
                System.out.println(c1);
            }
        }

        public void ViewAllStudents() {
            System.out.println("All Students: " + StudentsList.size());
            for (Student s1 : StudentsList) {
                System.out.println(s1);
            }
        }

        public double getStudentCreditHour(int stdid) {

            double totalCreditHour = 0;
            Student s1 = findStudent(stdid);
            if (s1 != null) {
                for (int i = 0; i < s1.getEnrolledCoursesList().size(); i++) {
                    totalCreditHour += s1.getEnrolledCoursesList().get(i).getCreditHour();
                }

            } else {
                System.out.println("Didnt Find Student id ");
            }
            return totalCreditHour;
        }
    }

