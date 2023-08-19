package cuk;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pnl0 extends JPanel {

	public Pnl0() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Panel0 initializing..........");
		this.setSize(300,350);
		setComponent();
	}
	private void setComponent() {
		this.setLayout(new BorderLayout(3,3));
		this.setBackground(Color.BLACK);
		this.add(new Pnl1(),BorderLayout.NORTH);
		this.add(new Pnl2(),BorderLayout.CENTER);
	}

	

}
