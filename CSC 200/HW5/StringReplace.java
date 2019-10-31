import java.util.Scanner;
class StringReplace
{
   public static void main(String[] args)
   {
      String name,color,food,animal;
      Scanner input = new Scanner(System.in);
      System.out.println("Give me a name of someone you know");
      name = input.next();
      System.out.println("Give me your favorite color");
      color= input.next();
      System.out.println("Give me your favorite food");
      food = input.next();
      System.out.println("Give me your favorite animal");
      animal = input.next();
      System.out.println("I had a dream that "+name+" ate a "+color+" "+animal+" and it tasted like "+food);
   
   
   }



}