package tycoonGame;

public class CreateItemBox { //Make groupLayout instead
	
	//Instance variables
	private String name;
	private Integer value;
	private Integer amount;
	private Integer timer;
	private CreateButton startButton;
	private CreateButton buyButton;
	private CreateButton upgradeButton;
	//Some progress bar
	//Some picture
	//Some box spacing (above + below)
	
	//Constructors
	public CreateItemBox() {
		setName(null);
		setValue(null);
		setAmount(null);
		setTimer(null);
	}
	
	public CreateItemBox(String name, Integer value, Integer amount, Integer timer) {
		setName(name);
		setValue(value);
		setAmount(amount);
		setTimer(timer);
	}
	
	//Getters and setters
	public String 	getName() {return name;}
	public void		setName(String name) {this.name = name;}
	public Integer 	getValue() {return value;}
	public void		setValue(Integer value) {this.value = value;}
	public Integer 	getAmount() {return amount;}
	public void		setAmount(Integer amount) {this.amount = amount;}
	public Integer 	getTimer() {return timer;}
	public void		setTimer(Integer timer) {this.timer = timer;}
	
	//toString
	public String toString() {
		return
				"You have: "+getAmount()+getName()+"(s). They are worth: "+getValue()+" and takes "+getTimer()+" to produce.";
	}
}
