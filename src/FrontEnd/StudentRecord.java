package FrontEnd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JSplitPane;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.List;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.protocol.Resultset;

import Database.DatabaseConnection;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
public  class StudentRecord extends JFrame {

	
	protected static final String DbUtils = null;

	
	private JPanel contentPane, studentPanel, registerPanel, securityPanel, ConfirmationPanel;
	private JLabel studentDetails, jl, jl1, L, line, name, Fname, address, dob, cntact, gnder,jllog,jlabout,jlpayment1,jllogout,jlpayment,jlreg,jlcurri,jlforget,jllogin, security,Cpswrd, line1,Uname, mail, institution, join, sem, dept, data,course, IIANote,search, courseIIA;
	private JTextField FnameTxt, addressTxt, cntactTxt, mailTxt, institutionTxt, joinTxt, srchTxt, UnameTxt;
	private JButton printbtn, addbtn, loadbtn, deletebtn, updatebtn;
	private List l;
	private JTable table;
	public JComboBox namecombo;
	protected Object[] courseSB;
	private int cnt = 1;
	private TextArea printTxt; 
	private JPasswordField CpswrdTxt;
	// security frame
	public JTextField nameTxt, nameclickCombobox;
	private JButton Confirmbtn;
	private JButton cancelbtn;
	private JButton show;
	private JButton hide;
	private ScrollPane scrollPane;
	private JPanel panel;
	private ScrollPane scrollPane_1;
	
	String Db;
	String Db1="";
	
	JTextArea TxtPrint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRecord frame = new StudentRecord();
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
	 * Create the frame.
	 */
	public StudentRecord() {
		
		// close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// frame size
		setBounds(100,100,1473,632);
		setResizable(false);
		getContentPane().setLayout(null);      
		setLocationRelativeTo(null);
		setTitle("Student Database");
		
		// create contentpanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new java.awt.Color(187, 235, 250));
		contentPane.setLayout(null);
		
		// student panel
		studentPanel = new JPanel();
		studentPanel.setBounds(92, 10, 1340, 60);
		studentPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
//		studentPanel.setBackground(new java.awt.Color(250, 245, 247));
		studentPanel.setBackground(new java.awt.Color(13, 37, 219));
		studentPanel.setLayout(null);
		
		// add jlabel to the student panel
		studentDetails= new JLabel("--- Inside Inspiration Academy > Student Database ---");
		studentDetails.setHorizontalAlignment(SwingConstants.CENTER);
		studentDetails.setFont(new Font("Tahoma", Font.BOLD, 35));
		studentDetails.setForeground(new java.awt.Color(26, 117, 255));
		studentDetails.setBounds(30, 0, 1300, 60);
		studentDetails.setForeground(new java.awt.Color(250, 250, 250));
		studentPanel.add(studentDetails);
		
		// image on the student panel left
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("inside_logo.jpg"));
	      Image bimg = img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	      ImageIcon image = new ImageIcon(bimg);
	      
	      jl = new JLabel(image);
	      jl.setBounds(0, 0, 100, 67);
//	      studentPanel.add(jl);
	      
	      // image on the student panel right
	      ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("inside_logo.jpg"));
	      Image bimg1 = img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	      ImageIcon image1 = new ImageIcon(bimg);
	      
	      jl1 = new JLabel(image);
	      jl1.setBounds(1240, 0, 100, 67);
//	      studentPanel.add(jl1);
		
	      
	      
	  	// new User Registration panel
			registerPanel = new JPanel();
			registerPanel.setBounds(92, 80, 480, 510);
			registerPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLUE));
			registerPanel.setBackground(new java.awt.Color(250, 250, 250));
			registerPanel.setLayout(null);
			
			// add new student label
			L=new JLabel("Add New Student");
			L.setBounds(30, 0, 400, 40);
			L.setFont(new Font("Tahoma", Font.BOLD, 20));
			 L.setForeground(new java.awt.Color(26, 117, 255));
			 registerPanel.add(L);
			 
			 // dotted line
			 line=new JLabel("_________________________________");
			 line.setBounds(30, 5, 450, 50);
			 line.setFont(new Font("Tahoma", Font.BOLD, 20));
			 line.setForeground(new java.awt.Color(26, 117, 255));
			 registerPanel.add(line);
		
			 // Name
			 name=new JLabel("Name *");
			 name.setBounds(30,44,100,40);
			 name.setFont(new Font("Tahoma", Font.BOLD, 16));
			 name.setForeground(new java.awt.Color(11, 107, 156));
			 registerPanel.add(name);
			        
				
				// frstnm txtfld
		    nameTxt=new JTextField();
	        nameTxt.setBounds(105,49,350,30);
	        nameTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
	        nameTxt.setForeground(new java.awt.Color(104, 108, 110));
	        registerPanel.add(nameTxt); 
	        
	        // Guardian's Name
			 Fname=new JLabel("Guardian Name *");
			 Fname.setBounds(30,81,150,40);
			 Fname.setFont(new Font("Tahoma", Font.BOLD, 16));
			 Fname.setForeground(new java.awt.Color(11, 107, 156));
			 registerPanel.add(Fname);
			        
				
				// grdn txtfld
		    FnameTxt=new JTextField();
	        FnameTxt.setBounds(174,86,281,30);
	        FnameTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
	        FnameTxt.setForeground(new java.awt.Color(104, 108, 110));
	        registerPanel.add(FnameTxt); 
	        
	        
	        // Address
	        address=new JLabel("Address *");
	        address.setBounds(30,121,150,40);
	        address.setFont(new Font("Tahoma", Font.BOLD, 16));
	        address.setForeground(new java.awt.Color(11, 107, 156));
			 registerPanel.add(address);
			        
				
			// address txtfld
		    addressTxt=new JTextField();
		    addressTxt.setBounds(122,126,334,30);
		    addressTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
		    addressTxt.setForeground(new java.awt.Color(104, 108, 110));
	        registerPanel.add(addressTxt); 
			 
	        // DOB
	        dob=new JLabel("DOB *");
	        dob.setBounds(30,161,50,40);
	        dob.setFont(new Font("Tahoma", Font.BOLD, 16));
	        dob.setForeground(new java.awt.Color(11, 107, 156));
			 registerPanel.add(dob);
	        
			 // choose dob
//	        Choice ch = new Choice();
//			ch.add("Date");
//			for(int i = 1; i <= 31; i++) {
//				ch.add(""+i);
//			}
//			ch.select("Date");
//			ch.setBounds(122, 169, 100, 150);
////			ch.setBackground(Color.GREEN);
//			registerPanel.add(ch);
//			ch.setFont(new Font("Tahoma", Font.BOLD, 16));
//			ch.setForeground(new java.awt.Color(104, 108, 110));
			
			 String datecnt[]= {"Date","1","2","3","4","5","6","7", "8","9","10","11","12","13","14","15", "16","17","18","19","20","21","22","23", "24","25","26","27","28","29","30","31"};
		        JComboBox date=new JComboBox(datecnt);
		        date.setBounds(122, 166, 100, 30);
		        date.setFont(new Font("Tahoma", Font.BOLD, 15));
		        date.setForeground(new java.awt.Color(104, 108, 110));
		        registerPanel.add(date);
		        
		        String monthcnt[]= {"Month","January","February","March","April","May","June","July", "August","September","October","November","December"};
		        JComboBox month=new JComboBox(monthcnt);
		        month.setBounds(230, 166, 110, 30);
		        month.setFont(new Font("Tahoma", Font.BOLD, 15));
		        month.setForeground(new java.awt.Color(104, 108, 110));
		        registerPanel.add(month);
		        
		        String yearcnt[]= {"Year","1990","1991","1992","1993","1994","1995","1996", "1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008", "2009","2010","2011","2012","2013"};
		        JComboBox year=new JComboBox(yearcnt);
		        year.setBounds(350, 166, 104, 30);
		        year.setFont(new Font("Tahoma", Font.BOLD, 15));
		        year.setForeground(new java.awt.Color(104, 108, 110));
		        registerPanel.add(year);
			
			 
			//Contact no
			cntact=new JLabel("Contact No *");
			cntact.setBounds(30,195,200,40);
			cntact.setFont(new Font("Tahoma", Font.BOLD, 16));
			cntact.setForeground(new java.awt.Color(11, 107, 156));
			 registerPanel.add(cntact);
			        
				
			// contact txtfld
		    cntactTxt=new JTextField();
		    cntactTxt.setBounds(140,204,317,30);
		    cntactTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
		    cntactTxt.setForeground(new java.awt.Color(104, 108, 110));
	        registerPanel.add(cntactTxt); 
			
			// Gender
	        gnder=new JLabel("Gender *");
	        gnder.setBounds(30,231,100,40);
	        gnder.setFont(new Font("Tahoma", Font.BOLD, 16));
	        gnder.setForeground(new java.awt.Color(11, 107, 156));
			 registerPanel.add(gnder);
			
			 // checkbox for gendeer
			 CheckboxGroup cg = new CheckboxGroup();
			 Checkbox c = new Checkbox("Male",cg,true);
				Checkbox c1 = new Checkbox("Female",cg,false);
				Checkbox c2 = new Checkbox("Others",cg,false);
				c.setBounds(142, 230, 70, 45);
				c1.setBounds(212, 230, 100, 45);
				c2.setBounds(312, 230, 100, 45);
				
				
				c.setFont(new Font("Tahoma", Font.BOLD, 16));
				c.setForeground(new java.awt.Color(104, 108, 110));
				c1.setFont(new Font("Tahoma", Font.BOLD, 16));
				c1.setForeground(new java.awt.Color(104, 108, 110));
				c2.setFont(new Font("Tahoma", Font.BOLD, 16));
				c2.setForeground(new java.awt.Color(104, 108, 110));
				registerPanel.add(c);
				registerPanel.add(c1);
				registerPanel.add(c2);
				
				// mail id
				mail=new JLabel("Email ID *");
				mail.setBounds(30,271,200,40);
				mail.setFont(new Font("Tahoma", Font.BOLD, 16));
				mail.setForeground(new java.awt.Color(11, 107, 156));
				 registerPanel.add(mail);
				        
					
				// mail txtfld
			    mailTxt=new JTextField();
			    mailTxt.setBounds(140,276,317,30);
			    mailTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
			    mailTxt.setForeground(new java.awt.Color(104, 108, 110));
		        registerPanel.add(mailTxt); 
		        
		        // Institution Name
		        institution=new JLabel("Instituion Name *");
		        institution.setBounds(30,310,280,40);
		        institution.setFont(new Font("Tahoma", Font.BOLD, 16));
		        institution.setForeground(new java.awt.Color(11, 107, 156));
				 registerPanel.add(institution);
				        
					
				// institution txtfld
				 institutionTxt=new JTextField();
				 institutionTxt.setBounds(180,316,278,30);
				 institutionTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
				 institutionTxt.setForeground(new java.awt.Color(104, 108, 110));
		        registerPanel.add(institutionTxt);
		        
		        // joining year
		        join=new JLabel("Year of Joining IIA *");
		        join.setBounds(30,349,170,40);
		        join.setFont(new Font("Tahoma", Font.BOLD, 16));
		        join.setForeground(new java.awt.Color(11, 107, 156));
				 registerPanel.add(join);
				        
					
				// joining txtfld
				 joinTxt=new JTextField();
				 joinTxt.setBounds(204,354,254,30);
				 joinTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
				 joinTxt.setForeground(new java.awt.Color(104, 108, 110));
		        registerPanel.add(joinTxt);
		        
		        // department
		        course=new JLabel("Stream *");
		        course.setBounds(30,390,90,40);
		        course.setFont(new Font("Tahoma", Font.BOLD, 16));
		        course.setForeground(new java.awt.Color(11, 107, 156));
				 registerPanel.add(course);
				 
				 // deparment combobox
				 String Coursearr[]= {"Select Your Stream","BSC","BTech","MCA","BCA","MTech","MSC","Others"};
			        JComboBox j=new JComboBox(Coursearr);
			        j.setBounds(115,395,180,30);
			        j.setFont(new Font("Tahoma", Font.BOLD, 15));
					 j.setForeground(new java.awt.Color(104, 108, 110));
			        registerPanel.add(j);
		        
		        // semester
		        sem=new JLabel("Semester *");
		        sem.setBounds(301,390,91,40); //30,390,90,40
		        sem.setFont(new Font("Tahoma", Font.BOLD, 16));
		        sem.setForeground(new java.awt.Color(11, 107, 156));
				 registerPanel.add(sem);
		        
				 TextArea ta = new TextArea();
					ta.setBounds(530, 250, 200, 200);
					ta.setBackground(Color.white);
					
					
					
					 TextArea ta1 = new TextArea();
						ta1.setBounds(530, 250, 200, 200);
						ta1.setBackground(Color.white);
//					contentPane.add(ta);
				 
					
					
					
					
					// sem combobox 
					 String semcnt[]= {"Sem","1","2","3","4","5","6","7", "8"};
				        JComboBox sem=new JComboBox(semcnt);
				        sem.setBounds(396, 395, 60, 30);
				        sem.setFont(new Font("Tahoma", Font.BOLD, 15));
				        sem.setForeground(new java.awt.Color(104, 108, 110));
				        registerPanel.add(sem);
		        
					 
					 // Courses
					 courseIIA=new JLabel("Choose Courses IIA *");
					 courseIIA.setBounds(30,429,174,40);
					 courseIIA.setFont(new Font("Tahoma", Font.BOLD, 16));
					 courseIIA.setForeground(new java.awt.Color(11, 107, 156));
						 registerPanel.add(courseIIA);
						 
						 
					// Courses Note
						 IIANote=new JLabel("Go to Curriculum page for Better view");
						 IIANote.setBounds(10,454,198,40);
						 IIANote.setFont(new Font("Lato Black", Font.ITALIC, 12));
						 IIANote.setForeground(new java.awt.Color(11, 107, 156));
					 	registerPanel.add(IIANote);
					 	
					 	
					 	 // courses IIA
						 String Course[]= {"C","C++","Java","Python","Data Structures & Algorithm","DBMS","SQL","Graphic Design","Compile Design","Operating System","Microprocessor","Digital Electronics", "Computer Architecture", "PHP", "AI", "Advanced Java", "MongoDB", "Javascript", "11", "12", "Django", "Node JS", "React JS", "Machine Learning", "CSS", "HTML", "Networking", "DAA"};

					        // Multiple selection via list courses
					        
					        l = new List((Course.length - 1), true);
					        l.setMultipleSelections(true);
					        
					        for(String crse: Course) {
					        	l.add(crse);
					        }
					        
					        l.setBounds(210, 439, 247, 60);
					        l.setFont(new Font("Tahoma", Font.BOLD, 15));
							l.setForeground(new java.awt.Color(104, 108, 110));
					        registerPanel.add(l);
					 	
					       
//					        l.deselect(2);
//					        l.select(7);
//					        l.select(1);
//					        
//					        String Dbfetch[] = l.getSelectedItems();
//					        
////					    **********************************************************************  
//					        int cnt1 = 0;
//					        for(int i = 0; i < Dbfetch.length; i++) {
//					        	for(int k = 0; k < Course.length; k++) {
//					        		if(Dbfetch[i].equals(Course[k])) {
////					        			ta1.append(k+" ");
//					        			l.select(k);
//					        			break;
//					        		}
//					        	}
//					        }
					        
//					      *****************************************************************************  
					        
					        
			        // Choose Courses textarea
				       
						
				// security
						
//		scrollPane = new JScrollPane();
//		scrollPane.setBounds(524, 120, 840, 440);
//		scrollPane.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
//		
//		contentPane.add(scrollPane);
//		
//		table = new JTable();
//		table.setBackground(new Color(240, 248, 255));
//
//		table.setForeground(new Color(0, 100, 0));
//
//		table.setFont(new Font("Tahoma", Font.BOLD, 13));
////		table.setBackground(new java.awt.Color(250, 250, 250));
////		table.setForeground(new java.awt.Color(26, 117, 255));
////		contentPane.add(table);
//		scrollPane.setViewportView(table);
//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//			},
//			 new String[] {
//				"Name", "Guardian Name","Address", "DOB","Contact No","Gender","Email ID","Institution Name","Joining Year","Stream", "Semester", "Courses"
//			}
//		));
					        
					        
					        
					        
					        
					        
       
		
		// table
		table = new JTable();
		table.setBackground(new Color(240, 250, 243));
		table.setForeground(new java.awt.Color(20, 79, 156));  //26, 117, 255  //31, 156, 20
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.setModel(new DefaultTableModel(

		new Object[][] {
		{" Name", "Guardian Name","Address", "DOB","Contact No","Gender","Email ID","Institution Name","Joining Year","Stream", "Semester", "Courses"},
		{null, null, null, null, null, null, null, null, null, null, null, null},
		{null, null, null, null, null, null, null, null, null, null, null, null},
		{null, null, null, null, null, null, null, null, null, null, null, null},
		{null, null, null, null, null, null, null, null, null, null, null, null},
		
		
		},

		new String[] {
				" Name", "Guardian Name","Address", "DOB","Contact No","Gender","Email ID","Institution Name","Joining Year","Stream", "Semester", "Courses"
		}
		));

		table.setBorder(new MatteBorder(1, 2, 2, 2, (Color) Color.BLUE));
		table.setBounds(524, 120, 840, 530);
		
		
		// for table head

		
		
		// fetch data from textAreas
		
		
		
		

		loadbtn = new JButton("Load");   
		loadbtn.setBounds(648, 567, 89, 23);
		loadbtn.setFont(new Font("Tahoma", Font.BOLD, 17));
		loadbtn.setBackground(new java.awt.Color(51,51,51));
		loadbtn.setForeground(Color.white);
		   
		loadbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					TxtPrint.setText("");
					Connection con1 = DatabaseConnection.getConnection();
					String loadQuery = "select * from studentRecord";
					PreparedStatement ps = con1.prepareStatement(loadQuery);
					ResultSet rs = ps.executeQuery();
					java.sql.ResultSetMetaData rsmd = rs.getMetaData();
					DefaultTableModel dtm = (DefaultTableModel) table.getModel();
					dtm.setRowCount(0);
					int column = rsmd.getColumnCount();
					while(rs.next()) {
						Vector v = new Vector();
						for(int i = 1; i <= column; i++) {
							v.add(rs.getString("Name"));
							v.add(rs.getString("Guardian_Name"));
							v.add(rs.getString("Address"));
							v.add(rs.getString("DOB"));
							v.add(rs.getString("Contact_No"));
							v.add(rs.getString("Gender"));
							v.add(rs.getString("Email_ID"));
							v.add(rs.getString("Institution_Name"));
							v.add(rs.getString("Joining_Year"));
							v.add(rs.getString("Stream"));
							v.add(rs.getString("Semester"));
							v.add(rs.getString("Selected_Courses"));
						}
						dtm.addRow(v);
					}
				
					Statement stm = con1.createStatement();
					ResultSet rs1 = stm.executeQuery("select distinct Name from studentRecord");
					
					while(rs1.next()) {
						String namesfromDB = rs1.getString("Name");
							namecombo.addItem(namesfromDB);
					}
					

//					 String Dbfetch2[] = Db.split(", ");
//					 for(int i = 0; i < Dbfetch2.length; i++) {
//						 l.deselect(i);
//					 }
					
					
					//" Name", "Guardian Name","Address", "DOB","Contact No","Gender","Email ID","Institution Name","Joining Year","Stream", "Semester", "Courses"},
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		// student data 
				data = new JLabel("Choose Student Name to view ");
				data.setFont(new Font("Tahoma", Font.BOLD, 17));
				data.setBounds(595, 83, 262, 14);
				data.setForeground(new java.awt.Color(25, 78, 148));
				
				String namecombox[]= {"Select Name to view record"};
				namecombo = new JComboBox(namecombox);
				namecombo.setBounds(859, 81, 230, 22);
				namecombo.setFont(new Font("Tahoma", Font.BOLD, 14));
				namecombo.setForeground(new java.awt.Color(104, 108, 110));
				
				namecombo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String namesString = namecombo.getSelectedItem().toString();
					try {
						Connection con3 = DatabaseConnection.getConnection(); 
						String comboQuery = "select * from studentRecord where Name=?";
						PreparedStatement ps = con3.prepareStatement(comboQuery);
						ps.setString(1, namesString);
						ResultSet rs = ps.executeQuery();

						if(namecombo.getSelectedItem().equals("Select Name to view record")) {
							mailTxt.setText("");
							nameTxt.setText("");
							FnameTxt.setText("");
							addressTxt.setText("");
							date.setSelectedIndex(0);
							month.setSelectedIndex(0);
							year.setSelectedIndex(0);
							cntactTxt.setText("");
							institutionTxt.setText("");
							j.setSelectedIndex(0);
							joinTxt.setText("");
							sem.setSelectedIndex(0);
							ta.setText("");
							
							String[] CourseFetch = l.getSelectedItems();
							
							for(int i = 0; i < CourseFetch.length; i++) {
								for(int p = 0; p < Course.length; p++) {
									if(Course[p].equals(CourseFetch[i])) {
										l.deselect(p);
									}
								}
							}
						}
						else {
						if(rs.next()) {
							mailTxt.setText("");
							nameTxt.setText("");
							FnameTxt.setText("");
							addressTxt.setText("");
							date.setSelectedIndex(0);
							month.setSelectedIndex(0);
							year.setSelectedIndex(0);
							cntactTxt.setText("");
							institutionTxt.setText("");
							j.setSelectedIndex(0);
							joinTxt.setText("");
							sem.setSelectedIndex(0);
							ta.setText("");
							String[] CourseFetch = l.getSelectedItems();
							
							for(int i = 0; i < CourseFetch.length; i++) {
								for(int p = 0; p < Course.length; p++) {
									if(Course[p].equals(CourseFetch[i])) {
										l.deselect(p);
									}
								}
							}
							
							
							int response1 = JOptionPane.showConfirmDialog(null, rs.getString("Name")+" before you get all the Access Confirm it's you! ","Confirm It's You", JOptionPane.YES_NO_OPTION);
							if(response1 == JOptionPane.YES_OPTION) {
								
								String[] CourseFetch1 = l.getSelectedItems();
								
								for(int i = 0; i < CourseFetch.length; i++) {
									for(int p = 0; p < Course.length; p++) {
										if(Course[p].equals(CourseFetch[i])) {
											l.deselect(p);
										}
									}
								}
								
								
								
								setBounds(100,125,1473,770);
								ConfirmationPanel.show();
								setLocationRelativeTo(null);
								
								
								// check username and password are match or not respect via email
								Confirmbtn.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										try {
											Connection con6 = Database.DatabaseConnection.getConnection();
											String userQuery = "select Username, Password from newregistration where Email=?";
											PreparedStatement ps = con6.prepareStatement(userQuery);
											
											ps.setString(1, rs.getString("Email_ID"));
											
											ResultSet rs1 = ps.executeQuery();
											int count100 = 0;
											while(rs1.next()) {
												if(rs1.getString("Username").equals(UnameTxt.getText()) && rs1.getString("Password").equals(CpswrdTxt.getText()) ) {
													nameTxt.setText(rs.getString("Name"));
													FnameTxt.setText(rs.getString("Guardian_Name"));
													addressTxt.setText(rs.getString("Address"));
													cntactTxt.setText(rs.getString("Contact_No"));
													mailTxt.setText(rs.getString("Email_ID"));
													institutionTxt.setText(rs.getString("Institution_Name"));
													joinTxt.setText(rs.getString("Joining_Year"));
													nameTxt.setText(rs.getString("Name"));
													j.setSelectedItem(rs.getString("Stream"));
													sem.setSelectedItem(rs.getString("Semester"));
													String dob = rs.getString("DOB");
													String dobsplit[] = dob.split(" ");
													date.setSelectedItem(dobsplit[0]);
													month.setSelectedItem(dobsplit[1]);
													year.setSelectedItem(dobsplit[2]);
													count100++;
//													
//													// *****************************************************
//													
													Db = rs.getString("Selected_Courses");
													System.out.println(Db+"1");
													 String Dbfetch[] = Db.split(", ");
							
													 
													   int cnt1 = 0;
												        for(int i = 0; i < Dbfetch.length; i++) {
												        	for(int k = 0; k < Course.length; k++) {
												        		if(Dbfetch[i].equals(Course[k])) {
//												        			ta1.append(k+" ");
												        			l.select(k);
												        			break;
												        		}
												        	}
												        }
//													
////													*************************************************************

													if(rs.getString("Gender").equals("Male")) {
														cg.setSelectedCheckbox(c);	
													}
													else if(rs.getString("Gender").equals("Female")) {
														cg.setSelectedCheckbox(c1);
													}
													else {
														cg.setSelectedCheckbox(c2);
													}
													JOptionPane.showMessageDialog(null, rs.getString("Name")+" it's you!! now you can Update, Delete, Print your data :)");
													ConfirmationPanel.hide();
										    		setBounds(100,100,1473,650);
										    		setLocationRelativeTo(null);
										    		UnameTxt.setText("");
										    		CpswrdTxt.setText("");
										    		
												}
												
												else {
													JOptionPane.showMessageDialog(null, "Oops! its not you..Invalid Username or Password");
//													System.out.println(CpswrdTxt.getText());
//													System.out.println(UnameTxt.getText());
//													System.out.println(rs1.getString("Password"));
//													System.out.println(rs1.getString("Username"));
													UnameTxt.setText("");
										    		CpswrdTxt.setText("");
												}
											}
										}catch(Exception ex) {
											ex.printStackTrace();
										}
								
									}
								});
								
								 cancelbtn.addActionListener(new ActionListener() {
								    	public void actionPerformed(ActionEvent e) {
								    		ConfirmationPanel.hide();
								    		setBounds(100,100,1473,650);
								    		setLocationRelativeTo(null);
								    	}
								    });
								
							}
							else {
								System.out.println("no");
							}
						}
						}
					}catch(Exception e1) {
						e1.printStackTrace();
					}
					}
				});
		
		
				
				
				
				// add button
				addbtn = new JButton("Add");   
				addbtn.setBounds(823, 567, 89, 23);
				addbtn.setFont(new Font("Tahoma", Font.BOLD, 17));
				addbtn.setBackground(new java.awt.Color(51,51,51));
				addbtn.setForeground(Color.white);
				   
				addbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
//						System.out.println("This is Add button");
						String stname = nameTxt.getText().trim();
						String stguardian = FnameTxt.getText();
						String staddress = addressTxt.getText();
						String stdob = date.getSelectedItem() + " "+ month.getSelectedItem()+ " "+ year.getSelectedItem();
						String stcontact = cntactTxt.getText();
						String stgender = cg.getSelectedCheckbox().getLabel();
						
						String stemail = "";
						if(EmailValidate(mailTxt.getText())) {
							stemail = mailTxt.getText();
//							 System.out.println("Email correct");
								String stinstitute = institutionTxt.getText();
								String stjoinyear = joinTxt.getText();
								String ststream = j.getSelectedItem().toString();
								String stsem = sem.getSelectedItem().toString();
								String stChosenCourses = ta.getText();
								String[] stcourses = l.getSelectedItems();
								if(stcourses.length == 0) {
									JOptionPane.showMessageDialog(null, "Please Choose Courses!");
								}
								for(String course : stcourses) {
									ta.append(course+", ");
								}
								
								// database code
								
								try {
									Connection con = DatabaseConnection.getConnection();
									Connection con2 = DatabaseConnection.getConnection();
									
									String Query = "select email from newregistration";
									PreparedStatement ps2= con.prepareStatement(Query);
									ResultSet rs2 = ps2.executeQuery();
									
									int count=0;
									
									while(rs2.next()) {
										if(rs2.getString("Email").equals(mailTxt.getText())) {
											String sqlQuery = "insert into studentRecord values(?,?,?,?,?,?,?,?,?,?,?,?)";
											PreparedStatement ps = con.prepareStatement(sqlQuery);
											ps.setString(1, stname);
											ps.setString(2, stguardian);
											ps.setString(3, staddress);
											ps.setString(4, stdob);
											ps.setString(5, stcontact);
											ps.setString(6, stgender);
											ps.setString(7, stemail);
											ps.setString(8, stinstitute);
											ps.setString(9, stjoinyear);
											ps.setString(10, ststream);
											ps.setString(11, stsem);
											ps.setString(12, ta.getText());
											
//											if(stname.equals("") && stemail.equals("") && staddress.equals("")) {
											if(!stname.equals("") && !stguardian.equals("") && !stemail.equals("") && !staddress.equals("") && !stcontact.equals("") && !stinstitute.equals("") && !stjoinyear.equals("") && !ststream.equals("Select Your Stream") && !stsem.equals("Sem") && !date.getSelectedItem().equals("Date") && !month.getSelectedItem().equals("Month") && !year.getSelectedItem().equals("Year") ) {
												ps.executeUpdate() ;
												JOptionPane.showMessageDialog(null, stname+", your record has been stored :)");
												cnt++;
												count++;
												nameTxt.setText("");
												FnameTxt.setText("");
												addressTxt.setText("");
												date.setSelectedIndex(0);
												month.setSelectedIndex(0);
												year.setSelectedIndex(0);
												cntactTxt.setText("");
												mailTxt.setText("");
												institutionTxt.setText("");
												j.setSelectedIndex(0);
												joinTxt.setText("");
												
//										********************* Deselect *****************************
											String[] CourseFetch = l.getSelectedItems();
						
											for(int i = 0; i < CourseFetch.length; i++) {
												for(int p = 0; p < Course.length; p++) {
													if(Course[p].equals(CourseFetch[i])) {
														l.deselect(p);
													}
												}
											}
												   
//										*****************************************************		
												 sem.setSelectedIndex(0);
												ta.setText("");
											}
											else {
												JOptionPane.showMessageDialog(null, "'*' Fields are mandetory");
											}
											
										}
									}
									if(count == 0) {
										JOptionPane.showMessageDialog(null, "You are not an Valid Student!!\nPlease Register via Correct information:)");
									}
									
									
									
									
						
								}catch(Exception e) {
									JOptionPane.showMessageDialog(null, "Oops!! Data is not inserted!");
									e.printStackTrace();
									
								}
						}
						else {
//							System.out.println("Email incorrect");
							JOptionPane.showMessageDialog(null," Invalid Email!! Please put Correct Email");
							mailTxt.setText("");
							
						}
						
					
				
					}
				});
		
		
				
				

				// delete btn
						deletebtn = new JButton("Delete");   
						deletebtn.setBounds(1343, 567, 89, 23);
						deletebtn.setFont(new Font("Tahoma", Font.BOLD, 17));
						deletebtn.setBackground(new java.awt.Color(51,51,51));
						deletebtn.setForeground(Color.white);
						   
						deletebtn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								String stemail = mailTxt.getText();
								String stname = nameTxt.getText();
								try {
									Connection con2 = DatabaseConnection.getConnection();
									String deleteQuery = "delete from studentRecord where Email_ID=?";
									PreparedStatement ps = con2.prepareStatement(deleteQuery);
									ps.setString(1, stemail);
									int response = JOptionPane.showConfirmDialog(null, stname+" Do you want to Delete ?","Select Option for Delete", JOptionPane.YES_NO_OPTION);
									
									if(response == JOptionPane.YES_OPTION) {
										ps.executeUpdate();
										JOptionPane.showMessageDialog(null, stname+", your record has been Deleted :)");
										mailTxt.setText("");
										nameTxt.setText("");
										FnameTxt.setText("");
										addressTxt.setText("");
										date.setSelectedIndex(0);
										month.setSelectedIndex(0);
										year.setSelectedIndex(0);
										cntactTxt.setText("");
										institutionTxt.setText("");
										j.setSelectedIndex(0);
										joinTxt.setText("");
										sem.setSelectedIndex(0);
										ta.setText("");
										namecombo.removeItem(stname);
										
										String[] CourseFetch1 = l.getSelectedItems();
										
										for(int i = 0; i < CourseFetch1.length; i++) {
											for(int p = 0; p < Course.length; p++) {
												if(Course[p].equals(CourseFetch1[i])) {
													l.deselect(p);
												}
											}
										}
										
									}
									if(response == JOptionPane.NO_OPTION) {
										JOptionPane.showMessageDialog(null, stname+", Deletion Unsuccessful!");
									}
									
									
									
								}catch(Exception e) {
									JOptionPane.showMessageDialog(null, stname+",Oops!! Check properly!!");
									e.printStackTrace();
								}
							}
						});
		
		
		
		// 
		
		updatebtn = new JButton("Update");   
		updatebtn.setBounds(989, 567, 100, 23);
		updatebtn.setFont(new Font("Tahoma", Font.BOLD, 17));
		updatebtn.setBackground(new java.awt.Color(51,51,51));
		updatebtn.setForeground(Color.white);
		   
		updatebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String stname = nameTxt.getText();
				String stguardian = FnameTxt.getText();
				String staddress = addressTxt.getText();
				String stdob = date.getSelectedItem() + " "+ month.getSelectedItem()+ " "+ year.getSelectedItem();
				String stcontact = cntactTxt.getText();
				String stgender = cg.getSelectedCheckbox().getLabel();
				
				String stemail = "";
				if(EmailValidate(mailTxt.getText())) {
					stemail = mailTxt.getText();
//					 System.out.println("Email correct");
					 String stinstitute = institutionTxt.getText();
						String stjoinyear = joinTxt.getText();
						String ststream = j.getSelectedItem().toString();
						String stsem = sem.getSelectedItem().toString();
						String stChosenCourses = ta.getText();
						Db="";
						String[] UpdateCourse = l.getSelectedItems();
						for(int i = 0; i < UpdateCourse.length; i++) {
							Db = Db + (UpdateCourse[i] + ", ");
						}
//						System.out.println(Db1+"2");
						
//						if(stcourses.length == 0) {
//							JOptionPane.showMessageDialog(null, "Please Choose Courses!");
//						}
//						for(String course : stcourses) {
//							ta.append(course+", ");
//						}
						
						try {
							Connection con4 = DatabaseConnection.getConnection();
							String UpdateQuery = "update studentRecord set Name=?, Guardian_Name=?, Address=?, DOB=?, Contact_No=?, Gender=?, Institution_Name=?, Joining_Year=?, Stream=?, Semester=?, Selected_Courses=? where Email_ID=?";
							PreparedStatement ps = con4.prepareStatement(UpdateQuery);
							ps.setString(1, stname);
							ps.setString(2, stguardian);
							ps.setString(3, staddress);
							ps.setString(4, stdob);
							ps.setString(5, stcontact);
							ps.setString(6, stgender);
							ps.setString(7, stinstitute);
							ps.setString(8, stjoinyear);
							ps.setString(9, ststream);
							ps.setString(10, stsem);
							ps.setString(11, Db);
							
							ps.setString(12, stemail);
							int response1 = JOptionPane.showConfirmDialog(null, stname+" Do you want to Update ?","Select Option for Update", JOptionPane.YES_NO_OPTION);
							if(response1 == JOptionPane.YES_OPTION) {
								ps.execute();
								JOptionPane.showMessageDialog(null, stname+", your Record has been Updated :)");
								mailTxt.setText("");
								nameTxt.setText("");
								FnameTxt.setText("");
								addressTxt.setText("");
								date.setSelectedIndex(0);
								month.setSelectedIndex(0);
								year.setSelectedIndex(0);
								cntactTxt.setText("");
								institutionTxt.setText("");
								j.setSelectedIndex(0);
								joinTxt.setText("");
								sem.setSelectedIndex(0);
								ta.setText("");
								String[] CourseFetch1 = l.getSelectedItems();
								
								for(int i = 0; i < CourseFetch1.length; i++) {
									for(int p = 0; p < Course.length; p++) {
										if(Course[p].equals(CourseFetch1[i])) {
											l.deselect(p);
										}
									}
								}
							}
							if(response1 == JOptionPane.NO_OPTION) {
								JOptionPane.showMessageDialog(null, stname+" Update Unsuccessful!");
							}
							
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null, "Oops! Check properly in "+e.getMessage());
						}
				}
				else {
//					System.out.println("Email incorrect");
					JOptionPane.showMessageDialog(null, name+" Invalid Email!! Please put Correct Email");
					
				}
				
				
				
			}
		});
		
		// 
		
		
				
		
		//
			
		
		
		
		
		
		printbtn = new JButton("Print");   
		printbtn.setBounds(1155, 567, 89, 23);
		printbtn.setFont(new Font("Tahoma", Font.BOLD, 17));
		printbtn.setBackground(new java.awt.Color(51,51,51));
		printbtn.setForeground(Color.white);
		
		// Printing Text
		
		
		
		TxtPrint = new JTextArea();
		TxtPrint.setLineWrap(true);
		TxtPrint.setFont(new Font("Tahoma", Font.BOLD, 10));
	      TxtPrint.setBounds(1091, 114, 341, 443);
	      contentPane.add(TxtPrint);
		
	      Date obj=new Date();
		  String date2=obj.toString();
			
		printbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtPrint.append("===================================================================\n"+
						"\tInside Inspiration Academy - Student Record\t"+"Time: "+date2+"\n" +
						"===========================================================================\n"+
						" Name : \t"+ nameTxt.getText() +"\n\n"+
						" Guardian's Name :\t"+ FnameTxt.getText()+"\n\n"+
						" Address : \t"+addressTxt.getText()+"\n\n"+
						" DOB : \t"+ date.getSelectedItem() + " "+ month.getSelectedItem()+ " "+ year.getSelectedItem()+"\n\n"+
						" Contact No : \t"+ cntactTxt.getText()+"\n\n"+
						" Gender : \t"+ cg.getSelectedCheckbox().getLabel()+"\n\n"+
						" Email Id : \t"+ mailTxt.getText()+"\n\n"+
						" Institute Name : \t"+ institutionTxt.getText()+"\n\n"+
						" Joining Year in IIA : \t"+ joinTxt.getText()+"\n\n"+
						" Stream : \t"+j.getSelectedItem().toString()+"\n\n"+
						" Semester : \t"+sem.getSelectedItem().toString()+"\n\n"+
						" Courses Taken :\t"+Db+"\n\n"+
						"=====================================================================================================================\n"
				);
				try {
					TxtPrint.print();
					
					
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					Logger.getLogger(PrinterGraphics.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
		
		
		
		
		search = new JLabel("Search");
		search.setFont(new Font("Tahoma", Font.BOLD, 17));
		search.setForeground(new java.awt.Color(25, 78, 148));
		search.setBounds(1115, 83, 95, 14);
		
		
		srchTxt = new JTextField();
		srchTxt.setBounds(1187, 80, 195, 24);
		srchTxt.setFont(new Font("Tahoma", Font.BOLD, 15));
		srchTxt.setForeground(new java.awt.Color(104, 108, 110));
		
		srchTxt.addKeyListener(new KeyAdapter() {
		public void keyReleased(KeyEvent e) {

			DefaultTableModel model = (DefaultTableModel)table.getModel();
			TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
			table.setRowSorter(tr);
			tr.setRowFilter(RowFilter.regexFilter(srchTxt.getText().trim()));
			}
		});
		
		
		// add to frame
				contentPane.add(studentPanel);
				contentPane.add(registerPanel);
//				contentPane.add(table);
				contentPane.add(deletebtn);
				contentPane.add(updatebtn);
				contentPane.add(addbtn);
				contentPane.add(printbtn);
				contentPane.add(deletebtn);
				contentPane.add(loadbtn);
				contentPane.add(data);
				contentPane.add(srchTxt);
				contentPane.add(namecombo);
				contentPane.add(search);
				
				
				// security
				ConfirmationPanel = new JPanel();
				ConfirmationPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
				ConfirmationPanel.setBounds(0, 595, 561, 132);
				ConfirmationPanel.setBackground(new java.awt.Color(250, 250, 250));
				ConfirmationPanel.setLayout(null);
				contentPane.add(ConfirmationPanel);
				
				// addsecurity label
				security=new JLabel("Confirm It's You :)");
				security.setBounds(155, 0, 400, 40);
				security.setFont(new Font("Tahoma", Font.BOLD, 20));
				security.setForeground(new java.awt.Color(26, 117, 255));
				ConfirmationPanel.add(security);
				 
				 Uname=new JLabel("Username *");
				 Uname.setBounds(30,34,100,40);
				 Uname.setFont(new Font("Tahoma", Font.BOLD, 16));
				 Uname.setForeground(new java.awt.Color(11, 107, 156));
				 ConfirmationPanel.add(Uname);
				        
					
					// frstnm txtfld
			    UnameTxt=new JTextField();
			    UnameTxt.setBounds(135,39,300,30);
			    UnameTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
			    UnameTxt.setForeground(new java.awt.Color(104, 108, 110));
			    ConfirmationPanel.add(UnameTxt); 
			    
			    Cpswrd=new JLabel("Password *");
			    Cpswrd.setBounds(30,72,100,40);
			    Cpswrd.setFont(new Font("Tahoma", Font.BOLD, 16));
			    Cpswrd.setForeground(new java.awt.Color(11, 107, 156));
				 ConfirmationPanel.add(Cpswrd);
				        
					
					// frstnm txtfld
				 CpswrdTxt=new JPasswordField();
				 CpswrdTxt.setBounds(135,77,300,30);
				 CpswrdTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
				 CpswrdTxt.setForeground(new java.awt.Color(104, 108, 110));
			    ConfirmationPanel.add(CpswrdTxt);
			    
			    Confirmbtn = new JButton("Confirm");
			    Confirmbtn.setForeground(Color.WHITE);
			    Confirmbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
			    Confirmbtn.setBackground(Color.BLACK);
			    Confirmbtn.setBounds(451, 72, 100, 23);
			    ConfirmationPanel.add(Confirmbtn);
			    
			    cancelbtn = new JButton("Cancel");
			    cancelbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
			    cancelbtn.setForeground(Color.WHITE);
			    cancelbtn.setBackground(Color.BLACK);
			    cancelbtn.setBounds(455, 103, 94, 21);
			    ConfirmationPanel.add(cancelbtn);
			    
			    show = new JButton("Show");
			    show.setBackground(Color.BLACK);
			    show.setForeground(Color.WHITE);
			    show.setFont(new Font("Tahoma", Font.BOLD, 15));
			    show.setBounds(451, 10, 100, 21);
			    show.addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		CpswrdTxt.setEchoChar((char)0);
			    	}
			    });
			    ConfirmationPanel.add(show);
			    
			    hide = new JButton("Hide");
			    hide.addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		CpswrdTxt.setEchoChar('*');
			    	}
			    });
			    hide.setFont(new Font("Tahoma", Font.BOLD, 15));
			    hide.setForeground(Color.WHITE);
			    hide.setBackground(Color.BLACK);
			    hide.setBounds(451, 41, 100, 21);
			    ConfirmationPanel.add(hide);
			    
			    scrollPane = new ScrollPane();
			    scrollPane.setBounds(595, 114, 480, 443);
			    contentPane.add(scrollPane);
			    
			    scrollPane.add(table);
			    
			    panel = new JPanel();
			    panel.setBackground(Color.WHITE);
			    panel.setBorder(null);
			    panel.setBounds(0, 10, 69, 581);
			    contentPane.add(panel);
		        
			    ConfirmationPanel.hide();
				
				
		         
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
			      
			      
			      
			      

			     
				
				
//				contentPane.add(printTxt);
	}
}