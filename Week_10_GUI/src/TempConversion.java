import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class TempConversion extends JFrame{

	private static final int WIDTH = 500;
	private static final int HEIGHT = 100;
	
	private JLabel celcius ,fahrenheit;
	
	private JTextField Tcelcius ,Tfahrenheit;
	
	private static final double FTOC = 5.0/9.0;
	private static final double CTOF = 9.0/5.0;
	private static final double OFFSET = 32;
	
	//Constructor
	public TempConversion() {
		setTitle("Temperature Conversion");
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,4));
		
		//Define Component
		celcius = new JLabel("Temp in Celcius : ");
	    fahrenheit = new JLabel("Temp in Fahrenheit : ");
	    
		Tcelcius = new JTextField(10);
		Tfahrenheit = new JTextField(10);
		
		// add component
		c.add(celcius);
	    c.add(Tcelcius);
	    c.add(fahrenheit);  
	    c.add(Tfahrenheit);
	    
	    
	    
	    //Celcius 
	    CelsHandler ch = new CelsHandler();
	    Tcelcius.addActionListener(ch);
	    //Fahrenheit
	    FahHandler fh = new FahHandler();
	    Tfahrenheit.addActionListener(fh);
	    
	    setSize(WIDTH,HEIGHT);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setVisible(true);
	}
	
	private class CelsHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celcius,fahrenheit;
			celcius = Double.parseDouble(Tcelcius.getText());
			fahrenheit = celcius * CTOF + OFFSET;
			Tfahrenheit.setText(String.format("%.2f",fahrenheit));
		}
	}
	
	private class FahHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celcius,fahrenheit;
			fahrenheit = Double.parseDouble(Tfahrenheit.getText());
			celcius = (fahrenheit- OFFSET) * FTOC ;
			Tcelcius.setText(String.format("%.2f",celcius));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempConversion tp = new TempConversion();

	}

}
