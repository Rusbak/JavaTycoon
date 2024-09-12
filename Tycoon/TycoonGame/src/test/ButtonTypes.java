package test;

public enum ButtonTypes {
	Start		(ButtonColors.Start, ButtonClick.Start),
	Buy			(ButtonColors.Buy, ButtonClick.Buy),
	Upgrade		(ButtonColors.Upgrade, ButtonClick.Upgrade),
	Category	(ButtonColors.Category, ButtonClick.Category),
	UpgradeMenu	(ButtonColors.UpgradeMenu, ButtonClick.UpgradeMenu),
	ShopMenu	(ButtonColors.ShopMenu, ButtonClick.ShopMenu),
	SettingsMenu(ButtonColors.SettingsMenu, ButtonClick.SettingsMenu),
	Mission		(ButtonColors.Mission, ButtonClick.Mission),
	Default		(ButtonColors.Default, ButtonClick.Default);
	
	ButtonTypes buttonType; //not used?
	ButtonColors buttonColor;
	ButtonClick buttonClick;
	
	ButtonTypes(ButtonColors buttonColor, ButtonClick buttonClick){
		this.buttonColor = buttonColor;
		this.buttonClick = buttonClick;
	}
	
	public static ButtonTypes getButtonTypes(String buttonType) {
		for (int i = 0; i < values().length; i++) {
			if (values()[i].toString().equals(buttonType)) {
				return values()[i];
			}
		} return Default;
	}	
	
//	public ButtonTypes getButtonTypes(String buttonType) {
//		for (int i = 0; i < ButtonTypes.values().length; i++) {
//			if (ButtonTypes.values()[i].toString().contains(buttonType)) {
//				return ButtonTypes.values()[i];
//			}
//		}
//		return Default;
//	}	
	
//	public ButtonTypes getButtonType(String buttonType) {
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
