// Q1. ADVANCED STUDENT RESULT ANALYZER
// -----------------------------------
// Create a Student class with:
// - name
// - rollNumber
// - marks (array of 6 subjects)

// Requirements:
// 1. Create 10 Student objects.
// 2. Create a method to calculate total marks.
// 3. Create a method to calculate percentage.
// 4. Create a method to return the student's grade.
// 5. Find the highest scorer in every subject.
// 6. Find the class topper and second topper.
// 7. Calculate the class average.
// 8. Display students scoring above the class average.
// 9. Find students who failed in at least one subject.
// 10. Create a method that accepts two Student objects and compares their performance.

class student{
    String name;
    int rollNumber;

    int[] marks = {83, 53, 52, 54, 56, 87};
    
    int totalMarks = 0;
    int percentage = 0;

    public  int addMarks(){
        for(int a : marks){
            totalMarks += a;
        }
        return totalMarks;
    }

    public int calculatePercentage(){
        percentage = totalMarks*100 /600;
        return percentage;
    }

    public 

}

public class advancedStudentAnalyzer {
    public static void main(String[] args) {
        student s = new student();

        s.name = "shubham";
        
        

        for(int m : s.marks){
            System.out.println(m);
        }
        System.out.println(s.addMarks());
        System.out.println(s.calculatePercentage());
       
    }
}
