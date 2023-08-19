package com.TicTacToe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pnl1 extends JPanel implements ActionListener{
	JButton btn[]=new JButton[9];
	Font font1= new Font("Ink Free",Font.BOLD,70);
	boolean flag=false;
	
	//Constructor of Pnl1
	public Pnl1() {
		System.out.println("Pnl1 initializing.......");
		this.setPreferredSize(new Dimension(450,450));
		setComponent();
	}

	private void setComponent() {
		this.setLayout(new GridLayout(3,3,5,5));
		this.setBackground(new Color(13,161,146));
		
		//creating 9 Buttons
		for (int i = 0; i < btn.length; i++) {
			btn[i]=new JButton(/*String.valueOf(i+1)*/);
			btn[i].setBackground(new Color(20,189,172));
			btn[i].setForeground(Color.white);
			btn[i].setFont(font1);
			btn[i].setFocusable(false);
			btn[i].addActionListener(this);
			this.add(btn[i]);
		}
		
	}
	public void actionPerformed(ActionEvent ae) {
		System.out.println(btn[1].getText()+"99999999999999");
		for (int i = 0; i < btn.length; i++) {
			//for player 1
			if(ae.getSource()==btn[i]) {
				if(flag) 
				{
					//If button is already Clicked
					if(btn[i].getText()=="1"||btn[i].getText()=="0") 
					{
						JOptionPane.showMessageDialog(this, "Position Alredy Occupied","Warrning",i, null);
					}
					//Button is not Clicked
					else 
					{
						btn[i].setForeground(new Color(84,84,84));
						btn[i].setText("1");
						System.out.println("true");
						flag=false;
					}
					
				}
				//for player 0
				else {
					//If button is already Clicked
					if(btn[i].getText()=="1"||btn[i].getText()=="0") {
						JOptionPane.showMessageDialog(this, "Position Alredy Occupied","Warrning",i, null);
					}
					//Button is not Clicked
					else {
						btn[i].setForeground(new Color(242,235,211));
						btn[i].setText("0");
						System.out.println("false");
						flag=true;
					}
				}
				
			}
			//if 5th chance comes near we may have one winner/looser/draw match
			if(i>=4) {
				if(Winner()==-1) {//if no winner found
					System.out.println(drawGame()+"..ae....ae....ae..");
					if(drawGame()) 
					{
					JOptionPane.showMessageDialog(this, "Oops! the match is Draw","Greeting",JOptionPane.INFORMATION_MESSAGE,TTTFrame.icon);
					int option=JOptionPane.showConfirmDialog(this, "wanna play again ","Information",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE,TTTFrame.icon);
					if(option==1) {
						System.exit(0);
					}
					else {
						new TTTFrame();
					}
					break;
					}
				}
				else {//if winner found
					int option=JOptionPane.showConfirmDialog(this, "wanna play again ","Information",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE,TTTFrame.icon);
					   if(option==1) {System.exit(0);}
					   else {new TTTFrame();}
					break;}
			}
		}
		
	}
	//Winner funtion starts here
	private int Winner(){
		int i=1;
		//for winner 1
		//if col matches
		System.out.println(i++);
		
		if(btn[0].getText()=="1"&&btn[1].getText()=="1"&&btn[2].getText()=="1") {
			JOptionPane.showMessageDialog(this, "1 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
		
			return 1;
		}
		else if(btn[3].getText()=="1"&&btn[4].getText()=="1"&&btn[5].getText()=="1") {
			JOptionPane.showMessageDialog(this, "1 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
			return 1;
		}
		else if(btn[6].getText()=="1"&&btn[7].getText()=="1"&&btn[8].getText()=="1") {
			JOptionPane.showMessageDialog(this, "1 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
			return 1;
		}
		//if row matches
		else if(btn[0].getText()=="1"&&btn[3].getText()=="1"&&btn[6].getText()=="1") {
			JOptionPane.showMessageDialog(this, "1 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
			return 1;
		}
		else if(btn[1].getText()=="1"&&btn[4].getText()=="1"&&btn[7].getText()=="1") {
			JOptionPane.showMessageDialog(this, "1 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
			return 1;
		}
		else if(btn[2].getText()=="1"&&btn[5].getText()=="1"&&btn[8].getText()=="1") {
			JOptionPane.showMessageDialog(this, "1 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
			return 1;
		}
		//if diagonal matches
		else if(btn[0].getText()=="1"&&btn[4].getText()=="1"&&btn[8].getText()=="1") {
			JOptionPane.showMessageDialog(this, "1 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
			return 1;
		}
		else if(btn[2].getText()=="1"&&btn[4].getText()=="1"&&btn[6].getText()=="1") {
			JOptionPane.showMessageDialog(this, "1 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
			return 1;
		}
		
		//for winner 0
		//if col matches
				if(btn[0].getText()=="0"&&btn[1].getText()=="0"&&btn[2].getText()=="0") {
					JOptionPane.showMessageDialog(this, "0 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
					return 0;
				}
				else if(btn[3].getText()=="0"&&btn[4].getText()=="0"&&btn[5].getText()=="0") {
					JOptionPane.showMessageDialog(this, "0 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
					return 0;
				}
				else if(btn[6].getText()=="0"&&btn[7].getText()=="0"&&btn[8].getText()=="0") {
					JOptionPane.showMessageDialog(this, "0 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
					return 0;
				}
		//if row matches
				else if(btn[0].getText()=="0"&&btn[3].getText()=="0"&&btn[6].getText()=="0") {
					JOptionPane.showMessageDialog(this, "0 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
					return 0;
				}
				else if(btn[1].getText()=="0"&&btn[4].getText()=="0"&&btn[7].getText()=="0") {
					JOptionPane.showMessageDialog(this, "0 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
					return 0;
				}
				else if(btn[2].getText()=="0"&&btn[5].getText()=="0"&&btn[8].getText()=="0") {
					JOptionPane.showMessageDialog(this, "0 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
					return 0;}
				//if diagonal matches
				else if(btn[0].getText()=="0"&&btn[4].getText()=="0"&&btn[8].getText()=="0") {
					JOptionPane.showMessageDialog(this, "0 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
					return 0;}
				else if(btn[2].getText()=="0"&&btn[4].getText()=="0"&&btn[6].getText()=="0") {
					JOptionPane.showMessageDialog(this, "0 is the Winner","Greeting",JOptionPane.INFORMATION_MESSAGE, TTTFrame.icon1);
					return 0;}
				else {
					return -1;
				}
					
	}
	//Winner funtion ends here
	
    private boolean drawGame(){//if the game being draw
    	 int count=0;
    	 for (int i = 0; i < btn.length; i++) {
    		 if(btn[i].getText()!=""){ 
    			 count++;
    			 System.out.println("count"+count);}
    	 }
    	 return count==9?true:false;	
	}
//    
}
