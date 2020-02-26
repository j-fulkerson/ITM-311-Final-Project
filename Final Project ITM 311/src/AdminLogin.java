import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;


//Login screen for the owner/admin is running in the background of the screen


class AdminLogin extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	String syspsw="admin123",sysusr="nicks123";
	 JPanel pnl = new JPanel();
	 JPanel pnl1 = new JPanel();
	 
	 

	 
	 //impliment the buttons and jtextfields for the login screen
	 JTextField field = new JTextField( 10 );
	 JTextField field1 = new JTextField( 10 );
	 
	 JButton btn1= new JButton("Login");
	 JButton btn2 = new JButton("Forgot Username and Password");
	 JLabel lbl= new JLabel("Password");
	 JLabel lbl1 = new JLabel("Username");
	 JLabel lD,lF,l3,l4,l5, l6, l7, l8, l9, l10;
	 
	 
	 public AdminLogin()
	 {
	 
		 
		 
		 
		 
		 add(pnl1);
		 
		 pnl1.add( lbl1 );
		 pnl1.add( field1 );
		 
		 pnl1.add( lbl );
		 pnl1.add( field );
		 
		 pnl1.add( btn2 );
		 pnl1.add( btn1 );
		 
		 setSize(500,500);
		 setTitle("Admin Login");
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 setVisible( true );
		 
		// login action listeners
				 field.addActionListener(this);
				 field1.addActionListener(this);
				 btn1.addActionListener(this);
				 btn2.addActionListener(this);
		 
		 
		

}


	 public void actionPerformed( ActionEvent e ) {
			{
				 if (e.getSource() == btn2)
				 {
					 JOptionPane.showMessageDialog(this, "Passowrd:admin123\nUsername:nicks123","ForgotPassword",
							JOptionPane.INFORMATION_MESSAGE); 
							 
				 }
				 
				//check the text fields for the hardcoded username and password
				 {
					 String password = field.getText();
					 String username = field1.getText();
					 
					 if (password.equals(syspsw) && (username.equals(sysusr)))
					 {
						 JOptionPane.showMessageDialog( this , "Total Orders: " + "\n\nTotal Revenue: " );
						 
					 } 
				
				  else
					 {
						JOptionPane.showMessageDialog(this , "Incorrect Username or Password", "Wrong Password",
								JOptionPane.ERROR_MESSAGE);
						 }

				 }
				 }
		  }




public static void main(String [] args) {
	AdminLogin GUI = new  AdminLogin();
}



}