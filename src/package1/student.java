package package1;

import java.util.Scanner;

public class student {
   
    
     String name;
     int rollno;
     String dob;
     String fathername;
    student()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the name :");
       this.name=sc.next();
       System.out.println("Enter the Rollno :");
       this.rollno=sc.nextInt();
       System.out.println("Enter the DoB:");
       this.dob=sc.next();
       System.out.println("Enter the fathername:");
       this.fathername= sc.next();
    }
    void display1()
    {   System.out.println("----------------------------------------");
         System.out.println("----------------------------------------");
        System.out.println("Name        :" + this.name);
        System.out.println("Roll.no     :" + this.rollno);
        System.out.println("FatherName  :" + this.fathername);
        System.out.println("DOB         :" + this.dob);

    }
    
}

