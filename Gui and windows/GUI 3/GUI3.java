import java.awt.*;
import javax.swing.*;
class GUI3 extends JFrame //image object added to JFrame// GUI3 test Complete
{
   ImageIcon pic;
   JLabel pichold;
   ImageIcon pic2;
   JLabel pichold2;
   GUI3()
   {
      setLayout(new FlowLayout());
      pic = new ImageIcon(getClass().getResource("funny1.png"));
      pichold = new JLabel(pic);
      add(pichold);
      pic2 = new ImageIcon(getClass().getResource("keanu.jpg"));
      pichold2 = new JLabel(pic2);
      add(pichold2);
   
   }
   public static void main(String[] args)
   {
      GUI3 mousa = new GUI3();
      mousa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mousa.pack();
      mousa.setTitle("Beauty");
      mousa.setVisible(true);
   
   
   }






}