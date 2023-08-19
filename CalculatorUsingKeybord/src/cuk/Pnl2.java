package cuk;
import java.awt.*;
import java.awt.event.*;

import javax.management.ValueExp;
import javax.swing.*;

public class Pnl2 extends JPanel implements KeyListener , ActionListener{
	JPanel pnlC,pnlE,pnlS;
	JButton numeric[]= new JButton[15];
	JButton Operator[]= new JButton[5];
	double num1,num2,result;
	char operator;
	
	public Pnl2() {
		// TODO Auto-generated constructor stub
		System.out.println("Panel2 initializing..........");
//		this.setSize(300,350);
		this.setPreferredSize(new Dimension(350,300));
		this.setFont(CalcFrame.myFont);
		setComponent();
	}
	
	private void setComponent() {
//		this.setBackground(Color.green);
		this.setLayout(new BorderLayout(5,4));
		// SUB PANELS
		pnlC= new JPanel();
		pnlC.setLayout(new GridLayout(5,3,5,4));
		pnlE= new JPanel();
		pnlE.setLayout(new GridLayout(5,1,5,4));
		pnlE.setPreferredSize(new Dimension(80,300));
		

		
//		Creating 10 numeric Button
		for (int i = 0; i < numeric.length; i++) {
		numeric[i]= new JButton();
		numeric[i].setForeground(Color.white);
		numeric[i].setBackground(new Color(45,45,45));
		numeric[i].setFocusable(false);
		numeric[i].setFont(CalcFrame.myFont);
		numeric[i].addActionListener(this);
		numeric[i].addKeyListener(this);
		
		int temp=9;
		if(i<10) {
		numeric[i].setText(String.valueOf(temp-i));
			temp--;
		}
		pnlC.add(numeric[i]);
		}
		
	    //creating four operator buttons	
		for (int i = 0; i < Operator.length; i++) {
			Operator[i]= new JButton();
			Operator[i].setBackground(new Color(54,155,94));
			Operator[i].setFont(CalcFrame.myFont);
			Operator[i].setFocusable(false);
//			******************ActionListener**************
			Operator[i].addActionListener(this);
//			**********************************************
			pnlE.add(Operator[i]);
			
			}
		
		Operator[0].setText("+");
		Operator[1].setText("-");
		Operator[2].setText("*");
		Operator[3].setText("/");
		Operator[4].setText("=");
		Operator[4].setForeground(new Color(255,255,255));
		Operator[4].setBackground(new Color(26,115,185));
		numeric[10].setText(".");
		numeric[13].setText("sqrt");
		numeric[13].setFont(CalcFrame.myFont1);
		numeric[13].setForeground(new Color(255,25,23));
		numeric[12].setText("C");
		numeric[12].setBackground(new Color(255,25,23));
		numeric[14].setText("(-)");
		numeric[11].setText("Del");
		numeric[11].setBackground(new Color(254,104,94));
		
		
		
		Pnl1.jt.addKeyListener(this);
		this.add(pnlC,BorderLayout.CENTER);
		this.add(pnlE,BorderLayout.EAST);
	}
//***************keyEvents*********************************************************************
	public void keyPressed (KeyEvent e) {        
		System.out.print("Char: "+e.getKeyChar()+"  ");
		System.out.println("Code: "+e.getKeyCode());
		
		
		if(e.getKeyChar()=='+') {
			num1=Double.parseDouble(Pnl1.jt.getText());
			operator='+';
			Pnl1.jt.setText("");
		}
		else if(e.getKeyChar()=='-') {
			num1=Double.parseDouble(Pnl1.jt.getText());
			operator='-';
			Pnl1.jt.setText("");
		}
		else if(e.getKeyChar()=='*') {
			num1=Double.parseDouble(Pnl1.jt.getText());
			operator='*';
			Pnl1.jt.setText("");
		}
		else if(e.getKeyChar()=='/') {
			num1=Double.parseDouble(Pnl1.jt.getText());
			operator='/';
			Pnl1.jt.setText("");
		}
		else if(e.getKeyChar()=='=' || e.getKeyCode()==10) {
			num2=Double.parseDouble(Pnl1.jt.getText().substring(1,Pnl1.jt.getText().length()));
			System.out.println("num1:  "+num1+"..........................");
			System.out.println("num2:  "+num2+"..........................");
			switch (operator) {
			case '+': {
				result=num1+num2;
				Pnl1.jt.setText(String.valueOf(result));
				break;
				}
			case '-': {
				result=num1-num2;
				Pnl1.jt.setText(String.valueOf(result));
				break;
				}
			case '*': {
				result=num1*num2;
				Pnl1.jt.setText(String.valueOf(result));
				break;
				}
			case '/': {
				result=num1/num2;
				Pnl1.jt.setText(String.valueOf(result));
				break;
				}
			}
		}
			
		
    }    
// overriding the keyReleased() method of KeyListener interface where we set the text of the label when key is released  
    public void keyReleased (KeyEvent e) {    
       if(e.getKeyChar()=='=') {
    	   Pnl1.jt.setText(Pnl1.jt.getText().substring(0, Pnl1.jt.getText().length()-1));
       }
    	}
// overriding the keyTyped() method of KeyListener interface where we set the text of the label when a key is typed  
    public void keyTyped (KeyEvent e) {    
    	 	
    }
//***************keyEvents***************************************************************************

//***************ActionEvents*************************    
@Override
public void actionPerformed(ActionEvent ae) {
//	panel1 Actions***********************
	for (int i =0; i <numeric.length; i++) {
		int temp=9;
		if(i<10) {
			if(ae.getSource()==numeric[i]) {
			Pnl1.jt.setText(Pnl1.jt.getText().concat(String.valueOf(temp-i)));
//			num1=Double.parseDouble(Pnl1.jt.getText());
			}
		}
			
	}
	if(ae.getSource()==numeric[10]) {
		Pnl1.jt.setText(Pnl1.jt.getText().concat("."));
//		num1=Double.parseDouble(Pnl1.jt.getText());
	}
	
	if(ae.getSource()==numeric[11]) {
		Pnl1.jt.setText(Pnl1.jt.getText().substring(0, Pnl1.jt.getText().length()-1));
		num1=Double.parseDouble(Pnl1.jt.getText());
	}
	
	if(ae.getSource()==numeric[12]) {
		Pnl1.jt.setText("");
		num1=Double.parseDouble(Pnl1.jt.getText());
	}
	
	if(ae.getSource()==numeric[14]) {
		Pnl1.jt.setText(Pnl1.jt.getText().concat("-"));
	}
	
	if(ae.getSource()==numeric[13]) {
		Pnl1.jt.setText(String.valueOf(Math.sqrt(Double.parseDouble(Pnl1.jt.getText()))));
	}
	
	
	//*************************************
	for(int i=0;i<Operator.length;i++) {
		System.out.println(i);
		if(ae.getSource()==Operator[i])
		{
			switch (i) {
			case 0: {
				num1=Double.parseDouble(Pnl1.jt.getText());
				operator='+';
				Pnl1.jt.setText("");
				break;
				}
			case 1: {
				num1=Double.parseDouble(Pnl1.jt.getText());
				operator='-';
				Pnl1.jt.setText("");
				break;
				}
			case 2: {
				num1=Double.parseDouble(Pnl1.jt.getText());
				operator='*';
				Pnl1.jt.setText("");
				break;
				}
			case 3: {
				num1=Double.parseDouble(Pnl1.jt.getText());
				operator='/';
				Pnl1.jt.setText("");
				break;
				}
			//equal operator
			case 4:{
				num2=Double.parseDouble(Pnl1.jt.getText());
				switch (operator) {
				case '+': {
					result=num1+num2;
					Pnl1.jt.setText(String.valueOf(result));
					break;
					}
				case '-': {
					result=num1-num2;
					Pnl1.jt.setText(String.valueOf(result));
					break;
					}
				case '*': {
					result=num1*num2;
					Pnl1.jt.setText(String.valueOf(result));
					break;
					}
				case '/': {
					result=num1/num2;
					Pnl1.jt.setText(String.valueOf(result));
					break;
					}
				}
				
			}
		}
	}
}    
}
//***************ActionEvents*************************
}
