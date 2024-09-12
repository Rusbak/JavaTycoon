package test;

//public class CreatePos {
//	private int posX;
//	private int posY;
//	private Position pos; //Create new class???
//	
//	public CreatePos() {
//		setPosX(null);
//		setPosY(null);
//	}
//	
//	public CreatePos(Integer posX, int posY) {
//		setPosX(posX);
//		setPosY(posY);
//	}
//	
//	public int 		getPosX() {return posX;}
//	public void		setPosX(Integer posX) {this.posX = posX;}
//	public int 		getPosY() {return posY;}
//	public void		setPosY(Integer posY) {this.posY = posY;}
//	public Position getPos() {return pos;}
//	public void		setPos(Position posX, Position posY) {this.pos = pos;}

public class CreatePos { //change to Position
	private int posX;
	private int posY;
	public CreatePos position;
	
//	CreatePos(int posX, int posY){
//		this.posX = posX;
//		this.posY = posY;
//	}
	CreatePos(int posX, int posY) {
		position = new CreatePos(posX, posY);
	}
	
	public CreatePos(String buttonType) {
		if (buttonType == "buy") {
			posX = 0;
			posY = 0;
		} else if (buttonType == "upgrade") {
			posX = 0;
			posY = 0;
		} else if (buttonType == "start") {
			posX = 0;
			posY = 0;
		} else if (buttonType == "upgradeMenu") {
			posX = 0;
			posY = 0;
		} else if (buttonType == "settingMenu") {
			posX = 0;
			posY = 0;
		} else if (buttonType == "shopMenu") {
			posX = 0;
			posY = 0;
		} else if (buttonType == "mission") {
			posX = 0;
			posY = 0;
		} else {
			return;
		}
	}
}
