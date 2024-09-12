package tycoonGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class test {
	private static int buttonClicks;
	private static JLabel label;
	
	public static void main(String[] args) {		
		JFrame frame = new JFrame("Clicker Simulator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(500,50,300,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JButton button1 = new JButton("Click");
		button1.setBounds(25,100,250,75); //varies per button
		button1.setBackground(Color.green); //varies per button type
		button1.setForeground(Color.white); //varies per button type
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonClicks += 1;
				updateLabel();
				System.out.println(buttonClicks); //varies per button(type)
			}
		});
		
		JButton button2 = new JButton("Restart");
		button2.setBounds(75,300,150,30); //varies per button
		button2.setBackground(Color.pink); //varies per button type
		button2.setForeground(Color.black); //varies per button type
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonClicks = 0;
				updateLabel();
				System.out.println(buttonClicks); //varies per button(type)
			}
		});
		
		label = new JLabel("Clicks");
		label.setBounds(125, 225, 100, 30);
		label.setText("Clicks: " + buttonClicks);

		frame.add(button1);
		frame.add(button2);
		frame.add(label);
	}
	
	public static void updateLabel() {
		label.setText("Clicks: " + buttonClicks);
	}

}
