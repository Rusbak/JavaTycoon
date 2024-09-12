//package test;
//
//import java.awt.Point;
//
////public interface CreateButton { //Make type of button a string? to make it easier accessible
////	int 	getPosX();
////	int 	getPosY(); //could probably combine coordinates
////	int 	getWidth();
////	int 	getHeight();
////	Colors 	getBackgroundColor();
////	Colors 	getForegroundColor();
////	boolean getClickable();
////}
//
//public class CreateButton { //Make type of button a string? to make it easier accessible
////	private int posX;
////	private int posY; //could probably combine coordinates (class or interface)
//	//private Point position;
////	private CreatePos position;
////	private int width;
////	private int height;
//	//private Point size; //not a Point
////	private CreateSize size;
////	private Colors backgroundColor;
////	private Colors foregroundColor;
//	private ButtonColors buttonColors;
//	private ButtonClick clickable;
//	
////	private boolean buy;
////	private boolean start;
////	private boolean upgrade;
//	
//	private ButtonTypes buttonType;
//	//private String buttonType; //this should go through buttonColor & clickable
//	
////	public void setPos(int posX, int posY) {
////		position.x = posX;
////		position.y = posY;
////		//position(posX, posY);
////		
////		CreatePos(int posX, int posY);
////	}
////	
////	public CreatePos getPos() {return position;} //call these from CreatePos class
////	
////	public void setSize(int width, int height) {
////		size.x = width;
////		size.y = height;
////		//size(width, height);
////	}
//	
////	public CreateSize getSize() {return size;} //call these from CreateSize Class
//	
////	public void setButtonColor(ButtonTypes buttonType) {
////		this.buttonColors = buttonType.getClass();
////		
////		this.buttonColors = buttonColors;
////	}
//	
//	public ButtonColors getButtonColor() {return buttonColors;} //call these from ButtonColors Class
//	
//	public void setButtonClick(String clickable) { //Could just be true/false calls
//		if (clickable == "Click") {this.clickable = true;}
//		else if (clickable == "NoClick") {this.clickable = false;}
//		else {System.out.println("I don't know if clickable or not...");}
//	}
//	
//	public ButtonClick getButtonClick() {return clickable;} //call these from ButtonClick Class
//	
////	public void setButtonType(ButtonColors buttonColors, boolean clickable) {
////		this.buttonColors = setButtonColors(buttonType);
////		this.clickable = setButtonClick(buttonType);
////	}
//	
////	public void setButtonType(String buttonType) {
////		buttonColors = ButtonColors.valueOf(buttonType);
////		clickable = ButtonClick.valueOf(buttonType);
////	}
////	
//	public ButtonTypes getButtonType() {
//		return buttonType;
//	}
//	
//	
//	CreateButton(ButtonTypes buttonType) {
//		//Do Something
//		this.buttonType = buttonType;
//	}
//}
//
