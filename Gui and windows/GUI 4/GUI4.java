import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUI4 extends JFrame//Test GUI4 Complete
{
   JLabel label;
   JButton button;
   int count = 0;
   GUI4()
   {
   setLayout(new FlowLayout());
      label = new JLabel("Im not gay");
      add(label);
      button = new JButton("Change");
      add(button);
      event e = new event();
      button.addActionListener(e);
   }
   public class event implements ActionListener{
      public void actionPerformed(ActionEvent e){
         if(count/2==0){
            label.setText("Im gay");
            count++;
         }else{
            label.setText("Im not gay");
            count++;
         }
      }
   }
   public static void main(String[] args)
   {
   GUI4 mousa = new GUI4();
   mousa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   mousa.setSize(200,150);
   mousa.setVisible(true);
   mousa.setTitle("inner switch");
   }
}