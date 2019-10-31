import java.io.*;
import java.util.*;

public class Adakng
{

   final static int ROW = 8, COLUMN = 8;
   public static int oneMove(int r,int c)//return number of avalable places to move for one turn
   {
      int q=9;
      if(r<=1||r>=ROW)
      {
         q-=3;
      }
      if(c<=1||c>=COLUMN)
      {
         q-=3;
      }
      if(q==3)
         q++;
      return q;
   }
   public static int recurKing(int k,int r,int c)
   {
      if(k==0)
      {
         return 1;
      }
      else if(oneMove(r,c)==4)//corner
      {
         return (int)Math.pow((k+1),2);
      }
      else if(oneMove(r,c)==6)//edge
      {
         return (k*2+1)*(k+1);
      }
      else if(oneMove(r,c)==9)//middle
      {
         return (int)Math.pow((k*2+1),2);
      }
      return 0;
   }
   public static void main(String[] args)
   {
      int s,r,c,k; //the total amount of spaces he can visit
      Scanner input= new Scanner(System.in);
      System.out.println("give amount of moves, starting row and col. I will return the amount of the possible spaces you can reach");
      k=input.nextInt();
      r=input.nextInt();
      c=input.nextInt();
      s=recurKing(k,r,c);
      //edge cases fix//
      //edge cases for corner first (there are no edge cases)
      //edge cases for edge pieces
      if(oneMove(r,c)==6)
      {
      if(r==1||r==ROW)
      {
         if(c-k<=0)
            s=s-(k+1)*((c-k)*-1+1);
         if(c+k>COLUMN)
            s=s-(k+1)*(c+k-COLUMN);
      //first we see what edge its on
      }//its on the top or bottom edge
      else if(c==1||c==COLUMN)
      {
         if(r-k<=0)
            s=s-(k+1)*((r-k)*-1+1);
         if(r+k>ROW)
            s=s-(k+1)*(r+k-ROW);
      }//its on left or right edge
      }
      if(oneMove(r,c)==9)
      {
      int Ca =0; //calamity var
      if(c-k<=0) //checks if it goes over the left side
      {
            s=s-(k*2+1)*((c-k)*-1+1);
            Ca+=(c-k)*-1+1;
            }
         if(c+k>COLUMN) //checks overflow on the right side
          {
            s=s-(k*2+1)*(c+k-COLUMN);
            Ca+=(c+k-COLUMN);
            }
         if(r-k<=0) //checks overflow on top
            s=s-(k*2+1)*((r-k)*-1+1)+Ca*((r-k)*-1+1);
         if(r+k>ROW)//checks overflow on the bottom
            s=s-(k*2+1)*(r+k-ROW)+Ca*(r+k-ROW);   
      }
      if(s>ROW*COLUMN)
         s=64;
      System.out.println(s);
   }

}
