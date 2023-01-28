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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.CardLayout;
public class Login extends JFrame  {

	private JPanel contentPane, registerPanel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Font fn, fn1, fn2, fn3, fn4, fn5;
	private JLabel jl, jl2, jl3, jl4, jl5, L, L1, L2, jllogin, jlreg, jlforget, jllogout;
	private JTextField t1;
	private JPasswordField p;
	private Button show, hide;
	private JButton login, reset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		// fonts
		fn = new Font("Tahoma", Font.BOLD, 16);
		fn1 = new Font("Tahoma", Font.BOLD, 26);
		fn2 = new Font("Lato Black", Font.ITALIC,12);
		fn4 = new Font("Tahoma", Font.BOLD,12);
		fn3 = new Font("Tahoma", Font.BOLD,15);
		fn5 = new Font("Tahoma", Font.BOLD,20);
		
		
		// close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// frame display
		setSize(609,369);
		setResizable(false);
		getContentPane().setLayout(null);      
		setLocationRelativeTo(null);
		setTitle("Login");
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new java.awt.Color(187, 235, 250));
		
		// Username 
		L=new JLabel("Username");
		L.setBounds(307, 66, 400, 40);
		L.setFont(fn5);
		 L.setForeground(new java.awt.Color(26, 117, 255));
	      
		
		// username condition
        jl2 = new JLabel("* Username should be between 6 - 15 characters.");
        jl2.setBounds(287, 135, 320, 15);
        jl2.setFont(fn2);
       
		
		//password
		L1=new JLabel("Password");
		L1.setBounds(307,151,400,40);
		L1.setFont(fn5);
		L1.setForeground(new java.awt.Color(26, 117, 255));
	     
		
		// username textfield
		t1=new JTextField(15);
        t1.setBounds(287,106,290,25);
        t1.setFont(fn3);
//        t1.setForeground(new java.awt.Color(64, 64, 64));
//        t1.setFont(new Font("Tahoma", Font.BOLD, 15));
		t1.setForeground(new java.awt.Color(104, 108, 110));
	     
        
        
        // passwordfield
        p=new JPasswordField(15);
        p.setBounds(287,191,200,25);
        p.setForeground(new java.awt.Color(64, 64, 64));
        p.setFont(fn3);
        p.setForeground(new java.awt.Color(104, 108, 110));
        // show button
        show = new Button("show");
		show.setBounds(493, 191, 40, 25);
		show.setFont(fn4);
		show.setBackground(new java.awt.Color(51,51,51));
		show.setForeground(Color.white);
		
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setEchoChar((char)0);
			}
		});
		
		// password warning
		jl3 = new JLabel("* Password should be more than 6 characters.");
        jl3.setBounds(277, 221, 320, 15);
        jl3.setFont(fn2);
        
        jl4 = new JLabel(" must contain letters (upper and lower case), numbers,");
        jl4.setBounds(277, 236, 320, 15);
        jl4.setFont(fn2);
        
        jl5 = new JLabel(" and special symbols(%, $, @, *)");
        jl5.setBounds(277, 251, 320, 15);
        jl5.setFont(fn2);
        
		
		// hide button
		hide = new Button("hide");
		hide.setBounds(537, 191, 40, 25);
		hide.setFont(fn4);
		hide.setBackground(new java.awt.Color(51,51,51));
		hide.setForeground(Color.white);
		
		
		hide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setEchoChar('*');
			}
		});
		
		
		
	    // image
	 	  ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Resources/locklogin.png"));
	      Image bimg = img.getImage().getScaledInstance(220, 256, Image.SCALE_DEFAULT);
	      ImageIcon image = new ImageIcon(bimg);
	      
	      jl = new JLabel(image);
	      jl.setBounds(44, 66, 220, 256);
	      
	      registerPanel = new JPanel();
	  	registerPanel.setBounds(64, 11, 521, 45);
		registerPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLUE));
		registerPanel.setLayout(null);
//		registerPanel.setBackground(new java.awt.Color(250, 245, 247));
		registerPanel.setBackground(new java.awt.Color(13, 37, 219));
		contentPane.add(registerPanel);
		
		
		L2=new JLabel("-- Inside Inspiration Academy --");
		L2.setForeground(new java.awt.Color(26, 117, 255));
		L2.setBounds(45, 0, 500, 40);
		L2.setFont(fn1);
//		 L2.setForeground(new java.awt.Color(26, 117, 255));
		L2.setForeground(new java.awt.Color(250, 250, 250));
		 registerPanel.add(L2);
	      
		
	      
	      
	      
	     
        
        
		
		
	      login = new JButton("Login");
	      login.setBounds(280, 285, 89, 23);
	      login.setFont(new Font("Tahoma", Font.BOLD, 17));
	      login.setBackground(new java.awt.Color(51,51,51));
	      login.setForeground(Color.white);
			contentPane.add(login);
			login.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("This is Login button");
					
					
					String username = t1.getText().trim();
					String password = p.getText().trim();
					try {
						Connection con = DatabaseConnection.getConnection();
						String s = "select * from Login where Username=? and Password=?";
						PreparedStatement ps = con.prepareStatement(s);
						ps.setString(1, username);
						ps.setString(2, password);
						ResultSet rs = ps.executeQuery();
						
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, "Welcome to Inside Inspiration Academy :)");
							dispose();
							HomePage home = new HomePage();
							home.main(null);
							
						}
						else {
							JOptionPane.showMessageDialog(null, "Invalid Username or Password");
						}
						
					}catch(Exception e1) {
						System.out.println(e1.getMessage());
					}
					
				
				}
			});
			
			
			
			 reset = new JButton("Reset");
			 reset.setBounds(480, 285, 89, 23);
			 reset.setFont(new Font("Tahoma", Font.BOLD, 17));
			 reset.setBackground(new java.awt.Color(51,51,51));
			 reset.setForeground(Color.white);
				contentPane.add(reset);
				reset.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						t1.setText("");
						p.setText("");
					}
				});
			
			
			
	      
	      
	      
		// add to frame
		contentPane.add(L);
		contentPane.add(L1);
		contentPane.add(jl2);
		contentPane.add(t1);
		contentPane.add(p);
		contentPane.add(show);
		contentPane.add(hide);
		contentPane.add(jl3);
		contentPane.add(jl4);
		contentPane.add(jl5);
		contentPane.add(jl);
	
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(0, 10, 56, 312);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLUE));
		panel_1.setBounds(265, 66, 320, 256);
		contentPane.add(panel_1);
		panel_1.setBackground(new java.awt.Color(250, 245, 247));
		panel_1.setLayout(new CardLayout(0, 0));
		
		
		
		 // Nav Login
	 	  ImageIcon imglogin = new ImageIcon(ClassLoader.getSystemResource("Resources/Login.png"));
	      Image bimglogin = imglogin.getImage().getScaledInstance(52, 52, Image.SCALE_DEFAULT);
	      ImageIcon imagelogin = new ImageIcon(bimglogin);
	      
	      jllogin = new JLabel(imagelogin);
	      jllogin.setBounds(29, 7, 0, 0);
	      
	      
	      // Nav registration
	 	  ImageIcon imgreg = new ImageIcon(ClassLoader.getSystemResource("Resources/registration.png"));
	      Image bimgreg = imgreg.getImage().getScaledInstance(52, 52, Image.SCALE_DEFAULT);
	      ImageIcon imagereg = new ImageIcon(bimgreg);
	      
	      jlreg = new JLabel(imagereg);
	      jlreg.setBounds(34, 7, 50, 50);
	      jlreg.addMouseListener(new MouseAdapter() {
		      	@Override
		      	public void mouseClicked(MouseEvent e) {
		      		dispose();
		      		NewRegistration newreg = new NewRegistration();
		      		newreg.main(null);
		      	}
		      });
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
	      
		
//		USERNAME        PASSWORD
//		--------------- ---------------
//		Admin           Admin2356@
		
	}
}



