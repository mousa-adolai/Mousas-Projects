import javax.swing.*;
import java.awt.*;
class firstGUI extends JFrame //video 2 test: completed
{
   JLabel label;
   JTextField texteditor;
   JButton button;
   firstGUI()
   {
      setLayout(new FlowLayout());
      label = new JLabel("Hi Im Mousa");
      add(label);
      texteditor = new JTextField(11);
      add(texteditor);
      button = new JButton("Do I also11");
      add(button);
   }
   public static void main(String[] args)
   {
      firstGUI mousa = new firstGUI();
      mousa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mousa.setSize(200,150);
      mousa.setVisible(true);
      mousa.setTitle("Test GUI 2");
   
   }




}