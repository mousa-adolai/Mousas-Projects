import javax.swing.JFrame; //https://www.youtube.com/watch?v=mjOicuXEvwg title: Java GUI Tutorial 1 - Creating the window

class GUI extends JFrame
{
   public static void main (String[] args)
   {
      GUI mousa = new GUI(); // defaultly constructs a jframe object
      mousa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the program end when the window is closed
      mousa.setSize(2000,1000);
      mousa.setVisible(true); //makes it so you can see the window
      mousa.setTitle("Mosua's First Window");
   
   
   }



}