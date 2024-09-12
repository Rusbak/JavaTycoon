package test;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar {
	
//	static int maxTime;
	static TimerList timerList;
	static boolean isAutomated; //if(isAutomated){timer.scheduleAtFixedRate(addTime, new Date(), 1000);}
	
//	ProgressBar(int maxTime){
//		this.maxTime = maxTime;
//	}
	
//	static Timer timer = new Timer();
//	static TimerTask addTime = new TimerTask() {
//		@Override
//		public void run() {
//			System.out.println("why do i have to exist?"); //i dont if pb gets iterated outside own scope
//		};
//	};
	
	public static JProgressBar getPB(int index) {	
		int maxTime = getMaxTime(index);
		JProgressBar pb = new JProgressBar(0, maxTime); //...getMaxTime(int index)
		pb.setBackground(Color.gray);
		pb.setForeground(Color.green);
		pb.setBounds(50,0,175,25); 
		pb.setPreferredSize(pb.getSize());
		pb.setValue(0);
		pb.setStringPainted(true);
		
//		pb.addChangeListener(SOMETHING); //do something in the ButtonAction class
		
		
		Timer timer = new Timer(); //have timer in a super class (buttonAction?)
		TimerTask addTime = new TimerTask() {
			@Override
			public void run() {
				pb.setValue(pb.getValue()+1); //loop over an array here instead
				Integer pbText = maxTime - pb.getValue();
				pb.setString(pbText.toString() + " sec");
//				System.out.println(pb.getString());//<----------------
				if (pb.getValue() == maxTime) {
					//Do something - add economy stuff
					pb.setValue(0); //why do this?
					pb.setString(maxTime + " sec");
				}
			};
		};
		
		timer.scheduleAtFixedRate(addTime, new Date(), 1000);
		
//		Timer timer = new Timer();
//		TimerTask addTime = new TimerTask() {
//			@Override
//			public void run() {
//				for(int i = 0; i <= maxTime; i++) {
//					pb.setValue(i);    
//					System.out.println(i);  
//				}
//			};
//		};		
//		timer.scheduleAtFixedRate(addTime, new Date(), maxTime);
		
		return pb;
	}
	
	public static int getMaxTime(int index) {
		for(int i = 0; i < TimerList.values().length; i++) {
			if (TimerList.values()[i].ordinal() == index) {
				return TimerList.values()[i].maxTime;
			}
		} return 999999;
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("awesome sauce");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(550,100,300,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
//		JProgressBar pb = new JProgressBar(0, 10); //this is ONLY for testing purposes
//		pb.setBackground(Color.gray);
//		pb.setForeground(Color.green);
//		pb.setBounds(40,25,160,30); 
//		pb.setValue(0);
////		pb.setValue(maxTime);    
//		pb.setStringPainted(true);
		
//		Timer timer = new Timer(); //have timer in a super class
//		TimerTask addTime = new TimerTask() {
//			@Override
//			public void run() {
//				Integer pbText = maxTime - pb.getValue();
//				pb.setString(pbText.toString());
//				pb.setValue(pb.getValue()+1); //loop over an array here instead
//				System.out.println(pb.getValue());
//			};
//		};
//		timer.scheduleAtFixedRate(addTime, new Date(), 1000);
		frame.add(getPB(0));
		frame.add(getPB(1));
		frame.add(getPB(2));
		
		
		//add everything to the frame
//		for(int i = 0; i < TimerList.values().length; i++); {
//			frame.add(getPB(i));
//		}
		
		
//		frame.add(getPB(0));
//		frame.add(getPB(1));
		
//		frame.add(getPB(TimerList.a.maxTime));
//		frame.add(getPB(TimerList.b.maxTime));
//		frame.add(getPB(TimerList.c.maxTime));
//		frame.add(getPB(TimerList.d.maxTime));
//		frame.add(getPB(TimerList.e.maxTime));
//		frame.add(getPB(TimerList.f.maxTime));

		//This should be called in the ProgressBar constructor :)
//		timer.scheduleAtFixedRate(addTime, new Date(), maxTime); //test hvor den går galt med println
		}
}
