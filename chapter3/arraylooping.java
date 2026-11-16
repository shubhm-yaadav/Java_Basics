// Fill that array with 3 Student objects (using new for each) and print all of them with a loop.
class student{
    String name;
}
public class arraylooping {
    public static void main(String[] args){
        student [] arrs = new student[3];
        arrs[0] = new student();
        arrs[0].name = "shubham";
        arrs[1] = new student();
        arrs[1].name = "rohit";
        arrs[2] = new student();
        arrs[2].name = "rahul";
        
        for(student arrr : arrs){
            System.out.println(arrr[0]);
        }
    }
}
