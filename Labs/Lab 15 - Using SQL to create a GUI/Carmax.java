import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;

import java.awt.Dimension;
import java.awt.event.*;

public class Carmax {
	
	private JLabel L1, L2, L3, L4, L5, L6, L7;
	private JTextField textField1,textField2,textField3,textField4,textField5,textField6,textField7;
	private JButton button1, button2, button3, button4;
	
	private String[] columnNames = {"VIN","Brand","Model","Year","Mileage","Price","Color", "Brand New"};
	private Object[][] data={{"","","","","","",""}};
	private JTable table;
	private DefaultTableModel dm;
	private JScrollPane scroll;
	public Inventory iv = new Inventory();
	
	String login = "jdbc:mysql://35.222.177.233:3306/carmax?useSSL=false";


	
	public Carmax() {
		final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 800;
		JFrame window = new JFrame("Kilometer Converter");
		window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - window.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - window.getHeight()) / 2);
		window.setLocation(x, y);
		
		table = new JTable();
		dm = new DefaultTableModel(data, columnNames);
		table.setModel(dm);
		scroll = new JScrollPane(table);
		scroll.setSize(700, 270);
		scroll.setLocation(50, 50);
		window.add(scroll);

		
		L1 = new JLabel("VIN");
		L1.setSize(200, 30);
		L1.setLocation(100, 400);
		window.add(L1);
		textField1 = new JTextField(10);
		textField1.setSize(100, 30);
		textField1.setLocation(150, 400);
		window.add(textField1);
		
		L2 = new JLabel("Brand");
		L2.setSize(200, 30);
		L2.setLocation(100, 450);
		window.add(L2);
		textField2 = new JTextField(10);
		textField2.setSize(100, 30);
		textField2.setLocation(150, 450);
		window.add(textField2);
		
		L3 = new JLabel("Model");
		L3.setSize(200, 30);
		L3.setLocation(300, 450);
		window.add(L3);
		textField3 = new JTextField(10);
		textField3.setSize(100, 30);
		textField3.setLocation(380, 450);
		window.add(textField3);
		
		L4 = new JLabel("Year");
		L4.setSize(200, 30);
		L4.setLocation(500, 450);
		window.add(L4);
		textField4 = new JTextField(10);
		textField4.setSize(100, 30);
		textField4.setLocation(580, 450);
		window.add(textField4);
		
		L5 = new JLabel("Mileage");
		L5.setSize(200, 30);
		L5.setLocation(90, 500);
		window.add(L5);
		textField5 = new JTextField(10);
		textField5.setSize(100, 30);
		textField5.setLocation(150, 500);
		window.add(textField5);

		L6 = new JLabel("Price");
		L6.setSize(200, 30);
		L6.setLocation(300, 500);
		window.add(L6);
		textField6 = new JTextField(10);
		textField6.setSize(100, 30);
		textField6.setLocation(380, 500);
		window.add(textField6);

		L7 = new JLabel("Color");
		L7.setSize(200, 30);
		L7.setLocation(500, 500);
		window.add(L7);
		textField7 = new JTextField(10);
		textField7.setSize(100, 30);
		textField7.setLocation(580, 500);
		window.add(textField7);


		
		
		textField1 = new JTextField(10);
		textField1.setSize(100, 30);
		textField1.setLocation(200, 50);
		window.add(textField1);
		
		button1 = new JButton("Search");
		button1.setSize(100, 30);
		button1.setLocation(100, 350);
		button1.addActionListener(new Button1Clicked());
		window.add(button1);
		
		button2 = new JButton("Add");
		button2.setSize(100, 30);
		button2.setLocation(150, 350);
		button2.addActionListener(new Button1Clicked());
		window.add(button1);
		
		button3 = new JButton("Delete");
		button3.setSize(100, 30);
		button3.setLocation(300, 500);
		button3.addActionListener(new Button1Clicked());
		window.add(button1);
		
		button4 = new JButton("Update");
		button4.setSize(100, 30);
		button4.setLocation(400, 500);
		button4.addActionListener(new Button1Clicked());
		window.add(button1);
		
		window.setVisible(true);
		
		try {
			dm.setDataVector(((Object) iv).search(textField1.getText(),textField2.getText(), textField3.getText(), textField4.getText(), textField5.getText(), textField6.getText(), textField7.getText()), columnNames);
		}
		catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e1)
		{
			e1.printStackTrace();
		}
		dm.fireTableDataChanged();
	}
	
	private class Button1Clicked implements ActionListener //search buttton
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				dm.setDataVector(iv.search(textField1.getText(), textField2.getText(), textField3.getText(), textField4.getText(), textField5.getText(), textField6.getText(), textField7.getText()), columnNames);
			}
			catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e1)
			{
				e1.printStackTrace();
			}
			dm.fireTableDataChanged();
		}
	}
	private class Button2Clicked implements ActionListener //add button
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				dm.setDataVector(iv.add(textField1.getText(), textField2.getText(), textField3.getText(), textField4.getText(), textField5.getText(), textField6.getText(), textField7.getText()), columnNames);
			}
			catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e1)
			{
				e1.printStackTrace();
			}
			dm.fireTableDataChanged();
		}
	}
	
	
	class Inventory{
		public Object [][] search1() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
			
			Object[][] table = new Object[100][7];
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String s1 = "jdbc:mysql://35.222.177.233:3306/carmax?useSSL=false";
			Connection connection = DriverManager.getConnection(s1,"root", "N!ko10101");
			Statement st = connection.createStatement();
			
			ResultSet rs = st.executeQuery("select * from cars;");
			int x = 0;
			
			while(rs.next())
			{
				table[x][0] = rs.getString(1);
				table[x][1] = rs.getString(2);
				table[x][2] = rs.getString(3);
				table[x][3] = rs.getString(4);
				table[x][4] = rs.getString(5);
				table[x][5] = rs.getString(6);
				table[x][6] = rs.getString(7);
				table[x][7] = rs.getString(8);
				x++;
			}
			
			connection.close();
			return table;
		
		}
		
		public Object [][] add(String s1, String s2, String s3, String s4, String s5, String s6, String s7) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
		{
			Object [][] table = new Object [100][8];
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String s11 = "jdbc:mysql://35.222.177.233:3306/carmax?useSSL=false";
			Connection connection = DriverManager.getConnection(login, "root", "1234");
			
			PreparedStatement st = connection.prepareStatement("INSERT INTO cars Values (?, ?, ?, ?, ?, ?, ?, ?)");
			
			st.setString(1, s11);
			st.setString(2, s2);
			st.setString(5, s3);
			st.setString(3, s4);
			st.setString(4, s5);
			st.setString(6, s6);
			st.setString(7, s7);
			st.setBoolean(8, true);
			
			st.executeUpdate();
			
			
			
			connection.close();
			return table;
		
		}
	}
}
