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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

public class ForgetPassword extends JFrame {

	private JPanel contentPane, registerPanel;
	private JTextField username_txt, email_txt;
	private JLabel jl, username, emailid, pswrd, jllogin, jlreg, jlforget, jllogout, L2, l10;
	private JButton showPassword;
	private JPasswordField pswrd_txt;
	private Button show;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgetPassword frame = new ForgetPassword();
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
	
public static boolean EmailValidate(String str) {
		
		String valiEmail =  "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat = Pattern.compile(valiEmail, Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(str);
		return matcher.find();
		
	}
	
	public ForgetPassword() {
		
		// close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// frame
		setSize(614,387);
		setResizable(false);
		getContentPane().setLayout(null);      
		setLocationRelativeTo(null);
		setTitle("Forget Password");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new java.awt.Color(187, 235, 250));
		contentPane.setLayout(null);
		
		// image section
		 ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Resources/forget.png"));
	      Image bimg = img.getImage().getScaledInstance(230, 224, Image.SCALE_DEFAULT);
	      ImageIcon image = new ImageIcon(bimg);
	      
	      jl = new JLabel(image);
	      jl.setBounds(357, 66, 230, 221);
		
		// username
		username= new JLabel("Enter Your Username *");
		username.setFont(new Font("Tahoma", Font.BOLD, 17));
		username.setForeground(new java.awt.Color(11, 107, 156));
		username.setBounds(80, 76, 214, 27);
		
		// usernam txtfld
		username_txt = new JTextField();
		username_txt.setBounds(80, 109, 260, 27);
		username_txt.setFont(new Font("Tahoma", Font.BOLD, 15));
		username_txt.setForeground(new java.awt.Color(104, 108, 110));
		
		// email id 
		emailid = new JLabel("Enter Your Mail Id *");
		emailid.setFont(new Font("Tahoma", Font.BOLD, 17));
		emailid.setForeground(new java.awt.Color(11, 107, 156));
		emailid.setBounds(80, 152, 182, 27);
		
		// email txtfld
		email_txt = new JTextField();
		email_txt.setBounds(80, 185, 260, 27);
		email_txt.setColumns(10);
		email_txt.setFont(new Font("Tahoma", Font.BOLD, 15));
		email_txt.setForeground(new java.awt.Color(104, 108, 110));
		
		//mandetory
		 l10 = new JLabel("* Fields are mandetory");
         l10.setBounds(80, 220, 180, 20);
         contentPane.add(l10);
         l10.setFont(new Font("Tahoma", Font.PLAIN, 13));
         l10.setForeground(new java.awt.Color(255, 51, 51));
		
		showPassword = new JButton("Show Your Password");
		showPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		showPassword.setBounds(80, 244, 260, 30);
		showPassword.setBackground(new java.awt.Color(51,51,51));
		showPassword.setForeground(Color.white);
		showPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("This is Show password button");
				String username = username_txt.getText();
				String email = "";
				if(EmailValidate(email_txt.getText())) {
					 email = email_txt.getText();
//					 System.out.println("Email correct");
					 try {
							Connection con = DatabaseConnection.getConnection();
							String s = "select Password from newregistration where Username=? and Email=?";
							PreparedStatement ps = con.prepareStatement(s);
							ps.setString(1, username);
							ps.setString(2, email);
							
							ResultSet rs = ps.executeQuery();
							
							if(rs.next()) {
								pswrd_txt.setText(rs.getString("Password"));
								show.show();
							}
							else {
								JOptionPane.showMessageDialog(null, "Wrong Username or Password!");
								pswrd_txt.setText("");
							}
							
//							if(rs.getString("Username").equals(username) && rs.getString("Email").equals(email)) {
//								while(rs.next()) {
//									pswrd_txt.setText(rs.getString("Password"));
//								}
//							}
//							else {
//								JOptionPane.showMessageDialog(null, "Wrong Username or Password!");
//							}
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null, e.getMessage());
							username_txt.setText("");
							email_txt.setText("");
							e.printStackTrace();
						}
				}
				else {
//					System.out.println("Email incorrect");
					JOptionPane.showMessageDialog(null, "Invalid Email!! Please put Correct Email");
					
				}
			
				
				
			}
		});
		
		// show the pswrd
		pswrd = new JLabel("Your Password ->");
		pswrd.setFont(new Font("Tahoma", Font.BOLD, 18));
		pswrd.setForeground(new java.awt.Color(11, 107, 156));
		pswrd.setBounds(80, 306, 170, 27);
		
		// pswrd txtfld
		pswrd_txt = new JPasswordField();
		pswrd_txt.setBounds(250, 307, 251, 28);
		pswrd_txt.setFont(new Font("Tahoma", Font.BOLD, 15));
		pswrd_txt.setForeground(new java.awt.Color(104, 108, 110));
		
		// show button
		 show = new Button("Show");
			show.setBounds(510, 306, 60, 27);
			show.setFont(new Font("Tahoma", Font.BOLD, 14));
			show.setBackground(new java.awt.Color(51,51,51));
			show.setForeground(Color.white);
			
			show.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pswrd_txt.setEchoChar((char)0);
				}
			});
			show.hide();
		
		//add component to the frame
		contentPane.add(jl);
		contentPane.add(username);
		contentPane.add(username_txt);
		contentPane.add(emailid);
		contentPane.add(email_txt);
		contentPane.add(showPassword);
		contentPane.add(pswrd);
		contentPane.add(pswrd_txt);
		contentPane.add(show);
		
		panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
		panel.setBounds(70, 66, 279, 220);
		panel.setBackground(new java.awt.Color(250, 245, 247));
		contentPane.add(panel);
		
		panel_1 = new JPanel();
		panel_1.setBounds(72, 296, 514, 47);
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
		panel_1.setBackground(new java.awt.Color(250, 245, 247));
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBounds(0, 10, 60, 333);
		panel_2.setBackground(Color.WHITE);
		contentPane.add(panel_2);
		
		
		   registerPanel = new JPanel();
		  	registerPanel.setBounds(71, 11, 516, 45);
			registerPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLUE));
			registerPanel.setLayout(null);
			registerPanel.setBackground(new java.awt.Color(13, 37, 219));
			contentPane.add(registerPanel);
			
			
			L2=new JLabel("-- Inside Inspiration Academy --");
			L2.setBounds(40, 0, 499, 40);
			L2.setForeground(new java.awt.Color(250, 250, 250));
			L2.setFont(new Font("Tahoma", Font.BOLD, 26));
			 registerPanel.add(L2);
		 
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
	      jlreg.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		dispose();
	      		NewRegistration newreg = new NewRegistration();
	      		newreg.main(null);
	      	}
	      });
	      jlreg.setBounds(34, 7, 50, 50);
	     
	      // Nav forget Password
	 	  ImageIcon imgforget = new ImageIcon(ClassLoader.getSystemResource("Resources/forgetPassword.png"));
	      Image bimgforget = imgforget.getImage().getScaledInstance(52, 52, Image.SCALE_DEFAULT);
	      ImageIcon imageforget = new ImageIcon(bimgforget);
	      
	      jlforget = new JLabel(imageforget);
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
	      
	      
	      panel_2.add(jllogin);
	      panel_2.add(jlreg);
	      panel_2.add(jlforget);
	      panel_2.add(jllogout);
		
		
		
		
		
		
		
		
	}
}