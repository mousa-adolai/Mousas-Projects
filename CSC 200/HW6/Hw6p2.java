import java.util.Scanner;
class Hw6p2 /*
Mousa Adolai

prints date given and replies with a statement of validity and if invalid says why

*/

{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      boolean valid=true;
      System.out.println("Give me a date in the format of mm/dd/year");
      String date = input.next();
      int breakindex= date.indexOf("/");
      String monthString = date.substring(0,breakindex);
      String rest= date.substring(breakindex+1);
      int breakindex1 = rest.indexOf("/");
      String dayString = rest.substring(0,breakindex1);
      String yearString = rest.substring(breakindex1+1);
      int month = Integer.parseInt(monthString);
      int day = Integer.parseInt(dayString);
      int year = Integer.parseInt(yearString);
      String reason= "";
      if(year<0){ //checking year
         reason = "the year is wrong";
         valid = false;
      }
      else if(month>12||month<1)
      { //checking month
         reason = "the month is wrong";
         valid = false;
      }
      else if(day<0||day>=28)
      {//checking day
         valid = false;
         reason ="the day is wrong";
         if(month==1||month==3||month==5||month==7||month==9||month==10||month==12)
            if(day<=31)
               valid=true;
         if(month==4||month==6||month==9||month==11)
            if(day<=30)
               valid = true;
         if((year%100!=0&&year%400!=0)&&year%4==0)
         {//leap year
            if(day<=29)
               valid = true;
         }
         else
            if(day<=28)
               valid= true;
               
      }
      if(valid)
      {
         System.out.println("Your date, "+date+" is valid");
      }
      else
      {
         System.out.println("Your date "+date+" is invalid because "+reason);
      }
   
   
   }








}