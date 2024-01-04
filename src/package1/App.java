package package1;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       reportcard m1=new reportcard();
      if(m1.marksvalidation())

     {m1.display1();

       m1.display2();
       m1.display3();
       }
       else {
        System.out.println("enter the marks 1 to 100");
       }


    }
}
