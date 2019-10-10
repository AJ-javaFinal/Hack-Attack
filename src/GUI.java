import java.awt.*;
import java.awt.Color;
import javax.swing.*;
public class GUI extends JFrame {
    private JButton nb = new JButton("Forward");
    private JButton sb = new JButton("Forward");
    private JButton eb = new JButton("Forward");
    private JButton wb = new JButton("Forward");
    private JButton cb = new JButton("Forward");
    private final int SIZE = 180;
    private Container con = getContentPane();
    private JButton button = new JButton("Begin Game");
    public GUI()
    {
        setSize(SIZE, SIZE);
        con.setLayout(new FlowLayout());
        con.add(button);
        con.setBackground(Color.YELLOW);
        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);
    }
    public static void main (String[]args){
        GUI frame = new GUI();
        frame.setVisible(true);
    }
}
