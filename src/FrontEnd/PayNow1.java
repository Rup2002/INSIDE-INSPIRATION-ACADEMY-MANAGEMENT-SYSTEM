		package FrontEnd;
		
		import java.awt.EventQueue;
		
		
		import javax.swing.JFrame;
		import javax.swing.JPanel;
		import javax.swing.JPasswordField;
		import javax.swing.border.EmptyBorder;
		import javax.swing.border.MatteBorder;
		import javax.swing.JSplitPane;
		
		import java.awt.Button;
		import java.awt.Checkbox;
		import java.awt.CheckboxGroup;
		import java.awt.Choice;
		import java.awt.Color;
		import javax.swing.JLabel;
		import javax.swing.JOptionPane;
		
		import java.awt.Font;
		import java.awt.Image;
		import java.awt.List;
		import java.awt.ScrollPane;
		import java.awt.TextArea;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.awt.event.KeyAdapter;
		import java.awt.event.KeyEvent;
		import java.awt.event.MouseAdapter;
		import java.awt.event.MouseEvent;
		import java.awt.print.PrinterException;
		import java.awt.print.PrinterGraphics;
		import java.sql.Connection;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
		import java.util.ArrayList;
		import java.util.Date;
		import java.util.Vector;
		import java.util.logging.Level;
		import java.util.logging.Logger;
		
		import javax.swing.SwingConstants;
		import javax.swing.BoxLayout;
		import javax.swing.ImageIcon;
		import javax.swing.JTable;
		import javax.swing.JTextArea;
		import javax.swing.JTextField;
		import javax.swing.RowFilter;
		import javax.swing.JComboBox;
		import javax.swing.JButton;
		import javax.swing.table.DefaultTableModel;
		import javax.swing.table.TableRowSorter;
		
		import com.mysql.cj.jdbc.result.ResultSetMetaData;
		import com.mysql.cj.protocol.Resultset;
		
		import Database.DatabaseConnection;
		
		import javax.swing.JScrollPane;
		public  class PayNow1 extends JFrame {
		
		
		protected static final String DbUtils = null;
		
		
		private JPanel contentPane, studentPanel, registerPanel;
		private JLabel studentDetails, jl, jl1, L, L1, L2,L3,coursechoose,line,Username, Emailid,Password, cntact, gnder, mail,  course, courseIIA,jllog, jlpayment1, jlabout, jlpayment,jlcurri, jllogout, jlforget, jlreg, jllogin;
		private JTextField UsernameTxt, EmailidTxt, mailTxt;
		public JTextField feesText;
		private JPasswordField p;
		private JButton printbtn, loadbtn, show,hide,fpay,showreceipt;
		private JTable table;
		public JComboBox namecombo;
		private JTextArea receiptTxt;
		private ScrollPane scrollPanel;
		
		
		
		/**
		* Launch the application.
		*/
		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
		try {
		PayNow1 frame = new PayNow1();
		frame.setVisible(true);
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
		});
		}
		
		/**
		* Create the frame.
		*/
		public PayNow1() {
		
		// close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// frame size
		setBounds(100,100,935,650);
		setResizable(false);
		getContentPane().setLayout(null);      
		setLocationRelativeTo(null);
		setTitle("PAYMENT RECEIPT GENERATION");
		   
		
		
		
		// HEADING
		studentPanel = new JPanel();
		studentPanel.setBounds(100, 10, 800, 60);
		studentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		studentPanel.setBackground(new java.awt.Color(249, 191, 59));
		studentPanel.setLayout(null);
		
		// add jlabel to the HEADING PANEL
		studentDetails= new JLabel("-- Inside Inspiration Academy > Payment Details --");
		studentDetails.setHorizontalAlignment(SwingConstants.CENTER);
		studentDetails.setFont(new Font("Tahoma", Font.BOLD, 30));
		studentDetails.setForeground(new java.awt.Color(255,255,255));
		studentDetails.setBounds(-5, 10, 813, 42);
		studentPanel.add(studentDetails);
		
		// image on the HEADING panel left
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Resources/inside_logo.jpg"));
		     Image bimg = img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		     ImageIcon image = new ImageIcon(bimg);
		     
		     jl = new JLabel(image);
		     jl.setBounds(0, 0, 100, 61);
		     jl.setBorder(new MatteBorder(2, 2, 2, 0, (Color) Color.CYAN));
		//     studentPanel.add(jl);
		     
		
		
		     
		     
		  // LOGIN PANEL FOR ALREADY REGISTERED USERS
		registerPanel = new JPanel();
		registerPanel.setBounds(100, 87, 480, 300);
		registerPanel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.YELLOW));
		registerPanel.setBackground(new java.awt.Color(250, 250, 250));
		registerPanel.setLayout(null);
		
		
		// addLOGIN INFORMATION label
		L=new JLabel("STUDENT INFORMATION");
		L.setBounds(30, 0, 400, 40);
		L.setFont(new Font("Tahoma", Font.BOLD, 20));
		L.setForeground(new java.awt.Color(26, 117, 255));
		registerPanel.add(L);
		
		
		
		
		// dotted line
		line=new JLabel("_______________________________");
		line.setBounds(30, 10, 450, 45);
		line.setFont(new Font("Tahoma", Font.BOLD, 20));
		line.setForeground(new java.awt.Color(26, 117, 255));
		registerPanel.add(line);
		
		// Name
		Username=new JLabel("Name *");
		Username.setBounds(30,52,100,40);
		Username.setFont(new Font("Tahoma", Font.BOLD, 16));
		Username.setForeground(new java.awt.Color(11, 107, 156));
		registerPanel.add(Username);
		       
		
		// NAME textfield
		UsernameTxt=new JTextField();
		UsernameTxt.setBounds(130,62,300,30);
		UsernameTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
		UsernameTxt.setForeground(new java.awt.Color(104,108,110));
		// UsernameTxt.backForeground(new java.awt.Color(171, 183, 183));
		       registerPanel.add(UsernameTxt);
		       
		
		       
		       // Emailid
		       Emailid=new JLabel("Email-id *");
		       Emailid.setBounds(30,128,150,40);
		       Emailid.setFont(new Font("Tahoma", Font.BOLD, 16));
		       Emailid.setForeground(new java.awt.Color(11, 107, 156));
		registerPanel.add(Emailid);
		       
		
		// Emailid txtfld
		EmailidTxt=new JTextField();
		EmailidTxt.setBounds(130,133,300,30);
		EmailidTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
		EmailidTxt.setForeground(new java.awt.Color(104,108,110));
		       registerPanel.add(EmailidTxt);
		
		       // PASSWORD
		       Password=new JLabel("Password *");
		       Password.setBounds(30,198,100,40);
		       Password.setFont(new Font("Tahoma", Font.BOLD, 16));
		       Password.setForeground(new java.awt.Color(11, 107, 156));
		registerPanel.add(Password);
		           
		// PASSWORD txtfld
		p=new JPasswordField(15);
		p.setBounds(130, 203, 300, 30);
		p.setFont(new Font("Tahoma", Font.BOLD, 16));
		p.setForeground(new java.awt.Color(104,108,110));
		registerPanel.add(p);
		 
		//SHOW BUTTON FOR PASSWORD SHOW
		show = new JButton("Show");  
		show.setBounds(230, 250, 89, 27);
		show.setFont(new Font("Tahoma", Font.BOLD, 17));
		show.setBackground(new java.awt.Color(0,100,0));
		show.setForeground(Color.white);
		show.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		p.setEchoChar((char)0);
		}
		});
		registerPanel.add(show);
		       
		//HIDE BUTTON FOR PASSWORD HIDE
		hide = new JButton("Hide");  
		hide.setBounds(340, 250, 89, 27);
		hide.setFont(new Font("Tahoma", Font.BOLD, 17));
		hide.setBackground(new java.awt.Color(217, 30, 24));
		hide.setForeground(Color.white);
		hide.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		p.setEchoChar('*');
		}
		});
		registerPanel.add(hide);
		
		
		                     //COURSE SELECTION BY LOGGED IN USERS
		L2=new JLabel("SELECT YOUR COURSE TO PAY");
		L2.setBounds(100, 530, 250, 40);
		L2.setFont(new Font("Tahoma", Font.BOLD, 15));
		L2.setForeground(new java.awt.Color(255, 255, 255));
		
		//SHOW THE RESPECTIVE COURSES FOR THE PARTICULER USER THROUGH THE COMBOBOX
		   String namecombox[]= {};
		namecombo = new JComboBox(namecombox);
		namecombo.setBounds(365, 540, 215, 22);
		namecombo.setFont(new Font("Tahoma", Font.BOLD, 14));
		namecombo.setForeground(new java.awt.Color(104, 108, 110));
		
		
		//FEES LABEL
		L3=new JLabel("YOUR FEES (in \u20B9)");
		L3.setBounds(100, 561, 200, 40);
		L3.setFont(new Font("Tahoma", Font.BOLD, 15));
		L3.setForeground(new java.awt.Color(255, 255, 255));
		
		//AUTOMETICALLY GENERATED FEES TXTFLD (WHICH CAN'T BE AFFECTED FROM THE USERS END)
		feesText=new JTextField();
		feesText.setBounds(365, 570, 215, 22);
		feesText.setFont(new Font("Tahoma", Font.BOLD, 14));
		feesText.setForeground(new java.awt.Color(104, 108, 110));
		
		//MAIN CONTENTPANE DESIGN
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(23, 23, 87));
		contentPane.setLayout(null);
		
		//SCROLLPANE DESIGN FOR THE TABLE
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(100, 430, 480, 88);
		contentPane.add(scrollPane);
		
		// table
		table = new JTable();
		table.setBackground(new Color(215, 254, 255));
		table.setForeground(new java.awt.Color(4, 59, 92));  //26, 117, 255  //31, 156, 20
		table.setFont(new Font("Tahoma", Font.BOLD, 10));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"             Name    ", "           Stream    ", "            Email ID    ", "          Courses    "},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"   Name", "  Stream", "Email ID", "Courses"
			}
		));
		scrollPane.add(table);
		
		       //AFTER LOGGID IN CLICK ON THIS BUTTON TO SHOW YOUR COURSES NAMES AND FEES(ONLY IF YOU ARE A REGISTERED STUDENT OF THE IIA PORTAL)
		loadbtn = new JButton("SHOW  YOUR  COURSES");  
		loadbtn.setBounds(100, 380, 481, 35);
		loadbtn.setFont(new Font("Tahoma", Font.BOLD, 17));
		loadbtn.setBackground(new java.awt.Color(249, 105, 14));
		loadbtn.setForeground(Color.white);
		
		//LOAD BUTTON FUNCTIONALLITY
		loadbtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		String usernameTxt = UsernameTxt.getText().trim();
		String mailTxt = EmailidTxt.getText().trim();
		String pswrdTxt = p.getText().trim();
		if(usernameTxt.equals("") || mailTxt.equals("") || pswrdTxt.equals("")){
		
		JOptionPane.showMessageDialog(null, "'*' Fields are required");
		}
		else {
		
		try {
		Connection con = Database.DatabaseConnection.getConnection();
		String check="select * from newregistration where Name=? and Email=? and Password=?";
		PreparedStatement pscheck = con.prepareStatement(check);
		pscheck.setString(1, usernameTxt);
		pscheck.setString(2, mailTxt);
		pscheck.setString(3, pswrdTxt);
		
		ResultSet rscheck = pscheck.executeQuery();
		//
		if(rscheck.next()) {
		
		
		try {
		JOptionPane.showMessageDialog(null, "Now Choose a Course to Make Payment and 'SHOW YOUR RECEIPT'");
		Connection con1 = Database.DatabaseConnection.getConnection();
		String loadQuery = "select * from studentrecord where Email_Id=?";
		
		PreparedStatement ps = con1.prepareStatement(loadQuery);
		
		ps.setString(1, mailTxt);
		
		ResultSet rs = ps.executeQuery();
		
		java.sql.ResultSetMetaData rsmd = rs.getMetaData();
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		dtm.setRowCount(0);
		
		int column = rsmd.getColumnCount();
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(30);
		                                    table.getColumnModel().getColumn(3).setPreferredWidth(200);
		                                    while(rs.next()) {
		Vector v = new Vector();
		for(int i = 1; i <= column; i++) {
		v.add(rs.getString("Name"));
		v.add(rs.getString("Stream"));
		v.add(rs.getString("Email_Id"));
		v.add(rs.getString("Selected_Courses"));
		
		}
		dtm.addRow(v);
		}
		
		String comboCoursesFetch = "select Selected_Courses from studentrecord where Email_Id=?";
		PreparedStatement ps1 = con.prepareStatement(comboCoursesFetch);
		ps1.setString(1, mailTxt);
		
		ResultSet rs1 = ps1.executeQuery();
		
		while(rs1.next()) {
		String coursesForCombo[] = rs1.getString("Selected_Courses").split(", ");
		for(int i = 0; i < coursesForCombo.length; i++) {
		namecombo.addItem(coursesForCombo[i]);
		}
		
		}
		
		}catch(Exception e) {
		e.printStackTrace();
		}
		
		}
		
		else
		{
		JOptionPane.showMessageDialog(null, "Invalid Username or Password or emailid");
		UsernameTxt.setText("");
		EmailidTxt.setText("");
		p.setText("");
		}
		
		}catch(Exception e) {
		e.printStackTrace();
		}
		}
		}
		});
		
		contentPane.add(loadbtn);
		
		//NAMECOMBO BOX FUNCTIONALLITY (COMBOBOX WHICH SHOWS THE COURSES FOR THE PARTICULER STUDENTS AND GENERATE THE CORRESPONDING FEE FOR THE SAME)
		namecombo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		try {
		Connection con2 = Database.DatabaseConnection.getConnection();
		String feesfetch = "select fees from feesdetails where courses= ?";
		////
		////
		PreparedStatement psfeesfetch = con2.prepareStatement(feesfetch);
		psfeesfetch.setString(1, (String) namecombo.getSelectedItem());
		System.out.println(namecombo.getSelectedItem().toString()+"1");
		ResultSet rsfeesfetch = psfeesfetch.executeQuery();
		
		//
		while(rsfeesfetch.next()) {
		System.out.println(rsfeesfetch.getString("fees")+"2");
		feesText.setText(rsfeesfetch.getString("fees"));
		}
		}catch(Exception e) {
		e.printStackTrace();
		}
		}
		});
		
		                    //SHOW RECEIPT BUTTON TO SHOW YOUR RECEIPT
		showreceipt = new JButton("Show Your Receipt");  
		showreceipt.setBounds(600, 540, 180, 30);
		showreceipt.setFont(new Font("Tahoma", Font.BOLD, 15));
		showreceipt.setBackground(new Color(255, 129, 2));
		showreceipt.setForeground(Color.white);
		
		                //PRINT BUTTON TO PRINT THE RECEIPT
		printbtn = new JButton("Print");  
		printbtn.setBounds(820, 540, 80, 30);
		printbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		printbtn.setBackground(new Color(255, 129, 2));
		printbtn.setForeground(Color.white);
		
		//TEXTAREA FOR THE RECEIPT GENERATED TEXTS
		receiptTxt= new JTextArea();
		receiptTxt.setBackground(Color.white);
		receiptTxt.setFont(new Font("Tahoma", Font.BOLD, 12));
		receiptTxt.setBounds(600,87,300,431);
		
		//PRINT BUTTON FUNCTIONALLITY
		printbtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		try {
		receiptTxt.print();
		} catch (PrinterException e1) {
		
		Logger.getLogger(PrinterGraphics.class.getName()).log(Level.SEVERE, null, e1);
		}
		
		}
		});
		
		        //SHOW RECEIPT BUTTON FUNCTIONALLITY
		showreceipt.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		
//			receiptTxt.setText("\n===================================================================\n");
		receiptTxt.setText("\n               ************************     \n");
		
		receiptTxt.setText(receiptTxt.getText()+"               *                FEES RECEIPT              *\n");
		
		receiptTxt.setText(receiptTxt.getText()+"               ************************    \n\n\n");
		
		Date obj=new Date();
		String date=obj.toString();
		receiptTxt.setText(receiptTxt.getText()+"\n      "+date+"\n\n");
		
		receiptTxt.setText(receiptTxt.getText()+"      Student name    :  "+UsernameTxt.getText()+"\n\n");
		receiptTxt.setText(receiptTxt.getText()+"      Student Email   :  "+EmailidTxt.getText()+"\n\n");
		receiptTxt.setText(receiptTxt.getText()+"      Course name     :  "+namecombo.getSelectedItem()+"\n\n");
		receiptTxt.setText(receiptTxt.getText()+"      Course fees     :  "+feesText.getText()+"\n\n\n");
		receiptTxt.setText(receiptTxt.getText()+"\n                    Signature  ___________________");
//		receiptTxt.setText("========================================================================\n");
		}
		});
		
		//NAVIGATION BAR DESIGN
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new MatteBorder(2, 0, 2, 2, (Color) Color.CYAN));
		panel_4.setBounds(0, 10, 72, 582);
		contentPane.add(panel_4);
		
		
		ImageIcon imglogin = new ImageIcon(ClassLoader.getSystemResource("Resources/Homenav.png"));
		Image bimglogin = imglogin.getImage().getScaledInstance(52, 55, Image.SCALE_DEFAULT);
		ImageIcon imagelogin = new ImageIcon(bimglogin);
		
		jllogin = new JLabel(imagelogin);
		jllogin.setBounds(29, 7, 0, 0);
		jllogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				HomePage sr = new HomePage();
				sr.main(null);
			}
		});
		
		
		// Nav new student
		 ImageIcon imgreg = new ImageIcon(ClassLoader.getSystemResource("Resources/newstudent.png"));
		Image bimgreg = imgreg.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT);
		ImageIcon imagereg = new ImageIcon(bimgreg);
		
		jlreg = new JLabel(imagereg);
		jlreg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				StudentRecord sr = new StudentRecord();
				sr.main(null);
			}
		});
		jlreg.setBounds(34, 7, 50, 50);
		
		// Nav teacher nav
		 ImageIcon imgforget = new ImageIcon(ClassLoader.getSystemResource("Resources/TrackPayment.png"));
		Image bimgforget = imgforget.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT);
		ImageIcon imageforget = new ImageIcon(bimgforget);
		
		jlforget = new JLabel(imageforget);
		
		jlforget.setBounds(31, 7, 0, 0);
		
		// Nav notrs
		 ImageIcon imglogout = new ImageIcon(ClassLoader.getSystemResource("Resources/notes1.png"));
		Image bimglogout = imglogout.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT);
		ImageIcon imagelogout = new ImageIcon(bimglogout);
		
		jllogout = new JLabel(imagelogout);
		jllogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				NotesSection notes = new NotesSection();
				notes.main(null);
			}
		});
		jllogout.setBounds(49, 7, 0, 0);
		
		
		// Nav notrs
		 ImageIcon imgpayment = new ImageIcon(ClassLoader.getSystemResource("Resources/Check.png"));
		Image bimgpayment = imgpayment.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT);
		ImageIcon imagepayment = new ImageIcon(bimgpayment);
		
		jlpayment = new JLabel(imagepayment);
		jlpayment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				TrackPayment notes = new TrackPayment();
				notes.main(null);
			}
		});
		jlpayment.setBounds(52, 7, 0, 0);
		
		// Nav notrs
		 ImageIcon imgpayment1 = new ImageIcon(ClassLoader.getSystemResource("Resources/track.png"));
		Image bimgpayment1 = imgpayment1.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT);
		ImageIcon imagepayment1 = new ImageIcon(bimgpayment1);
		
		jlpayment1 = new JLabel(imagepayment1);
		jlpayment1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				AdminPayment notes = new AdminPayment();
				notes.main(null);
			}
		});
		jlpayment1.setBounds(49, 10, 0, 0);
		
		// Nav notrs
		 ImageIcon imgabout = new ImageIcon(ClassLoader.getSystemResource("Resources/about.png"));
		Image bimgabout = imgabout.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT);
		ImageIcon imageabout = new ImageIcon(bimgabout);
		
		jlabout = new JLabel(imageabout);
		jlabout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				AboutUs notes = new AboutUs();
				notes.main(null);
			}
		});
		jlabout.setBounds(49, 10, 0, 0);
		
		// Nav notrs
		 ImageIcon imglog = new ImageIcon(ClassLoader.getSystemResource("Resources/logout1.png"));
		Image bimglog = imglog.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
		ImageIcon imagelog = new ImageIcon(bimglog);
		
		jllog = new JLabel(imagelog);
		jllog.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int response1 = JOptionPane.showConfirmDialog(null, "Do you want to Logout ?","Logout", JOptionPane.YES_NO_OPTION);
				if(response1 == JOptionPane.YES_OPTION) {
					dispose();
		    		Login log = new Login();
		    		log.main(null);
				}
				else {
					
				}
			}
		});
		jllog.setBounds(49, 10, 0, 0);
		
		ImageIcon imgcurri = new ImageIcon(ClassLoader.getSystemResource("Resources/curriculum.png"));
		Image bimgcurri = imgcurri.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT);
		ImageIcon imagecurri = new ImageIcon(bimgcurri);
		
		jlcurri = new JLabel(imagecurri);
		jlcurri.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Curriculum notes = new Curriculum();
				notes.main(null);
			}
		});
		jlcurri.setBounds(49, 7, 0, 0);
		     
		     panel_4.add(jllogin);
		     panel_4.add(jlreg);
		     panel_4.add(jlforget);
		     panel_4.add(jllogout);
		     panel_4.add(jlcurri);
		     panel_4.add(jlpayment);
		     panel_4.add(jlpayment1);
		     panel_4.add(jlabout);
		     panel_4.add(jllog);
		
		
		       // add to frame
		contentPane.add(studentPanel);
		contentPane.add(registerPanel);
		contentPane.add(printbtn);
		contentPane.add(namecombo);
		contentPane.add(feesText);
		contentPane.add(L2);
		contentPane.add(L3);
		contentPane.add(showreceipt);
		contentPane.add(receiptTxt);
		}
		}