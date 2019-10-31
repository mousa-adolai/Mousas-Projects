import java.io.*;
import java.util.*;
class Puzzle_Game
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int t = input.nextInt();
      String done = "123456789";
      int count = 0;
      while(t-->0)
      {
         int[][] puzzle = new int[3][3];
         //adding user input into double array
         for(int row = 0; row< 3; row++)
         {
            for(int col = 0 ;col< 3; col++)
            {
               puzzle[row][col]= input.nextInt();
            }
         }
         //checking if there are any moves if not return -1
         if(checkR(puzzle)||checkL(puzzle)||checkUp(puzzle)||checkD(puzzle))
         {
         //check how many moves
         //I have no where to go from here how do i solve a puzzle with code
            System.out.print("x");
         }
         else
            System.out.print("-1");
      }
   }
   //checking right side    
   public static boolean checkR (int array[][])
   {
      int prime = 0;
      for(int row = 0; row< 3; row++)
      {
         for(int col = 0 ;col< 2; col++)
         {
            prime = array[row][col]+ array[row][col+1];
            if(prime==3||prime==5||prime==7||prime==11||prime==13||prime==17)
               return true;           
         }
      }
      return false;
   }
//checking Left,up,and down
   public static boolean checkL (int array[][])
   {
      int prime = 0;
      for(int row = 0; row< 3; row++)
      {
         for(int col = 1 ;col< 3; col++)
         {
            prime = array[row][col]+ array[row][col-1];
            if(prime==3||prime==5||prime==7||prime==11||prime==13||prime==17)
               return true;           
         }
      }
      return false;
   }
   public static boolean checkUp (int array[][])
   {
      int prime = 0;
      for(int row = 1; row< 3; row++)
      {
         for(int col = 0 ;col< 2; col++)
         {
            prime = array[row][col]+ array[row-1][col];
            if(prime==3||prime==5||prime==7||prime==11||prime==13||prime==17)
               return true;           
         }
      }
      return false;
   }
   public static boolean checkD (int array[][])
   {
      int prime = 0;
      for(int row = 0; row< 2; row++)
      {
         for(int col = 0 ;col< 3; col++)
         {
            prime = array[row][col]+ array[row+1][col];
            if(prime==3||prime==5||prime==7||prime==11||prime==13||prime==17)
               return true;           
         }
      }
      return false;
   }

}