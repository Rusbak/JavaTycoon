package test;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JProgressBar;

public class Button {
	private Colors colors;
	private ButtonColors buttonColors;
	private ButtonBounds buttonBounds;
	private ButtonClick clickable;	
	private ButtonTypes buttonType;
	private static ActionListener buttonAction; //this is always null
	private static Button button;
	
//	public static Colors getColors(String color) {
//		for(int i = 0; i < Colors.values().length; i++) {
//			if (Colors.values()[i].toString().equals(color)) {
//				return Colors.values()[i];
//			}
//		} return Colors.Default;
//	}
	
//	public static ButtonColors getButtonColors(String buttonType) {
//		for (int i = 0; i < ButtonColors.values().length; i++) {
//			if (ButtonColors.values()[i].toString().equals(buttonType)) {
//				return ButtonColors.values()[i];
//			}
//		} return ButtonColors.Default;
//	}	
	
//	public static ButtonBounds getButtonBounds(String buttonType){ 
//		for (int i = 0; i < ButtonBounds.values().length; i++) {
//			if (ButtonBounds.values()[i].toString().equals(buttonType)) {
//				return ButtonBounds.values()[i];
//			}
//		} return ButtonBounds.Default;
//	}	

//	public static ButtonClick getButtonClick(String buttonType) {
//		for (int i = 0; i < ButtonClick.values().length; i++) {
//			if (ButtonClick.values()[i].toString().equals(buttonType)) {
//				return ButtonClick.values()[i];
//			}
//		} return ButtonClick.Default;
//	}	
	
//	public static ButtonTypes getButtonTypes(String buttonType) {
//		for (int i = 0; i < ButtonTypes.values().length; i++) {
//			if (ButtonTypes.values()[i].toString().equals(buttonType)) {
//				return ButtonTypes.values()[i];
//			}
//		} return ButtonTypes.Default;
//	}		
	
	
	Button(ButtonTypes buttonType, ButtonBounds buttonBounds) { //not used because JButton privileges being used instead
		this.buttonType = buttonType;
		this.buttonBounds = buttonBounds;
	}
	
	public static JButton getButton(String buttonType) {		
		JButton button = new JButton(buttonType);
		
		button.setBackground(Colors.getColors(ButtonColors.getButtonColors(buttonType).backgroundColor).color);
		button.setForeground(Colors.getColors(ButtonColors.getButtonColors(buttonType).foregroundColor).color);
		
		button.setBounds(ButtonBounds.getButtonBounds(buttonType).posX, 
						 ButtonBounds.getButtonBounds(buttonType).posY, 
						 ButtonBounds.getButtonBounds(buttonType).width, 
						 ButtonBounds.getButtonBounds(buttonType).height); //ButtonBounds doesn't return as a "rectangle" so it has to be done this scuffed way...
		button.setPreferredSize(button.getSize()); //so layoutManagers won't resize the components
		
		button.setEnabled(ButtonClick.getButtonClick(buttonType).clickable);
		
		button.addActionListener(ButtonAction.getActionListener(buttonType));
		
		return button;
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("awesome sauce");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(550,100,300,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
//		JSomething panel for itembox items
		
		//define what a progressBar is in another class
//		JProgressBar progressBar = new JProgressBar("nyooom");
		
		//add everything to the frame
		frame.add(getButton("Start"));
		frame.add(getButton("Buy"));
		frame.add(getButton("Upgrade"));
		
		frame.add(getButton("Category")); //call this in a main class
		frame.add(getButton("UpgradeMenu"));
		frame.add(getButton("ShopMenu"));
		frame.add(getButton("SettingsMenu"));
		frame.add(getButton("Mission"));
	}
}

/*
 * Create frame
 * create buttons
 * set size and stuff
 * put buttons in list/array
 * loop over the list/array to add to frame
 */

