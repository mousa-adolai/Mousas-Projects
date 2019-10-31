import java.util.*;
import java.io.*;

class Special_ingriedients
{
   String ans = "";
   //will return the string of special ingriedients
   public String special (String[] aaray)
   {
      int shortest = 200;
      int index;
      for(int j=0; j<aaray.length; j++)
      {
         if(j==0||aaray[j].length() <shortest)
         {
            index=j;
            shortest=aaray[j].length();
         }
      }
   //first will find shortest word aaray[index]
   
      return ans;
   }
   
   
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int t = input.nextInt();
      while(t-- != 0)
      {
         int dishes = input.nextInt();
         String[] plates = new String[dishes];
         for(int i = 0; i< dishes ; i++)
         {
            plates[i] = input.next();
         } 
      /*for(int y = 0; y<dishes ; y++)
      System.out.println(plates[y]); just checking*/
      }
   
   }



}