import java.util.Scanner;


	
	
import java.awt.*;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;



class NicksGUI extends JFrame implements ActionListener
{
	//Hardcoded the password and username becuase we dont hava a datbase setup
	 private static final long serialVersionUID = 1L;
	 String syspsw="admin123",sysusr="nicks123";
	 JPanel pnl = new JPanel();
	 JPanel pnl1 = new JPanel();
	 
	 

	 
	 //impliment the buttons and jtextfields for the login screen
	 JLabel field = new JLabel("   ");
	 JLabel field1 = new JLabel("	");
	 JTextField field2 = new JTextField( 20 );
	 JLabel btn1= new JLabel("	");
	 JLabel btn2 = new JLabel("	");
	 JLabel lbl= new JLabel("	");
	 JLabel lbl1 = new JLabel("	");
	 JLabel lD,lF,l3,l4,l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19,
	 l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35, l36, l37, l38,l39,l40,l41, l42,
	 l43, l44, l45, l46, l47, l48, l49, l50, l51, l52, l53, l54, l55, l56, l57, l58, l59, l60, l61, l62, l63, l64, l65;
	 JRadioButton btg, bti, bthd, bth, btm, btdl, btdm, btds, btfl, btfs;
	 JRadioButton dis,sdis;
	 JCheckBox cat;
	 //JRadioButton cash,visa,mast,disc,pay,apple;
	 
	 
	 private JRadioButton cash,visa,mast,disc,pay,apple;
	 private ButtonGroup Group;
	 
	 
	 float gyro1 = 5.50f,Italian = 4.500f, HotDog = 3.500f, Hamb = 3.800f, 
		   Meatb = 4.25f, Drink = 1.000f, GreekL = 1.500f, GreekS = 1.000f;
	 
	 
	 	 
	 
	 
	 
	// JTextField gyro,ham,hot,ital,meat,largf,smalf,largd,medd,smald;
	 JButton btnc;
	 JTextField name = new JTextField( 20 );
	 
	 
	 JTextField gyro = new JTextField( "0" );
	 JTextField ham = new JTextField( "0" );
	 JTextField hot = new JTextField( "0" );
	 JTextField ital = new JTextField( "0" );;
	 JTextField meat = new JTextField( "0" );
	 JTextField largf = new JTextField( "0" );
	 JTextField smalf = new JTextField( "0" );
	 JTextField largd = new JTextField( "0" );
	 JTextField medd = new JTextField( "0" );
	 JTextField smald = new JTextField( "0" );
	 
	 
	 //login gui 
	 public NicksGUI()
	 {
		 
		
	  JMenuBar menuBar = new JMenuBar();
	  add(menuBar);
	  
		  	//implement the listening constraints for the jpanel
		
	  JMenu mnHelp = new JMenu("Help");
	  menuBar.add(mnHelp);
	  
	  
	  JMenuItem mntmAbout = new JMenuItem("About");
	  mnHelp.add(mntmAbout);
	  
	  JMenuItem mnExit = new JMenuItem("Exit");
	  menuBar.add(mnExit);
	  
	  mnExit.addActionListener(e -> System.exit(0));
	  
	  mntmAbout.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent arg0)
		  {
			  JOptionPane.showMessageDialog( null, "Programmer: Joe Fulkerson \nDate Completed: 12/1/2018"
			  		+ "\nv1.0.0.1" ,
					  "About" ,
			  		+  JOptionPane.PLAIN_MESSAGE);
		  }
	  });
	  
	  //ADmin Login Class
	  
	  
	  setJMenuBar(menuBar);
			 
	  	//declare names of each button and radio button not within the login gui
	  	pnl.setLayout( new GridLayout(14,7));
	  
	    
	    // Note to self these need action listeners
	  	btg = new JRadioButton("Gyros Sandwich", false);
	  	bti = new JRadioButton("Italian Beef Sandwich", false);
	  	bthd = new JRadioButton("Hot Dog", false);
	  	bth = new JRadioButton("Hamburger", false);
	  	btm = new JRadioButton("Meatball", false);
	  	btdl = new JRadioButton("Large", false);
	  	btdm = new JRadioButton("Medium", false);
	  	btds = new JRadioButton("Small", false);
	  	btfl = new JRadioButton("Large", false);
	  	btfs = new JRadioButton("Small", false);
	  	btnc = new JButton("DONE");
	  	dis = new JRadioButton("Student Discount", false);
	  	sdis = new JRadioButton("Senior Discount",false);
	  	
	  	//LAbels (Mainly Spaces For the JPanel)
	  	lD = new JLabel("Drinks");
	  	lF = new JLabel("Fries");
	  	l3 = new JLabel("	");
	  	l4 = new JLabel("	");
	  	l5 = new JLabel("	");
	  	l6 = new JLabel("	");
	  	l7= new JLabel("  ");
	  	l8 = new JLabel("	");
	  	l9 = new JLabel("	");
	  	l10 = new JLabel("	");
	  	l11 = new JLabel("  ");
	  	l12  = new JLabel(" ");
	  	l13 = new JLabel(" ");
	  	l14 = new JLabel(" ");
	  	l15 = new JLabel(" ");
	  	l16 = new JLabel(" ");
	  	l17 = new JLabel(" ");
	  	l18 = new JLabel(" ");
	  	l19 = new JLabel(" ");
	  	l20 = new JLabel("Payment Type");
	  	l21 = new JLabel(" ");
	  	l22 = new JLabel(" ");
	  	l23 = new JLabel(" ");
	  	l24 = new JLabel(" ");
	  	l25 = new JLabel(" ");
	  	l26 = new JLabel(" ");
	  	l27 = new JLabel(" ");
	  	l28 = new JLabel(" ");
	  	l29 = new JLabel(" ");
	  	l30 = new JLabel(" ");
	  	l31 = new JLabel(" ");
	  	l32 = new JLabel(" ");
	  	l33 = new JLabel(" ");
	  	l34 = new JLabel(" ");
	  	l35 = new JLabel(" ");
	  	l36 = new JLabel(" ");
	  	l37 = new JLabel(" ");
	  	l38 = new JLabel(" ");
	  	l39 = new JLabel(" ");
	  	l40 = new JLabel(" ");
	  	l41 = new JLabel("Order Details");
	  	l42 = new JLabel(" ");
	  	l43 = new JLabel(" ");
	  	l44 = new JLabel(" ");
	  	l45 = new JLabel(" ");
	  	l46 = new JLabel(" ");
	  	l47 = new JLabel(" ");
	  	l48 = new JLabel(" ");
	  	l49 = new JLabel(" ");
	  	l50 = new JLabel(" ");
	  	l51 = new JLabel(" ");
	  	l52 = new JLabel(" ");
	  	l53 = new JLabel(" ");
	  	l54 = new JLabel(" ");
	  	l55 = new JLabel(" ");
	  	l56 = new JLabel(" ");
	  	l57 = new JLabel(" ");
	  	l58 = new JLabel("Order Name ");
	  	l59 = new JLabel(" ");
	  	l60 = new JLabel(" ");
	  	l61 = new JLabel(" ");
	  	l62 = new JLabel(" ");
	  	l63 = new JLabel(" ");
	  	l64 = new JLabel(" ");
	  	l65 = new JLabel(" ");
	  	
	  	
	  	
	  	//Note to self These need action listeners
	  	//JCheckboxes (PaymentTypes)
	  	
	  	Group = new ButtonGroup();
	  	cat = new JCheckBox("Catering", false);
	  	cash = new JRadioButton("Cash", false);
	  	visa = new JRadioButton("Visa", false);
	  	mast = new JRadioButton("MasterCard", false);
	  	disc = new JRadioButton("Discover", false);
	  	pay = new JRadioButton("PayPal", false);
	  	apple = new JRadioButton("ApplePay", false);
	  	Group.add(cash);
	 	Group.add(visa);
	 	Group.add(mast);
	 	Group.add(disc);
	 	Group.add(pay);
	 	Group.add(apple);
	  	
	  	
	  	

	  	
		 
	  	//add the pnl 
		add(pnl);
		
		
		
		//line 1
		pnl.add(l59);
		pnl.add(l60);
		pnl.add(l61);
		pnl.add(l62);
		pnl.add(l63);
		pnl.add(l58);
		pnl.add(name);
		
		//Line 2
		pnl.add( gyro);
		pnl.add( btg );
		pnl.add( ital );
		pnl.add( bti );
		pnl.add( l3 );
		pnl.add( l64 );
		pnl.add( l65 );
		
		//Line 3
		pnl.add( ham );
		pnl.add( bth );
		pnl.add( hot );
		pnl.add( bthd );
		pnl.add( l4 );
		pnl.add( lbl );
		pnl.add( field );
		
		//line 4
		pnl.add( meat );
		pnl.add( btm );
		pnl.add( l5 );
		pnl.add( l6 );
		pnl.add( l42 );
		pnl.add( btn2 );
		pnl.add( btn1 );
		
		//line 5
		pnl.add( l26 );
		pnl.add( l27 );
		pnl.add( l28 );
		pnl.add( l29 );
		pnl.add( l30 );
		pnl.add( l43 );
		pnl.add( l44 );
		
		//line 6
		pnl.add( l7 );
		pnl.add( lD );
		pnl.add( l8 );
		pnl.add( l9 );
		pnl.add( lF );
		pnl.add( l45 );
		pnl.add( l46 );
		
		//line 7
		pnl.add( largd );
		pnl.add( btdl );
		pnl.add( l10 );
		pnl.add( largf);
		pnl.add( btfl );
		pnl.add( l11 );
		pnl.add( sdis );
		
		//line 8
		pnl.add( medd );
		pnl.add( btdm );
		pnl.add( l13 );
		pnl.add( smalf);
		pnl.add( btfs );
		pnl.add( l14 );
		pnl.add( dis );
		
		//line 9
		pnl.add(  smald );
		pnl.add( btds );
		pnl.add( l16 );
		pnl.add( l17 );
		pnl.add( l12 );
		pnl.add( l25 );
		pnl.add( cat );
		
		
		//line 10
		pnl.add( l31 );
		pnl.add( l32 );
		pnl.add( l33 );
		pnl.add( l34 );
		pnl.add( l35 );
		pnl.add( l48 );
		pnl.add( l49 );

		// line 11
		pnl.add( l38 );
		pnl.add( l39 );
		pnl.add( l40 );
		pnl.add( lbl1 );
		pnl.add( field1 );
		pnl.add( l50 );
		pnl.add( l51 );

		//line 12
		pnl.add( l20 );
		pnl.add( l21 );
		pnl.add( l22 );
		pnl.add( l23 );
		pnl.add( l24 );
		pnl.add( l52 );
		pnl.add( l53 );
		
		//line 13
		pnl.add( cash );
		pnl.add( visa );
		pnl.add( mast );
		pnl.add( disc );
		pnl.add( pay );
		pnl.add( l54);
		pnl.add( l55 );
		
		//line 14
		pnl.add( apple );
		pnl.add( l47 );
		pnl.add( l36 );
		pnl.add( l37 );
		pnl.add( l56);
		pnl.add( l57 );
		pnl.add( btnc );
		
		
		btnc.addActionListener(this);
 	
		 setSize(1000,600);
		 setTitle("Ordering System v1.0.0.1");
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 setVisible( true );
  
		 
	 }
	 

	 //perform the event listeners for the jtextfield to verify the username to open the program.
	 public void actionPerformed( ActionEvent ae )
	 {
		 
		 
		 {
			 
			 float catering = .10f;
			 float grandtotal = 0.00f;
			 float tax = .10f;
			 float price = 0;
			 float StDiscount = .10f, SeDiscount = .20f;
			 
			 int GyroQ = Integer.parseInt(gyro.getText());
			 int HamQ = Integer.parseInt(ham.getText());
			 int HotQ = Integer.parseInt(hot.getText());
			 int ItalQ = Integer.parseInt(ital.getText());
			 int MeatQ = Integer.parseInt(meat.getText());
			 int LargfQ = Integer.parseInt(largf.getText());
			 int SmalfQ = Integer.parseInt(smalf.getText());
			 int LargdQ = Integer.parseInt(largd.getText());
			 int MeddQ = Integer.parseInt(medd.getText());
			 int SmaldQ = Integer.parseInt(smald.getText());
			 
			 
			 float gt = GyroQ * gyro1;
			 float it = ItalQ * Italian;
			 float hdt = HotQ * HotDog;
			 float hbt = HamQ * Hamb;
			 float mbt = MeatQ * Meatb;
			 float ldt = LargdQ * Drink;
			 float mdt = MeddQ * Drink;
			 float sdt = SmaldQ * Drink;
			 float lft = LargfQ * GreekL;
			 float sft = SmalfQ * GreekS;	 
			 float stdTotal = 0.00f, senTotal = 0.00f, catTotal = 0.00f;
			 String name1 = (name.getText());
			float subTotal = gt + it + hdt + hbt + mbt + ldt + mdt + sdt + lft + sft;
			
			
			float taxtotal = ( tax * subTotal) + subTotal;
			 
			 String message = " ", ab = "", payment = "";
			 //Payment methods and total adding
			 if(cash.isSelected() == true)
			 {
				 payment = "Cash";
			 }
			 if(visa.isSelected() == true)
			 {
				 payment = "Visa";
			 }
			 if(mast.isSelected() == true)
			 {
				 payment = "MasterCard";
			 }
			 if(disc.isSelected() == true)
			 {
				 payment = "Discover";
			 }
			 if(pay.isSelected() == true)
			 {
				 payment = "PayPal";
			 }
			 if(apple.isSelected() == true)
			 {
				 payment = "ApplePay";
			 }
			 if(dis.isSelected() == true)
			 {
				stdTotal  = StDiscount * subTotal;
			 }
			if(sdis.isSelected() == true)
			{
				senTotal = SeDiscount * subTotal;
			}
			if(cat.isSelected() == true)
			{
				catTotal = catering * subTotal;
			}
			 
			 
			 float discTotal = stdTotal + senTotal + catTotal;
			 grandtotal = taxtotal - discTotal;
			 //item selection to add to the receipt 
			 
			 if(btg.isSelected() == true)
			 {
				 ab = ab + "\n" + GyroQ + " Gyro Sandwich.............$ " + gt; 
			 }
			 if(bti.isSelected() == true)
			 {
				 ab = ab + "\n" + ItalQ + " Italian Beef Sandwich.....$ " + it; 
			 }
			 if(bthd.isSelected() == true)
			 {
				 ab = ab + "\n" + HotQ + " Hot Dog...................$ " + hdt; 
			 }
			 if(bth.isSelected() == true)
			 {
				 ab = ab + "\n" + HamQ + " Hamburger.................$ " + hbt; 
			 }
			 if(btm.isSelected() == true)
			 {
				 ab = ab + "\n" + MeatQ + " Meatball..................$ " + mbt; 
			 }
			 if(btdl.isSelected() == true)
			 {
				 ab = ab + "\n" + LargdQ + " Large Drink...............$ " + ldt; 
			 }
			 if(btdm.isSelected() == true)
			 {
				 ab = ab + "\n" + MeddQ + " Medium Drink..............$ " + mdt; 
			 }
			 if(btds.isSelected() == true)
			 {
				 ab = ab + "\n" + SmaldQ + " Small Drink...............$ " + sdt; 
			 }
			 if(btfl.isSelected() == true)
			 {
				 ab = ab + "\n" + LargfQ + " Large Fry................$ " + lft; 
			 }
			 if(btfs.isSelected() == true)
			 {
				 ab = ab + "\n" + SmalfQ + " Small Fry................$ " + sft; 
			 }
			
			 //printing of the final receipt 
			 if (ae.getSource() == btnc)
			 {
			 
			 message = "=====Nicks Gyros===== " + "\nName on Order: " + name1 + ab + "\n=========================" + "\n\nSubtotal.......$ " + subTotal
					 + "\nDiscounts.....-$ " + discTotal + "\nTax............%10" + "\n\nTotal..........$ " + grandtotal  + "\nPayment Type: " + payment + "\n\n====ThankYou======" ;
			 JOptionPane.showMessageDialog(null,  message ,
					 "Reciept", JOptionPane.PLAIN_MESSAGE);
		 }
		 }
		 
		
		 }
		 


	 public static void main( String[] args)
	 {
		 
		 
		 
		 float revenue = 0;
		 float totalS = 0;
		
		 
		AdminLogin log = new AdminLogin();
		NicksGUI gui = new NicksGUI();
		
		 
	 }
	 }


