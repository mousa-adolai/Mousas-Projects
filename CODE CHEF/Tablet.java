import java.util.*;
import java.io.*;
class Tablet
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int t = input.nextInt();
      while(t-- != 0)
      {
         int At = 0; //acceptable tablets based on the budget
         int N = input.nextInt(); //# of tablets
         int B = input.nextInt(); //Budget
         tablet[] tablets = new tablet[N];
         ArrayList<Integer> Area = new ArrayList<Integer>();
         //adding tablets to an array
         for(int i=0; i<N ; i++)
         {
            int w= input.nextInt();
            int l= input.nextInt();
            int p= input.nextInt();
            tablets[i] = new tablet(w,l,p);
         //I need to make an array of tablets(check)
         //then go through and see if our budget work for any of them
         //with the indexes that work we will find the largest area then we should be done
         }
         for(int y=0; y<N; y++)
         {
         //determining the amount of buyable tablets and collecting usable area
            if(tablets[y].getP()<=B)
            {
               At++;
               Area.add((tablets[y].getW())*(tablets[y].getL()));
            }
         }
         if(At==0)//saying there are no usable one or finding the largest tablet
         {
            System.out.println("no tablet");
         }
         else
         {
            System.out.println(Collections.max(Area));
         }
      }
   }
   public static class tablet
   {
      private int Width;
      private int Length;
      private int Price;
   
      public tablet(int w, int l, int p)
      {
         Width = w;
         Length = l;
         Price = p;
      
      }
      public int getW()
      {
         return Width;
      }
      public int getL()
      {
         return Length;
      }
      public int getP()
      {
         return Price;
      }
   
   }





}