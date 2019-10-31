import java.util.Scanner;
import java.lang.Math;
class HW7P2
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String play="";
      while(!play.equals("q"))
      {
         int num1= (int)(Math.random()*20+1);
         int num2= (int)(Math.random()*20+1);
         int sum= num1+num2;
         System.out.println("What is "+num1+" plus "+num2+" ?");
         int input= in.nextInt();
         if(input==sum)
            System.out.println("Wow, Correct!");
         else
            System.out.println("Wrong!, the corret answer was "+sum+" !");
         System.out.println("Press Q and enter to quit or else press R and enter to restart");
         play=in.next().toLowerCase();
      }
   
   
   
   }




}