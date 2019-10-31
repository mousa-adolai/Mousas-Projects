import javax.swing.JOptionPane;
public class GuiDialouge
{
   public static void main(String[] args)
   {
      String name, iS1,iS2; //input string 1 and to to be parsed into val1 and val2
      int val1, val2, max,min,avg;
      double avg;
      name= JOptionPane.showInputDialog("Enter your name:");
      iS1 = JOptionPane.showInputDialog("Enter 1st integer");
      iS2 = JOptionPane.showInputDialog("Enter 2nd integer");
      val1= Integer.parseInt(iS1);
      val2= Integer.parseInt(iS2);
      max= val1>=val2?val1:val2;
      min= val1>=val2?val2:val1;
      avg= (max+min)/2;
      JOptionPane.showMessageDialog(null, "Integer value 1: "+val1+" and value 2: "+val2+"\nmax: "+max+"\nmin: "+min+"\nAvg: "+avg+"\nHello "+name+" ,You are very smart");
      
      
   }


}