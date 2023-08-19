package src.Calculator1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CalcFrame extends JFrame implements ActionListener{
	private JPanel pnl1,pnl2;
	private JButton btn[];
	private JTextField inputTF,outputTF;
	Font font1= new Font("Areal",Font.BOLD,33);
	Font font2= new Font("Verdana",Font.BOLD,21);
	double res=0,num2=0,num1=0;
	char operator;

	
	
	CalcFrame(){
		System.out.println("CalcFrame Initializing.......");
		// TODO Auto-generated constructor stub
				System.out.println("Welcome to GridLayout");
				this.setSize(410,500);
//				this.pack();
				setComponent();
				
				this.setLocationRelativeTo(null);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				this.setVisible(true);
	}
	private void setComponent(){
		
		
		//Creating input and output TextField
		inputTF= new JTextField();
		inputTF.setSize(400,80);
		inputTF.setLocation(0,0);
		inputTF.setBackground(Color.green);
		inputTF.setFont(font1);
		outputTF= new JTextField();
		outputTF.setSize(400,45);
		outputTF.setBackground(Color.blue);
		outputTF.setLocation(0,80);
		outputTF.setFont(font1);
		
		//Display panel
		pnl1= new JPanel();
		pnl1.setBounds(0,0,400,125);
		pnl1.setBackground(Color.red);
		pnl1.setLayout(null);
		pnl1.add(inputTF);
		pnl1.add(outputTF);
		
		//keys panel
		pnl2= new JPanel();
		pnl2.setBackground(Color.blue);
		pnl2.setBounds(0,125,400,340);
		pnl2.setLayout(null);
		
		
//		pnl3= new JPanel();
//		pnl3.setBackground(Color.yellow);
//		
//		pnl4= new JPanel();
//		pnl4.setBackground(Color.green);
//		
//		pnl5= new JPanel();
//		pnl5.setBackground(Color.pink);
//		
//		pnl6= new JPanel();
//		pnl6.setBackground(Color.black);
		
		
		//creating buttons
		btn=new JButton[17];
		
		for (int i = 0; i <17; i++) {
			btn[i]=new JButton("button"+i);
			btn[i].setBackground(Color.yellow);
			btn[i].addActionListener(this);
			btn[i].setFont(font2);
		}
		
		//Setting size of buttons.....................
		btn[0].setBounds(0,0,100,67);
		btn[1].setBounds(100,0,100,67);
		btn[2].setBounds(200,0,100,67);
		btn[3].setBounds(300,0,100,67);
		btn[4].setBounds(0,67,100,67);
		btn[5].setBounds(100,67,100,67);
		btn[6].setBounds(200,67,100,67);
		btn[7].setBounds(300,67,100,2*67);
		btn[8].setBounds(0,2*67,100,67);
		btn[9].setBounds(100,2*67,100,67);
		btn[10].setBounds(200,2*67,100,67);
		btn[11].setBounds(0,3*67,100,67);
		btn[12].setBounds(100,3*67,100,67);
		btn[13].setBounds(200,3*67,100,67);
		btn[14].setBounds(300,3*67,100,2*67);
		btn[15].setBounds(0,4*67,2*100,67);
		btn[16].setBounds(200,4*67,100,67);
		btn[0].setText("Del");
		btn[1].setText("/");
		btn[2].setText("*");
		btn[3].setText("-");
		btn[4].setText("7");
		btn[5].setText("8");
		btn[6].setText("9");
		btn[7].setText("+");
		btn[8].setText("4");
		btn[9].setText("5");
		btn[10].setText("6");
		btn[11].setText("1");
		btn[12].setText("2");
		btn[13].setText("3");
		btn[14].setText("=");
		btn[15].setText("0");
		btn[16].setText(".");
	//..........................................................

        //adding KeyListeners to buttons
		
		
		//Adding Buttons to panel2.........................
		for (int i = 0; i <17; i++) {
			pnl2.add(btn[i]);
			
		}
		//.................................................
		//Adding panels to main frame
		this.setLayout(null);
		this.add(pnl1);
		this.add(pnl2);	
	}
	
//	Action Listener area starts.............
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn[0]) {
			System.out.println("Delete");
//			use either this.....................
//			String temp="";
//			String string=inputTF.getText();
//			for (int i = 0; i < string.length()-1; i++) {
//				temp=temp+string.charAt(i);
//			}
//			inputTF.setText(temp);
//			or thiiis---------------------------------
			inputTF.setText(inputTF.getText().substring(0,inputTF.getText().length()-1));
		}
		if(e.getSource()==btn[1]) {
			System.out.println("/");
			operator='/';
			num1 = Double.parseDouble(inputTF.getText());
			inputTF.setText("");
			
//			display area of panel1
//			outputTF.setText("/");
//			...............................................
		}
		if(e.getSource()==btn[2]) {
			System.out.println("*");
			operator='*';
			num1 = Double.parseDouble(inputTF.getText());
			inputTF.setText("");
		}
		if(e.getSource()==btn[3]) {
			System.out.println("-");
			operator='-';
			num1 = Double.parseDouble(inputTF.getText());
			inputTF.setText("");
		}
		if(e.getSource()==btn[4]) {
			System.out.println("7");
			inputTF.setText(inputTF.getText().concat(String.valueOf(7)));
		}
		if(e.getSource()==btn[5]) {
			System.out.println("8");
			inputTF.setText(inputTF.getText().concat(String.valueOf(8)));
		}
		if(e.getSource()==btn[6]) {
			System.out.println("9");
			inputTF.setText(inputTF.getText().concat(String.valueOf(9)));
		}
		if(e.getSource()==btn[7]) {
			System.out.println("+");
			operator='+';
			num1 = Double.parseDouble(inputTF.getText());
			inputTF.setText("");
		}
		if(e.getSource()==btn[8]) {
			System.out.println("4");
			inputTF.setText(inputTF.getText().concat(String.valueOf(4)));
		}
		if(e.getSource()==btn[9]) {
			System.out.println("5");
			inputTF.setText(inputTF.getText().concat(String.valueOf(5)));
		}
		if(e.getSource()==btn[10]) {
			System.out.println("6");
			inputTF.setText(inputTF.getText().concat(String.valueOf(6)));
		}
		if(e.getSource()==btn[11]) {
			System.out.println("1");
			inputTF.setText(inputTF.getText().concat(String.valueOf(1)));
		}
		if(e.getSource()==btn[12]) {
			System.out.println("2");
			inputTF.setText(inputTF.getText().concat(String.valueOf(2)));
		}
		if(e.getSource()==btn[13]) {
			System.out.println("3");
			inputTF.setText(inputTF.getText().concat(String.valueOf(3)));
		}
		if(e.getSource()==btn[14]) {
			System.out.println("=");
			num2=Double.parseDouble(inputTF.getText());
			switch(operator) {
				case '+':
					res=num1+num2;
					inputTF.setText(String.valueOf(res));
					break;
				case '-':
					res=num1-num2;
					inputTF.setText(String.valueOf(res));
					break;
				case '*':
					res=num1*num2;
					inputTF.setText(String.valueOf(res));
					break;
				case '/':
					res=num1/num2;
					inputTF.setText(String.valueOf(res));
			}
		}
		if(e.getSource()==btn[15]) {
			System.out.println("0");
			inputTF.setText(inputTF.getText().concat(String.valueOf(0)));
			
		}
		if(e.getSource()==btn[16]) {
			System.out.println(".");
			inputTF.setText(inputTF.getText().concat("."));
		}
		
		
		
		
	}
//	Action Listener area ends..............
	
	public static void main(String[] args) {
		new CalcFrame();
	}
	
	
}
