package FrontEnd;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JToolBar;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Choice;
import javax.swing.border.MatteBorder;

import Database.DatabaseConnection;

import javax.swing.UIManager;

public class NotesSection extends JFrame{

	private JFrame frame;
	private JPanel contentPane, notesPanel, CoursesPanel, userPanel, downloadPanel, imagePanel, panel;
	private JLabel notesDetails, jl, jl1, L, line, L1, line1,jl11,jl12, jldbms, Cname,jllog,jlabout,jlpayment1,jlpayment,jllogout,jlforget,jlcurri,jlreg,jllogin, Coursename, name,jlcsarchi,jlai,jladvjava,jlmongo,jljs,jlphp, jlnode,email, Username, Cpswrd, jljava, jlpython, jlcpp,jldjango, jlsql, jlc, jlhtml,jldaa, jldsa, jlmicro, jlos, jlnetworking, jlcomplier, jlcss, jlml, jlreact;
	private JButton java, python, sql, cpp,Microprocessor_1,os_1;
	private JTextArea ta;
	private JButton java_1;
	private JButton python_1;
	private JButton cpp_1;
	private JButton sql_1;
	private JButton Microprocessor;
	private JButton os;
	private JTextField CnameTxt, nameTxt, mailTxt, UsernameTxt;
	private JPasswordField CpswrdTxt;

	private JButton dwnloadbtn, notesBtn;
	private JPanel panel_1;
	private JButton goStudentRecord;
	private JButton showbtn;
	private JButton hidebtn;
	private JButton java_2;
	private JButton python_2;
	private JButton cpp_2;
	private JButton sql_2;
	private JButton java_3;
	private JButton python_3;
	private JButton cpp_3;
	private JButton sql_3;
	private JButton Microprocessor_2;
	private JButton os_2;
	private JButton Microprocessor_3;
	private JButton os_3;
	private JButton Microprocessor_4;
	private JButton os_4;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotesSection frame = new NotesSection();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
public static boolean EmailValidate(String str) {
		
		String valiEmail =  "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat = Pattern.compile(valiEmail, Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(str);
		return matcher.find();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public  NotesSection(){
		setBounds(100, 100, 1070, 610);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null); 
		setTitle("Notes Section");
		
		// contentpane
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new java.awt.Color(187, 235, 250));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// notesPane
		notesPanel = new JPanel();
		notesPanel.setBounds(20, 10, 944, 60);
		notesPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		notesPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
		notesPanel.setBackground(new java.awt.Color(250, 245, 247));
		notesPanel.setLayout(null);
		notesPanel.setBackground(new java.awt.Color(13, 37, 219));
		
		// add jlabel to the notes panel
		notesDetails= new JLabel("-- Inside Inspiration Academy > Notes Section --");
		notesDetails.setHorizontalAlignment(SwingConstants.CENTER);
		notesDetails.setFont(new Font("Tahoma", Font.BOLD, 34));
		notesDetails.setForeground(new java.awt.Color(26, 117, 255));
		notesDetails.setBounds(40, 7, 870, 35);
		notesPanel.add(notesDetails);
		notesDetails.setForeground(new java.awt.Color(250, 250, 250));
		
		
		// image on the student panel left
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("inside_logo.jpg"));
	      Image bimg = img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	      ImageIcon image = new ImageIcon(bimg);
	      
	      jl = new JLabel(image);
	      jl.setBounds(0, 0, 100, 67);
//	      notesPanel.add(jl);
	      
	      // image on the student panel right
	      ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("inside_logo.jpg"));
	      Image bimg1 = img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	      ImageIcon image1 = new ImageIcon(bimg);
	      
	      jl1 = new JLabel(image);
	      jl1.setBounds(844, 0, 100, 67);
//	      notesPanel.add(jl1);

	  	// new User Registration panel
			CoursesPanel = new JPanel();
			CoursesPanel.setBounds(20, 80, 480, 480);
			CoursesPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			CoursesPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
			CoursesPanel.setBackground(new java.awt.Color(250, 250, 250));
			CoursesPanel.setLayout(null);
			
			// add new student label
			L=new JLabel("Choose the Course ");
			L.setBounds(20,5, 400, 40);
			L.setFont(new Font("Tahoma", Font.BOLD, 19));
			 L.setForeground(new java.awt.Color(26, 117, 255));
			 CoursesPanel.add(L);
			 
			 // dotted line
			 line=new JLabel("___________________________________");
			 line.setBounds(20, 10, 481, 50);
			 line.setFont(new Font("Tahoma", Font.BOLD, 20));
			 line.setForeground(new java.awt.Color(26, 117, 255));
			 CoursesPanel.add(line);
	  
		
			 
//			 new User Registration panel
			userPanel = new JPanel();
			userPanel.setBounds(520, 80, 446, 480);
			userPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			userPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
			userPanel.setBackground(new java.awt.Color(250, 250, 250));
			userPanel.setLayout(null);	 
			
			
			
			
				
			
					
					 
					 
					 
					 
				
					
		
		
		
		java = new JButton("Java");
		java.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTxt.setText("");
	 			mailTxt.setText("");
	 			UsernameTxt.setText("");
	 			CpswrdTxt.setText("");
	 			downloadPanel.hide();
		 		imagePanel.hide();
				Coursename.setText(java.getLabel());
				imagePanel.removeAll();
				imagePanel.add(jljava);
				
			}
		});
		java.setBackground(new java.awt.Color(51,51,51));
		java.setForeground(Color.WHITE);
		java.setFont(new Font("Tahoma", Font.BOLD, 15));
		java.setBounds(20, 57, 80, 30);
		CoursesPanel.add(java);
		
		python = new JButton("Python");
		python.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTxt.setText("");
	 			mailTxt.setText("");
	 			UsernameTxt.setText("");
	 			CpswrdTxt.setText("");
	 			downloadPanel.hide();
		 		imagePanel.hide();
				Coursename.setText(python.getLabel());
				imagePanel.removeAll();
				imagePanel.add(jlpython);
				
			}
		});
		python.setBounds(127, 57, 93, 30);
		python.setBackground(new java.awt.Color(51,51,51));
		python.setForeground(Color.WHITE);
		python.setFont(new Font("Tahoma", Font.BOLD, 15));
		CoursesPanel.add(python);
		
		cpp = new JButton("C++");
		cpp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTxt.setText("");
	 			mailTxt.setText("");
	 			UsernameTxt.setText("");
	 			CpswrdTxt.setText("");
	 			downloadPanel.hide();
		 		imagePanel.hide();
				Coursename.setText(cpp.getLabel());
				imagePanel.removeAll();
				imagePanel.add(jlcpp);
				
				
			}
		});
		cpp.setBackground(new java.awt.Color(51,51,51));
		cpp.setForeground(Color.WHITE);
		cpp.setFont(new Font("Tahoma", Font.BOLD, 15));
		cpp.setBounds(251, 57, 90, 30);
		CoursesPanel.add(cpp);
		
		sql = new JButton("SQL");
		sql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTxt.setText("");
	 			mailTxt.setText("");
	 			UsernameTxt.setText("");
	 			CpswrdTxt.setText("");
	 			downloadPanel.hide();
		 		imagePanel.hide();
				Coursename.setText(sql.getLabel());
				imagePanel.removeAll();
				imagePanel.add(jlsql);
			}
		});
		sql.setBounds(367, 57, 102, 30);
		sql.setBackground(new java.awt.Color(51,51,51));
		sql.setForeground(Color.WHITE);
		sql.setFont(new Font("Tahoma", Font.BOLD, 15));
		CoursesPanel.add(sql);
		contentPane.add(userPanel);
		
		JLabel L_1 = new JLabel("Download Notes ");
		L_1.setForeground(new Color(26, 117, 255));
		L_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		L_1.setBounds(20, 5, 400, 40);
		userPanel.add(L_1);
		
		JLabel line_1 = new JLabel("________________________________");
		line_1.setForeground(new Color(26, 117, 255));
		line_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		line_1.setBounds(20, 10, 481, 50);
		userPanel.add(line_1);
		
		// Course name
		 Cname=new JLabel("Course Name : ");
		 Cname.setBounds(20,44,150,40);
		 Cname.setFont(new Font("Tahoma", Font.BOLD, 18));
		 Cname.setForeground(new java.awt.Color(11, 107, 156));
		 userPanel.add(Cname);
		 
		 
		 Coursename=new JLabel("");
		 Coursename.setBounds(170,45,300,40);
		 Coursename.setFont(new Font("Tahoma", Font.BOLD, 16));
		 Coursename.setForeground(Color.red);
		 userPanel.add(Coursename);
		 
		 name=new JLabel("Name *");
		 name.setBounds(20,81,150,40);
		 name.setFont(new Font("Tahoma", Font.BOLD, 18));
		 name.setForeground(new java.awt.Color(11, 107, 156));
		 userPanel.add(name);
		        
			
			// grdn txtfld
	    nameTxt=new JTextField();
        nameTxt.setBounds(120,86,310,30);
        nameTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
        nameTxt.setForeground(new java.awt.Color(104, 108, 110));
        userPanel.add(nameTxt); 
        
        email = new JLabel("Email Id *");
        email.setForeground(new Color(11, 107, 156));
        email.setFont(new Font("Tahoma", Font.BOLD, 18));
        email.setBounds(20, 124, 150, 40);
        userPanel.add(email);
        
        mailTxt = new JTextField();
        mailTxt.setForeground(new Color(104, 108, 110));
        mailTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
        mailTxt.setBounds(120, 129, 310, 30);
        userPanel.add(mailTxt);
        
        Username= new JLabel("Username *");
        Username.setForeground(new Color(11, 107, 156));
        Username.setFont(new Font("Tahoma", Font.BOLD, 18));
        Username.setBounds(20, 190, 150, 40);
        userPanel.add(Username);
        
        UsernameTxt = new JTextField();
        UsernameTxt.setForeground(new Color(104, 108, 110));
        UsernameTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
        UsernameTxt.setBounds(140, 195, 290, 30);
        userPanel.add(UsernameTxt);
		 
        Cpswrd=new JLabel("Password *");
	    Cpswrd.setBounds(20,234,150,40);
	    Cpswrd.setFont(new Font("Tahoma", Font.BOLD, 18));
	    Cpswrd.setForeground(new java.awt.Color(11, 107, 156));
	    userPanel.add(Cpswrd);
		        
	  
			// frstnm txtfld
		 CpswrdTxt=new JPasswordField();
		 CpswrdTxt.setBounds(140,240,290,30);
		 CpswrdTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
		 CpswrdTxt.setForeground(new java.awt.Color(104, 108, 110));
		 userPanel.add(CpswrdTxt);
		 
		  showbtn = new JButton("Show");
		  showbtn.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		CpswrdTxt.setEchoChar((char)0);
		  	}
		  });
			 showbtn.setBounds(147, 3, 69, 22);
			 showbtn.setBackground(Color.BLACK);
			 showbtn.setForeground(Color.WHITE);
			 showbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
			 CpswrdTxt.add(showbtn);
			 
			 hidebtn = new JButton("Hide");
			 hidebtn.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		CpswrdTxt.setEchoChar('*');
			 	}
			 });
			 hidebtn.setBounds(219, 3, 65, 22);
			 hidebtn.setBackground(Color.BLACK);
			 hidebtn.setForeground(Color.WHITE);
			 hidebtn.setFont(new Font("Tahoma", Font.BOLD, 13));
			 CpswrdTxt.add(hidebtn);	
		 
		 // dwnload panel
		 downloadPanel = new JPanel();
		 downloadPanel.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		 downloadPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) UIManager.getColor("CheckBoxMenuItem.selectionBackground")));
		 downloadPanel.setBounds(20, 332, 410, 130);
		 userPanel.add(downloadPanel);
		 
		 downloadPanel.hide();
		 
		
			
			
		 
		 dwnloadbtn = new JButton("Click Here to Download Notes");
		 dwnloadbtn.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(Coursename.getText().equals("")) {
		 			JOptionPane.showMessageDialog(null, "Oops! Please Choose your Course first!!");
		 		}
		 		
		 		else if(nameTxt.getText().equals("") || mailTxt.getText().equals("") || UsernameTxt.getText().equals("") || CpswrdTxt.getText().equals("")) {
		 			JOptionPane.showMessageDialog(null, "Oops! '*' Fields are Mandatory!!");
		 			nameTxt.setText("");
		 			mailTxt.setText("");
		 			UsernameTxt.setText("");
		 			CpswrdTxt.setText("");
		 			downloadPanel.hide();
			 		imagePanel.hide();
		 		}
		 		else {
		 			try {
		 				Connection con = DatabaseConnection.getConnection();
		 				String validateQuery = "select * from newregistration where Email=? and Username=? and Password=?";
		 				PreparedStatement ps = con.prepareStatement(validateQuery);
//		 				ps.setString(1, nameTxt.getText());
		 				
		 				
						if(EmailValidate(mailTxt.getText())) {
							ps.setString(1, mailTxt.getText().trim());
			 				ps.setString(2, UsernameTxt.getText().trim());
			 				ps.setString(3, CpswrdTxt.getText().trim());
			 				
			 				ResultSet rs = ps.executeQuery();
			 				
			 				if(rs.next()) {
			 					
			 					
			 					downloadPanel.show();
						 		imagePanel.show();
			 				}
			 				else {
			 					JOptionPane.showMessageDialog(null, "Oops! Incorrect Username or Password!!");
			 					nameTxt.setText("");
					 			mailTxt.setText("");
					 			UsernameTxt.setText("");
					 			CpswrdTxt.setText("");
					 			downloadPanel.hide();
						 		imagePanel.hide();
			 				}
						}
						else {
//							System.out.println("Email incorrect");
							JOptionPane.showMessageDialog(null," Invalid Email!! Please put Correct Email");
							
						}
		 				
		 				
		 				
		 			}catch(Exception ex) {
		 				JOptionPane.showMessageDialog(null, ex.getMessage());
		 				ex.printStackTrace();
		 			}
		 			
		 			
		 			
		 		}
		 		
		 	}
		 });
		 dwnloadbtn.setBackground(new java.awt.Color(51,51,51));
		 dwnloadbtn.setForeground(Color.WHITE);
		 dwnloadbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		 dwnloadbtn.setBounds(20, 294, 410, 28);
		 userPanel.add(dwnloadbtn);
		
		 
		 
		        
		
		 
			
		 notesBtn = new JButton("Open Notes");
		 notesBtn.setBounds(231, 55, 150, 28);
		 notesBtn.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String email = "";
				if(EmailValidate(mailTxt.getText())) {
					 email = mailTxt.getText();
//					 System.out.println("Email correct");
					 try {					
				 			Connection con1 = DatabaseConnection.getConnection();
				 			String courseValidate = " select Selected_Courses from studentRecord where Email_ID=?";
				 			PreparedStatement ps = con1.prepareStatement(courseValidate);
				 			
				 		
				 			
				 			ps.setString(1,email);
				 			
				 			ResultSet rs1 = ps.executeQuery();
				 			l1:
				 			if(rs1.next()) {
				 				String courses[] = rs1.getString("Selected_Courses").toLowerCase().split(", ");
				 				for(int i = 0; i < courses.length; i++) {
//				 					System.out.println(courses[i]);
				 					if(courses[i].equals(Coursename.getText().toLowerCase())) {
				 						Desktop.getDesktop().open(new java.io.File("Resources/MOOCS.pdf"));
				 						break l1;
				 					}
				 				}
				 				int response1 = JOptionPane.showConfirmDialog(null, "Oops! You are not enrolled in "+Coursename.getText()+" Course!! \nPlease Enorll First to get Notes Access :)","Enrolling this Course ?", JOptionPane.YES_NO_OPTION);
				 				if(response1 == JOptionPane.YES_OPTION) {
				 					goStudentRecord.show();
				 				}
				 				else {
				 					System.out.println("No");
				 				}
				 				
				 				
				 			}
				 			
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					 
					 
				}
				else {
//					System.out.println("Email incorrect");
					JOptionPane.showMessageDialog(null, name+" Invalid Email!! Please put Correct Email");
					
				}
				
		 		
		 	}
		 });
		 downloadPanel.setLayout(null);
		 notesBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		 notesBtn.setForeground(Color.WHITE);
		 notesBtn.setBackground(Color.BLACK);
		 downloadPanel.add(notesBtn);	
		 
		 imagePanel = new JPanel();
		 imagePanel.setBounds(10, 10, 200, 110);
		 imagePanel.setLayout(null);
		 downloadPanel.add(imagePanel);
		 
		 // enroll now button
		 goStudentRecord = new JButton("Enroll Now");
		 goStudentRecord.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		dispose();
		 		StudentRecord strcrd = new StudentRecord();
		 		strcrd.main(null);
		 	}
		 });
		 goStudentRecord.setBounds(231, 93, 152, 25);
		 goStudentRecord.setBackground(new java.awt.Color(51,51,51));
		 goStudentRecord.setForeground(Color.WHITE);
		 goStudentRecord.setFont(new Font("Tahoma", Font.BOLD, 15));
		 downloadPanel.add(goStudentRecord);
		 goStudentRecord.hide();
		 
		 
		 
		 
		 
		 // java image
		 ImageIcon imgjava = new ImageIcon(ClassLoader.getSystemResource("Resources/Java.png"));
			Image bimgjava = imgjava.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT);
			ImageIcon imagejava = new ImageIcon(bimgjava);
			jljava = new JLabel(imagejava);
			jljava.setBounds(50, 0, 90, 100);
			
		// python image
			ImageIcon imgpython = new ImageIcon(ClassLoader.getSystemResource("Resources/python.png"));
			Image bimgpython = imgpython.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT);
			ImageIcon imagepython = new ImageIcon(bimgpython);
			jlpython = new JLabel(imagepython);
			jlpython.setBounds(50, 10, 90, 100);
		
		// c++
			ImageIcon imgcpp = new ImageIcon(ClassLoader.getSystemResource("Resources/cpp.png"));
			Image bimgcpp = imgcpp.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT);
			ImageIcon imagecpp = new ImageIcon(bimgcpp);
			jlcpp = new JLabel(imagecpp);
			jlcpp.setBounds(50, 10, 90, 100);
			
		//sql
			ImageIcon imgsql = new ImageIcon(ClassLoader.getSystemResource("Resources/sql.png"));
			Image bimgsql = imgsql.getImage().getScaledInstance(145, 105, Image.SCALE_DEFAULT);
			ImageIcon imagesql = new ImageIcon(bimgsql);
			jlsql = new JLabel(imagesql);
			jlsql.setBounds(40, 3, 145, 105);
			
		//c
			ImageIcon imgc = new ImageIcon(ClassLoader.getSystemResource("Resources/c.png"));
			Image bimgc = imgc.getImage().getScaledInstance(130, 110, Image.SCALE_DEFAULT);
			ImageIcon imagec = new ImageIcon(bimgc);
			jlc = new JLabel(imagec);
			jlc.setBounds(40, 1, 130, 110);
			
		// HTML
			ImageIcon imghtml = new ImageIcon(ClassLoader.getSystemResource("Resources/html.png"));
			Image bimghtml = imghtml.getImage().getScaledInstance(130, 110, Image.SCALE_DEFAULT);
			ImageIcon imagehtml = new ImageIcon(bimghtml);
			jlhtml = new JLabel(imagehtml);
			jlhtml.setBounds(40, 1, 130, 110);
			
		//DSA
			ImageIcon imgdsa = new ImageIcon(ClassLoader.getSystemResource("Resources/dsa.jpg"));
			Image bimgdsa = imgdsa.getImage().getScaledInstance(130, 110, Image.SCALE_DEFAULT);
			ImageIcon imagedsa = new ImageIcon(bimgdsa);
			jldsa = new JLabel(imagedsa);
			jldsa.setBounds(40, 1, 130, 110);
			
		//DAA
			ImageIcon imgdaa = new ImageIcon(ClassLoader.getSystemResource("Resources/daa.png"));
			Image bimgdaa = imgdaa.getImage().getScaledInstance(130, 110, Image.SCALE_DEFAULT);
			ImageIcon imagedaa = new ImageIcon(bimgdaa);
			jldaa = new JLabel(imagedaa);
			jldaa.setBounds(40, 1, 130, 110);
			
		//Microprocessor
			ImageIcon imgmicro = new ImageIcon(ClassLoader.getSystemResource("Resources/micro.png"));
			Image bimgmicro = imgmicro.getImage().getScaledInstance(130, 105, Image.SCALE_DEFAULT);
			ImageIcon imagemicro = new ImageIcon(bimgmicro);
			jlmicro = new JLabel(imagemicro);
			jlmicro.setBounds(40, 0, 130, 105);
			
		//OS
			ImageIcon imgos = new ImageIcon(ClassLoader.getSystemResource("Resources/os.png"));
			Image bimgos = imgos.getImage().getScaledInstance(140, 110, Image.SCALE_DEFAULT);
			ImageIcon imageos = new ImageIcon(bimgos);
			jlos = new JLabel(imageos);
			jlos.setBounds(30, 1, 140, 110);
			
		//Networking
			ImageIcon imgnet = new ImageIcon(ClassLoader.getSystemResource("Resources/network.png"));
			Image bimgnet = imgnet.getImage().getScaledInstance(130, 115, Image.SCALE_DEFAULT);
			ImageIcon imagenet = new ImageIcon(bimgnet);
			jlnetworking = new JLabel(imagenet);
			jlnetworking.setBounds(30, 0, 130, 115);
		
		//Compiler Design
			ImageIcon imgcomp = new ImageIcon(ClassLoader.getSystemResource("Resources/compiler.jpg"));
			Image bimgcomp = imgcomp.getImage().getScaledInstance(140, 115, Image.SCALE_DEFAULT);
			ImageIcon imagecomp = new ImageIcon(bimgcomp);
			jlcomplier = new JLabel(imagecomp);
			jlcomplier.setBounds(30, 0, 140, 115);
			
		//Compiler Design
			ImageIcon imgdbms = new ImageIcon(ClassLoader.getSystemResource("Resources/dbms.png"));
			Image bimgdbms = imgdbms.getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT);
			ImageIcon imagedbms = new ImageIcon(bimgdbms);
			jldbms = new JLabel(imagedbms);
			jldbms.setBounds(30, 0, 110, 110);
			
		//Compiler Design
			ImageIcon imgcss = new ImageIcon(ClassLoader.getSystemResource("Resources/css.png"));
			Image bimgcss = imgcss.getImage().getScaledInstance(133, 115, Image.SCALE_DEFAULT);
			ImageIcon imagecss = new ImageIcon(bimgcss);
			jlcss = new JLabel(imagecss);
			jlcss.setBounds(30, 0, 133, 115);
			
		//ML
			ImageIcon imgml = new ImageIcon(ClassLoader.getSystemResource("Resources/ml.jpg"));
			Image bimgml = imgml.getImage().getScaledInstance(140, 115, Image.SCALE_DEFAULT);
			ImageIcon imageml = new ImageIcon(bimgml);
			jlml = new JLabel(imageml);
			jlml.setBounds(30, -5, 140, 115);
		
		//React
			ImageIcon imgreact = new ImageIcon(ClassLoader.getSystemResource("Resources/react.png"));
			Image bimgreact = imgreact.getImage().getScaledInstance(180, 100, Image.SCALE_DEFAULT);
			ImageIcon imagereact = new ImageIcon(bimgreact);
			jlreact = new JLabel(imagereact);
			jlreact.setBounds(10, 2, 180, 100);
			
		//Node
			ImageIcon imgnode = new ImageIcon(ClassLoader.getSystemResource("Resources/node.png"));
			Image bimgnode = imgnode.getImage().getScaledInstance(187, 85, Image.SCALE_DEFAULT);
			ImageIcon imagenode = new ImageIcon(bimgnode);
			jlnode = new JLabel(imagenode);
			jlnode.setBounds(10, 5, 187, 85);
			
		//Django
			ImageIcon imgdjango = new ImageIcon(ClassLoader.getSystemResource("Resources/django.png"));
			Image bimgdjango = imgdjango.getImage().getScaledInstance(187, 85, Image.SCALE_DEFAULT);
			ImageIcon imagedjango = new ImageIcon(bimgdjango);
			jldjango = new JLabel(imagedjango);
			jldjango.setBounds(5, 15, 187, 85);
			
			
			//12
			ImageIcon img12 = new ImageIcon(ClassLoader.getSystemResource("Resources/12.jpg"));
			Image bimg12 = img12.getImage().getScaledInstance(130, 105, Image.SCALE_DEFAULT);
			ImageIcon image12 = new ImageIcon(bimg12);
			jl12 = new JLabel(image12);
			jl12.setBounds(25, 2, 130, 105);
			
			//11
			ImageIcon img11 = new ImageIcon(ClassLoader.getSystemResource("Resources/11.jpg"));
			Image bimg11 = img11.getImage().getScaledInstance(130, 105, Image.SCALE_DEFAULT);
			ImageIcon image11 = new ImageIcon(bimg11);
			jl11 = new JLabel(image11);
			jl11.setBounds(25, 2, 130, 105);
			
			
			//javascript
			ImageIcon imgjs = new ImageIcon(ClassLoader.getSystemResource("Resources/js.png"));
			Image bimgjs = imgjs.getImage().getScaledInstance(187, 85, Image.SCALE_DEFAULT);
			ImageIcon imagejs = new ImageIcon(bimgjs);
			jljs = new JLabel(imagejs);
			jljs.setBounds(5, 15, 187, 85);
			
			
			//mongodb
			ImageIcon imgmongo = new ImageIcon(ClassLoader.getSystemResource("Resources/mongo.png"));
			Image bimgmongo = imgmongo.getImage().getScaledInstance(187, 85, Image.SCALE_DEFAULT);
			ImageIcon imagemongo = new ImageIcon(bimgmongo);
			jlmongo = new JLabel(imagemongo);
			jlmongo.setBounds(5, 10, 187, 85);
			
			//advance java
			ImageIcon imgadvjava = new ImageIcon(ClassLoader.getSystemResource("Resources/advance_java.jpg"));
			Image bimgadvjava = imgadvjava.getImage().getScaledInstance(187, 106, Image.SCALE_DEFAULT);
			ImageIcon imageadvjava = new ImageIcon(bimgadvjava);
			jladvjava = new JLabel(imageadvjava);
			jladvjava.setBounds(5, 2, 187, 106);
			
			
			//ai
			ImageIcon imgai = new ImageIcon(ClassLoader.getSystemResource("Resources/ai1.png"));
			Image bimgai = imgai.getImage().getScaledInstance(187, 106, Image.SCALE_DEFAULT);
			ImageIcon imageai = new ImageIcon(bimgai);
			jlai = new JLabel(imageai);
			jlai.setBounds(5, 2, 187, 106);
			
			
			
			//php
			ImageIcon imgphp = new ImageIcon(ClassLoader.getSystemResource("Resources/php.png"));
			Image bimgphp = imgphp.getImage().getScaledInstance(187, 85, Image.SCALE_DEFAULT);
			ImageIcon imagephp = new ImageIcon(bimgphp);
			jlphp = new JLabel(imagephp);
			jlphp.setBounds(5, 15, 187, 85);
			
			
			//architecture
			ImageIcon imgarchi = new ImageIcon(ClassLoader.getSystemResource("Resources/archi.png"));
			Image bimgarchi = imgarchi.getImage().getScaledInstance(187, 85, Image.SCALE_DEFAULT);
			ImageIcon imagearchi = new ImageIcon(bimgarchi);
			jlcsarchi = new JLabel(imagearchi);
			jlcsarchi.setBounds(5, 15, 187, 85);
			
			imagePanel.hide();
		 
			// frstnm txtfld
//	    CnameTxt=new JTextField();
//        CnameTxt.setBounds(105,49,350,30);
//        CnameTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
//        CnameTxt.setForeground(new java.awt.Color(104, 108, 110));
//        userPanel.add(CnameTxt); 
		
		
		
		
		
		
		// add to contentPane
				contentPane.add(notesPanel);
				contentPane.add(CoursesPanel);
				
				java_1 = new JButton("C");
				java_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(java_1.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jlc);
					}
				});
				java_1.setForeground(Color.WHITE);
				java_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				java_1.setBackground(new Color(51, 51, 51));
				java_1.setBounds(20, 103, 80, 30);
				CoursesPanel.add(java_1);
				
				python_1 = new JButton("HTML");
				python_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(python_1.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jlhtml);
					}
				});
				python_1.setForeground(Color.WHITE);
				python_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				python_1.setBackground(new Color(51, 51, 51));
				python_1.setBounds(127, 103, 93, 30);
				CoursesPanel.add(python_1);
				
				cpp_1 = new JButton("DSA");
				cpp_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(cpp_1.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jldsa);
					}
				});
				cpp_1.setForeground(Color.WHITE);
				cpp_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				cpp_1.setBackground(new Color(51, 51, 51));
				cpp_1.setBounds(251, 103, 90, 30);
				CoursesPanel.add(cpp_1);
				
				sql_1 = new JButton("DAA");
				sql_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(sql_1.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jldaa);
					}
				});
				sql_1.setForeground(Color.WHITE);
				sql_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				sql_1.setBackground(new Color(51, 51, 51));
				sql_1.setBounds(367, 103, 102, 30);
				CoursesPanel.add(sql_1);
				
				Microprocessor = new JButton("Microprocessor");
				Microprocessor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(Microprocessor.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jlmicro);
					}
				});
				Microprocessor.setBounds(20, 154, 202, 30);
				Microprocessor.setForeground(Color.WHITE);
				Microprocessor.setFont(new Font("Tahoma", Font.BOLD, 15));
				Microprocessor.setBackground(new Color(51, 51, 51));
				CoursesPanel.add(Microprocessor);
				
				os= new JButton("Operating System");
				os.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(os.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jlos);
					}
				});
				os.setForeground(Color.WHITE);
				os.setFont(new Font("Tahoma", Font.BOLD, 15));
				os.setBackground(new Color(51, 51, 51));
				os.setBounds(251, 154, 218, 30);
				CoursesPanel.add(os);
				
				Microprocessor_1 = new JButton("Networking");
				Microprocessor_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(Microprocessor_1.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jlnetworking);
						
					}
					
				});
				Microprocessor_1.setForeground(Color.WHITE);
				Microprocessor_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				Microprocessor_1.setBackground(new Color(51, 51, 51));
				Microprocessor_1.setBounds(20, 205, 202, 30);
				CoursesPanel.add(Microprocessor_1);
				
				os_1 = new JButton("Compiler Design");
				os_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(os_1.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jlcomplier);
					}
				});
				os_1.setForeground(Color.WHITE);
				os_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				os_1.setBackground(new Color(51, 51, 51));
				os_1.setBounds(251, 205, 218, 30);
				CoursesPanel.add(os_1);
				
				java_2 = new JButton("DBMS");
				java_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(java_2.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jldbms);
					}
				});
				java_2.setForeground(Color.WHITE);
				java_2.setFont(new Font("Tahoma", Font.BOLD, 15));
				java_2.setBackground(new Color(51, 51, 51));
				java_2.setBounds(20, 254, 80, 30);
				CoursesPanel.add(java_2);
				
				python_2 = new JButton("CSS");
				python_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(python_2.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jlcss);
					}
				});
				python_2.setForeground(Color.WHITE);
				python_2.setFont(new Font("Tahoma", Font.BOLD, 15));
				python_2.setBackground(new Color(51, 51, 51));
				python_2.setBounds(127, 254, 93, 30);
				CoursesPanel.add(python_2);
				
				cpp_2 = new JButton("ML");
				cpp_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(cpp_2.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jlml);
					}
				});
				cpp_2.setForeground(Color.WHITE);
				cpp_2.setFont(new Font("Tahoma", Font.BOLD, 15));
				cpp_2.setBackground(new Color(51, 51, 51));
				cpp_2.setBounds(251, 254, 90, 30);
				CoursesPanel.add(cpp_2);
				
				sql_2 = new JButton("React");
				sql_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(sql_2.getLabel()+" JS");
						imagePanel.removeAll();
						imagePanel.add(jlreact);
					}
				});
				sql_2.setForeground(Color.WHITE);
				sql_2.setFont(new Font("Tahoma", Font.BOLD, 15));
				sql_2.setBackground(new Color(51, 51, 51));
				sql_2.setBounds(367, 254, 102, 30);
				CoursesPanel.add(sql_2);
				
				java_3 = new JButton("Node");
				java_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(java_3.getLabel()+" JS");
						imagePanel.removeAll();
						imagePanel.add(jlnode);
					}
				});
				java_3.setForeground(Color.WHITE);
				java_3.setFont(new Font("Tahoma", Font.BOLD, 15));
				java_3.setBackground(new Color(51, 51, 51));
				java_3.setBounds(20, 303, 80, 30);
				CoursesPanel.add(java_3);
				
				python_3 = new JButton("Django");
				python_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(python_3.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jldjango);
					}
				});
				python_3.setForeground(Color.WHITE);
				python_3.setFont(new Font("Tahoma", Font.BOLD, 15));
				python_3.setBackground(new Color(51, 51, 51));
				python_3.setBounds(127, 303, 93, 30);
				CoursesPanel.add(python_3);
				
				cpp_3 = new JButton("12");
				cpp_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(cpp_3.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jl12);
					}
				});
				cpp_3.setForeground(Color.WHITE);
				cpp_3.setFont(new Font("Tahoma", Font.BOLD, 15));
				cpp_3.setBackground(new Color(51, 51, 51));
				cpp_3.setBounds(251, 303, 90, 30);
				CoursesPanel.add(cpp_3);
				
				sql_3 = new JButton("11");
				sql_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(sql_3.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jl11);
					}
				});
				sql_3.setForeground(Color.WHITE);
				sql_3.setFont(new Font("Tahoma", Font.BOLD, 15));
				sql_3.setBackground(new Color(51, 51, 51));
				sql_3.setBounds(367, 303, 102, 30);
				CoursesPanel.add(sql_3);
				
				Microprocessor_2 = new JButton("JavaScript");
				Microprocessor_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(Microprocessor_2.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jljs);
					}
				});
				Microprocessor_2.setForeground(Color.WHITE);
				Microprocessor_2.setFont(new Font("Tahoma", Font.BOLD, 15));
				Microprocessor_2.setBackground(new Color(51, 51, 51));
				Microprocessor_2.setBounds(20, 351, 202, 30);
				CoursesPanel.add(Microprocessor_2);
				
				os_2 = new JButton("MongoDB");
				os_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(os_2.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jlmongo);
					}
				});
				os_2.setForeground(Color.WHITE);
				os_2.setFont(new Font("Tahoma", Font.BOLD, 15));
				os_2.setBackground(new Color(51, 51, 51));
				os_2.setBounds(251, 351, 218, 30);
				CoursesPanel.add(os_2);
				
				Microprocessor_3 = new JButton("Advanced Java");
				Microprocessor_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(Microprocessor_3.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jladvjava);
					}
				});
				Microprocessor_3.setForeground(Color.WHITE);
				Microprocessor_3.setFont(new Font("Tahoma", Font.BOLD, 14));
				Microprocessor_3.setBackground(new Color(51, 51, 51));
				Microprocessor_3.setBounds(20, 397, 202, 30);
				CoursesPanel.add(Microprocessor_3);
				
				os_3 = new JButton("Artificial Intelligence");
				os_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(os_3.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jlai);
					}
				});
				os_3.setForeground(Color.WHITE);
				os_3.setFont(new Font("Tahoma", Font.BOLD, 15));
				os_3.setBackground(new Color(51, 51, 51));
				os_3.setBounds(251, 397, 218, 30);
				CoursesPanel.add(os_3);
				
				Microprocessor_4 = new JButton("PHP");
				Microprocessor_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(Microprocessor_4.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jlphp);
					}
				});
				Microprocessor_4.setForeground(Color.WHITE);
				Microprocessor_4.setFont(new Font("Tahoma", Font.BOLD, 15));
				Microprocessor_4.setBackground(new Color(51, 51, 51));
				Microprocessor_4.setBounds(20, 440, 202, 30);
				CoursesPanel.add(Microprocessor_4);
				
				os_4 = new JButton("Computer Architecture");
				os_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameTxt.setText("");
			 			mailTxt.setText("");
			 			UsernameTxt.setText("");
			 			CpswrdTxt.setText("");
			 			downloadPanel.hide();
				 		imagePanel.hide();
						Coursename.setText(os_4.getLabel());
						imagePanel.removeAll();
						imagePanel.add(jlcsarchi);
					}
				});
				os_4.setForeground(Color.WHITE);
				os_4.setFont(new Font("Tahoma", Font.BOLD, 15));
				os_4.setBackground(new Color(51, 51, 51));
				os_4.setBounds(251, 440, 218, 30);
				CoursesPanel.add(os_4);
		
				
				  panel = new JPanel();
				    panel.setBorder(null);
				    panel.setBounds(987, 10, 69, 550);
				    panel.setBackground(new java.awt.Color(255,255,255));
				    contentPane.add(panel);
				    
				    
				    // Nav Home
				 	  ImageIcon imglogin = new ImageIcon(ClassLoader.getSystemResource("Homenav.png"));
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
				 	  ImageIcon imgreg = new ImageIcon(ClassLoader.getSystemResource("newstudent.png"));
				      Image bimgreg = imgreg.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT);
				      ImageIcon imagereg = new ImageIcon(bimgreg);
				      
				      jlreg = new JLabel(imagereg);
				      jlreg.addMouseListener(new MouseAdapter() {
					      	@Override
					      	public void mouseClicked(MouseEvent e) {
					      		dispose();
					      		StudentRecord tr = new StudentRecord();
					      		tr.main(null);
					      	}
					      });
				      jlreg.setBounds(34, 7, 50, 50);
				      
				      // Nav teacher nav
				 	  ImageIcon imgforget = new ImageIcon(ClassLoader.getSystemResource("TrackPayment.png"));
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
				 	  ImageIcon imglogout = new ImageIcon(ClassLoader.getSystemResource("notes1.png"));
				      Image bimglogout = imglogout.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT);
				      ImageIcon imagelogout = new ImageIcon(bimglogout);
				      
				      jllogout = new JLabel(imagelogout);
				      jllogout.setBounds(49, 7, 0, 0);
				      
				      
				      // Nav notrs
				 	  ImageIcon imgpayment = new ImageIcon(ClassLoader.getSystemResource("Check.png"));
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
				      jlpayment.setBounds(49, 7, 0, 0);
				      
				      ImageIcon imgcurri = new ImageIcon(ClassLoader.getSystemResource("curriculum.png"));
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
				      
				      // Nav notrs
				 	  ImageIcon imgpayment1 = new ImageIcon(ClassLoader.getSystemResource("track.png"));
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
				 	  ImageIcon imgabout = new ImageIcon(ClassLoader.getSystemResource("about.png"));
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
				 	  ImageIcon imglog = new ImageIcon(ClassLoader.getSystemResource("logout1.png"));
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
				      
				      
				      panel.add(jllogin);
				      panel.add(jlreg);
				      panel.add(jlforget);
				      panel.add(jllogout);
				      panel.add(jlcurri);
				      panel.add(jlpayment);
				      panel.add(jlpayment1);
				      panel.add(jlabout);
				      panel.add(jllog);
	}
}
