package cuk;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcFrame extends JFrame{
	ImageIcon icon= new ImageIcon("src/image/calc.png");
	public static Font myFont = new Font("Ink Free",Font.BOLD,30);
	public static Font myFont1 = new Font("Ink Free",Font.BOLD,21);
	public CalcFrame() {
		System.out.println("CalcFrame initializing........");
//		this.setSize(400,450);
		this.setTitle("Calculator...");
		this.setIconImage(icon.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setComponent();
		this.pack();
		this.setFont(myFont);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	private void setComponent() {
		System.out.println("SetComponent Method initializing........");	
		this.setLayout(new BorderLayout (5,5));
		
		this.add(new Pnl0(),BorderLayout.CENTER);
	}

	
}
