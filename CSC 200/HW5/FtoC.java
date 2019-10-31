import java.util.Scanner;
class FtoC
{
   public static void main(String[] args)
   {
      String name;
      double f,c;
      Scanner input= new Scanner(System.in);
      System.out.println("Hello can I have your name please");
      name= input.next();
      System.out.println("Hello "+name+", can you give a degree faranhiet");
      f=input.nextDouble();
      c= 5*(f-32)/9;
      System.out.format("%.2f"+" faranheit equals "+"%.2f"+" celsius",f,c);
   
   
   }



}