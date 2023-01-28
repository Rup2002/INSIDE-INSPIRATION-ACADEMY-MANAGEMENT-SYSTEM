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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class NewRegistration extends JFrame {

	// todo -> Email Validation
	private JPanel contentPane,registerPanel,fillPanel;
	private JTextField  t3,  t6;
	private Font fn,fn1,fn2,fn3, fn4, fn5, fn6, fn7, fn8;
	private JLabel jl, jl2, jl3, jl4, jl5, l10, L, L1, L2, L3, L4, L5, L6, jllogin, jlreg, jlforget, jllogout;
	
	private JButton save, cancel;
	private Button show, hide;
	
	// security for studentRecord
	public JTextField t1, t2, t4;
	public JPasswordField p;
	private JPanel panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewRegistration frame = new NewRegistration();
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
	public NewRegistration() {
		
		// fonts
		fn = new Font("Tahoma", Font.BOLD, 16);
		fn1 = new Font("Tahoma", Font.BOLD, 30);
		fn2 = new Font("Tahoma", Font.BOLD,17);
		fn3 = new Font("Tahoma", Font.BOLD,15);
		fn4 = new Font("Tahoma", Font.BOLD, 20);
		fn5 = new Font("Tahoma", Font.BOLD,12);
		fn6 = new Font("Lato Black", Font.ITALIC,12);
		fn7 = new Font("Tahoma", Font.BOLD, 15);
		fn8 = new Font("Tahoma", Font.PLAIN, 13);
		
		// close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// frame size
		setSize(905,600);
		setResizable(false);
		getContentPane().setLayout(null);       
		setLocationRelativeTo(null);
		setTitle("New User Registration");
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new java.awt.Color(190, 230, 250));
		
		
		// new User Registration panel
		registerPanel = new JPanel();
		registerPanel.setBounds(371, 11, 510, 45);
		registerPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLUE));
//		registerPanel.setBackground(new java.awt.Color(250, 250, 250));
		registerPanel.setBackground(new java.awt.Color(13, 37, 219));
		registerPanel.setLayout(null);
		
		
		L=new JLabel("--- New User Registration ---");
		L.setBounds(40, 0, 500, 40);
		L.setFont(fn1);
		L.setForeground(new java.awt.Color(250, 250, 250));
		 registerPanel.add(L);
        
		// username warning
		 jl2 = new JLabel("* Username should be between 3 - 15 characters.");
	     jl2.setBounds(496, 319, 320, 15);
	     jl2.setFont(fn6);
	       
        jl3 = new JLabel("* Password should be more than 2 characters must contain letters");
        jl3.setBounds(496,394,375,15);
        jl3.setFont(fn6);
        
        jl4 = new JLabel("numbers, and special symbols(%, $, @, !)");
        jl4.setBounds(496, 408, 375, 15);
        jl4.setFont(fn6);
         
         
         // passwrd show btn
         show = new Button("show");
		show.setBounds(781, 355, 40, 25);
		show.setFont(fn5);
		show.setBackground(new java.awt.Color(51,51,51));
		show.setForeground(Color.white);
		
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setEchoChar((char)0);
			}
		});
		
		// passwrd hide btn
		  hide = new Button("hide");
		hide.setBounds(826, 355, 40, 25);
		hide.setFont(fn5);
		hide.setBackground(new java.awt.Color(51,51,51));
		hide.setForeground(Color.white);
		
		hide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setEchoChar('*');
			}
		});
        // save button
    	
		save = new JButton("Save");
		save.setFont(new Font("Tahoma", Font.BOLD, 17));
		save.setBounds(421, 504, 89, 30);
		save.setBackground(new java.awt.Color(51,51,51));
		save.setForeground(Color.white);
		
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				System.out.println("This is Save Button");
				String name = t1.getText().trim()+" "+ t2.getText().trim();
				String email = "";
				if(EmailValidate(t3.getText())) {
					 email = t3.getText();
//					 System.out.println("Email correct");
					 String username = t4.getText();
						String pswrd = null;
						if(name.equals("") || email.equals("") || username.equals("")) {
							JOptionPane.showMessageDialog(null, "'*' Fields are required");
						}
//						
//						
							if(p.getText().equals(t6.getText()) && p.getText() !=null ) {
								pswrd = p.getText();
//								System.out.println(name);
//								System.out.println(email);
//								System.out.println(username);
//								System.out.println(pswrd);
								
								try {
									Connection con = DatabaseConnection.getConnection();
									String s = "insert into NewRegistration values(?,?,?,?)";
									PreparedStatement ps = con.prepareStatement(s);
									ps.setString(1, name);
									ps.setString(2, email);
									ps.setString(3, username);
									ps.setString(4, pswrd);
									
									
									ps.executeUpdate() ;
										
									
									JOptionPane.showMessageDialog(null, name+" succesfully added to the Database");
									t1.setText("");
									t2.setText("");
									t3.setText("");
									t4.setText("");
									p.setText("");
									t6.setText("");
									
									
								Connection con1 = DatabaseConnection.getConnection();
								String s1 = "insert into login values(?,?)";
								PreparedStatement ps1 = con1.prepareStatement(s1);
								ps1.setString(1, username);
								ps1.setString(2, pswrd);
								
								ps1.executeUpdate();
								
								
								

								}catch(Exception e) {
									
									e.printStackTrace();
									JOptionPane.showMessageDialog(null, " Oops!! not added to the Database");
									
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "Password and Confirm Password Field must be same!");
								t6.setText("");
//								t3.setText("");
							}
				}
				else {
//					System.out.println("Email incorrect");
					JOptionPane.showMessageDialog(null, name+" Invalid Email!! Please put Correct Email");
					t3.setText("");
					
				}
				
					
					
			}
		});
		
		// cancel button
		cancel = new JButton("Reset");
		cancel.setFont(new Font("Tahoma", Font.BOLD, 17));
		cancel.setBounds(746, 504, 117, 30);
		cancel.setBackground(new java.awt.Color(51,51,51));
		cancel.setForeground(Color.white);
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				p.setText("");
				t6.setText("");
			}
		});
		
		
		// image
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Resources/newuser2.png"));
		Image bimg = img.getImage().getScaledInstance(390, 561, Image.SCALE_DEFAULT);
		ImageIcon image = new ImageIcon(bimg);
		jl = new JLabel(image);
		jl.setBounds(31, -10, 390, 561);
		
		
		//aad to frame
		contentPane.add(jl2);
		contentPane.add(jl3);
		contentPane.add(jl4);
		contentPane.add(registerPanel);
		contentPane.add(save);
		contentPane.add(cancel);
		contentPane.add(show);
		contentPane.add(hide);
		contentPane.add(jl);
		
		fillPanel = new JPanel();
		fillPanel.setBounds(371, 63, 510, 489);
		fillPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLUE));
		fillPanel.setBackground(new java.awt.Color(250, 250, 250));
		fillPanel.setLayout(null);
		contentPane.add(fillPanel);
		
		
		// firstname
		L1=new JLabel("First Name *");
		L1.setBounds(10, 10, 400, 40);
		fillPanel.add(L1);
		L1.setFont(fn2);
		L1.setForeground(new java.awt.Color(11, 107, 156));
		
		
		// last name
		L2=new JLabel("Last Name *");
		L2.setBounds(10, 74, 400, 40);
		fillPanel.add(L2);
		L2.setFont(fn2);
		L2.setForeground(new java.awt.Color(11, 107, 156));
		
	     
	     
		// email
		L3=new JLabel("Email Id *");
		L3.setBounds(10, 146, 400, 40);
		fillPanel.add(L3);
		L3.setFont(fn2);
		L3.setForeground(new java.awt.Color(11, 107, 156));
		
		
		// username
		L4=new JLabel("Username *");
		L4.setBounds(10, 217, 400, 40);
		fillPanel.add(L4);
		L4.setFont(fn2);
		L4.setForeground(new java.awt.Color(11, 107, 156));
		
		
		// password
		L5=new JLabel("Password *");
		L5.setBounds(10, 286, 400, 40);
		fillPanel.add(L5);
		L5.setFont(fn2);
		L5.setForeground(new java.awt.Color(11, 107, 156));
		
	        
		// conform password
		L6=new JLabel("Confirm Password *");
		L6.setBounds(10, 376, 400, 40);
		fillPanel.add(L6);
		L6.setFont(fn2);
		L6.setForeground(new java.awt.Color(11, 107, 156));
		
		
		// cnfrm pswrd txtfld
		  t6=new JTextField();
		  t6.setBounds(189, 383, 311, 30);
		  fillPanel.add(t6);
		  t6.setFont(fn7);
		  t6.setForeground(new java.awt.Color(104, 108, 110));
		  
		// password txtfld
		 p =new JPasswordField();
		 p.setBounds(125, 293, 280, 30);
		 fillPanel.add(p);
		 p.setFont(fn);
		 p.setFont(fn7);
		 p.setForeground(new java.awt.Color(104, 108, 110));
		 
		
		// usernm txtfld
		t4=new JTextField();
		t4.setBounds(125, 224, 375, 30);
		fillPanel.add(t4);
		t4.setFont(fn7);
		t4.setForeground(new java.awt.Color(104, 108, 110));
		
		
		// eml txtfld
		t3=new JTextField();
		t3.setBounds(125, 153, 375, 30);
		fillPanel.add(t3);
		t3.setFont(fn7);
		t3.setForeground(new java.awt.Color(104, 108, 110));
		
		// lstnm txtfld
		 t2=new JTextField();
		 t2.setBounds(125, 81, 375, 30);
		 fillPanel.add(t2);
		 t2.setFont(fn7);
		 t2.setForeground(new java.awt.Color(104, 108, 110));
		 
		
		// frstnm txtfld
        t1=new JTextField();
        t1.setBounds(125, 17, 375, 30);
        fillPanel.add(t1);
        t1.setFont(fn7);
        t1.setForeground(new java.awt.Color(104, 108, 110));
        
        // mandetory field warnings
         l10 = new JLabel("* Fields are mandetory");
         l10.setBounds(367, 469, 180, 20);
         fillPanel.add(l10);
         l10.setFont(fn8);
         l10.setForeground(new java.awt.Color(255, 51, 51));
         
         panel = new JPanel();
         panel.setBorder(null);
         panel.setBounds(0, 10, 61, 541);
         panel.setBackground(Color.WHITE);
         contentPane.add(panel);
//         panel.setLayout(null);
         
         // Nav Login
	 	  ImageIcon imglogin = new ImageIcon(ClassLoader.getSystemResource("Resources/Login.png"));
	      Image bimglogin = imglogin.getImage().getScaledInstance(52, 52, Image.SCALE_DEFAULT);
	      ImageIcon imagelogin = new ImageIcon(bimglogin);
	      
	      jllogin = new JLabel(imagelogin);
	      jllogin.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		dispose();
	      		Login login = new Login();
	      		login.main(null);
	      	}
	      });
	      jllogin.setBounds(29, 7, 0, 0);
	      
	      
	      // Nav registration
	 	  ImageIcon imgreg = new ImageIcon(ClassLoader.getSystemResource("Resources/registration.png"));
	      Image bimgreg = imgreg.getImage().getScaledInstance(52, 52, Image.SCALE_DEFAULT);
	      ImageIcon imagereg = new ImageIcon(bimgreg);
	      
	      jlreg = new JLabel(imagereg);
	      jlreg.setBounds(34, 7, 50, 50);
	     
	      // Nav forget Password
	 	  ImageIcon imgforget = new ImageIcon(ClassLoader.getSystemResource("Resources/forgetPassword.png"));
	      Image bimgforget = imgforget.getImage().getScaledInstance(52, 52, Image.SCALE_DEFAULT);
	      ImageIcon imageforget = new ImageIcon(bimgforget);
	      
	      jlforget = new JLabel(imageforget);
	      jlforget.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		dispose();
	      		ForgetPassword forget = new ForgetPassword();
	      		forget.main(null);
	      	}
	      });
	      jlforget.setBounds(29, 7, 0, 0);
	      
	      // Nav logout
	 	  ImageIcon imglogout = new ImageIcon(ClassLoader.getSystemResource("Resources/logout1.png"));
	      Image bimglogout = imglogout.getImage().getScaledInstance(53, 55, Image.SCALE_DEFAULT);
	      ImageIcon imagelogout = new ImageIcon(bimglogout);
	      
	      jllogout = new JLabel(imagelogout);
	      jllogout.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		int response1 = JOptionPane.showConfirmDialog(null, "Do you want to Close ?","Logout", JOptionPane.YES_NO_OPTION);
	      		if(response1 == JOptionPane.YES_OPTION) {
	      			dispose();
		      		System.exit(0);
	      		}
	      		else {
	      			
	      		}
	      	}
	      });
	      jllogout.setBounds(49, 7, 0, 0);
	      
	      
	      panel.add(jllogin);
	      panel.add(jlreg);
	      panel.add(jlforget);
	      panel.add(jllogout);
	      
		
	}
}