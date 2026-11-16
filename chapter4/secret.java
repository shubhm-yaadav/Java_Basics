class secrets{
    int secretNum (){
        return 5;
    }
}

public class secret {
    public static void main(String[] args) {
        secrets s = new secrets();
        int num = s.secretNum();
        System.out.println(num);
    }
}
