import java.util.Scanner;
/*
so this program will make the smallest number possible of N using
d and adding it to the end of N x amount of times
i dont really get it yet but i have no doubt Ill get there
okay so basicly you must keep the same amount of digits in N 
but you can take out a digit from anywhere in the number but you must add d
to the end of N to replace the digit you just removed
methods we need
-first we need to determine how to get the smallest number
-a method that removes all numbers from N that are bigger than d
-a method that just adds d back into N until it has the appropriate number of digits
*/
class Beautiful_ChefDigit //CHDIGER -- easy
{

public static Double removeGD(double N,double  d)//returns N with every digit less than d removed
{
String x = String.valueOf(N);
String ans = "";
int index=x.length();
for(int i=0; i<index-2;i++)
{
int r = x.charAt(i)-48;//its the ascii val
if(r>d)
ans+=x.charAt(i);
}
if(ans.equals(""))
return 0.0;
return Double.parseDouble(ans);

}
public static double addGD(double N,double d,int i)//returns N with i number of digits added to the end of N
{
String ans = String.valueOf(N);
ans=ans.substring(0,ans.length()-2);
int r =i-ans.length();
String k =String.valueOf(d);
k=k.substring(0,k.length()-2);
for(int j=0;j<r;j++)
{
ans+=k;
}
return Double.parseDouble(ans);
}
   public static void main(String[] args)
   {
      double N, d;
      Scanner input=new Scanner(System.in);
      int t= input.nextInt();
      while(t-->0)
      {
         N=input.nextDouble();
         d=input.nextDouble();
         int i= String.valueOf(N).length()-2;
      N=removeGD(N,d);
      System.out.println(addGD(N,d,i));
      }
   }
}