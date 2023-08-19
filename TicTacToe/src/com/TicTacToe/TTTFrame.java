package com.TicTacToe;

import javax.swing.*;

public class TTTFrame extends JFrame{
    static ImageIcon icon = new ImageIcon("src/image/1.png");
    static ImageIcon icon1 = new ImageIcon("src/image/o1.png");
	public TTTFrame() {
		this.setIconImage(icon.getImage());
		this.setTitle("TicTacToe......");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setComponent();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	private void setComponent() {
//		this.setLayout(null);
		Pnl1 pnl1= new Pnl1(); 
		this.add(pnl1);
		this.pack();
	}

}
