package test;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Box {
	static JFrame frame = new JFrame("awesome sauce");
	static JPanel box = new JPanel(); //rename to itemBox or something
	
	static List<JPanel> itemBoxes = new ArrayList<JPanel>();
	
//	static Container box = frame.getContentPane();
	
	public static void getBox(int index) { //rename to getItemBox
		int vSpace = index * 75;
		
		JPanel box = new JPanel(); 
		box.setLayout(null);
		box.setBounds(25,(0 + vSpace),225,50);
		box.setBackground(Colors.Gray.color);

		box.add(Button.getButton("Start"), 0); //add specific buttons
		box.add(Button.getButton("Buy"), 1);
		box.add(Button.getButton("Upgrade"), 2);
		box.add(ProgressBar.getPB(index), 3); //I think these are index points

		itemBoxes.add(box); //maybe loop over indexes here instead?
		frame.add(box);
	}
	
	public static void main(String[] args) {
//		JFrame frame = new JFrame("awesome sauce");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(550,100,300,500);
		frame.setLayout(null);
		
//		getBox(0);
		
		//for each item in category, get itembox
		for(int i = 0; i<5; i++) {
			getBox(i);
		}

		frame.setVisible(true);
	}
}
