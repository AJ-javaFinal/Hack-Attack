//import java.awt.*;
//import javax.swing.*;
//public class GUI extends JFrame {
//    private JButton nb = new JButton("Forward");
//    private JButton sb = new JButton("Backward");
//    private JButton eb = new JButton("Right");
//    private JButton wb = new JButton("Left");
//    private JButton cb = new JButton("Attack");
//      private Container con = getContentPane();
//    public GUI()
//    {
//        con.setLayout(new BorderLayout());
//        con.add(nb, BorderLayout.NORTH);
//        con.add(sb, BorderLayout.SOUTH);
//        con.add(eb, BorderLayout.EAST);
//        con.add(wb, BorderLayout.WEST);
//        con.add(cb, BorderLayout.CENTER);
//        setSize(400, 150);
//    }
//    public static void main (String[]args){
//        GUI frame = new GUI();
//        frame.setVisible(true);
//    }
//}
import javax.swing.*;
import java.awt.*;
public class GUI extends JFrame{
    private final int WIDTH = 250;
    private final int HEIGHT = 120;
    private JButton button1 = new JButton("Super Easy");
    private JButton button2 = new JButton("Easy");
    private JButton button3 = new JButton("Medium");
    private JButton button4 = new JButton("Hard");
    private JButton button5 = new JButton("Super Hard");
    public GUI(){
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        con.add(panel1);
        con.add(panel2);
        con.add(panel3);
        panel1.add(button1);
        panel1.add(button2);
        panel2.add(button3);
        panel3.add(button4);
        setSize(WIDTH, HEIGHT);
    }
    public static void main(String[]args){
        GUI frame = new GUI();
        frame.setVisible(true);
    }
}
