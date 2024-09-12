package tycoonGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CreateButton {
	
	//Instance variables
	private Integer height;
	private Integer width;
	private Integer posX;
	private Integer posY;
	private String boxColor;
	private String textColor;
	private boolean clickable;
	
	//Constructors
	public CreateButton() {
		setHeight(null);
		setWidth(null);
		setPosX(null);
		setPosY(null);
		setBoxColor(""); //it will just be default, so not needed?
		setTextColor(""); //it will just be default, so not needed?
		setClickable(false);
	}
	
	public CreateButton(Integer height, Integer width, Integer posX, Integer posY,
			String boxColor, String textColor, boolean clickable) {
		setHeight(height);
		setWidth(width);
		setPosX(posX);
		setPosY(posY);
		setBoxColor(boxColor);
		setTextColor(textColor);
		setClickable(clickable);
	}
	
	//Getters and setters
	public Integer 	getHeight() {return height;}
	public void		setHeight(Integer height) {this.height = height;}
	public Integer 	getWidth() {return width;}
	public void		setWidth(Integer width) {this.width = width;}
	public Integer 	getPosX() {return posX;}
	public void		setPosX(Integer posX) {this.posX = posX;}
	public Integer 	getPosY() {return posY;}
	public void		setPosY(Integer posY) {this.posY = posY;}
	public String 	getBoxColor() {return boxColor;}
	public void		setBoxColor(String boxColor) {this.boxColor = boxColor;}
	public String 	getTextColor() {return textColor;}
	public void		setTextColor(String textColor) {this.textColor = textColor;}
	public boolean 	getClickable() {return clickable;}
	public void		setClickable(boolean clickable) {this.clickable = clickable;}
	
	public static void main(String[] args) {		
		JFrame frame = new JFrame("Default Button");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Click Me!");
		button.setBounds(50,50,100,30); //varies per button
		button.setBackground(Color.green); //varies per button type
		button.setForeground(Color.white); //varies per button type
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Clicked"); //varies per button(type)
			}
		});
		
		frame.add(button);
		
		frame.setSize(200,150);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
