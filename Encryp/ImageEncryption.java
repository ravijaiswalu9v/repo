import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;

public class ImageEncryption
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();
		frame.setTitle("Image Encryptor...");
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	    // setting font
		Font font= new Font("Roboto",Font.BOLD,25);
		
		// Creating objects of JButton
		JButton button = new JButton("Open Image");
		button.setFont(font);
		
		// Creating objects of JTextField
		JTextField textField = new JTextField(10);
		textField.setFont(font);
		
		// setcomponents
		frame.setLayout(new FlowLayout());
		
		
		frame.add(button);
		frame.add(textField);
		
		button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
		System.out.println("Button Clicked");
		//bringing out the text written in textField
		String text = textField.getText();
		//convert it into Integer form
		int temp = Integer.parseInt(text);
		operate(temp);
		}
		});	
		frame.setVisible(true);
	}
	
	public static void operate(int key)
	{
		
			JFileChooser fileChooser = new JFileChooser();
			//to open it into center
			fileChooser.showOpenDialog(null);
			
			File file = fileChooser.getSelectedFile();
			
			//to read data
			try{
				FileInputStream fis = new FileInputStream(file);
				byte data[] = new byte[fis.available()];
				fis.read(data);
			
				int i=0;
				JOptionPane.showMessageDialog(null, "wait until done....");// edited by me
			for(byte b : data)
				{
					System.out.println(b);
					data[i]=(byte)(b^key);
					i++;
				}
			//to write data
			FileOutputStream fos = new FileOutputStream(file);
			
			fos.write(data);
			fos.close();
			
			JOptionPane.showMessageDialog(null,"Done");
			
			
			}catch(Exception e){
				e.printStackTrace();
			}
			
	}
}