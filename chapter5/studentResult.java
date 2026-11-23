// QUESTION 2: Student Result Processing
// --------------------------------------------------
// Create a class Student with fields:
//   - String name
//   - int rollNo
//   - int[] marks   (marks in 5 subjects)

// Write the following methods inside the class:
//   1. Constructor Student(String name, int rollNo, int[] marks)
//   2. int total()          - returns the sum of marks
//   3. double percentage()  - returns total / 5
//   4. char grade()         - returns grade based on percentage:
//         90 and above -> 'A'
//         75 to 89     -> 'B'
//         50 to 74     -> 'C'
//         35 to 49     -> 'D'
//         below 35     -> 'F'
//   5. boolean isPass()     - returns true only if the student has at least 35 in EVERY subject
//   6. void display()       - prints name, roll no, total, percentage, grade and Pass/Fail

// In main():
//   - Take input using Scanner for 4 students (name, roll no, 5 marks each).
//   - Store them in a Student[] array.
//   - Display all results.
//   - Print the name of the topper (highest total).
//   - Print how many students got each grade (A, B, C, D, F).
//   - Print the list of students who failed.


class student{
    String name;
    int rollNO;
    int[] marks = new int[5];

    //constructor
    public student(String name, int rollNO, int[] marks){

    }

    int totalMarks = 0;

    public int totalmarks(){
        for(int i : marks){
            totalMarks += i;
            
        }
        return totalMarks;
    }

}
public class studentResult {
    student s = new student("shubham", 10, int[]marks{28,64,66,67,76})
}
