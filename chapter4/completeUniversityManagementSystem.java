// Q20. COMPLETE UNIVERSITY MANAGEMENT SYSTEM
// -------------------------------------------
// Create three classes: Student, Teacher and Course.

// Student:
// - studentId
// - name
// - marks (array of subjects)

// Teacher:
// - teacherId
// - name
// - salary

// Course:
// - courseId
// - courseName
// - teacher (Teacher object)
// - students (array of Student objects)

// Requirements:
// 1. Create 3 Teacher objects.
// 2. Create 5 Course objects.
// 3. Assign teachers to courses.
// 4. Assign multiple students to each course.
// 5. Calculate the average marks of each course.
// 6. Find the topper in each course.
// 7. Find the teacher handling the highest number of students.
// 8. Find the course with the highest average marks.
// 9. Find students enrolled in multiple courses.
// 10. Generate a complete university report.


class student{
    int StudentId;
    String studentName;
    int[] marks = new int[5];
}

class teacher{
    int teacherId;
    String teacherName;
    int salary;
}

class coures{
    int courseId;
    String courseName;

    teacher t = new teacher();

    student[] s = new student[3];
}
public class completeUniversityManagementSystem {
    public static void main(String[] args) {
         teacher t1 = new teacher();
         teacher t2 = new teacher();
         teacher t3 = new teacher();

         coures c1 = new coures();
         coures c2 = new coures();
         coures c3 = new coures();
         coures c4 = new coures();
         coures c5 = new coures();
    }
}
