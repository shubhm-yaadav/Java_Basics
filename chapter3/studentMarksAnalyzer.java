// Q1. Student Marks Analyzer
// Create a Student class with name, rollNumber and marks.
// - Create an array of 6 Student objects.
// - Find the highest and second-highest marks.
// - Print the names of both students.
// - Print students who scored above the class average.


class student{
    String name;
    int rollNumber;
    int Marks;
}
public class studentMarksAnalyzer {
    public static void main(String[] args) {
        student[] students = new student[6];

        students[0] = new student();
        students[0].name = "shubham";
        students[0].rollNumber = 37;
        students[0].Marks = 400;

        students[1] = new student();
        students[1].name = "Rohit";
        students[1].rollNumber = 42;
        students[1].Marks = 356;

        students[2] = new student();
        students[2].name = "Gaurav";
        students[2].rollNumber = 26;
        students[2].Marks = 254;

        students[3] = new student();
        students[3].name = "rohan";
        students[3].rollNumber = 46;
        students[3].Marks = 256;

        students[4] = new student();
        students[4].name = "robin";
        students[4].rollNumber = 2;
        students[4].Marks = 125;

        students[5] = new student();
        students[5].name = "ravi";
        students[5].rollNumber = 35;
        students[5].Marks = 378;

        student higestMarks = students[0];
        student secondHigestMarks = null;
        int total = 0;

        //for the higest marks
        for (student hm : students){
            total += hm.Marks;
            if (hm.Marks > higestMarks.Marks) {
                higestMarks = hm;
            }else if (secondHigestMarks == null || hm.Marks > secondHigestMarks.Marks){
                if (hm != higestMarks){
                    secondHigestMarks = hm;
                }
            }
        }
        System.out.println("the higest marks student is......" + higestMarks.Marks);
        System.out.println("the average is " + total);
        System.out.println("the second higest marks is " + secondHigestMarks.Marks);
    }
}


