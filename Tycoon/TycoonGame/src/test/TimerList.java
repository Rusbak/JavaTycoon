package test;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/*
 * Each categories first items timer, translate to the number of the category
 * Cat1 Item1 = index1
 * Cat1 Item2 = index2
 * 
 * Cat2 Item1 = index2
 * Cat2 Item2 = index3 ...and so on
 */

public enum TimerList { //milliseconds i guess (its in seconds because of 1 second timer)
	a(10),
	b(25),
	c(50),
	d(100),
	e(250),
	f(600);
	
	int maxTime;
	
	TimerList(int maxTime){
		this.maxTime = maxTime;
	}
	
//	public static int getMaxTime(int index) {
//		for(int i = 0; i < TimerList.values().length; i++) {
//			if (TimerList.values()[i].ordinal() == index) {
//				return TimerList.values()[i].maxTime;
//			}
//		} return 999999;
//	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("awesome sauce");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(550,100,300,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
//		for (int i = 0; i < TimerList.values().length; i++) {
//			System.out.println(getMaxTime(i));
//		}
		
		//add everything to the frame
//		frame.add(getPB(a.maxTime));
//		frame.add(getPB(b.maxTime));
//		frame.add(getPB(c.maxTime));
//		frame.add(getPB(d.maxTime));
//		frame.add(getPB(e.maxTime));
//		frame.add(getPB(f.maxTime));
	}
}
