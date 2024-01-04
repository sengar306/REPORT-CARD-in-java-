package package1;

import java.util.Scanner;

    class marks extends student{
   float m1,m2,m3,m4,m5;
   Scanner sc=new Scanner(System.in);
   marks()
   {
    System.out.println("enter the physics marks out of 100");
    this.m1=sc.nextInt();
    System.out.println("enter the chemistry marks out of 100");
     this.m2=sc.nextInt();
    System.out.println("enter the math marks out of 100");
     this.m3=sc.nextInt();
    System.out.println("enter the hindi marks out of 100");
     this.m4=sc.nextInt();
    System.out.println("enter the english marks out of 100");
     this.m5=sc.nextInt();
}
Boolean marksvalidation()
{
    if(this.m1<0 || this.m2<0 || this.m3<0 || this.m4<0 || this.m5<0) 
    {
        return false;
    }
    else if(this.m1>100 || this.m2>100 || this.m3>100 || this.m4>100 || this.m5>100) 
    {
        return false;
    }
    else 
    {
        return true;
    }
}
String passed(float marks)
{  
  
     if(marks<30)
    { 
    return "fail";
    }
   else {
    return "pass";
   }
}


void display2()
{       System.out.println("--------------------------------------------------");
        System.out.println("SUBJECTS     MARKS OUT OF   RESULT ");
        System.out.println("Physics    : " + this.m1  + "   "+ "100      " +passed(m1));
        System.out.println("chemistry  : " + this.m2  + "   "+ "100      "  +passed(m2));
        System.out.println("Math       : " + this.m2  + "   "+ "100      "+passed(m3));
        System.out.println("Hindi      : " + this.m2  + "   "+ "100      "+passed(m4));
        System.out.println("English    : " + this.m2  + "   "+ "100      "+passed(m5));
}

}
