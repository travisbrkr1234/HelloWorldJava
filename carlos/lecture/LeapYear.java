import java.util.Scanner;

   public class LeapYear {
     public static void main(String[] args) {
       int yeartocheck;
       boolean isleap=false;
       Scanner scan=new Scanner(System.in);
       do{
         isleap=false;
         System.out.print("\n\n\n\nEnter a year and I will deduce whether it is/was a leap year or not. \n");
         System.out.print("You can end at any time by inputting a zero \"0\"\n\n");
         yeartocheck=scan.nextInt();
         if(yeartocheck>=1582)
         {
           if(yeartocheck%100==0 && yeartocheck%400==0)
             isleap=true;
           else if(yeartocheck%4==0 && yeartocheck%100!=0)
             isleap=true;
           if(isleap){
             System.out.print(yeartocheck+" is a leap year!");
           }
           else
           {
             System.out.print(yeartocheck + " is not a leap year.");
           }
         }
         else
         {
           System.out.print(yeartocheck+" is before 1582, the year that the leap year was established. Please select a year on or after 1582");
         }
       } while(yeartocheck!=0);
     }
   }
