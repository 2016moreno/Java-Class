package classexamples;
import javax.swing.*;

import java.awt.Toolkit;

import java.awt.Dimension;
import java.awt.event.*;

public class carmax {
	
	private JLabel messageLabel1;
	private JTextField textField1;
	private JButton button1;
	
	public carmax() {
		final int WINDOW_WIDTH = 325, WINDOW_HEIGHT = 180;
		JFrame window = new JFrame("Kilometer Converter");
		window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - window.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - window.getHeight()) / 2);
		window.setLocation(x, y);

		
		messageLabel1 = new JLabel("Enter a distance in kilometers");
		messageLabel1.setSize(200, 30);
		messageLabel1.setLocation(10, 50);
		window.add(messageLabel1);
		textField1 = new JTextField(10);
		textField1.setSize(100, 30);
		textField1.setLocation(200, 50);
		window.add(textField1);
		button1 = new JButton("Calculate");
		button1.setSize(100, 30);
		button1.setLocation(100, 100);
		
		button1.addActionListener(new Button1Clicked());

		window.add(button1);
		
		window.setVisible(true);
		
	}
	
	private class Button1Clicked implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
            JOptionPane.showMessageDialog(null, Double.parseDouble(textField1.getText())*0.6214+" miles");
		}
	}

	
	public static void main(String[] args) {
		new carmax();
	}

}
