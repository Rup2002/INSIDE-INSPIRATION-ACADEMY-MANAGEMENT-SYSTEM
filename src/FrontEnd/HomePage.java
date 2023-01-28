package FrontEnd;
import java.awt.Button;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;



import Database.DatabaseConnection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class HomePage extends JFrame {

	// todo -> Email Validation
	private JPanel contentPane,registerPanel,fillPanel, panel;
	private JTextField  t3,  t6;
	private Font fn,fn1,fn2,fn3, fn4, fn5, fn6, fn7, fn8;
	private JLabel jl, jl2, jl3, jl4, jl5, l10, L, L1, L2, L3, L4, L5, L6, jllogin, jlreg, jlforget, jllogout,jldada,jlcurri, jlpayment, jlpayment1, jlabout, jllog,studentDetails, jlsup, jlcollage;
	
	private JButton save, cancel;
	private Button show, hide;
	
	// security for studentRecord
	public JTextField t1, t2, t4;
	public JPasswordField p;
	private JPanel supriyoDa;
	private JPanel CollagePic;
	private JPanel Dada;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel biswalabel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		
		
		getContentPane().setBackground(new Color(187, 235, 250));
		setBounds(100,100,1401,645);
		setTitle("Home Page");
		setResizable(false);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new java.awt.Color(187, 235, 250));
		
		panel = new JPanel();
		panel.setBounds(74, 11, 1308, 60);
		panel.setBorder(new MatteBorder(1, 2, 2, 2, (Color) new Color(9, 16, 61)));
		panel.setBackground(new Color(255, 255, 108));
		panel.setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 11, 64, 587);
		getContentPane().add(panel_1);
		
		
		
		contentPane.add(panel);
		contentPane.add(panel_1);
	
		
		         
         // Nav Home
	 	  ImageIcon imglogin = new ImageIcon(ClassLoader.getSystemResource("Resources/Homenav.png"));
	      Image bimglogin = imglogin.getImage().getScaledInstance(52, 55, Image.SCALE_DEFAULT);
	      ImageIcon imagelogin = new ImageIcon(bimglogin);
	      
	      jllogin = new JLabel(imagelogin);
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
	      jlpayment1.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		dispose();
	      		AdminPayment sr = new AdminPayment();
	      		sr.main(null);
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
//	      jllog.setBounds(49, 10, 0, 0);
	      
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
//	      jlcurri.setBounds(49, 7, 0, 0);
	      
	      
	      panel_1.add(jllogin);
	      panel_1.add(jlreg);
	      panel_1.add(jlforget);
	      panel_1.add(jllogout);
	      panel_1.add(jlcurri);
	      panel_1.add(jlpayment);
	      panel_1.add(jlpayment1);
	      panel_1.add(jlabout);
	      panel_1.add(jllog);
		
	      
	      panel.setBackground(new java.awt.Color(13, 37, 219));   
	      
	  	studentDetails= new JLabel("--- Inside Inspiration Academy > Home Page ---");
//		studentDetails.setHorizontalAlignment(SwingConstants.CENTER);
		studentDetails.setFont(new Font("Tahoma", Font.BOLD, 35));
		studentDetails.setForeground(new java.awt.Color(250, 250, 250)); 
		studentDetails.setBounds(227, 0, 867, 50);
		panel.add(studentDetails);
		
		
		
		
		
		
		ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("Resources/logos.png"));
		Image bimg2 = img2.getImage().getScaledInstance(578, 517, Image.SCALE_DEFAULT);
		ImageIcon image2 = new ImageIcon(bimg2);
		jlcollage = new JLabel(image2);
		jlcollage.setBounds(439, 81, 576, 517);
		
		
		
		CollagePic = new JPanel();
		CollagePic.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLUE));
		CollagePic.setBounds(436, 78, 582, 523);
		contentPane.add(jlcollage);
		contentPane.add(CollagePic);
		
		
		ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("Resources/DadaPic.jpg"));
		Image bimg1 = img1.getImage().getScaledInstance(300, 306, Image.SCALE_DEFAULT);
		ImageIcon image1 = new ImageIcon(bimg1);
		jldada = new JLabel(image1);
		jldada.setBounds(1025, 82, 350, 363);
		
		
		
		Dada = new JPanel();
		Dada.setBackground(new java.awt.Color(240, 245, 95));
		Dada.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		Dada.setBounds(1021, 82, 357, 369);
		contentPane.add(jldada);
		contentPane.add(Dada);
		
		
		
		
		
		
		
		
		
		
		
	      
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Resources/supriyoDa.jpg"));
		Image bimg = img.getImage().getScaledInstance(300, 306, Image.SCALE_DEFAULT);
		ImageIcon image = new ImageIcon(bimg);
		jlsup = new JLabel(image);
		jlsup.setBounds(75, 85, 350, 363);
		
		
		supriyoDa = new JPanel();
		supriyoDa.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 255)));
		supriyoDa.setBounds(72, 82, 357, 369);
		supriyoDa.setBackground(new java.awt.Color(240, 245, 95));
		contentPane.add(jlsup);
		contentPane.add(supriyoDa);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 255, 0)));
		panel_2.setBounds(70, 461, 362, 136);
		contentPane.add(panel_2);
		panel_2.setBackground(new java.awt.Color(9, 16, 61));
		panel_2.setLayout(null);
		
		JLabel supriyolabel = new JLabel("Supriyo Da(Co-Founder, Teacher at IIA)");
		supriyolabel.setBounds(14, 10, 360, 23);
		supriyolabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		supriyolabel.setForeground(new java.awt.Color(26, 117, 255));
		supriyolabel.setForeground(new java.awt.Color(250, 250, 250)); 
		panel_2.add(supriyolabel);
		
		JLabel lblBscComputer = new JLabel(">BSc Comp. Science(Hons),  Gurudas College");
		lblBscComputer.setForeground(Color.WHITE);
		lblBscComputer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBscComputer.setBounds(6, 36, 364, 23);
		panel_2.add(lblBscComputer);
		
		JLabel lblMscCs = new JLabel(">MSc Comp. Science at Surendranath College");
		lblMscCs.setForeground(Color.WHITE);
		lblMscCs.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMscCs.setBounds(6, 60, 364, 23);
		panel_2.add(lblMscCs);
		
		JLabel lblComputerTeacher = new JLabel(">Computer Teacher at Rabindra Path Bhavan");
		lblComputerTeacher.setForeground(Color.WHITE);
		lblComputerTeacher.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblComputerTeacher.setBounds(6, 84, 360, 23);
		panel_2.add(lblComputerTeacher);
		
		JLabel lblAcademy = new JLabel("   Academy (2021 - Present)");
		lblAcademy.setForeground(Color.WHITE);
		lblAcademy.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAcademy.setBounds(6, 107, 360, 23);
		panel_2.add(lblAcademy);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.YELLOW));
		panel_3.setBackground(new Color(9, 16, 61));
		panel_3.setBounds(1021, 457, 361, 141);
		contentPane.add(panel_3);
		
		biswalabel_1 = new JLabel("Biswajit Da(Founder and Teacher at IIA)");
		biswalabel_1.setForeground(Color.WHITE);
		biswalabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		biswalabel_1.setBounds(10, 10, 350, 23);
		panel_3.add(biswalabel_1);
		
		JLabel dadaqualification1 = new JLabel("> BSc Computer Science (Honours) at CU");
		dadaqualification1.setFont(new Font("Tahoma", Font.BOLD, 15));
		dadaqualification1.setForeground(Color.WHITE);
		dadaqualification1.setBounds(10, 37, 331, 23);
		panel_3.add(dadaqualification1);
		
		JLabel lblBtechCse = new JLabel("> B.Tech CSE at Rajabazar Science College");
		lblBtechCse.setForeground(Color.WHITE);
		lblBtechCse.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBtechCse.setBounds(10, 61, 341, 23);
		panel_3.add(lblBtechCse);
		
		JLabel lblMtechCseAt = new JLabel("> M.Tech CSE at Rajabazar Science College");
		lblMtechCseAt.setForeground(Color.WHITE);
		lblMtechCseAt.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMtechCseAt.setBounds(10, 85, 360, 23);
		panel_3.add(lblMtechCseAt);
		
		JLabel lblSystemEngineer = new JLabel("> System Engineer at TCS (2020 - Present)");
		lblSystemEngineer.setForeground(Color.WHITE);
		lblSystemEngineer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSystemEngineer.setBounds(10, 108, 360, 23);
		panel_3.add(lblSystemEngineer);
		
		
		
		
	}
}


































