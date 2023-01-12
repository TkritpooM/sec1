import java.awt.*;
import javax.swing.*;

public class TestGUI extends JFrame{
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;
	private JLabel length ,width, area ,parameter;

	//Constructor
	public TestGUI() {
	    setTitle("Area and Perimeter");
	    setSize(WIDTH,HEIGHT);
	    setVisible(true);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    
	    length = new JLabel("Enter the length : ");
	    width = new JLabel("Enter the length : ");
	    area = new JLabel("Enter the length : ");
	    parameter = new JLabel("Enter the length : ");
	    
	    //GridLayout
	    GridLayout L = new GridLayout(7,1);
	    setLayout(L);
	    
	    add(length);
	    add( width);
	    add(area);
	    add(parameter);
	}
	
	public static void main(String[] args) {
		TestGUI prog = new TestGUI();
	}

}
