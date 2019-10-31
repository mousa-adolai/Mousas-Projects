import java.io.*;
import java.util.*;
class Cows
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int N=input.nextInt();
   //constraint control 2<=N<=20
      if(N<2)
         N=2;
      else if(N>20)
         N=20;
   //constraints over
      int[] Men = new int[N];
      for(int i=0; i<N; i++)
      {
         Men[i]= input.nextInt();
      }
   //so now I got an array of cows
   //first we will see if the whole subset is biased by checking if the sum is even 
   }
 /*
 public static class Cow
 {
 private int milk;
 public Cow(int m)
 {
 milk=m;
 }
 public int getM()
 {
 return milk;
 }
 }
 */ //i can just make an array of the values I dont need the class cow
   public static boolean isEven(int[] arr)
   {
      int total=0;
      for(int i=0; i<arr.length;i++)
         total=arr[i]+total;
      if(total%2==0)
         return true;
      return false;
   }
 
 
}