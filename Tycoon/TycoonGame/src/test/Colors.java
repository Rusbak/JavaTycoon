package test;

import java.awt.Color;

public enum Colors { //this really don't matter do it?
	White(Color.white), 
	Black(Color.black), 
	Green(Color.green), 
	Gray(Color.gray), 
	Red(Color.red), 
	Orange(Color.orange),
	Blue(Color.blue),
	Yellow(Color.yellow),
	Pink(Color.pink),
	Magenta(Color.magenta),
	Default(Color.white);
	
	
	Color color;
	
	Colors(Color color){
		this.color = color;
	}
	
	public static Colors getColors(String color) {
		for(int i = 0; i < values().length; i++) {
			if (values()[i].toString().equals(color)) {
				return values()[i];
			}
		} return Default;
	}
	
//	public Colors getColors(String color) {
//		
//		for(int i = 0; i < Colors.values().length;) {
//			if (color == Colors.values()[i].toString()) {
//				return Colors.values()[i];
////			}
////			else if (color != Colors.values()[Colors.values().length].toString()) {
////				return White;
//			}
//			else {return White;}	
//		}
//		return null; //This might be fuckin Shit up?
//	}
}