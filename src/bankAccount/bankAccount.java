package bankAccount;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class bankAccount {

	int pinan = 1234;
	int bal = 0;
	boolean logged = false;
	
	JLabel label1;
	JLabel label12;
	JLabel label2;
	JLabel label21;
	JLabel label3;
	JLabel label4;
	JLabel labelAU;
	
	JTextField text1;
	JTextField deAmount;
	JTextField withAmount;
	
	JButton button1;
	JButton button2;
	JButton button3;
	JButton depositBut;
	JButton withdrawBut;
	JButton exitBut;
	JButton balanceBut;
	JButton backBut;
	
	JFrame thisGUI;
	JPanel panel;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panelAboutUs;

	JOptionPane dialoguePin;
	JOptionPane dialoguePanel4;
	
	
	
	public static void main(String[] args) {
		new bankAccount();
	}
		
	public bankAccount(){
		System.out.println("Hello World");
		thisGUI = new JFrame();
		thisGUI.setTitle("My First GUI");
		thisGUI.setResizable(false);
		thisGUI.setLocationRelativeTo(null);
		thisGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisGUI.setSize(500, 500);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel4 = new JPanel();
		panel4.setLayout(null);
		
		panelAboutUs = new JPanel();
		panelAboutUs.setLayout(null);
		
		
//		.___  ___.  _______ .__   __.  __    __  
//		|   \/   | |   ____||  \ |  | |  |  |  | 
//		|  \  /  | |  |__   |   \|  | |  |  |  | 
//		|  |\/|  | |   __|  |  . `  | |  |  |  | 
//		|  |  |  | |  |____ |  |\   | |  `--'  | 
//		|__|  |__| |_______||__| \__|  \______/  
		
		
		ListenForHomeItem lForHomeItem = new ListenForHomeItem();
		ListenForlogOutItem lForLogOutItem = new ListenForlogOutItem();
		ListenForAboutUsItem lForAboutUsItem = new ListenForAboutUsItem();
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenuItem HomeMenuItem = new JMenuItem("Home", KeyEvent.VK_O);
		HomeMenuItem.addActionListener(lForHomeItem);
		fileMenu.add(HomeMenuItem);
		fileMenu.addSeparator();
		
		JMenuItem logOutMenuItem = new JMenuItem("Log Out", KeyEvent.VK_P);
		logOutMenuItem.addActionListener(lForLogOutItem);
		fileMenu.add(logOutMenuItem);
		
		JMenu editMenu = new JMenu("About");
		JMenuItem AboutUsMenuItem = new JMenuItem("About Us");
		AboutUsMenuItem.addActionListener(lForAboutUsItem);
		editMenu.add(AboutUsMenuItem);
		
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		thisGUI.add(menuBar);
		thisGUI.setJMenuBar(menuBar);
		
//		.______      ___      .__   __.  _______  __          __  
//		|   _  \    /   \     |  \ |  | |   ____||  |        /_ | 
//		|  |_)  |  /  ^  \    |   \|  | |  |__   |  |         | | 
//		|   ___/  /  /_\  \   |  . `  | |   __|  |  |         | | 
//		|  |     /  _____  \  |  |\   | |  |____ |  `----.    | | 
//		| _|    /__/     \__\ |__| \__| |_______||_______|    |_| 
		                                                       
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(86, 222, 190));
		
		
		ListenForPanel1Button lForPanel1Button = new ListenForPanel1Button();
		
		
		label1 = new JLabel();
		label1.setText("Welcome");
		label1.setBounds(0,0,500,30);
		label1.setOpaque(false);
		label1.setBackground(Color.pink);
		label1.setFont(new Font(label1.getName(), Font.PLAIN, 18));
		label1.setHorizontalAlignment(JLabel.CENTER);
		
		label12 = new JLabel();
		label12.setText("Enter Pin:");
		label12.setBounds(100,130,90,40);
		label12.setOpaque(false);
		
		label12.setFont(new Font(label12.getName(), Font.PLAIN, 20));
		
		
		
		
		text1 = new JTextField(20);
		text1.setBounds(195,130, 120, 40);
		text1.addActionListener(new ListenForPanel1Text());
		
		
		
		button1 = new JButton("Enter");
		button1.setBounds(320, 130, 135, 40);
		button1.addActionListener(lForPanel1Button);
		
		
		panel.add(button1);
		panel.add(label1);
		panel.add(label12);
		panel.add(text1);
		
		
		
		
//		.______      ___      .__   __.  _______  __          ___   
//		|   _  \    /   \     |  \ |  | |   ____||  |        |__ \  
//		|  |_)  |  /  ^  \    |   \|  | |  |__   |  |           ) | 
//		|   ___/  /  /_\  \   |  . `  | |   __|  |  |          / /  
//		|  |     /  _____  \  |  |\   | |  |____ |  `----.    / /_  
//		| _|    /__/     \__\ |__| \__| |_______||_______|   |____| 
//		                                                            
		 
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(new Color(86, 222, 190));
		
		ListenForPanel2Deposit lForPanel2Deposit = new ListenForPanel2Deposit();
		ListenForPanel2Withdraw lForPanel2Withdraw = new ListenForPanel2Withdraw();
		
		label2 = new JLabel();
		label2.setText("Account: " + 1234);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setBounds(0,0,500,30);
		label2.setOpaque(true);
		label2.setBackground(new Color(86, 222, 190));
		label2.setFont(new Font(label2.getName(), Font.BOLD, 24));
		
		label21 = new JLabel();
		label21.setText("Balance: $" + bal);
		label21.setHorizontalAlignment(JLabel.CENTER);
		label21.setBounds(0,30,500,30);
		label21.setOpaque(true);
		label21.setBackground(new Color(86, 222, 190));
		label21.setFont(new Font(label21.getName(), Font.BOLD, 24));
		
		
		depositBut = new JButton();
		depositBut.setBounds(40, 175, 200, 40);
		depositBut.setText("Deposit");
		depositBut.addActionListener(lForPanel2Deposit);
		panel2.add(depositBut);
		
		withdrawBut = new JButton();
		withdrawBut.setBounds(260, 175, 200, 40);
		withdrawBut.setText("Withdraw");
		withdrawBut.addActionListener(lForPanel2Withdraw);
		panel2.add(withdrawBut);
		
		
		panel2.add(label21);
		panel2.add(label2);

//.______      ___      .__   __.  _______  __          ____   
//|   _  \    /   \     |  \ |  | |   ____||  |        |___ \  
//|  |_)  |  /  ^  \    |   \|  | |  |__   |  |          __) | 
//|   ___/  /  /_\  \   |  . `  | |   __|  |  |         |__ <  
//|  |     /  _____  \  |  |\   | |  |____ |  `----.    ___) | 
//| _|    /__/     \__\ |__| \__| |_______||_______|   |____/  
		
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground(new Color(86, 222, 190));
		
		ListenForPanel3text lForPanel3Text = new ListenForPanel3text();
		ListenForPanel3button lForPanel3button = new ListenForPanel3button();
		ListenForBackBut lForBackButton = new ListenForBackBut();

		
		label3 = new JLabel();
		label3.setText("Withdraw");
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setBounds(0,60,500,30);
		label3.setOpaque(true);
		label3.setBackground(new Color(86, 222, 190));
		label3.setFont(new Font(label3.getName(), Font.BOLD, 24));
		
		button2 = new JButton();
		button2.setBounds(160, 200, 200, 40);
		button2.setText("Enter");
		button2.addActionListener(lForPanel3button);
		panel3.add(button2);
		
		backBut = new JButton();
		backBut.setBounds(5, 5, 80, 40);
		backBut.setText("Back");
		backBut.addActionListener(lForBackButton);
		panel3.add(backBut);
		
		deAmount = new JTextField(20);
		deAmount.setBounds(160,130, 200, 40);
		deAmount.addActionListener(lForPanel3Text);
		panel3.add(deAmount);
		
		
		panel3.add(label3);
		
		
		
//		.______      ___      .__   __.  _______  __          _  _    
//		|   _  \    /   \     |  \ |  | |   ____||  |        | || |   
//		|  |_)  |  /  ^  \    |   \|  | |  |__   |  |        | || |_  
//		|   ___/  /  /_\  \   |  . `  | |   __|  |  |        |__   _| 
//		|  |     /  _____  \  |  |\   | |  |____ |  `----.      | |   
//		| _|    /__/     \__\ |__| \__| |_______||_______|      |_|   
		
		
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBackground(new Color(86, 222, 190));
		
		ListenForPanel4text lForPanel4Text = new ListenForPanel4text();
		ListenForPanel4button lForPanel4button = new ListenForPanel4button();
		
		
		label4 = new JLabel();
		label4.setText("Withdraw");
		label4.setHorizontalAlignment(JLabel.CENTER);
		label4.setBounds(0,60,500,30);
		label4.setOpaque(true);
		label4.setBackground(new Color(86, 222, 190));
		label4.setFont(new Font(label4.getName(), Font.BOLD, 24));
		
		button3 = new JButton();
		button3.setBounds(160, 200, 200, 40);
		button3.setText("Enter");
		button3.addActionListener(lForPanel4button);
		panel4.add(button3);
		
		withAmount = new JTextField(20);
		withAmount.setBounds(160,130, 200, 40);
		withAmount.addActionListener(lForPanel4button);
		panel4.add(withAmount);
		
		backBut = new JButton();
		backBut.setBounds(5, 5, 80, 40);
		backBut.setText("Back");
		backBut.addActionListener(lForBackButton);
		panel4.add(backBut);
		
		panel4.add(label3);
		
		
		thisGUI.add(panel);
		thisGUI.setVisible(true);
		
		
		
//		.______      ___      .__   __.  _______  __             
//		|   _  \    /   \     |  \ |  | |   ____||  |           
//		|  |_)  |  /  ^  \    |   \|  | |  |__   |  |        ABOUT
//		|   ___/  /  /_\  \   |  . `  | |   __|  |  |        
//		|  |     /  _____  \  |  |\   | |  |____ |  `----.    
//		| _|    /__/     \__\ |__| \__| |_______||_______|      
		
		panelAboutUs = new JPanel();
		panelAboutUs.setLayout(null);
		panelAboutUs.setBackground(new Color(86, 222, 190));
		
		labelAU = new JLabel();
		labelAU.setBounds(0,20,30,30);
		labelAU
		
		panelAboutUs.add(labelAU);
	}

	
	
	
	
	
	//Add Action Listeners Here
	
	
	
	
	
//	.___  ___.  _______ .__   __.  __    __  
//	|   \/   | |   ____||  \ |  | |  |  |  | 
//	|  \  /  | |  |__   |   \|  | |  |  |  | 
//	|  |\/|  | |   __|  |  . `  | |  |  |  | 
//	|  |  |  | |  |____ |  |\   | |  `--'  | 
//	|__|  |__| |_______||__| \__|  \______/  
	
	
	private class ListenForHomeItem implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Clicked Home Option");
			if (logged) {
				panel2.add(label21);
				panel2.add(label2);
				thisGUI.setContentPane(panel2);
				thisGUI.invalidate();
				thisGUI.validate();
			}
			
		}
		
	}
	
	private class ListenForlogOutItem implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Clicked Log Out Option");
			logged = false;
			panel.add(label1);
			panel.add(label12);
			thisGUI.setContentPane(panel);
			thisGUI.invalidate();
			thisGUI.validate();
			
		}
		
	}
	
	private class ListenForAboutUsItem implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//JOptionPane.showMessageDialog(thisGUI, text1.getText());
			System.out.println("Clicked About Us");
			thisGUI.setContentPane(panelAboutUs);
			thisGUI.invalidate();
			thisGUI.validate();
		}
		
	}
	
	
//	.______      ___      .__   __.  _______  __          __  
//	|   _  \    /   \     |  \ |  | |   ____||  |        /_ | 
//	|  |_)  |  /  ^  \    |   \|  | |  |__   |  |         | | 
//	|   ___/  /  /_\  \   |  . `  | |   __|  |  |         | | 
//	|  |     /  _____  \  |  |\   | |  |____ |  `----.    | | 
//	| _|    /__/     \__\ |__| \__| |_______||_______|    |_| 
	
	private class ListenForPanel1Text implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Panel1 Text");
			panel1Code();
		}
		
	}
	private class ListenForPanel1Button implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Panel1 Button");
			panel1Code();
		}
		
	}
	private void panel1Code() {
		String txt = text1.getText();
		txt.trim();
		if (Integer.parseInt(txt) == pinan) {
			logged = true;
			thisGUI.setContentPane(panel2);
			thisGUI.invalidate();
			thisGUI.validate();
		}
		else {
			dialoguePin.showMessageDialog(panel, "What are you stupid or something");;
			System.out.println(txt);
			System.out.println(pinan);
		}
		
	}
	
	
//	.______      ___      .__   __.  _______  __          ___   
//	|   _  \    /   \     |  \ |  | |   ____||  |        |__ \  
//	|  |_)  |  /  ^  \    |   \|  | |  |__   |  |           ) | 
//	|   ___/  /  /_\  \   |  . `  | |   __|  |  |          / /  
//	|  |     /  _____  \  |  |\   | |  |____ |  `----.    / /_  
//	| _|    /__/     \__\ |__| \__| |_______||_______|   |____| 
//	   
	
	private class ListenForPanel2Deposit implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Panel2 Deposit");
			panel3.add(label21);
			panel3.add(label2);
			thisGUI.setContentPane(panel3);
			thisGUI.invalidate();
			thisGUI.validate();
			
		}
		
	}
	private class ListenForPanel2Withdraw implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Panel2 WithDraw");
			panel4.add(label21);
			panel4.add(label2);
			thisGUI.setContentPane(panel4);
			thisGUI.invalidate();
			thisGUI.validate();
			
		}
		
	}
	
	//.______      ___      .__   __.  _______  __          ____   
	//|   _  \    /   \     |  \ |  | |   ____||  |        |___ \  
	//|  |_)  |  /  ^  \    |   \|  | |  |__   |  |          __) | 
	//|   ___/  /  /_\  \   |  . `  | |   __|  |  |         |__ <  
	//|  |     /  _____  \  |  |\   | |  |____ |  `----.    ___) | 
	//| _|    /__/     \__\ |__| \__| |_______||_______|   |____/  

		
	
	private class ListenForPanel3text implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Panel3 text");
			panel3Code();
			
		}
		
	}
	private class ListenForPanel3button implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Panel3 button");
			panel3Code();
			
		}
		
	}
	private class ListenForBackBut implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Back Button");
				panel2.add(label21);
				panel2.add(label2);
				thisGUI.setContentPane(panel2);
				thisGUI.invalidate();
				thisGUI.validate();
		}
		
	}

	
	private void panel3Code() {
		String txt = deAmount.getText();
		bal += Integer.parseInt(txt);
		label21.setText("Balance: $" + bal);
	}
	
	
	
//	.______      ___      .__   __.  _______  __          _  _    
//	|   _  \    /   \     |  \ |  | |   ____||  |        | || |   
//	|  |_)  |  /  ^  \    |   \|  | |  |__   |  |        | || |_  
//	|   ___/  /  /_\  \   |  . `  | |   __|  |  |        |__   _| 
//	|  |     /  _____  \  |  |\   | |  |____ |  `----.      | |   
//	| _|    /__/     \__\ |__| \__| |_______||_______|      |_|   

	
	
	private class ListenForPanel4text implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Panel4 text");
			panel4Code();
			
		}
		
	}
	private class ListenForPanel4button implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Panel4 button");
			panel4Code();
			
		}
		
	}
	private void panel4Code() {
		String txt = withAmount.getText();
		if (bal - Integer.parseInt(txt) < 0) {
			dialoguePanel4.showMessageDialog(panel4, "You can't withdraw that amount, you are too poor!!");;
		}
		//else if (//add way to check if string){
			
		//}
		else {
			bal -= Integer.parseInt(txt);
		}
		label21.setText("Balance: $" + bal);
	}
	
	
	
	
	
	
	
	
	
}



