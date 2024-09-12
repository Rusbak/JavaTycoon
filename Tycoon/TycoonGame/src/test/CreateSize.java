package test;

public class CreateSize { //change to Position
	private int width;
	private int height;
	public CreateSize size;

	CreateSize(int width, int height) {
		size = new CreateSize(width, height);
	}
	
	public CreateSize(String buttonType) {
		if (buttonType == "buy") {
			width = 1;
			height = 1;
			
		} else if (buttonType == "upgrade") {
			width = 1;
			height = 1;
			
		} else if (buttonType == "start") {
			width = 1;
			height = 1;
			
		} else if (buttonType == "upgradeMenu") {
			width = 1;
			height = 1;
			
		} else if (buttonType == "settingMenu") {
			width = 1;
			height = 1;
			
		} else if (buttonType == "shopMenu") {
			width = 1;
			height = 1;
			
		} else if (buttonType == "mission") {
			width = 1;
			height = 1;
			
		} else {
			return;
		}
	}
}
