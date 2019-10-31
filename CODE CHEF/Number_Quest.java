import java.io.*;
import java.util.*;

class Number_Quest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int Q = input.nextInt();
      Query[] Queries = new Query[Q];
      for(int i =0; i<Q; i++)
      {
         int L = input.nextInt();
         int R = input.nextInt();
         int O = input.nextInt();
         int K = input.nextInt();
         Queries[i] = new Query(L,R,O,K);
      }
      //going thru every query and returning who won
      for(int y=0; y<Q; y++)
      {
         int pointsO=0;
         int pointsK=0;
         int index = Queries[y].getR()-Queries[y].getL();
         if(index==1)
            index++;
         int[] seq = new int[index];
         int[] delt = new int[index];
         seq[0]=Queries[y].getL();
         seq[index-1] = Queries[y].getR();
      //filling up the seq of consec number for each query
         for(int j=1; j<index-1; j++)
         {
            seq[j]= seq[0]+j;
         }
      // making the delta sequence
         for(int f=0; f<index; f++)
         {
            int x = seq[f];
            delt[f]= delta(x);
         }
      //checking through for O
         for(int a=0; a<index; a++)
         {
            if(delt[a]==Queries[y].getO())
               pointsO++;
         }
         
      //going through for K
         for(int b=0; b<index; b++)
         {
            if(delt[b]==Queries[y].getK())
               pointsK++;
         }
      //Telling You who won
         if(pointsK>pointsO)
         {
            System.out.println("Krushna");
         }
         else if(pointsO>pointsK)
         {
            System.out.println("Onkar");
         }
         else
            System.out.println("Draw");
      }
   
   
   }

   static class Query
   {
      private int Left;
      private int Right;
      private int Onkar;
      private int Kurishma;
   
      public Query(int L, int R, int O, int K)
      {
         Left=L;
         Right = R;
         Onkar = O;
         Kurishma = K;
      }
   
      public int getL()
      {
         return Left;
      }
      public int getR()
      {
         return Right;
      }
      public int getO()
      {
         return Onkar;
      }
      public int getK()
      {
         return Kurishma;
      }
   }
   
   public static int delta (int x)
   {
      if (x<10)
      {
         return x;
      }
      else
      {
      //finding dum of digits
         int sum =0;
         while(x>0)
         {
            sum=sum+(x%10);
            x = x/10;
         }
         delta(sum);
      }
   return 0;
   }
   

}