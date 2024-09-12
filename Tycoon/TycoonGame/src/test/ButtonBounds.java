package test;

public enum ButtonBounds {
	Start		(0, 0, 50, 50),
	Buy			(50, 25, 150, 25),
	Upgrade		(200, 25, 25, 25),
	Category	(15, 50, 90, 50),
	UpgradeMenu	(180, 420, 120, 50),
	ShopMenu	(60, 420, 120, 50),
	SettingsMenu(0, 420, 60, 50),
	Mission		(0, 0, 50, 50),
	Default		(10, 10, 10, 10);
	
	int posX;
	int posY;
	int width;
	int height;
	ButtonBounds buttonBounds;

	ButtonBounds(int posX, int posY, int width, int height){
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
	}
	
	public static ButtonBounds getButtonBounds(String buttonType){ 
		for (int i = 0; i < values().length; i++) {
			if (values()[i].toString().equals(buttonType)) {
				return values()[i];
			}
		} return Default;
	}	
	
//	public ButtonBounds getButtonBounds(String buttonType){ 
//		for (int i = 0; i < ButtonBounds.values().length; i++) {
//			if (ButtonBounds.values()[i].toString().contains(buttonType)) {
//				return ButtonBounds.values()[i];
//			}
//		}
//		return Default;
//	}	
}
	
//	public ButtonBounds setButtonBounds()
//public class CreatePos { //change to Position
//	private int posX;
//	private int posY;
//	public CreatePos position;
//	
////	CreatePos(int posX, int posY){
////		this.posX = posX;
////		this.posY = posY;
////	}
//	CreatePos(int posX, int posY) {
//		position = new CreatePos(posX, posY);
//	}
//	
//	public CreatePos(String buttonType) {
//		if (buttonType == "buy") {
//			posX = 0;
//			posY = 0;
//		} else if (buttonType == "upgrade") {
//			posX = 0;
//			posY = 0;
//		} else if (buttonType == "start") {
//			posX = 0;
//			posY = 0;
//		} else if (buttonType == "upgradeMenu") {
//			posX = 0;
//			posY = 0;
//		} else if (buttonType == "settingMenu") {
//			posX = 0;
//			posY = 0;
//		} else if (buttonType == "shopMenu") {
//			posX = 0;
//			posY = 0;
//		} else if (buttonType == "mission") {
//			posX = 0;
//			posY = 0;
//		} else {
//			return;
//		}
//	}
//}
//package test;
//
//public class CreateSize { //change to Position
//	private int width;
//	private int height;
//	public CreateSize size;
//
//	CreateSize(int width, int height) {
//		size = new CreateSize(width, height);
//	}
//	
//	public CreateSize(String buttonType) {
//		if (buttonType == "buy") {
//			width = 1;
//			height = 1;
//			
//		} else if (buttonType == "upgrade") {
//			width = 1;
//			height = 1;
//			
//		} else if (buttonType == "start") {
//			width = 1;
//			height = 1;
//			
//		} else if (buttonType == "upgradeMenu") {
//			width = 1;
//			height = 1;
//			
//		} else if (buttonType == "settingMenu") {
//			width = 1;
//			height = 1;
//			
//		} else if (buttonType == "shopMenu") {
//			width = 1;
//			height = 1;
//			
//		} else if (buttonType == "mission") {
//			width = 1;
//			height = 1;
//			
//		} else {
//			return;
//		}
//	}
//}

