package test;

import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JFrame;

import java.awt.Container;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.*;

public class ItemBox { //extends ProgressBar, Button
	private ProgressBar pb;
	private Button start, buy, upgrade;
	
    static JFrame frame = new JFrame("ItemBox");  
    static Container contentPanel = frame.getContentPane();  
	
	
	ItemBox(ProgressBar pb, Button start, Button buy, Button upgrade) { //might not be used because groupLayout privileges being used instead
		this.pb = pb;	
		this.start = start;
		this.buy = buy;
		this.upgrade = upgrade;
	}
	
	public static GroupLayout getItemBox(int index) {
		GroupLayout itemBox = new GroupLayout(contentPanel);
//		itemBox.setAutoCreateGaps(true);
//		itemBox.setAutoCreateContainerGaps(true);
		
		JButton startButton = Button.getButton("Start");
		JButton buyButton = Button.getButton("Buy");
		JButton upgradeButton = Button.getButton("Upgrade");
		JProgressBar progressBar = ProgressBar.getPB(index);
		
		itemBox.setHorizontalGroup(itemBox.createSequentialGroup()
				.addGroup(itemBox.createParallelGroup(LEADING, false)
						.addComponent(startButton))
				.addGroup(itemBox.createParallelGroup(TRAILING, false)
						.addComponent(progressBar)
						.addComponent(buyButton))
				.addGroup(itemBox.createParallelGroup(TRAILING, false)
						.addComponent(upgradeButton)));
		
		itemBox.setVerticalGroup(itemBox.createSequentialGroup()
				.addGroup(itemBox.createParallelGroup(BASELINE, false)
						.addComponent(startButton)
						.addComponent(progressBar))
				.addGroup(itemBox.createParallelGroup(BASELINE, false)
						.addComponent(startButton) //no?
						.addComponent(buyButton)
						.addComponent(upgradeButton)));
		
		return itemBox;
	}
	
	public static void main(String[] args) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setBounds(550,100,300,500);

		contentPanel.setLayout(getItemBox(0));
		
//		frame.pack();
		frame.setVisible(true);
	}
	
//	public static JButton getButton(String buttonType) {		
//		JButton button = new JButton(buttonType);
//		
//		button.setBackground(getColors(getButtonColors(buttonType).backgroundColor).color);
//		button.setForeground(getColors(getButtonColors(buttonType).foregroundColor).color);
//		
//		button.setBounds(getButtonBounds(buttonType).posX, getButtonBounds(buttonType).posY, getButtonBounds(buttonType).width, getButtonBounds(buttonType).height);
//		
//		button.setEnabled(getButtonClick(buttonType).clickable);
//		
//		button.addActionListener(ButtonAction.getActionListener(buttonType));
//		
//		return button;
//	}
	
//	public static void main(String[] args) {
//		JFrame frame = new JFrame("awesome sauce");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(550,100,300,500);
//		frame.setLayout(null);
//		frame.setVisible(true);
//		
//		//add everything to the frame
//		frame.add(getButton("Start"));
//	}
}
