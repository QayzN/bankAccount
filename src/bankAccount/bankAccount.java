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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class bankAccount {

	int pinan = 1234;
	
	JLabel label1;
	JLabel label12;
	JLabel label2;
	JLabel label21;
	JLabel label3;
	JLabel label4;
	
	JTextField text1;
	JTextField text2;
	JTextField text3;
	
	JButton button1;
	JButton button2;
	JButton button3;
	JButton depositBut;
	JButton withdrawBut;
	JButton exitBut;
	JButton balanceBut;
	
	JFrame thisGUI;
	JPanel panel;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	
	
	
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
		
		
		
//		.___  ___.  _______ .__   __.  __    __  
//		|   \/   | |   ____||  \ |  | |  |  |  | 
//		|  \  /  | |  |__   |   \|  | |  |  |  | 
//		|  |\/|  | |   __|  |  . `  | |  |  |  | 
//		|  |  |  | |  |____ |  |\   | |  `--'  | 
//		|__|  |__| |_______||__| \__|  \______/  
		
		
		ListenForAboutItem lForAboutItem = new ListenForAboutItem();
		ListenForlogOutItem lForLogOutItem = new ListenForlogOutItem();
		ListenForCopyItem lForCopyItem = new ListenForCopyItem();
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenuItem AboutMenuItem = new JMenuItem("About", KeyEvent.VK_O);
		AboutMenuItem.addActionListener(lForAboutItem);
		fileMenu.add(AboutMenuItem);
		fileMenu.addSeparator();
		JMenuItem logOutMenuItem = new JMenuItem("Log Out", KeyEvent.VK_P);
		logOutMenuItem.addActionListener(lForLogOutItem);
		fileMenu.add(logOutMenuItem);
		
		JMenu editMenu = new JMenu("Edit");
		JMenuItem copyMenuItem = new JMenuItem("Copy");
		copyMenuItem.addActionListener(lForCopyItem);
		editMenu.add(copyMenuItem);
		
		
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
		label1.setBounds(0,0,600,30);
		label1.setOpaque(true);
		label1.setBackground(Color.pink);
		label1.setFont(new Font(label1.getName(), Font.PLAIN, 18));
		label1.setHorizontalAlignment(JLabel.CENTER);
		
		label12 = new JLabel();
		label12.setText("Enter Pin:");
		label12.setBounds(130,130,90,40);
		label12.setOpaque(true);
		
		label12.setFont(new Font(label12.getName(), Font.PLAIN, 20));
		
		
		
		
		text1 = new JTextField(20);
		text1.setBounds(220,130, 120, 40);
		text1.addActionListener(new ListenForPanel1Text());
		
		
		
		button1  = new JButton("Enter");
		button1.setBounds(350, 130, 135, 40);
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
		
		
		label2 = new JLabel();
		label2.setText("Account:" + 1234);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setBounds(0,0,500,30);
		label2.setOpaque(true);
		label2.setBackground(new Color(86, 222, 190));
		label2.setFont(new Font(label2.getName(), Font.BOLD, 24));
		
		label21 = new JLabel();
		label21.setText("Balance:" + 1234);
		label21.setHorizontalAlignment(JLabel.CENTER);
		label21.setBounds(0,30,500,30);
		label21.setOpaque(true);
		label21.setBackground(new Color(86, 222, 190));
		label21.setFont(new Font(label21.getName(), Font.BOLD, 24));
		
		
		depositBut = new JButton();
		depositBut.setBounds(40, 175, 200, 40);
		depositBut.setText("Deposit");
		panel2.add(depositBut);
		
		withdrawBut = new JButton();
		withdrawBut.setBounds(260, 175, 200, 40);
		withdrawBut.setText("Withdraw");
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
		
		label3 = new JLabel();
		label3.setText("Withdraw");
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setBounds(0,60,500,30);
		label3.setOpaque(true);
		label3.setBackground(new Color(86, 222, 190));
		label3.setFont(new Font(label3.getName(), Font.BOLD, 24));
		
		button2 = new JButton();
		button2.setBounds(40, 175, 200, 40);
		button2.setText("Enter");
		panel3.add(button2);
		
		text2 = new JTextField(20);
		text2.setBounds(220,130, 120, 40);
		panel3.add(text2);
		
		panel3.add(label21);
		panel3.add(label2);
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
		
		label4 = new JLabel();
		label4.setText("Withdraw");
		label4.setHorizontalAlignment(JLabel.CENTER);
		label4.setBounds(0,60,500,30);
		label4.setOpaque(true);
		label4.setBackground(new Color(86, 222, 190));
		label4.setFont(new Font(label4.getName(), Font.BOLD, 24));
		
		button3 = new JButton();
		button3.setBounds(40, 175, 200, 40);
		button3.setText("Enter");
		panel4.add(button3);
		
		text3 = new JTextField(20);
		text3.setBounds(220,130, 120, 40);
		panel4.add(text3);
		
		panel4.add(label21);
		panel4.add(label2);
		panel4.add(label3);
		
		
		thisGUI.add(panel);
		thisGUI.setVisible(true);
		
	}
	
	
	
	
	//Add Action Listeners Here
	
	
	
	private class ListenForAboutItem implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Clicked About Option");
		}
		
	}
	
	private class ListenForlogOutItem implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Clicked Log Out Option");
			thisGUI.setContentPane(panel);
			thisGUI.invalidate();
			thisGUI.validate();
			
		}
		
	}
	
	private class ListenForCopyItem implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//JOptionPane.showMessageDialog(thisGUI, text1.getText());
			System.out.println("Clicked ????");
		}
		
	}
	
	private class ListenForPanel1Text implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Panel1 Text");
		}
		
	}
	private class ListenForPanel1Button implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Panel1 Button");
		}
		
	}
	private void panel1Code() {
		String txt = text1.getText();
		txt = txt.trim();
		
		text1.setText(null);
		
	}

}
