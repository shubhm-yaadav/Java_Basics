public class Xcopy {
    public static void main(String[] args){
         int orgi = 42;
         Xcopy  copy = new Xcopy();
         int y = copy.go(orgi);
         System.out.println(orgi +"....." +y);



    }

    int  go(int arg){
        arg = arg * 2;
        return arg;
    }
}
