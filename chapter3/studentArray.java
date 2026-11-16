// Create a Student class with name and marks. Declare Student[] arr = new Student[3]; and print arr[0]. What is printed, and why?
class student{
    String name;
    int marks;
}
public class studentArray {
    public static void main(String[] arr){
        student [] arrs = new student[3];
        // arrs[0] =  new student();
        // arrs[0].name = "shuham";
        System.out.println(arrs[0].name);
    }
}
