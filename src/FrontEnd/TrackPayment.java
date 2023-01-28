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
		import java.io.File;
		import java.io.FileInputStream;
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
		import javax.swing.Action;
		import javax.swing.BoxLayout;
		import javax.swing.ImageIcon;
		import javax.swing.JTable;
		import javax.swing.JTextArea;
		import javax.swing.JTextField;
		import javax.swing.RowFilter;
		import javax.swing.JComboBox;
		import javax.swing.JFileChooser;
		import javax.swing.JButton;
		import javax.swing.table.DefaultTableModel;
		import javax.swing.table.TableRowSorter;
		
		import com.mysql.cj.jdbc.result.ResultSetMetaData;
		import com.mysql.cj.protocol.Resultset;
		
		import Database.DatabaseConnection;
		
		import javax.swing.JScrollPane;
		public  class TrackPayment extends JFrame {
		
		
		protected static final String DbUtils = null;
		private JPanel contentPane, studentPanel, registerPanel,panel_4, panel;
		private JLabel jllog, jlpayment1, jlabout, jlpayment,jlcurri, jllogout, L3,jlforget, jlreg, jllogin,studentDetails, jl1, L, L1, L2,coursechoose,line,Username, Emailid,Password,mail, course;
		private JTextField UsernameTxt, EmailidTxt,mailTxt;
		
		private JPasswordField p;
		private JButton loadbtn, show,hide,fpay,upload,submit,checkbtn;
		
		private JTable table;
		public JComboBox namecombo,namecombo1;
		
		private ScrollPane scrollPanel;
		private JLabel lblNewLabel, PayNowLabel, QRCode, gpay;
		private JPanel panel_1;
		private JPanel panel_2;
		private JLabel lblNewLabel_2;
		
		/**
		* Launch the application.
		*/
		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
		try {
			TrackPayment frame = new TrackPayment();
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
		public TrackPayment() {
		
		// close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// frame size
		setBounds(100,100,859,650);
		setResizable(false);
		getContentPane().setLayout(null);      
		setLocationRelativeTo(null);
		setTitle("PAYMENT SCREENSHOT UPLOAD");
		
		
		// HEADING panel
		studentPanel = new JPanel();
		studentPanel.setBounds(86, 10, 749, 60);
		studentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		studentPanel.setBackground(new java.awt.Color(13, 37, 219));
		studentPanel.setLayout(null);
		
		// add jlabel to the HEADING panel
		studentDetails= new JLabel("-- Inside Inspiration Academy > Pay Now --");
		studentDetails.setHorizontalAlignment(SwingConstants.CENTER);
		studentDetails.setFont(new Font("Tahoma", Font.BOLD, 30));
		studentDetails.setForeground(Color.WHITE);
		studentDetails.setBounds(10, 10, 729, 40);
		studentPanel.add(studentDetails);
		
		// image on the HEADING panel left
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("inside_logo.jpg"));
		     Image bimg = img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		     ImageIcon image = new ImageIcon(bimg);
		     
		  // ALREADY REGISTERED STUDENT'S LOG IN panel
		registerPanel = new JPanel();
		registerPanel.setBounds(398, 80, 437, 468);
		registerPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLUE));
		registerPanel.setBackground(new java.awt.Color(250, 250, 250));
		registerPanel.setLayout(null);
		
		
		// ALREADY REGISTERED STUDENT'S LOG IN label
		L=new JLabel("Student Information");
		L.setBounds(30, 0, 400, 40);
		L.setFont(new Font("Tahoma", Font.BOLD, 25));
		L.setForeground(new java.awt.Color(26, 117, 255));
		registerPanel.add(L);
		
		
		// dotted line
		line=new JLabel("______________________________");
		line.setBounds(30, 5, 450, 59);
		line.setFont(new Font("Tahoma", Font.BOLD, 20));
		line.setForeground(new java.awt.Color(26, 117, 255));
		registerPanel.add(line);
		
		// Name
		Username=new JLabel("Name *");
		Username.setBounds(30,57,100,40);
		Username.setFont(new Font("Tahoma", Font.BOLD, 16));
		Username.setForeground(new java.awt.Color(11, 107, 156));
		registerPanel.add(Username);
		       
		
		// NAME txtfld
		UsernameTxt=new JTextField();
		UsernameTxt.setBounds(130,63,284,30);
		UsernameTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
		UsernameTxt.setForeground(new java.awt.Color(104,108,110));
		       registerPanel.add(UsernameTxt);
		
		       // Emailid
		       Emailid=new JLabel("Email-id *");
		       Emailid.setBounds(30,121,150,40);
		       Emailid.setFont(new Font("Tahoma", Font.BOLD, 16));
		       Emailid.setForeground(new java.awt.Color(11, 107, 156));
		registerPanel.add(Emailid);
		       
		
		// Emailid txtfld
		EmailidTxt=new JTextField();
		EmailidTxt.setBounds(130,126,284,30);
		EmailidTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
		EmailidTxt.setForeground(new java.awt.Color(104,108,110));
		       registerPanel.add(EmailidTxt);
		
		       // PASSWORD
		       Password=new JLabel("Password *");
		       Password.setBounds(30,198,100,40);
		       Password.setFont(new Font("Tahoma", Font.BOLD, 16));
		       Password.setForeground(new java.awt.Color(11, 107, 156));
		registerPanel.add(Password);
		
		//PASSWORD TXTFLD
		p=new JPasswordField(15);
		p.setBounds(130, 203, 284, 30);
		p.setFont(new Font("Tahoma", Font.BOLD, 16));
		p.setForeground(new java.awt.Color(104,108,110));
		registerPanel.add(p);
		
		
		    //PASSWORD SHOW BUTTON    
		show = new JButton("Show");  
		show.setBounds(246, 250, 81, 27);
		show.setFont(new Font("Tahoma", Font.BOLD, 15));
		show.setBackground(new java.awt.Color(0,100,0));
		show.setForeground(Color.white);
		show.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		p.setEchoChar((char)0);
		}
		});
		registerPanel.add(show);
		       
		                //PASSWORD HIDE BUTTON
		hide = new JButton("Hide");  
		hide.setBounds(337, 250, 77, 27);
		hide.setFont(new Font("Tahoma", Font.BOLD, 15));
		hide.setBackground(new java.awt.Color(217, 30, 24));
		hide.setForeground(Color.white);
		hide.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		p.setEchoChar('*');
		}
		});
		registerPanel.add(hide);
		
		//PAYMENT SCREENSHOT UPLOAD BUTTON (WHERE THE TRANSACTION ID IS PROVIDED)
		submit = new JButton("Upload your payment Screenshot");  
		submit.setBounds(398, 558, 437, 32);
		submit.setFont(new Font("Tahoma", Font.BOLD, 16));
		submit.setBackground(new java.awt.Color(241, 90, 34));
		submit.setForeground(Color.white);
		                   
		   //UPLOAD FUNCTIONALLITY
		submit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		
		String usernameTxt = UsernameTxt.getText();
		String mailTxt = EmailidTxt.getText();
		String pswrdTxt = p.getText();
		String courseTxt=namecombo.getSelectedItem().toString();
		String monthTxt=namecombo1.getSelectedItem().toString();
		if(usernameTxt.equals("") || mailTxt.equals("") || pswrdTxt.equals("") || monthTxt.equals("")){
		
		JOptionPane.showMessageDialog(null, "'*' Fields are required");
		}
		else {
		
		try {
		Connection con = Database.DatabaseConnection.getConnection();
		String check="select * from newregistration where email=? and password=?";
		PreparedStatement pscheck = con.prepareStatement(check);
//		pscheck.setString(1, usernameTxt);
		pscheck.setString(1, mailTxt);
		System.out.println(mailTxt);
		pscheck.setString(2, pswrdTxt);
		System.out.println(pswrdTxt);
		
		ResultSet rscheck = pscheck.executeQuery();
		//
		if(rscheck.next()) {
		
		try {
		Connection con1 = DatabaseConnection.getConnection();
		String s="insert into studentreceiptcollection values(?,?,?,?,?,?)";
		PreparedStatement pscheck1 = con1.prepareStatement(s);
		
		
		JFileChooser jfc=new JFileChooser();
		jfc.showOpenDialog(null);
		File file=jfc.getSelectedFile();
		
		FileInputStream fis=new FileInputStream(file);
		pscheck1.setString(1, mailTxt);
		pscheck1.setBinaryStream(2, fis,fis.available());
		pscheck1.setString(3, courseTxt);
		pscheck1.setString(4, monthTxt);
		pscheck1.setString(5, "payment done");
		pscheck1.setString(6, usernameTxt);
		
		pscheck1.executeUpdate();
		
		JOptionPane.showMessageDialog(null, "image is sucessfully inserted");
		
		}catch(Exception e4) {
		e4.printStackTrace();
		}
		
		}
		
		else
		{
		JOptionPane.showMessageDialog(null, "Invalid Username or Password or emailid");
		UsernameTxt.setText("");
		EmailidTxt.setText("");
		p.setText("");
		}
		
		
		}catch(Exception e5) {
		e5.printStackTrace();
		}
		}
		}
		});
		
		                     //COURSE CHOOSE LABEL
		L2=new JLabel("Choose Course *");
		L2.setBounds(30, 339, 300, 41);
		L2.setFont(new Font("Tahoma", Font.BOLD, 17));
		L2.setForeground(new java.awt.Color(11, 107, 156));
		registerPanel.add(L2);
		
		//MONTH CHOOSE LABEL
		L3=new JLabel("Choose Month *");
		L3.setBounds(30, 395, 300, 40);
		L3.setFont(new Font("Tahoma", Font.BOLD, 17));
		L3.setForeground(new java.awt.Color(11, 107, 156));
		registerPanel.add(L3);
		
		                        //COURSE COMBOBOX
		   String namecombox[]= {};
		namecombo = new JComboBox(namecombox);
		namecombo.setBounds(180,344, 234, 30);
		namecombo.setFont(new Font("Tahoma", Font.BOLD, 14));
		namecombo.setForeground(new java.awt.Color(104, 108, 110));
		registerPanel.add(namecombo);
		
		//MONTH COMBOBOX
		String namecombox1[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		namecombo1 = new JComboBox(namecombox1);
		namecombo1.setBounds(180,400, 234, 30);
		namecombo1.setFont(new Font("Tahoma", Font.BOLD, 14));
		namecombo1.setForeground(new java.awt.Color(104, 108, 110));
		registerPanel.add(namecombo1);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new java.awt.Color(167, 235, 250));
		contentPane.setLayout(null);
		
		
		
		//MAKE PAYMENT BUTTON
		loadbtn = new JButton("Make Payment");  
		loadbtn.setBounds(0, 294, 437, 30);
		loadbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		loadbtn.setBackground(new java.awt.Color(50,205,50));
		loadbtn.setForeground(Color.white);
		 
		//MAKE PAYMENT BUTTON FUNCTIONALLITY
		loadbtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		String usernameTxt = UsernameTxt.getText().trim();
		String mailTxt = EmailidTxt.getText().trim();
		String pswrdTxt = p.getText().trim();
		
		String monthTxt=namecombo1.getSelectedItem().toString();
		if(usernameTxt.equals("") || mailTxt.equals("") || pswrdTxt.equals("")||monthTxt.equals("")){
		
		JOptionPane.showMessageDialog(null, "'*' Fields are required");
		}
		else {
		
		try {
		Connection con = DatabaseConnection.getConnection();
		String check="select * from newregistration where email=? and password=?";
		PreparedStatement pscheck = con.prepareStatement(check);
//		pscheck.setString(1, usernameTxt);
		pscheck.setString(1, mailTxt);
		pscheck.setString(2, pswrdTxt);
		
		ResultSet rscheck = pscheck.executeQuery();
		//
		if(rscheck.next()) {
			PayNowLabel.hide();
			panel.show();
		JOptionPane.showMessageDialog(null, "Now choose your course and month for which you want to pay :-");
		
//		JOptionPane.showMessageDialog(null, "PLEASE ATTACH THE APPROPRIATE PAYMENT SCREENSHOT FOR THE SAME 'WHICH IS DIFFERENT FROM THE PAYMENT RECEIPT':-");
		
		
		try {
		
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
		
		registerPanel.add(loadbtn);
		
		//PANEL FOR NAVIGATION BAR
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(null);
		panel_4.setBounds(0, 10, 66, 580);
		contentPane.add(panel_4);
		
		
		//IMAGES FOR NAVIGATION BAR
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
		jlforget.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				PayNow1 notes = new PayNow1();
				notes.main(null);
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
		//		dispose();
		//		PayNow1 notes = new PayNow1();
		//		notes.main(null);
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
		
		lblNewLabel = new JLabel("* File Format must be in (.jpg or .png)");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(185, 442, 271, 20);
		registerPanel.add(lblNewLabel);
		contentPane.add(submit);
		
		 panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(84, 80, 304, 510);
		contentPane.add(panel);
		panel.setLayout(null);
		
		PayNowLabel = new JLabel("");
		PayNowLabel.setBounds(551, 80, 218, 503);
		
		
		// image
		ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("Resources/pay2.png"));
		Image bimg1 = img1.getImage().getScaledInstance(550, 510, Image.SCALE_DEFAULT);
		ImageIcon image1 = new ImageIcon(bimg1);
		PayNowLabel = new JLabel(image1);
		PayNowLabel.setBounds(-40, 80, 550, 510);
		
		
		// image
		ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("Resources/QRCode.png"));
		Image bimg2 = img2.getImage().getScaledInstance(270, 235, Image.SCALE_DEFAULT);
		ImageIcon image2 = new ImageIcon(bimg2);
		QRCode = new JLabel(image2);
		QRCode.setBounds(5, 5, 270, 235);
				
		// image
		ImageIcon img3 = new ImageIcon(ClassLoader.getSystemResource("Resources/gpay.jpg"));
		Image bimg3 = img3.getImage().getScaledInstance(330, 154, Image.SCALE_DEFAULT);
		ImageIcon image3 = new ImageIcon(bimg3);
		gpay = new JLabel(image3);
		gpay.setBounds(-25, 0, 330, 137);
		
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(248, 248, 248));
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(64, 64, 64)));
		panel_2.setForeground(Color.DARK_GRAY);
		panel_2.setBounds(10, 10, 284, 246);
		panel.add(panel_2);
		panel_2.setLayout(null);
		contentPane.add(PayNowLabel);
		panel_2.add(QRCode);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 299, 284, 137);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		panel_1.add(gpay);
		
		JLabel lblNewLabel_1 = new JLabel(" Scan this QR code to Make Payment");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1.setBounds(3, 438, 323, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(" and upload only this .jpg or .png\r\n");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(15, 458, 294, 20);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("  file to confirm your payment  :)");
		lblNewLabel_1_1_1.setForeground(Color.RED);
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(17, 480, 284, 20);
		panel.add(lblNewLabel_1_1_1);
		
		lblNewLabel_2 = new JLabel("      UPI ID: ashtiasa@oksbi");
		lblNewLabel_2.setForeground(new Color(82, 82, 82));
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_2.setBounds(20, 266, 274, 23);
		panel.add(lblNewLabel_2);
		
		
		
		PayNowLabel.show();
		
		panel.hide();
		
		
		
		
		
		
		
		}
		}