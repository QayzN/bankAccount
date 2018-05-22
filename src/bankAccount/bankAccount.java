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

public class bankAccount {

	JFrame thisGUI;
	JPanel panel;
	JLabel label1;
	//JLabel label2;
	JButton depositBut;
	JButton withdrawBut;
	JButton exitBut;
	JButton balanceBut;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new bankAccount();
	}

	public bankAccount() {
		System.out.println("Hello World");
		thisGUI = new JFrame();
		thisGUI.setSize(500, 500);
		thisGUI.setResizable(false);
		thisGUI.setLocationRelativeTo(null);
		
		//ListenForButton lForButton = new ListenForButton();
		//ListenForText lForText = new ListenForText();
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
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(86, 222, 190));
		
		label1 = new JLabel();
		label1.setText("_____'s Bank Account");
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setBounds(0,0,500,30);
		label1.setOpaque(true);
		label1.setBackground(new Color(86, 222, 190));
		label1.setFont(new Font(label1.getName(), Font.BOLD, 24));
		panel.add(label1);
		
		depositBut = new JButton();
		depositBut.setBounds(40, 175, 200, 40);
		depositBut.setText("Deposit");
		panel.add(depositBut);
		
		withdrawBut = new JButton();
		withdrawBut.setBounds(260, 175, 200, 40);
		withdrawBut.setText("Withdraw");
		panel.add(withdrawBut);
		
		//exitBut = new JButton();
		//exitBut.setBounds(150, 150, 200, 40);
		//exitBut.setText("EXIT");
		//panel.add(exitBut);
		
		//balanceBut = new JButton();
		//balanceBut.setBounds(260, 150, 200, 40);
		//balanceBut.setText("Balance");
		//panel.add(balanceBut);
		
		//label2 = new JLabel();
		//label2.setText("Test");
		//label2.setBounds(0,30,500,440);
		//label2.setOpaque(true);
		//label2.setBackground(Color.pink);
		//label2.setFont(new Font(label2.getName(), Font.ITALIC, 24));
		//panel.add(label2);
		
		thisGUI.setVisible(true);
		thisGUI.add(panel);
	}
	
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
	
}
