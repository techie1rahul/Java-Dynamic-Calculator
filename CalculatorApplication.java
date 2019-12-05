package day19;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalulatorApplication extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
   
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalulatorApplication frame = new CalulatorApplication();
					frame.setVisible(true);
				    }
            catch(Exception e)
            {
					      e.printStackTrace();
				    }
			}
		});
	}

	/**
	 * Create the frame.
	 */
	double num,ans;
	int calculation;
	
	public void arithmetic_operation()				// FOR OPERATION //
	{
		switch(calculation)
		{
		case 1:			// FOR ADDITION //
			ans=num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 2:			// FOR SUBSTRACTION //
			ans=num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 3:			// FOR MULTIPLICATION //
			ans=num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 4:			// FOR DIVISION //
			ans=num % Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 5:			// FOR MODULUS //
			ans=num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		}
	}
	public CalulatorApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 447);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		textField = new JTextField();
		textField.setBounds(6, 57, 355, 71);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblStandardCalculator = new JLabel("Standard Calculator");
		lblStandardCalculator.setForeground(Color.WHITE);
		lblStandardCalculator.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		lblStandardCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblStandardCalculator.setBounds(68, 16, 225, 29);
		contentPane.add(lblStandardCalculator);
		
		JButton btnNewButton_9 = new JButton("0");				// FOR BUTTON 0 //
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btnNewButton_9.setBounds(85, 362, 75, 57);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_2 = new JButton("1");				// FOR BUTTON 1 //
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btnNewButton_2.setBounds(6, 302, 75, 60);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("2");				// FOR BUTTON 2 //
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btnNewButton_3.setBounds(85, 302, 75, 60);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_8 = new JButton("3");				// FOR BUTTON 3 //
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btnNewButton_8.setBounds(163, 302, 75, 60);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_1 = new JButton("4");				// FOR BUTTON 4 //
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btnNewButton_1.setBounds(6, 242, 75, 60);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("5");				// FOR BUTTON 5 //
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btnNewButton_6.setBounds(85, 242, 75, 60);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("6");				// FOR BUTTON 6 //
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btnNewButton_7.setBounds(163, 242, 75, 60);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton = new JButton("7");				// FOR BUTTON 7 //
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");

			}
		});
		btnNewButton.setBounds(6, 181, 75, 60);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("8");				// FOR BUTTON 8 //
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btnNewButton_5.setBounds(85, 181, 75, 60);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_10 = new JButton("9");				// FOR BUTTON 9 //
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btnNewButton_10.setBounds(163, 181, 75, 60);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_4 = new JButton(".");				// FOR BUTTON . //
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btnNewButton_4.setBounds(6, 362, 75, 57);
		contentPane.add(btnNewButton_4);
		
		JButton button_3 = new JButton("+");					// FOR ADDITION OPERATION //
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 1;
				textField.setText("");
			}
		});
		button_3.setBounds(244, 362, 117, 57);
		contentPane.add(button_3);
		
		JButton button_2 = new JButton("-");					// FOR SUBSTRACTION OPERATION //
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 2;
				textField.setText("");
			}
		});
		button_2.setBounds(244, 302, 117, 60);
		contentPane.add(button_2);
		
		JButton btnX = new JButton("x");						// FOR MULTIPLICATION OPERATION //
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 3;
				textField.setText("");
			}
		});
		btnX.setBounds(244, 242, 117, 60);
		contentPane.add(btnX);
		
		JButton button_1 = new JButton("%");					// FOR DIVISION OPERATION //
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 4;
				textField.setText("");
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(244, 181, 117, 60);
		contentPane.add(button_1);
		
		JButton button_4 = new JButton("/");					// FOR MODULUS OPERATION //
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 5;
				textField.setText("");
			}
		});
		button_4.setBounds(244, 131, 117, 50);
		contentPane.add(button_4);
		
		JButton button = new JButton("=");						// FOR EQUAL TO OPERATION //
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
			}
		});
		button.setBounds(163, 362, 75, 57);
		contentPane.add(button);
		
		JButton btnCe = new JButton("CE");						// FOR CLEAR SCREEN //
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnCe.setBounds(163, 131, 75, 50);
		contentPane.add(btnCe);						//7050337898
	}
}
