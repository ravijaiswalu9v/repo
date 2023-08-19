package cuk;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pnl1 extends JPanel{
	public static JTextField jt;
	public Pnl1() {
		// TODO Auto-generated constructor stub
		System.out.println("Panel1 initializing..........");
		this.setSize(300,350);
		this.setPreferredSize(new Dimension(350,90));
		setComponent();
	}

	private void setComponent() {
		this.setLayout(null);
//		this.setBackground(Color.magenta);
		
		//Textfield settings
		jt= new JTextField("");
//		jt.setFocusable(false);
		jt.setBounds(15,15,320,60);
		jt.setBackground(new Color(205,205,203));
		jt.setForeground(Color.black);
		jt.setFont(CalcFrame.myFont);
		
		this.add(jt,BorderLayout.CENTER);
	}
}
