import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SomethingWindow extends JFrame
{
    public SomethingWindow()
    {
        super("Student Info");
        JPanel jp=new JPanel(new FlowLayout());
        add(jp);
        setSize(320,150);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new SomethingWindow();
    }
}
