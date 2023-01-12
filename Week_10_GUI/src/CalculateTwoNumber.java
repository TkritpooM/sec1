import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 536);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JLabel lblNewLabel = new JLabel("Enter Number 2");
		lblNewLabel.setBounds(114, 143, 105, 31);
		contentPane.add(lblNewLabel);

		final JLabel lblNewLabel_1 = new JLabel("Enter Number 1");
		lblNewLabel_1.setBounds(114, 101, 105, 31);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(273, 106, 105, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(273, 148, 105, 20);
		contentPane.add(textField_1);

		final JComboBox cmbOperator = new JComboBox();
		cmbOperator.setBounds(273, 203, 105, 22);
		// contentPane.add(cmbOperator);
		cmbOperator.addItem("+");
		cmbOperator.addItem("-");
		cmbOperator.addItem("*");
		cmbOperator.addItem("/");
		contentPane.add(cmbOperator);

		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(114, 199, 105, 31);
		contentPane.add(lblOperator);
		
		JLabel lblHowToShow = new JLabel("How to show digit");
		lblHowToShow.setBounds(114, 242, 105, 31);
		contentPane.add(lblHowToShow);

		final JRadioButton rdbtnNewRadioButton = new JRadioButton("1 Digit");
		rdbtnNewRadioButton.setBounds(269, 246, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2 Digit");
		rdbtnNewRadioButton_1.setBounds(269, 272, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);

		JLabel lblOptionToShow = new JLabel("Option to show");
		lblOptionToShow.setBounds(114, 310, 105, 31);
		contentPane.add(lblOptionToShow);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Result at DialogBox");
		chckbxNewCheckBox.setBounds(273, 314, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		final JLabel lblNewLabel_2 = new JLabel("Show Result");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(114, 365, 117, 39);
		contentPane.add(lblNewLabel_2);

		final JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				double num1, num2, sum = 0;
				String operator;
				if (a.getSource() == btnNewButton) {
					if (textField.getText().equals("") || textField_1.getText().equals("")) {
						System.out.println("Input some number !!!");

					} else {
						num1 = Double.parseDouble(textField.getText());
						num2 = Double.parseDouble(textField_1.getText());
						operator = (String) cmbOperator.getSelectedItem();
						if (operator.equals("+"))
							sum = num1 + num2;
						if (operator.equals("-"))
							sum = num1 - num2;
						if (operator.equals("*"))
							sum = num1 * num2;
						if (operator.equals("/"))
							sum = num1 / num2;
						
						DecimalFormat frmNumber = null;
						if (rdbtnNewRadioButton.isSelected()) {
							frmNumber = new DecimalFormat("#,###.0");
						}
						else if (rdbtnNewRadioButton_1.isSelected()) {
							frmNumber = new DecimalFormat("#,###.00");
						}
						lblNewLabel_2.setText(frmNumber.format(sum));
					}
				}
			}
		});
		btnNewButton.setBounds(114, 418, 117, 39);
		contentPane.add(btnNewButton);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(283, 418, 117, 39);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel_3 = new JLabel("Number Operator");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(153, 30, 247, 39);
		contentPane.add(lblNewLabel_3);

		

		

	}
}
