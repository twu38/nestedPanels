/*  NestedPanels.java
 *  
 *  Display a frame containing 2 panels.Each panel should contain 2 images. 
 *  Fix the size of the first panel so that both of its images remain side by side.  
 *  Allow the other panel to change size as needed.
 *
 *  @author    TICHIN WU
 *  @version   1.8.0
 *  @since     12/6/2016
 */
import java.awt.*;
import javax.swing.*;

public class NestedPanels
{
    public static void main(String[] arg)
    {
	 
     JFrame frame= new JFrame("Nested Panels");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
     
     // set the images
     ImageIcon icon1 = new ImageIcon("dancer1.gif");
     ImageIcon icon2 = new ImageIcon("dancer2.gif");	
     ImageIcon icon3 = new ImageIcon("dancer3.gif");
     ImageIcon icon4 = new ImageIcon("dancer4.gif");	 
     	 
     JLabel label1 = new JLabel(icon1);
     JLabel label2 = new JLabel(icon2);
     JLabel label3 = new JLabel(icon3);
     JLabel label4 = new JLabel(icon4);
    
     // set up subpanel 
     JPanel subPanel1= new JPanel();
     subPanel1.setPreferredSize(new Dimension(400,400));
     subPanel1.setBackground(Color.black);
     
     // add lebals to subpanel1 
     subPanel1.add(label1);
     subPanel1.add(label2);
     
     // set up subpanel2
     JPanel subPanel2 = new JPanel(); 
     subPanel2.setBackground(Color.white);
     
     // add lebals to subpanel2
     subPanel2.add(label3);
     subPanel2.add(label4);
     
     //set primary panel to hold 2 subpanels and set the border manager
     JPanel primaryPanel = new JPanel();
     primaryPanel.setLayout(new BorderLayout());
     primaryPanel.setBackground(Color.gray);
     primaryPanel.setPreferredSize(new Dimension(600,400));
     
     //add subpanels to primary panel
     primaryPanel.add(subPanel1,BorderLayout.WEST);
     primaryPanel.add(subPanel2,BorderLayout.CENTER);
  
     //add primary panel and it's components to the content pane.
     frame.getContentPane().add(primaryPanel);
     frame.setSize(800,400);
     frame.pack();
     frame.setVisible(true);	
    }	   
}     