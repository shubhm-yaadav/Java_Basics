class value{
    void go(int z){
        z = 0;
        System.out.println(z);
    }
}

public class passingTheCopy {
    public static void main (String[] args){
        int x = 7;
        value v = new value(); 
        v.go(x);

    }    
}
