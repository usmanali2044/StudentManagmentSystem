# 🎓 Student Management System in Java

A complete **console-based Java application** that allows an administrator to manage students and courses in a university/college environment. This system supports **adding/removing students and courses**, **enrolling students in courses**, and **tracking student credit hours** — all through an interactive menu in the terminal.

---

## 💻 Features

- Add, view, and remove **students**
- Add, view, and remove **courses**
- Enroll a student into multiple courses
- Drop a student from any course
- Show all students enrolled in a particular course
- Show all courses a specific student is enrolled in
- Calculate the **total credit hours** for a student
- Validations for:
  - Removing students with active enrollments
  - Course size limit (max 50 students)
  - Duplicate enrollments

---

## 🧠 Object-Oriented Concepts Used

| OOP Concept | Usage |
|-------------|-------|
| **Encapsulation** | Private fields, public getters/setters in `Student`, `Course`, `Admin` |
| **Abstraction**   | `StudentManager` class abstracts all admin operations |
| **Association / Composition** | `Student` contains a list of `Course`s and vice versa |
| **Data Hiding**   | Use of private attributes and method access through public functions |
| **Modularity**    | Each class has a single responsibility (`Course`, `Student`, `Admin`, etc.) |
| **Class Interaction** | `StudentManager` interacts with `Admin`, which handles `Student` and `Course` lists |

---

## 🗂️ Project Structure

StudentManagementSystem/
│
├── Main.java # Menu and user interaction
├── StudentManager.java # Manages operations via Admin
├── Admin.java # Core logic: add/remove/enroll/drop
├── Student.java # Student model
├── Course.java # Course model
└── README.md # You are here

## 🧪 How to Run

1. Open any Java IDE (e.g., IntelliJ, NetBeans) or a terminal with JDK installed.
2. Compile all `.java` files:
   ```bash
   javac *.java
3. Run the application:

bash
Copy
Edit
java Main

Developed By
Usman Ali
🎓 CS Student | Java & SQL Learner
📧 usmanali.cs2044@gmail.com
🌐 GitHub: https://github.com/usmanali2044/
