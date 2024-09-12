package test;

public enum ButtonColors {	
	Start		("Red", "White"),
	Buy			("Green", "White"),
	Upgrade		("Orange", "White"),
	Category	("Magenta", "White"),
	UpgradeMenu	("Yellow", "Black"),
	ShopMenu	("Red", "Black"),
	SettingsMenu("Gray", "White"),
	Mission		("Pink", "Black"),
	Default		("White", "Black");
	
	
	String backgroundColor, foregroundColor;
	
	ButtonColors(String backgroundColor, String foregroundColor){
		this.backgroundColor = backgroundColor;
		this.foregroundColor = foregroundColor;
	}
	
	public static ButtonColors getButtonColors(String buttonType) {
		for (int i = 0; i < values().length; i++) {
			if (values()[i].toString().equals(buttonType)) {
				return values()[i];
			}
		} return Default;
	}
	
//	Start(Colors.Red, Colors.White),
//	Buy(Colors.Green, Colors.White),
//	Upgrade(Colors.Orange, Colors.White),
//	Category(Colors.Magenta, Colors.White),
//	UpgradeMenu(Colors.Yellow, Colors.Black),
//	ShopMenu(Colors.Red, Colors.Black),
//	SettingsMenu(Colors.Gray, Colors.White),
//	Mission(Colors.Pink, Colors.Black),
//	Default(Colors.White, Colors.Black);
//	
//	
//	Colors backgroundColor, foregroundColor;
//	
//	ButtonColors(Colors backgroundColor, Colors foregroundColor){
//		this.backgroundColor = backgroundColor;
//		this.foregroundColor = foregroundColor;
//	}
	
//	public ButtonColors getButtonColors(String buttonType) {
//		for (int i = 0; i < Buttonvalues().length; i++) {
//			if (Buttonvalues()[i].toString().contains(buttonType)) {
//				return Buttonvalues()[i];
//			}
//		}
//		return Default;
//	}

	//	public ButtonColors getButtonColors(String buttonType) {
//		if (buttonType == "start") {return Start;}
//		else if (buttonType == "buy") {return Buy;}
//		else if (buttonType == "upgrade") {return Upgrade;}
//		else if (buttonType == "category") {return Category;}
//		else if (buttonType == "upgradeMenu") {return UpgradeMenu;}
//		else if (buttonType == "shopMenu") {return ShopMenu;}
//		else if (buttonType == "settingsMenu") {return SettingsMenu;}
//		else if (buttonType == "mission") {return Mission;}
//		else {return Default;}
//	}
	
}
