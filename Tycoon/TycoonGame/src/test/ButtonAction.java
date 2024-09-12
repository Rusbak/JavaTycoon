package test;

import java.awt.event.*;

public class ButtonAction {
	private static ActionListener buttonAction; //maybe use the ActionListener object instead
	
	public static ActionListener getActionListener(String buttonType) {
//    	System.out.println("dafuq");

		
		if (buttonType == "") {
			buttonAction = new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			    	System.out.println("Default");
			            //Do nothing - Default
			    }
			};
		}	
		else if (buttonType == "Start") {
			buttonAction = new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			    	System.out.println(buttonType);
			            //run the PB - once
			    		//use the scheduleAtFixedRate method from the PB class
			    }
			};
		}
		else if (buttonType == "Buy") {
			buttonAction = new ActionListener(){  
			    public void actionPerformed(ActionEvent e){    
			    	System.out.println(buttonType);
			            //if affordable add one item
			    }
			};
		}
		else if (buttonType == "Upgrade") {
			buttonAction = new ActionListener(){  
			    public void actionPerformed(ActionEvent e){    
			    	System.out.println(buttonType);
			            //go to the upgradeMenu for this item
			    }
			};
		}
		else if (buttonType == "Category") {
			buttonAction = new ActionListener(){  
			    public void actionPerformed(ActionEvent e){    
			    	System.out.println(buttonType);
			            //switch to the selected category, if it not the current one
			    }
			};
		}
		else if (buttonType == "UpgradeMenu") {
			buttonAction = new ActionListener(){  
			    public void actionPerformed(ActionEvent e){    
			    	System.out.println(buttonType);
			            //open the upgradeMenu
			    }
			};
		}
		else if (buttonType == "ShopMenu") {
			buttonAction = new ActionListener(){  
			    public void actionPerformed(ActionEvent e){    
			    	System.out.println(buttonType);
			            //Open the shop for like buying cards and stuff, probably one of the last things to do
			    }
			};
		}
		else if (buttonType == "SettingsMenu") {
			buttonAction = new ActionListener(){  
			    public void actionPerformed(ActionEvent e){    
			    	System.out.println(buttonType);
			            //Opne the settingsMenu
			    }
			};
		}
		else if (buttonType == "Mission") { //probably needs more layers?
			buttonAction = new ActionListener(){  
			    public void actionPerformed(ActionEvent e){    
			    	System.out.println(buttonType);
			            //Open the selected mission. Also maybe one of the last things, if not THE last thing, to do
			    }
			};
		}
		else if (buttonType == "Home") {
			buttonAction = new ActionListener(){  
			    public void actionPerformed(ActionEvent e){    
			    	System.out.println(buttonType);
			            //Should just be like a back button that goes to the main screen(with the categories)
			    }
			};
		}
		return buttonAction;
	}
}
