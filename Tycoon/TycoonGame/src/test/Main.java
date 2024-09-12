package test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Main {
	static Timer timer = new Timer(); //this is most likely not correct

	public static void update() {
		TimerTask addTime = new TimerTask() {
			@Override
			public void run() {
				//do all the update stuff here
			};
		};
		
		timer.scheduleAtFixedRate(addTime, new Date(), 1000); //have this in the main method
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("awesome sauce");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(550,100,300,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
//		//add everything to the frame - call this stuff in the itemBox class
//		frame.add(Button.getButton("Start"));
//		frame.add(ProgressBar.getPB(0));
//		frame.add(Button.getButton("Buy"));
//		frame.add(Button.getButton("Upgrade"));
		
		frame.add(Button.getButton("Category")); //loop over all the categories
		frame.add(Button.getButton("UpgradeMenu"));
		frame.add(Button.getButton("ShopMenu"));
		frame.add(Button.getButton("SettingsMenu"));
		frame.add(Button.getButton("Mission"));
	}
}

//TODO for this class:
//Have an overall update funtion, call this using the scheduleAtFixedRate method
//Print all the menu buttons - ✔
//	make it possible to actually go to these menues and stuff - do in buttonAction class
//		have information about stuff elsewhere, but call and print from this class (getters and setters)
//Print the itemBoxes specific to the selected category
//	actually "make" the categories elsewhere
//		the categories needs information from the itemList, as to what it should actually print
//			just start of with placeholders, nerd
//
//
//TODO for other classes:
//Progressbar only goes off when item is clicked
//	or when item is automated
//Make it possible to buy more of an item - change the buttonString to actual price
//	make funtion for what new items should cost
//Do some math of how much rep of the PB - maybe also for the time it takes
//	itemType * amount * bought stuff
//		where would I actually change this information??
//			maybe as object in the itemList instead of just strings??
//Instead of printing all items in the category
//	only print the items you have and the next non-bought item
//For later: decide on one overall economy or economy for each category
//	maybe have a main economy and an alternative economy, based on time or something else
//
