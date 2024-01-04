package package1;

    class reportcard extends marks{

        float percentage;
        float total;
        reportcard()
        {
        }
        float total()
        {
           this.total=super.m1+super.m2+super.m3+super.m4+super.m5;
          
           return this.total;
        }
        float percentage()
        {
            return this.percentage=(total/500)*100;
        }
      
        String resulted()
        {
                  if(this.percentage<30)
                  {
                    return "fail";
                  }
                  else{
                    return "pass";
                  }
       }
       String grade()
       {
        if(this.percentage>90 && this.percentage<100)
        {
            return "A";
        }
       else if(this.percentage>80 &&this.percentage<90)
        {
            return "B";
        }
       else if(this.percentage>70 && this.percentage<80)
        {
            return "C";
        }
       else  if(this.percentage>60 && this.percentage<70)
        {
            return "D";
        }
        else {
            return "E";
        }
        
       }
       void display3()
       {
          System.out.println("----------------------------------------");
          System.out.println("Total marks    :  " +"    "+this.total());
          System.out.println("percentage     :  " +"    "+this.percentage());
          System.out.println("Result         :  " +"    "+this.resulted());
          System.out.println("Grade          :  " +"    "+this.grade());
    
       }
    
    }
    
    

