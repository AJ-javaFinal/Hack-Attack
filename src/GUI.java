import java.awt.*;
import java.awt.Color;
import javax.swing.*;
public class GUI extends JFrame {
    private JButton nb = new JButton("Forward");
    private JButton sb = new JButton("Backward");
    private JButton eb = new JButton("Right");
    private JButton wb = new JButton("Left");
    private JButton cb = new JButton("Attack");
//    private final int SIZE = 180;
      private Container con = getContentPane();
//    private JButton button = new JButton("Begin Game");
    public GUI()
    {
        con.setLayout(new BorderLayout());
        con.add(nb, BorderLayout.NORTH);
        con.add(sb, BorderLayout.SOUTH);
        con.add(eb, BorderLayout.EAST);
        con.add(wb, BorderLayout.WEST);
        con.add(cb, BorderLayout.CENTER);
        setSize(400, 150);
//        setSize(SIZE, SIZE);
//        con.setLayout(new FlowLayout());
//        con.add(button);
//        con.setBackground(Color.YELLOW);
//        button.setBackground(Color.RED);
//        button.setForeground(Color.WHITE);
    }
    public static void main (String[]args){
        GUI frame = new GUI();
        frame.setVisible(true);
    }
}
