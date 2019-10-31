import java.util.Scanner;
class BirthdayWizard
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("What year were you born in?");
int year = input.nextInt();
System.out.println("Give me a year");
int year1 = input.nextInt();
System.out.println("In the year "+year1+" you will be "+(year1-year)+" years old."); 


}




}