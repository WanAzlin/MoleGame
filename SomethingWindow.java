import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SomethingWindow extends JFrame
{
    public SomethingWindow()
    {
        super("This is my application");
        JPanel jp=new JPanel(new FlowLayout());
        add(jp);
        setSize(320,150);
     
        JButton aButton = new JButton("Push me");
        jp.add(aButton);
	JButton bButton;
	bButton = new JButton();
	bButton.setText("Click me");
	jp.add(bButton);
	jp.add(new JButton("Nothing")); // anonymous obj. style_
	
	aButton.addActionListener(new AButtonActionListener());
	bButton.addActionListener(new BButtonActionListener());
	
	ArrActionListener arl = new ArrActionListener();
	for (int x=0;x<4;x++){
	    JButton btnArr = new JButton("Button "+x); // all buttons here named btnArr
	    jp.add(btnArr);
	    btnArr.addActionListener(arl);
	} // This jp comes from JPanel above
	
        setVisible(true);
    }
    
    private class AButtonActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt){
            JOptionPane.showMessageDialog(null,"A button was pushed!");
        }
    }
    
    private class BButtonActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt){
            JOptionPane.showMessageDialog(null,"B button was clicked!");
        }
    }
    
    private class ArrActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            String btn=evt.getActionCommand();  // grab text from button
            JOptionPane.showMessageDialog(null,btn+" was pressed!");
        }
    }
    
    public static void main(String[] args)
    { 
        new SomethingWindow();
    }
}
