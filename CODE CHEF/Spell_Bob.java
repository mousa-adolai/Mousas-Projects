import java.io.*;
import java.util.*;

class Spell_Bob
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int t = input.nextInt();
      while(t-- >0)
      {
         String A=input.nextLine().trim();
         String B=input.nextLine().trim();
         if(((A.charAt(0)=='b'||B.charAt(0)=='b')&&(A.charAt(1)=='b'||B.charAt(1)=='b')&&(A.charAt(2)=='o'||A.charAt(2)=='o'))||
         ((A.charAt(0)=='b'||B.charAt(0)=='b')&&(A.charAt(1)=='o'||B.charAt(1)=='o')&&(A.charAt(2)=='b'||A.charAt(2)=='b'))||
         ((A.charAt(0)=='o'||B.charAt(0)=='o')&&(A.charAt(1)=='b'||B.charAt(1)=='b')&&(A.charAt(2)=='b'||A.charAt(2)=='b')))
            System.out.println("yes");
         else
            System.out.println("no");
      
      
      }
   
   }



}