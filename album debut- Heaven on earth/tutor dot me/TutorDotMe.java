import java.util.Scanner;
class TutorDotMe
{
   String Name;
   int DateOfBirth;
   String Bio;
   String PS;//previous schooling--this is how tutours will identify the student, and the app will ask for it
   public TutorDotMe (String n,int d, String b,String ps) 
   {
      Name=n;
      DateOfBirth=d;
      Bio=b;
      PS=ps;//previous schooling
   }
   public String toString()
   {
   return Name+" "+DateOfBirth/1000000+"/"+(DateOfBirth%1000000)/10000+"/"+DateOfBirth%10000+"\nBio\n"+Bio+"\nPrevious Schooling\n"+PS; //returns all the things needed for a profile page on the app i.e name, D.O.B,bio,and profile picture
   }
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("name, date of birth, and bio, and previous/current schooling");
      TutorDotMe account = new TutorDotMe(input.next(),input.nextInt(),input.nextLine(),input.nextLine());
      System.out.println(account);
   }

}