import java.util.Scanner;
class HW6p1
{
   public static void main (String[] args)
   {
      String in;
      int temp;
      Scanner input = new Scanner(System.in);
      System.out.println("What type of degree do you want converted: Celsius ('C' or 'c') or Farenhiet ('F' or 'f')");
      in = input.next();
      if(in.equals("F")||in.equals("f")||in.equals("C")||in.equals("c"))
      {
      System.out.println("Please enter your degree");
      temp= input.nextInt();
      if(in.equals("F")||in.equals("f"))
      {
      System.out.println("You entered "+temp+" degrees F");
      temp = 5*(temp-32)/9;
      System.out.println("Which equals "+temp+" degrees C");
      }
      else
      {
      System.out.println("You entered "+temp+" degrees C");
      temp = 9*temp/5+32;
      System.out.println("Which equals "+temp+" degrees F");

      }
      
      }
      else
      {
         System.out.println("Your input was incorrect please restart the program and try again");
      }
   
   
   
   }






}