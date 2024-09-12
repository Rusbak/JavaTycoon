package test;

public enum ButtonClick {
	Start		(true),
	Buy			(false),
	Upgrade		(false),
	Category	(false),
	UpgradeMenu	(true),
	ShopMenu	(true),
	SettingsMenu(true),
	Mission		(true),
	Default		(false);
	
	boolean clickable;
	
	ButtonClick(boolean clickable){
		this.clickable = clickable;
	}
	
	public static ButtonClick getButtonClick(String buttonType) {
		for (int i = 0; i < values().length; i++) {
			if (values()[i].toString().equals(buttonType)) {
				return values()[i];
			}
		} return Default;
	}	
	
//	public ButtonClick getButtonClick(String buttonType) {
//		for (int i = 0; i < ButtonClick.values().length; i++) {
//			if (ButtonClick.values()[i].toString().contains(buttonType)) {
//				return ButtonClick.values()[i];
//			}
//		}
//		return Default;
//	}	
	
//	public ButtonClick getButtonType(String buttonType) {
//		if (buttonType == "start") {return Start;}
//		else if (buttonType == "buy") {return Buy;}
//		else if (buttonType == "upgrade") {return Upgrade;}
//		else if (buttonType == "shop") {return Shop;}
//		else if (buttonType == "menu") {return Menu;}
//		else if (buttonType == "category") {return Category;}
//		else {return Default;}
//	}
}