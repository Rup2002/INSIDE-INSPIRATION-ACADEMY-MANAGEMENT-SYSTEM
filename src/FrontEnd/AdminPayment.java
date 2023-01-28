		package FrontEnd;
		
		import java.awt.EventQueue;
		
		import javax.swing.JFrame;
		import java.awt.Color;
		import javax.swing.JPanel;
		import javax.swing.JPasswordField;
		import javax.swing.JTable;
		import javax.swing.JLabel;
		import javax.swing.JOptionPane;
		import javax.swing.JTextField;
		import javax.swing.SwingConstants;
		import javax.swing.border.EmptyBorder;
		import javax.swing.border.MatteBorder;
		import javax.swing.table.DefaultTableModel;
		
		import Database.DatabaseConnection;
		
		import java.awt.Font;
		import java.awt.Image;
		
		import javax.swing.JComboBox;
		import java.awt.ScrollPane;
		
		import javax.swing.ImageIcon;
		import javax.swing.JButton;
		import java.awt.event.ActionListener;
		import java.awt.event.MouseAdapter;
		import java.awt.event.MouseEvent;
		import java.sql.Connection;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.Statement;
		import java.util.Vector;
		import java.awt.event.ActionEvent;
		
		public class AdminPayment extends JFrame {
		
		
		private JFrame frame;
		private JTextField nameTxt;
		private JTextField emailTxt;
		private JPasswordField p;
		private JComboBox namecombo,namecombo1,namecombo2;
		private JTable table;
		private JTextField textField_1;
		private JLabel jllog, jlpayment1, jlabout, jlpayment,jlcurri, jllogout, jlforget, jlreg, jllogin,name,email,password,namecomboline,namecombo1line,namecomboTxt,namecomboTxt1,u1;
		private JPanel contentPane,panel,panel_1,panel_2;
		
		private JButton login,show,hide,reset,loadbtn,due;
		private ScrollPane scrollPanel;
		/**
		* Launch the application.
		*/
		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
		try {
			AdminPayment frame = new AdminPayment();
		frame.setVisible(true);
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
		});
		}
		
		/**
		* Create the application.
		*/
		
		/**
		* Initialize the contents of the frame.
		*/
		public  AdminPayment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// frame size
		setBounds(100, 100, 1050, 628);
		setResizable(false);
		getContentPane().setLayout(null);      
		setLocationRelativeTo(null);
		setTitle("Admin payment database check");
		
		// create contentpanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new java.awt.Color(187, 235, 250));
		contentPane.setLayout(null);
		
		//CREATING HEADING PANEL
		panel = new JPanel();
		panel.setBounds(91, 10, 918, 62);
		panel.setBackground(new Color(13, 37, 239));
		contentPane.add(panel);
		panel.setLayout(null);
		
		//HEADING LABEL
		JLabel lblNewLabel_1 = new JLabel("-- Inside Inspiration Academy > Track Payment (Admin) --");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 10, 898, 42);
		panel.add(lblNewLabel_1);
		
		//ADD IMAGE TO THE HEADING PANEL
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Resources/inside_logo.jpg"));
		     Image bimg = img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		     ImageIcon image = new ImageIcon(bimg);
		   
		   //CREATE USER INFORMATION PANEL
		panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
		panel_1.setBounds(91, 82, 409, 248);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		//ADD NAME LABEL TO THE USER INFORMATION PANEL
		name = new JLabel("Name *");
		name.setForeground(new java.awt.Color(52, 45, 113));
		name.setFont(new Font("Tahoma", Font.BOLD, 18));
		name.setBounds(10, 57, 100, 27);
		panel_1.add(name);
		
		//ADD NAME TXTFLD TO THE USER INFORMATION PANEL
		nameTxt = new JTextField();
		nameTxt.setForeground(new Color(104, 108, 110));
		nameTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
		nameTxt.setBounds(120, 60, 265, 30);
		panel_1.add(nameTxt);
		nameTxt.setColumns(10);
		
		//ADD EMAIL LABEL TO THE USER INFORMATION PANEL
		email = new JLabel("Email-Id *");
		email.setForeground(new java.awt.Color(52, 45, 113));
		email.setFont(new Font("Tahoma", Font.BOLD, 18));
		email.setBounds(10, 108, 100, 27);
		panel_1.add(email);
		
		//ADD EMAIL TXTFLD TO THE USER INFORMATION PANEL
		emailTxt = new JTextField();
		emailTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
		emailTxt.setForeground(new Color(104, 108, 110));
		emailTxt.setColumns(10);
		emailTxt.setBounds(120, 108, 265, 30);
		panel_1.add(emailTxt);
		
		
		//ADD PASSWORD LABEL TO THE USER INFORMATION PANEL
		password = new JLabel("Password *");
		password.setForeground(new java.awt.Color(52, 45, 113));
		password.setFont(new Font("Tahoma", Font.BOLD, 18));
		password.setBounds(10, 161, 114, 27);
		panel_1.add(password);
		
		//ADD EMAIL TXTFLD TO THE USER INFORMATION PANEL
		p = new JPasswordField();
		p.setFont(new Font("Tahoma", Font.BOLD, 16));
		p.setForeground(new Color(104, 108, 110));
		p.setColumns(10);
		p.setBounds(120, 161, 265, 30);
		panel_1.add(p);
		
		//ADD ADMIN LOGIN LABEL TO THE USER INFORMATION PANEL
		JLabel lblNewLabel_2_2 = new JLabel("Admin Login *");
		lblNewLabel_2_2.setForeground(new java.awt.Color(52, 45, 113));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_2.setBounds(10, 0, 375, 37);
		panel_1.add(lblNewLabel_2_2);
		
		
		//ADD -------- LABEL TO THE USER INFORMATION PANEL after admin login text
		u1 = new JLabel("_____________________________");
		u1.setForeground(Color.BLUE);
		u1.setFont(new Font("Tahoma", Font.BOLD, 20));
		u1.setBounds(10, 13, 399, 37);
		panel_1.add(u1);
		
		//CREATE ANOTHER PANEL FOR THE STUDENT NAME COMBOBOX
		panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 255)));
		panel_2.setBounds(91, 340, 409, 234);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		//ADD COMBOBOX TO THIS PANEL
		String namecombox[]= {};
		namecombo = new JComboBox(namecombox);
		namecombo.setFont(new Font("Tahoma", Font.BOLD, 14));
		namecombo.setForeground(new Color(104, 108, 110));
		namecombo.setBounds(10, 57, 375, 31);
		panel_2.add(namecombo);
		
		//ADD COMBOBOX LABEL to this panel
		namecomboTxt = new JLabel("Choose Student for Tracking Payment");
		namecomboTxt.setForeground(new Color(52, 45, 113));
		namecomboTxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		namecomboTxt.setBounds(10, 10, 389, 22);
		panel_2.add(namecomboTxt);
		
		//ADD -------- TO THIS PANEL AFTER THIS TEXT
		namecomboline = new JLabel("_____________________________");
		namecomboline.setForeground(Color.BLUE);
		namecomboline.setFont(new Font("Tahoma", Font.BOLD, 20));
		namecomboline.setBounds(10, 20, 389, 27);
		panel_2.add(namecomboline);
		
		//ADD CHOOSE COURSE LABEL AFTER THE TEXT CHOOSE COURSE IN THIS PANEL
		namecomboTxt1 = new JLabel("Choose Course");
		namecomboTxt1.setForeground(new Color(52, 45, 113));
		namecomboTxt1.setFont(new Font("Tahoma", Font.BOLD, 20));
		namecomboTxt1.setBounds(10, 98, 375, 22);
		panel_2.add(namecomboTxt1);
		
		//ADD COURSE COMBOBOX TO THIS PANEL
		namecombo1line = new JLabel("_____________________________");
		namecombo1line.setForeground(Color.BLUE);
		namecombo1line.setFont(new Font("Tahoma", Font.BOLD, 20));
		namecombo1line.setBounds(10, 107, 389, 31);
		panel_2.add(namecombo1line);
		
		//ADD COMBOBOX FOR COURSE TO THIS PANEL
		String namecombox1[]= {};
		namecombo1 = new JComboBox(namecombox1);
		namecombo1.setForeground(new Color(104, 108, 110));
		namecombo1.setFont(new Font("Tahoma", Font.BOLD, 14));
		namecombo1.setBounds(10, 148, 375, 31);
		panel_2.add(namecombo1);
		
		//CREATE LOG IN BUTTON FOR USER LOGIN
		login = new JButton("Login");
		login.setBackground(new java.awt.Color(4, 59, 92));
		login.setForeground(Color.WHITE);
		login.setFont(new Font("Tahoma", Font.BOLD, 16));
		login.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		String NameTxt = nameTxt.getText();
		String mailTxt = emailTxt.getText();
		String pswrdTxt = p.getText();
		if(NameTxt.equals("") || mailTxt.equals("") || pswrdTxt.equals("")){
		
		JOptionPane.showMessageDialog(null, "'*' Fields are required");
		}
		else {
		
		try {
		Connection con = DatabaseConnection.getConnection();
		Connection con5 = DatabaseConnection.getConnection();
		String check="select * from adminaccess where name=? and email=? and password=?";
		String StudentinLoop="insert into studentnamesforadminaccess(studentsofiia, course) select name, Selected_Courses from studentrecord";
		PreparedStatement pscheck = con.prepareStatement(check);
		PreparedStatement str = con5.prepareStatement(StudentinLoop);
		pscheck.setString(1, NameTxt);
		pscheck.setString(2, mailTxt);
		pscheck.setString(3, pswrdTxt);
		
		ResultSet rscheck = pscheck.executeQuery();
		//
		if(rscheck.next()) {
		JOptionPane.showMessageDialog(null, "Now select a student name to track payment :");
		str.executeUpdate() ;
		
		//dispose();
		
		try {
		
		String studentsFetch = "select distinct studentsofiia from studentnamesforadminaccess where Email=?";
		PreparedStatement ps1 = con.prepareStatement(studentsFetch);
		ps1.setString(1, mailTxt);
		
		ResultSet rs1 = ps1.executeQuery();
		
		
		while(rs1.next()) {
		String studentsForCombo[] = rs1.getString("studentsofiia").split("\n");
		for(int i = 0; i < studentsForCombo.length; i++) {
			System.out.println(studentsForCombo[i]);
		namecombo.addItem(studentsForCombo[i]);
		
		}
		
		// private void initComponents() {
		// // TODO Auto-generated method stub
		//
		// }
		}
		
		
		
		}catch(Exception e1) {
		e1.printStackTrace();
		}
		
		}
		
		
		else
		{
		JOptionPane.showMessageDialog(null, "Invalid Username or Password or emailid");
		nameTxt.setText("");
		emailTxt.setText("");
		p.setText("");
		}
		
		}catch(Exception e2) {
		e2.printStackTrace();
		}
		}
		}
		});
		login.setBounds(10, 211, 80, 27);
		panel_1.add(login);
		
		//STUDENTS NAME DISPLAYING COMBOBOX FUNCTIONALLITY
		namecombo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		//String nameselect=(String) namecombo.getSelectedItem();
		try {
		Connection con = DatabaseConnection.getConnection();
		String courseFetch = "select distinct course from studentnamesforadminaccess where studentsofiia=?";
		PreparedStatement ps1 = con.prepareStatement(courseFetch);
		ps1.setString(1, (String) namecombo.getSelectedItem());
		
		
		ResultSet rs1 = ps1.executeQuery();
		
        namecombo1.removeAllItems();
		while(rs1.next()) {
		
		String courseForCombo[] = rs1.getString("course").split(", ");
		for(int i = 0; i < courseForCombo.length; i++) {
		
		namecombo1.addItem(courseForCombo[i]);
		
		}
		   
		// private void initComponents() {
		// // TODO Auto-generated method stub
		//
		// }
		}
		
		}catch(Exception e) {
		e.printStackTrace();
		}
		}
		});
		
		
		        //CREATE RESET BUTTON
		reset = new JButton("Reset");
		reset.setForeground(Color.WHITE);
		reset.setBackground(Color.red);
		reset.setFont(new Font("Tahoma", Font.BOLD, 16));
		reset.setBounds(109, 211, 80, 27);
		reset.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		nameTxt.setText("");
		emailTxt.setText("");
		p.setText("");
		}
		});
		
		panel_1.add(reset);
		
		//CREATE PASSWORD SHOW BUTTON
		show = new JButton("Show");
		show.setForeground(Color.WHITE);
		show.setBackground(new Color(0, 155, 0));
		show.setFont(new Font("Tahoma", Font.BOLD, 16));
		show.setBounds(210, 211, 80, 27);
		
		show.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		p.setEchoChar((char)0);
		}
		});
		panel_1.add(show);
		
		//CREATE PASSWORD HIDE BUTTON
		hide = new JButton("Hide");
		hide.setForeground(Color.WHITE);
		hide.setBackground(new Color(231, 45, 18));
		hide.setFont(new Font("Tahoma", Font.BOLD, 16));
		hide.setBounds(300, 211, 85, 27);
		hide.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		p.setEchoChar('*');
		}
		});
		panel_1.add(hide);
		
		        //CREATE TRACK PAYMENT BUTTON AND FUNCTIONALLITY
		loadbtn = new JButton("TRACK PAYMENT");
		loadbtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		try {
		Connection con2 = DatabaseConnection.getConnection();
		String courseFetch2 = "select email,courses,month, paymentdoneornot from studentreceiptcollection where courses=? and name=? and paymentdoneornot='payment done'";
		PreparedStatement ps5 = con2.prepareStatement(courseFetch2);
		ps5.setString(1, (String) namecombo1.getSelectedItem());
		ps5.setString(2, (String) namecombo.getSelectedItem());
		
//		************************************************************************************************
		ResultSet rs5 = ps5.executeQuery();
		java.sql.ResultSetMetaData rsmd = rs5.getMetaData();
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		dtm.setRowCount(0);
		
		int column = rsmd.getColumnCount();
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(20);
		table.getColumnModel().getColumn(2).setPreferredWidth(20);
		                    table.getColumnModel().getColumn(3).setPreferredWidth(100);
		                    while(rs5.next()) {
		Vector v = new Vector();
		for(int i = 1; i <= column; i++) {
		v.add(rs5.getString("email"));
		v.add(rs5.getString("courses"));
		v.add(rs5.getString("month"));
		v.add(rs5.getString("paymentdoneornot"));
		
		
		}
		dtm.addRow(v);
		namecombo2.removeAllItems();
		                    }
		
		
		}catch(Exception e6) {
		e6.printStackTrace();
		}
		}
		});
		loadbtn.setBackground(Color.BLUE);
		loadbtn.setForeground(Color.WHITE);
		loadbtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		loadbtn.setBounds(10, 193, 375, 31);
		panel_2.add(loadbtn);
		
		
		
		//CREATE TABLE TO TRACK THE PAYMENT DETAILS
		table = new JTable();
		table.setBackground(new Color(240, 250, 243));
		table.setForeground(new java.awt.Color(4, 59, 92));  //26, 117, 255  //31, 156, 20
		table.setFont(new Font("Tahoma", Font.BOLD, 10));
		table.setModel(new DefaultTableModel(
		
		new Object[][] {
		{"          Student Mail","                Course", "           Paid Months","  Payment Done or Not",},
		{null, null,null,null},
		{null, null,null,null},
		{null, null,null,null},
		{null, null,null,null},
		
		
		},
		
		new String[] {
		"Student Mail"," Course", "Paid Months","Payment Done or Not",
		}
		));
		
		table.setBorder(new MatteBorder(1, 2, 2, 2, (Color) Color.BLUE));
		table.setBounds(436, 102, 520, 400);
		
		   //CREATE SCROLLPANE FOR THE TABLE
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(517, 82, 492, 361);
		contentPane.add(scrollPane);
		scrollPane.add(table);
		
		//CREATE ANOTHER PANEL TO SHOW THE PAYMENT DUE MONTHS
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(517, 460, 492, 114);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		//ADD LABEL AS TOTAL DUE MONTH TO THE PANEL
		JLabel lblNewLabel_4 = new JLabel("Total Due (Month)");
		lblNewLabel_4.setForeground(new Color(52, 45, 113));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_4.setBounds(10, 63, 183, 26);
		panel_3.add(lblNewLabel_4);
		
		//ADD COMBOBOX TO DISPLAY THE DUE MONTH/MONTHS FOR CORRESPONDING STUDENT FOR THEIR RESPECTIVE COURSES
		String namecombox11[]= {};
		namecombo2 = new JComboBox(namecombox11);
		namecombo2.setBounds(203,64, 279, 26);
		namecombo2.setFont(new Font("Tahoma", Font.BOLD, 14));
		namecombo2.setForeground(new java.awt.Color(104, 108, 110));
		panel_3.add(namecombo2);
		
		//ADD CHECK DUE MONTH BUTTON TO THE PANEL AND FUNCTIONALLITY
		due = new JButton("Check Due Month\r\n");
		due.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		try {
		Connection con2 = DatabaseConnection.getConnection();
		String courseFetch2 = "select month from coursestrack as a where course=? and not exists(select month from studentreceiptcollection as b where course=? and name=? and a.month=b.month)";
		PreparedStatement ps5 = con2.prepareStatement(courseFetch2);
		ps5.setString(1, (String) namecombo1.getSelectedItem());
		ps5.setString(2, (String) namecombo1.getSelectedItem());
		ps5.setString(3, (String) namecombo.getSelectedItem());
		
		
		
		
		
		ResultSet monthfetch = ps5.executeQuery();
		namecombo2.removeAllItems();
		
		while(monthfetch.next()) {
		
		
		namecombo2.addItem(monthfetch.getString("month"));
		}
		
		
		
		}catch(Exception e6) {
		e6.printStackTrace();
		}
		}
		});
		due.setBackground(Color.BLUE);
		due.setForeground(Color.WHITE);
		due.setFont(new Font("Tahoma", Font.BOLD, 18));
		due.setBounds(10, 10, 472, 31);
		panel_3.add(due);
		
		//ADD NAVIGATION BAR
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(null);
		panel_4.setBounds(0, 10, 72, 564);
		contentPane.add(panel_4);
		
		
		//ADD NAVIGATION BAR IMAGES  
		        // Nav Home
		 ImageIcon imglogin = new ImageIcon(ClassLoader.getSystemResource("Resources/Homenav.png"));
	      Image bimglogin = imglogin.getImage().getScaledInstance(52, 55, Image.SCALE_DEFAULT);
	      ImageIcon imagelogin = new ImageIcon(bimglogin);
	      
	      jllogin = new JLabel(imagelogin);
	      jllogin.addMouseListener(new MouseAdapter() {
		      	@Override
		      	public void mouseClicked(MouseEvent e) {
		      		dispose();
		      		HomePage sr = new HomePage();
		      		sr.main(null);
		      	}
		      });
	      jllogin.setBounds(29, 7, 0, 0);
	      
	      
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
	      jlforget.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		dispose();
	      		PayNow1 tr = new PayNow1();
	      		tr.main(null);
	      	}
	      });
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
		
		     
		
		
		
		
		
		
		
		
		}
		}