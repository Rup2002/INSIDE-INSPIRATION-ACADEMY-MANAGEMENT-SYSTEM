package FrontEnd;

import java.awt.*;
import java.awt.image.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Curriculum extends JFrame{
	
	private JPanel contentPane,studentPanel;
	private Font fn1,fn2,fn3,fn5,fn7,fn8;
	private JLabel l1,studentDetails, jllog,jlabout,jlpayment1,jlpayment,jllogout,jlforget,jlreg,jllogin,jlcurri, jloops;
	private JCheckBox c6;
	private JComboBox semester;
	private JComboBox subject, select_type;
	private JPanel panel;
	private JComboBox select_Stream, select_course;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblChooseStream;
	private JLabel lblNewLabel_3;
	private JLabel lblChooseSemester;
	private JLabel lblNewLabel_2;
	private JLabel lblChooseCourse;
	private JLabel lblNewLabel_4;
	private JPanel ImagePanel;
	private JPanel panel_3;
	private JLabel lblNewLabel_5;
	private JLabel course_Name;
	private JPanel panel_2;
	private JButton btnNewButton;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Curriculum frame = new Curriculum();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	public Curriculum() {
		
		// close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// frame size
		setBounds(100, 100, 1000, 670);
		setResizable(false);
		getContentPane().setLayout(null);      
		setLocationRelativeTo(null);
		setTitle("Curriculum");
		
		// create contentpanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new java.awt.Color(187, 235, 250));
		contentPane.setLayout(null);
		
		
		// student panel
				studentPanel = new JPanel();
				studentPanel.setBounds(76, 11, 900, 60);
				studentPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
//				studentPanel.setBackground(new java.awt.Color(250, 245, 247));
				studentPanel.setBackground(new java.awt.Color(13, 37, 219));
				studentPanel.setLayout(null);
		
				
				
		contentPane.add(studentPanel);
		
		// add jlabel to the student panel
		studentDetails= new JLabel("--- Inside Inspiration Academy > Curriculum ---");
		studentDetails.setBounds(0, 0, 896, 60);
		studentPanel.add(studentDetails);
		studentDetails.setHorizontalAlignment(SwingConstants.CENTER);
		studentDetails.setFont(new Font("Tahoma", Font.BOLD, 33));
//		studentDetails.setForeground(new java.awt.Color(26, 117, 255));
		studentDetails.setForeground(new java.awt.Color(250, 250, 250));
		
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(null);
		panel.setBounds(0, 10, 66, 613);
		contentPane.add(panel);
		
		 // Nav Home
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
		      		StudentRecord tr = new StudentRecord();
		      		tr.main(null);
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
	 	  ImageIcon imgcurri = new ImageIcon(ClassLoader.getSystemResource("Resources/curriculum.png"));
	      Image bimgcurri = imgcurri.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT);
	      ImageIcon imagecurri = new ImageIcon(bimgcurri);
	      
	      jlcurri = new JLabel(imagecurri);
	      jlcurri.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
//	      		dispose();
//	      		PayNow1 notes = new PayNow1();
//	      		notes.main(null);
	      	}
	      });
	      jlcurri.setBounds(49, 7, 0, 0);
	      
	      
	      
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
	      jlpayment.setBounds(49, 7, 0, 0);
	      
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
	      
	      
	      panel.add(jllogin);
	      panel.add(jlreg);
	      panel.add(jlforget);
	      panel.add(jllogout);
	      panel.add(jlcurri);
	      panel.add(jlpayment);
	      panel.add(jlpayment1);
	      panel.add(jlabout);
	      panel.add(jllog);
		
		String semof8[] = {"Select Semester", "1", "2", "3", "4", "5", "6", "7", "8"};
		String semof6[] = {"Select Semester", "1", "2", "3", "4", "5", "6"};
		String semof4[] = {"Select Semester", "1", "2", "3", "4"};
		
		panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLUE));
		panel_1.setBackground(new java.awt.Color(247, 250, 255));
		panel_1.setBounds(76, 81, 334, 542);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
	// type choose
		
		
		
		
		
		
		select_type = new JComboBox();
		select_type.setForeground(Color.BLUE);
		select_type.setBackground(new Color(247, 237, 245));
		select_type.setBounds(10, 58, 298, 34);
		panel_1.add(select_type);
		select_type.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(select_type.getSelectedItem().equals("College Courses")) {
					select_Stream.removeAllItems();
					lblChooseStream.setText("Choose Stream *");
//					select_Stream.setSelectedItem(null);
					select_Stream.addItem("Select Stream for College Course");
					select_Stream.addItem("B.Sc Computer Science Honours(CU)");
					select_Stream.addItem("B.Sc Computer Science Pass(CU)");
					select_Stream.addItem("Bachelor of Technology(CSE,IT,ECE)");
					select_Stream.addItem("Bachelor of Computer Application(BCA)");
					select_Stream.addItem("Master of Computer Application(MCA)");
					select_Stream.addItem("Diploma in Computer Science");
					
				}
				else
					if(select_type.getSelectedItem().equals("Programming Courses")) {
						select_Stream.removeAllItems();
						semester.removeAllItems();
						select_course.removeAllItems();
						lblChooseStream.setText("Choose Course *");
						select_Stream.addItem("Select Stream for Programming Course");
						select_Stream.addItem("C Programming");
						select_Stream.addItem("C++ Programming");
						select_Stream.addItem("Java Complete Course");
						select_Stream.addItem("Python Complete Course");
						select_Stream.addItem("Web Development");
					}
					else
						if(select_type.getSelectedItem().equals("School Courses")) {
							select_Stream.removeAllItems();
							lblChooseStream.setText("Choose Course *");
							semester.removeAllItems();
							select_course.removeAllItems();
							select_Stream.addItem("Select Stream for School Course");
							select_Stream.addItem("Class 12 Computer Science");
							select_Stream.addItem("Class 11 Computer Science");
							select_Stream.addItem("Class 12 Computer Application");
							select_Stream.addItem("Class 11 Computer Application");
							select_Stream.addItem("Basic School Oriented Courses");
						}
						else {
							JOptionPane.showMessageDialog(null, "Please Choose Correct Type of Courses!!");
						}
			}
		});
		select_type.setModel(new DefaultComboBoxModel(new String[] {"Select Type of Courses","College Courses", "Programming Courses", "School Courses"}));
		select_type.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		
		lblNewLabel = new JLabel("Course Type *");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setForeground(new java.awt.Color(26, 117, 255));
		lblNewLabel.setBounds(10, 10, 314, 29);
		panel_1.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("________________________\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new java.awt.Color(26, 117, 255));    
		lblNewLabel_1.setBounds(10, 22, 324, 29);
		panel_1.add(lblNewLabel_1);
		
		lblChooseStream = new JLabel("Choose Stream *");
		lblChooseStream.setForeground(new Color(26, 117, 255));
		lblChooseStream.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblChooseStream.setBounds(10, 102, 314, 29);
		panel_1.add(lblChooseStream);
		
		lblNewLabel_3 = new JLabel("________________________\r\n");
		lblNewLabel_3.setForeground(new Color(26, 117, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 114, 324, 29);
		panel_1.add(lblNewLabel_3);
		
		
		select_Stream = new JComboBox();
		select_Stream.setBounds(10, 153, 298, 34);
		select_Stream.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		select_Stream.setForeground(Color.BLUE);
		select_Stream.setBackground(new Color(247, 237, 245));
		select_Stream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				course_Name.setText(select_Stream.getSelectedItem().toString());
				if(select_Stream.getSelectedItem().equals("B.Sc Computer Science Honours(CU)")) {
					semester.removeAllItems();
					for(String sem : semof6) {
						semester.addItem(sem);
					}
				}
				else
					if(select_Stream.getSelectedItem().equals("B.Sc Computer Science Pass(CU)")) {
						semester.removeAllItems();
						for(String sem : semof6) {
							semester.addItem(sem);
						}
					}
				else
					if(select_Stream.getSelectedItem().equals("Bachelor of Technology(CSE,IT,ECE)")) {
						semester.removeAllItems();
						for(String sem : semof8) {
							semester.addItem(sem);
						}
					}
				else
					if(select_Stream.getSelectedItem().equals("Bachelor of Computer Application(BCA)")) {
						semester.removeAllItems();
						for(String sem : semof6) {
							semester.addItem(sem);
						}
					}
				else
					if(select_Stream.getSelectedItem().equals("Master of Computer Application(MCA)")) {
						semester.removeAllItems();
						for(String sem : semof4) {
							semester.addItem(sem);
						}
					}
				else 
					if(select_Stream.getSelectedItem().equals("Diploma in Computer Science")) {
						semester.removeAllItems();
						for(String sem : semof6) {
							semester.addItem(sem);
						}
					}
			}
		});
		
		panel_1.add(select_Stream);
		
		lblChooseSemester = new JLabel("Choose Semester");
		lblChooseSemester.setForeground(new Color(26, 117, 255));
		lblChooseSemester.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblChooseSemester.setBounds(10, 197, 314, 29);
		panel_1.add(lblChooseSemester);
		
		lblNewLabel_2 = new JLabel("________________________\r\n");
		lblNewLabel_2.setForeground(new Color(26, 117, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 209, 324, 29);
		panel_1.add(lblNewLabel_2);
		
		
		
		
		
		
		semester = new JComboBox();
		semester.setBounds(10, 246, 298, 34);
		semester.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		semester.setForeground(Color.BLUE);
		semester.setBackground(new Color(247, 237, 245));
		panel_1.add(semester);
		
		lblChooseCourse = new JLabel("Choose Course *");
		lblChooseCourse.setForeground(new Color(26, 117, 255));
		lblChooseCourse.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblChooseCourse.setBounds(10, 290, 314, 29);
		panel_1.add(lblChooseCourse);
		
		lblNewLabel_4 = new JLabel("________________________\r\n");
		lblNewLabel_4.setForeground(new Color(26, 117, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(10, 302, 324, 29);
		panel_1.add(lblNewLabel_4);
		
	
		
		
		select_course = new JComboBox();	
		select_course.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		select_course.setBounds(10, 341, 298, 34);
		select_course.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		select_course.setForeground(Color.BLUE);
		select_course.setBackground(new Color(247, 237, 245));
		panel_1.add(select_course);
		select_course.setMaximumRowCount(15);
		
		ImagePanel = new JPanel();
		ImagePanel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		ImagePanel.setBounds(420, 132, 556, 491);
		contentPane.add(ImagePanel);
		ImagePanel.setLayout(null);
		

		//OOPS
		ImageIcon imgoops = new ImageIcon(ClassLoader.getSystemResource("Resources/Logos_light2.png"));
		Image bimgoops = imgoops.getImage().getScaledInstance(555, 490, Image.SCALE_DEFAULT);
		ImageIcon imageoops = new ImageIcon(bimgoops);
		jloops = new JLabel(imageoops);
		jloops.setBounds(2, 2, 555, 488);
		ImagePanel.add(jloops);
		panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(154, 240, 245, 68);
		
		panel_2.setLayout(null);
		
		btnNewButton = new JButton("View Curriculum");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(new java.awt.Color(255, 227, 3));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(course_Name.getText() != "" && course_Name.getText() != "Select Stream for College Course" && course_Name.getText() != "Select Stream for School Course" &&  course_Name.getText() != "Select Stream for Programming Course") {
						if(course_Name.getText() == "B.Sc Computer Science Honours(CU)" || course_Name.getText() == "B.Sc Computer Science Pass(CU)" )
							Desktop.getDesktop().open(new java.io.File("Resources/UG-CompSc.pdf"));
						if(course_Name.getText() == "Bachelor of Technology(CSE,IT,ECE)")
							Desktop.getDesktop().open(new java.io.File("Resources/Btech.pdf"));
						if(course_Name.getText() == "Bachelor of Computer Application(BCA)")
							Desktop.getDesktop().open(new java.io.File("Resources/BCA.pdf"));
						if(course_Name.getText() == "Master of Computer Application(MCA)")
							Desktop.getDesktop().open(new java.io.File("Resources/MCA.pdf"));
						if(course_Name.getText() == "Diploma in Computer Science")
							Desktop.getDesktop().open(new java.io.File("Resources/Diploma.pdf"));
						if(course_Name.getText() == "Class 12 Computer Science" || course_Name.getText() == "Class 11 Computer Science")
							Desktop.getDesktop().open(new java.io.File("Resources/11_12.pdf"));
						if(course_Name.getText() == "Basic School Oriented Courses")
							Desktop.getDesktop().open(new java.io.File("Resources/basic_cs.pdf"));
						if(course_Name.getText() == "Class 11 Computer Application" || course_Name.getText() == "Class 12 Computer Application")
							Desktop.getDesktop().open(new java.io.File("Resources/11_12_CA.pdf"));
						if(course_Name.getText() == "C Programming" || course_Name.getText() == "C++ Programming")
							Desktop.getDesktop().open(new java.io.File("Resources/C_C++.pdf"));
						if(course_Name.getText() == "Java Complete Course")
							Desktop.getDesktop().open(new java.io.File("Resources/java.pdf"));
						if(course_Name.getText() == "Web Development")
							Desktop.getDesktop().open(new java.io.File("Resources/WebDev.pdf"));
						if(course_Name.getText() == "Python Complete Course")
							Desktop.getDesktop().open(new java.io.File("Resources/Python.pdf"));
					}
	
					else {
						JOptionPane.showMessageDialog(null, "Please Choose your Stream First!!");
					}
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(15, 10, 214, 48);
		panel_2.add(btnNewButton);
		
		jloops.add(panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.PINK));
		panel_3.setBackground(new java.awt.Color(252, 227, 30));
		panel_3.setBounds(420, 81, 556, 41);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		
		
		
		lblNewLabel_5 = new JLabel("Course Details :");
		lblNewLabel_5.setBackground(Color.MAGENTA);
		lblNewLabel_5.setForeground(Color.DARK_GRAY);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5.setBounds(10, 10, 155, 21);
		panel_3.add(lblNewLabel_5);
		
		course_Name = new JLabel("");
		course_Name.setFont(new Font("Tahoma", Font.BOLD, 18));
		course_Name.setForeground(Color.RED);
		course_Name.setBounds(166, 10, 380, 27);
		panel_3.add(course_Name);
		
		semester.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(semester.getSelectedItem().equals("1") && select_Stream.getSelectedItem().equals("B.Sc Computer Science Honours(CU)")) {
					select_course.removeAllItems();
//					select_Stream.setSelectedItem(null);
					select_course.addItem("Courses for Sem I -> B.Sc CS(Honours)");
					select_course.addItem("Digital Circuits");
					select_course.addItem("Digital Circuits Lab");
					select_course.addItem("Programming Fundamentals using C");
					select_course.addItem("Programming in C Lab");
				}
				else
					if(semester.getSelectedItem().equals("2") && select_Stream.getSelectedItem().equals("B.Sc Computer Science Honours(CU)")) {
						select_course.removeAllItems();
//						select_Stream.setSelectedItem(null);
						select_course.addItem("Courses for Sem II -> B.Sc CS(Honours)");
						select_course.addItem("Computer Organization and Architecture");
						select_course.addItem("Computer Organization Lab");
					}
				else
					if(semester.getSelectedItem().equals("3") && select_Stream.getSelectedItem().equals("B.Sc Computer Science Honours(CU)")) {
						select_course.removeAllItems();
//							select_Stream.setSelectedItem(null);
						select_course.addItem("Courses for Sem III -> B.Sc CS(Honours)");
						select_course.addItem("Data Structure Using C");
						select_course.addItem("Data Structure using C Lab");
						select_course.addItem("Computational Mathematics");
						select_course.addItem("Computational Mathematics Lab");
						select_course.addItem("Microprocessor and its Applications");
						select_course.addItem("Programming Microprocessor 8085");
						select_course.addItem("Computer Graphics");
						select_course.addItem("Sensor Network and IoT");
					}
				else
					if(semester.getSelectedItem().equals("4") && select_Stream.getSelectedItem().equals("B.Sc Computer Science Honours(CU)")) {
						select_course.removeAllItems();
//								select_Stream.setSelectedItem(null);
						select_course.addItem("Courses for Sem IV -> B.Sc CS(Honours)");
						select_course.addItem("Data Communication, Networking and Internet Technology");
						select_course.addItem("Computer Networking and Web Design");
						select_course.addItem("Introduction to Algorithms & its Applications");
						select_course.addItem("Algorithms Lab.");
						select_course.addItem("Operating Systems");
						select_course.addItem("Operating Systems Lab (Shell Programming)");
						select_course.addItem("Information Security");
						select_course.addItem("E-Commerce");
					}
				else
					if(semester.getSelectedItem().equals("5") && select_Stream.getSelectedItem().equals("B.Sc Computer Science Honours(CU)")) {
						select_course.removeAllItems();
//									select_Stream.setSelectedItem(null);
						select_course.addItem("Courses for Sem V -> B.Sc CS(Honours)");
						select_course.addItem("Data Base Management System (DBMS)");
						select_course.addItem("RDBMS Lab using My SQL & PHP");
						select_course.addItem("Object Oriented Programming System (OOPs)");
						select_course.addItem("OOPs Lab using Java");
						select_course.addItem("Digital Image Processing");
						select_course.addItem("Image Processing Lab");
						select_course.addItem("Operation Research (O.R.)");
						select_course.addItem("Operation Research (O.R.) Lab. using C/ Python");
						
						
					}
				else
					if(semester.getSelectedItem().equals("6") && select_Stream.getSelectedItem().equals("B.Sc Computer Science Honours(CU)")) {
						select_course.removeAllItems();
//										select_Stream.setSelectedItem(null);
						select_course.addItem("Courses for Sem VI -> B.Sc CS(Honours)");
						select_course.addItem("Software Engineering");
						select_course.addItem("Software Engineering Lab");
						select_course.addItem("Theory of Computation");
						select_course.addItem("Embedded Systems");
						select_course.addItem("Embedded Systems Lab");
						select_course.addItem("Multimedia and its Applications");
						select_course.addItem("Multimedia and its Applications Lab");
						select_course.addItem("Introduction to Computational Intelligence ");
						select_course.addItem("Computational Intelligence Laboratory");
					}
						
						// CS Pass
						
						if(semester.getSelectedItem().equals("1") && select_Stream.getSelectedItem().equals("B.Sc Computer Science Pass(CU)")) {
							select_course.removeAllItems();
//							select_Stream.setSelectedItem(null);
							select_course.addItem("Courses for Sem I -> B.Sc CS(Pass)");
							select_course.addItem("Computer Fundamentals and Digital Logic Design");
							select_course.addItem("Word Processing, Spreadsheet, Presentation and Web design by HTML/ PHP");
						}
						else
							if(semester.getSelectedItem().equals("2") && select_Stream.getSelectedItem().equals("B.Sc Computer Science Pass(CU)")) {
								select_course.removeAllItems();
//								select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem II -> B.Sc CS(Pass)");
								select_course.addItem("Algorithms and Data Structure");
								select_course.addItem("Programming with C");
							}
						else
							if(semester.getSelectedItem().equals("3") && select_Stream.getSelectedItem().equals("B.Sc Computer Science Pass(CU)")) {
								select_course.removeAllItems();
//									select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem III -> B.Sc CS(Pass)");
								select_course.addItem("Computer Organization");
								select_course.addItem("Communication, Computer Network and Internet");
								select_course.addItem("Multimedia and its Applications");
							}
						else
							if(semester.getSelectedItem().equals("4") && select_Stream.getSelectedItem().equals("B.Sc Computer Science Pass(CU)")) {
								select_course.removeAllItems();
//										select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem IV -> B.Sc CS(Pass)");
								select_course.addItem("Operating System");
								select_course.addItem("Shell Programming (Unix/ Linux)");
							}
						else
							if(semester.getSelectedItem().equals("5") && select_Stream.getSelectedItem().equals("B.Sc Computer Science Pass(CU)")) {
								select_course.removeAllItems();
//											select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem V -> B.Sc CS(Pass)");
								select_course.addItem("Software Engineering");
								select_course.addItem("Information Security");
								select_course.addItem("Data base Management System (DBMS)");
								select_course.addItem("Database Design and Applications");
								select_course.addItem("Object Oriented Programming ");
								select_course.addItem("Object Oriented Programming by C++/ Java");
								select_course.addItem("Sensor Network and IoT");
								select_course.addItem("Sensor Network and IoT Lab");
								
								
							}
						else
							if(semester.getSelectedItem().equals("6") && select_Stream.getSelectedItem().equals("B.Sc Computer Science Pass(CU)")) {
								select_course.removeAllItems();
//												select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem VI -> B.Sc CS(Pass)");
								select_course.addItem("Embedded Systems");
								select_course.addItem("Embedded Systems Lab");
								select_course.addItem("Operation Research");
								select_course.addItem("Operation Research Lab");
								select_course.addItem("Computational Mathematics");
								select_course.addItem("Computational Mathematics Lab");
							}
						
						// CS Btech
						
						if(semester.getSelectedItem().equals("1") && select_Stream.getSelectedItem().equals("Bachelor of Technology(CSE,IT,ECE)")) {
							select_course.removeAllItems();
//							select_Stream.setSelectedItem(null);
							select_course.addItem("Courses for Sem I -> B.Tech(CSE,IT,ECE)");
							select_course.addItem("No Courses!!");
//							select_course.addItem("Computer Fundamentals and Digital Logic Design");
//							select_course.addItem("Word Processing, Spreadsheet, Presentation and Web design by HTML/ PHP");
						}
						else
							if(semester.getSelectedItem().equals("2") && select_Stream.getSelectedItem().equals("Bachelor of Technology(CSE,IT,ECE)")) {
								select_course.removeAllItems();
//								select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem II -> B.Tech(CSE,IT,ECE)");
								select_course.addItem("No Courses!!");
//								select_course.addItem("Algorithms and Data Structure");
//								select_course.addItem("Programming with C");
							}
						else
							if(semester.getSelectedItem().equals("3") && select_Stream.getSelectedItem().equals("Bachelor of Technology(CSE,IT,ECE)")) {
								select_course.removeAllItems();
//									select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem III -> B.Tech(CSE,IT,ECE)");
								select_course.addItem("Computer Organization");
								select_course.addItem("Data stucture & Algorithms");
					
							}
						else
							if(semester.getSelectedItem().equals("4") && select_Stream.getSelectedItem().equals("Bachelor of Technology(CSE,IT,ECE)")) {
								select_course.removeAllItems();
//										select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem IV ->B.Tech(CSE,IT,ECE)");
								select_course.addItem("Computer Architecture");
								select_course.addItem("Design & Analysis of Algorithms");
							}
						else
							if(semester.getSelectedItem().equals("5") && select_Stream.getSelectedItem().equals("Bachelor of Technology(CSE,IT,ECE)")) {
								select_course.removeAllItems();
//											select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem V ->B.Tech(CSE,IT,ECE)");
								select_course.addItem("Software Engineering");
								select_course.addItem("Compiler Design");
								select_course.addItem("Operating Systems");
								select_course.addItem("Object Oriented Programming");
								select_course.addItem("Computer Graphics ");
								select_course.addItem("Advanced Computer Architecture");
								select_course.addItem("Artificial Intelligence");
								
								
							}
						else
							if(semester.getSelectedItem().equals("6") && select_Stream.getSelectedItem().equals("Bachelor of Technology(CSE,IT,ECE)")) {
								select_course.removeAllItems();
//												select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem VI -> B.Tech(CSE,IT,ECE)");
								select_course.addItem("Database Management Systems");
								select_course.addItem("Computer Networks");
								select_course.addItem("Advanced Algorithms");
								select_course.addItem("Distributed Database Management System");
								select_course.addItem(" Parallel and Distributed Algorithms");
								
							}
						else
							if(semester.getSelectedItem().equals("7") && select_Stream.getSelectedItem().equals("Bachelor of Technology(CSE,IT,ECE)")) {
								select_course.removeAllItems();
//													select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem VII -> B.Tech(CSE,IT,ECE)");
								select_course.addItem(" Cloud Computing");
								select_course.addItem("Multi-agent Intelligent Systems/Machine learning");
								select_course.addItem("Neural Networks and Deep Learning");
								select_course.addItem("Soft Computing");
								select_course.addItem("Information Theory and Coding");
								select_course.addItem("Cyber Security");
							}
						
						else
							if(semester.getSelectedItem().equals("8") && select_Stream.getSelectedItem().equals("Bachelor of Technology(CSE,IT,ECE)")) {
								select_course.removeAllItems();
//													select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem VIII -> B.Tech(CSE,IT,ECE)");
								select_course.addItem("Web and Internet Technology");
								select_course.addItem("Internet of Things");
								select_course.addItem("Operation Research");
								select_course.addItem("Operation Research Lab");
								select_course.addItem("Computational Mathematics");
								select_course.addItem("Computational Mathematics Lab");
							}
						
						// BCA
						if(semester.getSelectedItem().equals("1") && select_Stream.getSelectedItem().equals("Bachelor of Computer Application(BCA)")) {
							select_course.removeAllItems();
//							select_Stream.setSelectedItem(null);
							select_course.addItem("Courses for Sem I -> (BCA)");
							select_course.addItem("Introduction to Programming");
							select_course.addItem("PC Software");
						}
						else
							if(semester.getSelectedItem().equals("2") && select_Stream.getSelectedItem().equals("Bachelor of Computer Application(BCA)")) {
								select_course.removeAllItems();
//								select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem II -> (BCA)");
								select_course.addItem("Computer Architecture and Systems Software");
								select_course.addItem("Computer Programming");
							}
						else
							if(semester.getSelectedItem().equals("3") && select_Stream.getSelectedItem().equals("Bachelor of Computer Application(BCA)")) {
								select_course.removeAllItems();
//									select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem III -> (BCA)");
								select_course.addItem("Operating Systems");
								select_course.addItem("Data Structures with C");
								select_course.addItem("Graphics & Internet");
							}
						else
							if(semester.getSelectedItem().equals("4") && select_Stream.getSelectedItem().equals("Bachelor of Computer Application(BCA)")) {
								select_course.removeAllItems();
//										select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem IV ->  (BCA)");
								select_course.addItem("Data Base Management System");
								select_course.addItem("Object-Oriented Programming with C++");
								select_course.addItem("Software Project Management and Quality Assurance");
							}
						else
							if(semester.getSelectedItem().equals("5") && select_Stream.getSelectedItem().equals("Bachelor of Computer Application(BCA)")) {
								select_course.removeAllItems();
//											select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem V -> (BCA)");
								select_course.addItem("Data Communication & Computer Networks");
								select_course.addItem("Windows Programming");
								select_course.addItem("Unix and Shell Programming");
								
							}
						else
							if(semester.getSelectedItem().equals("6") && select_Stream.getSelectedItem().equals("Bachelor of Computer Application(BCA)")) {
								select_course.removeAllItems();
//												select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem VI -> (BCA)");
								select_course.addItem("Advanced networking and Communication");
								select_course.addItem("Image Processing");
								select_course.addItem("Software Engineering");
								select_course.addItem("Object Oriented Programming with Java");
								select_course.addItem("Advanced Database Management");
							}
					
						//MCA
						
						if(semester.getSelectedItem().equals("1") && select_Stream.getSelectedItem().equals("Master of Computer Application(MCA)")) {
							select_course.removeAllItems();
//							select_Stream.setSelectedItem(null);
							select_course.addItem("Courses for Sem I -> (MCA)");
							select_course.addItem("Fundamentals of Computer Organization");
							select_course.addItem("Web Technology");
							select_course.addItem("Data and File Structure");
							select_course.addItem("Programming Fundamentals");
						}
						else
							if(semester.getSelectedItem().equals("2") && select_Stream.getSelectedItem().equals("Master of Computer Application(MCA)")) {
								select_course.removeAllItems();
//								select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem II -> (MCA)");
								select_course.addItem("Operating Systems");
								select_course.addItem("Unix and Windows Lab");
							}
						else
							if(semester.getSelectedItem().equals("3") && select_Stream.getSelectedItem().equals("Master of Computer Application(MCA)")) {
								select_course.removeAllItems();
//									select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem III -> (MCA)");
								select_course.addItem("Database Management Systems");
								select_course.addItem("Object-Oriented Analysis and Design");
								select_course.addItem("Computer Communication Networks");
							}
						else
							if(semester.getSelectedItem().equals("4") && select_Stream.getSelectedItem().equals("Master of Computer Application(MCA)")) {
								select_course.removeAllItems();
//										select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem IV -> (MCA)");
								select_course.addItem("Software Engineering I");
								select_course.addItem("Network Programming");
		
							}
						else
							if(semester.getSelectedItem().equals("5") && select_Stream.getSelectedItem().equals("Master of Computer Application(MCA)")) {
								select_course.removeAllItems();
//											select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem V -> (MCA)");
								select_course.addItem("Software Engineering II");
								select_course.addItem("AI and Application Lab");
								
							}
						else
							if(semester.getSelectedItem().equals("6") && select_Stream.getSelectedItem().equals("Master of Computer Application(MCA)")) {
								select_course.removeAllItems();
//												select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem VI -> (MCA)");
							}
						
						//Diploma in computer science
						
						if(semester.getSelectedItem().equals("1") && select_Stream.getSelectedItem().equals("Diploma in Computer Science")) {
							select_course.removeAllItems();
//							select_Stream.setSelectedItem(null);
							select_course.addItem("Courses for Sem I -> Diploma in CS");
							select_course.addItem("Computer Fundamentals & Applications");
						}
						else
							if(semester.getSelectedItem().equals("2") && select_Stream.getSelectedItem().equals("Diploma in Computer Science")) {
								select_course.removeAllItems();
//								select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem II -> Diploma in CS");
								select_course.addItem("Computer Center Management");
								select_course.addItem("Programming in C");
							}
						else
							if(semester.getSelectedItem().equals("3") && select_Stream.getSelectedItem().equals("Diploma in Computer Science")) {
								select_course.removeAllItems();
//									select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem III -> Diploma in CS");
								select_course.addItem("Data Structure");
								select_course.addItem("Operating system");
								select_course.addItem("Object-oriented programming in C++");
							}
						else
							if(semester.getSelectedItem().equals("4") && select_Stream.getSelectedItem().equals("Diploma in Computer Science")) {
								select_course.removeAllItems();
//										select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem IV -> Diploma in CS");
								select_course.addItem("Computer Architecture");
								select_course.addItem("Database Management System");
								select_course.addItem("Linux O.S");
								select_course.addItem("Programming in Visual basic");
		
							}
						else
							if(semester.getSelectedItem().equals("5") && select_Stream.getSelectedItem().equals("Diploma in Computer Science")) {
								select_course.removeAllItems();
//											select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem V -> Diploma in CS");
								select_course.addItem("Software Engineering");
								select_course.addItem("Web designing");
								select_course.addItem("System Software");
								
							}
						else
							if(semester.getSelectedItem().equals("6") && select_Stream.getSelectedItem().equals("Diploma in Computer Science")) {
								select_course.removeAllItems();
//												select_Stream.setSelectedItem(null);
								select_course.addItem("Courses for Sem VI -> Diploma in CS");
								select_course.addItem("Computer Networks");
								select_course.addItem("Networking Technology");
							}
					
					
			}
		});
		
		
		

	
//		
//		subject = new JComboBox();
//		subject.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		subject.setModel(new DefaultComboBoxModel(new String[] {" Select Subject", "DBMS", "Python ", "C", "C++"}));
//		subject.setBounds(574, 305, 223, 43);
//		contentPane.add(subject);
		
		
		
		
	}
}