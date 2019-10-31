import java.io.*;
import java.util.*;
public class Chef_Squared
{
   public static void main(String[]args)
   {
      Scanner input= new Scanner(System.in);
      int t = input.nextInt();
      while(t-->0)
      {
         int S,M; //the sizes of the smallest and largest group respectivly
         int L=0;
         int N = input.nextInt();
         int[] scores= new int[N];
         for(int i=0; i<N;i++)
         {
            scores[i]=input.nextInt();
            if(scores[i]<0)
               L++;
         }
         if(L==0)
         System.out.println(N+" "+N);
      //now we have our array of scores
      //if all the scores are positive there can only be one group so S=M=N
      
      
      }
   
   }

}






