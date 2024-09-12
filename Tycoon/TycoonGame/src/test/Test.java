package test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; //frames and shit
import java.awt.*; //clicking stuff

/** The todo's
 * Combine items (as component) to a springLayout. (i use)
 * Make items an array/list
 * Simplify component setup(external classes)
 * Make the items become selfaware(know their own information)
 * Add pictures
 * Make new pages for upgrades setting etc.
 * Make page scrollable
 */

public class Test {
	private static int buttonClicks;
	private static JLabel label;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(500,50,300,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JButton button1 = new JButton("Click");
		button1.setBounds(25,25,60,60); //varies per button
		button1.setBackground(Color.red); //varies per button type
		button1.setForeground(Color.white); //varies per button type
		
		JButton button2 = new JButton("Clack");
		button2.setBounds(85,25,175,30); //varies per button
		button2.setBackground(Color.white); //varies per button type
		button2.setForeground(Color.black); //varies per button type
		
		JButton button3 = new JButton("Cluck");
		button3.setBounds(85,55,150,30); //varies per button
		button3.setBackground(Color.green); //varies per button type
		button3.setForeground(Color.white); //varies per button type
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonClicks += 1;
				updateLabel();
				System.out.println(buttonClicks); //varies per button(type)
			}
		});
		
		JButton button4 = new JButton("Clock");
		button4.setBounds(235,55,25,30); //varies per button
		button4.setBackground(Color.orange); //varies per button type
		button4.setForeground(Color.white); //varies per button type
		
		label = new JLabel("Clicks");
		label.setBounds(125, 225, 100, 30);
		label.setText("Clicks: " + buttonClicks);
		
//		JButton button5 = new JButton("meh");
//		button5.setBounds(25,85,235,60);
//		button5.setBackground(Color.blue);
//		button5.setForeground(Color.lightGray);

		//add stuff to a springLayout, then add that to frame with a loop
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(label);
//		frame.add(button5);
	}
	
	public static void updateLabel() {
		label.setText("Clicks: " + buttonClicks);
	}

}
