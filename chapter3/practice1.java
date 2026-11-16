// 1. Student Array

// Create a Student class with:

// name
// marks

// Create an array of 5 students and print:

// all names
// highest marks

class student {
    String name;
    int totalMarks;
}

public class practice1 {
    public static void main(String[] args) {
        
    
    student[] studentsarr = new student[5];
    
    studentsarr[0] = new student();
    studentsarr[1] = new student();
    studentsarr[2] = new student();
    studentsarr[3] = new student();
    studentsarr[4] = new student();

    studentsarr[0].name = "Shubham";
    studentsarr[0].totalMarks = 498;

    
    studentsarr[1].name = "rohit";
    studentsarr[1].totalMarks = 264;

    studentsarr[2].name = "gaurav";
    studentsarr[2].totalMarks = 135;

    studentsarr[3].name = "rohan";
    studentsarr[3].totalMarks = 345;

    studentsarr[4].name = "rahul";
    studentsarr[4].totalMarks = 465;

    int x = 0;
    while(x <= 4){
        System.out.println(studentsarr[x].name);
        System.out.println(studentsarr[x].totalMarks);
        
        
        if (studentsarr[x].totalMarks > 450){
            System.out.println("youu achive first position...");
        }

        System.out.println();
    x = x+1;

    }
 
}
}
