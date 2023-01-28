package FrontEnd;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.Icon;

public class AboutUs extends JFrame{

	private JFrame frame;
	private JPanel contentPane, navPanel, photo, panel_2;
	private JLabel jllog, jlabout, jlpayment1, jlpayment,jlcurri, jllogout, jlforget, jlreg, jllogin, jl, jl1, jl2, jl3, jl4, jl5; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
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
	public AboutUs() {
		// close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// frame size
		setBounds(100,100,1070,677);
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
		
		JPanel panel = new JPanel();
		panel.setBounds(88, 11, 955, 60);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
		panel.setBackground(new java.awt.Color(250, 245, 247));
		panel.setBackground(new java.awt.Color(13, 37, 219));
		panel.setLayout(null);
		contentPane.add(panel);
		
		JLabel lbl = new JLabel("--- Inside Inspiration Academy > About Us ---");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 34));
		lbl.setForeground(new java.awt.Color(26, 117, 255));
		lbl.setBounds(10, 10, 924, 35);
		lbl.setForeground(new java.awt.Color(250, 250, 250));
		panel.add(lbl);
		
		
		JPanel body = new JPanel();
		//body.setBorder(new LineBorder(new Color(13, 37, 219), 3));
		body.setBorder(new EmptyBorder(5, 5, 5, 5));
		body.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
		body.setBackground(new java.awt.Color(250,250,250));
		body.setBounds(88, 82, 955, 545);
		contentPane.add(body);
		body.setLayout(null);
		
		
		
		JLabel developer = new JLabel("Developers >>  ");
		developer.setBounds(22, 223, 359, 49);
		developer.setFont(new Font("Tahoma", Font.BOLD, 30));
		developer.setBackground(new Color(0, 0, 0));
		developer.setForeground(Color.BLUE);
		body.add(developer);
		
		 photo = new JPanel();
		photo.setBounds(22, 283, 176, 201);
		photo.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
		photo.setBackground(new java.awt.Color(250,250,250));
		body.add(photo);
		photo.setLayout(null);
		
		// image section
	 ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("Resources/me.jpg"));
      Image bimg1 = img1.getImage().getScaledInstance(190, 210, Image.SCALE_DEFAULT);
      ImageIcon image1 = new ImageIcon(bimg1);
      
      jl1 = new JLabel(image1);
      jl1.setBounds(1, 1, 175, 200);
      
      photo.add(jl1);
		
		
		JLabel about = new JLabel("Inside Inspiration Academy is a dream place for every student who loves to learn ");
		about.setBounds(20, 5, 769, 36);
		about.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 19));
		about.setBackground(new Color(0, 0, 0));
		about.setForeground(new Color(0, 0, 0));
		
		
		JLabel about_1 = new JLabel("theoretical education center. We always try to provide the practical knowledge along");
		about_1.setBounds(5, 60, 792, 36);
		about_1.setForeground(Color.BLACK);
		about_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 19));
		about_1.setBackground(Color.BLACK);
		
		
		JLabel about_2 = new JLabel("with the theoretical studies of each and every subject and this academy welcomes ");
		about_2.setBounds(20, 88, 769, 36);
		about_2.setForeground(Color.BLACK);
		about_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 19));
		about_2.setBackground(Color.BLACK);
		
		
		JLabel about_3 = new JLabel("everyone. So,come and join us the earliest.");
		about_3.setBounds(17, 117, 769, 36);
		about_3.setForeground(Color.BLACK);
		about_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 19));
		about_3.setBackground(Color.BLACK);
		
		
		JLabel about_4 = new JLabel("Contact us now: +91-7003254546 /+91-8910061600");
		about_4.setForeground(Color.RED);
		about_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		about_4.setBackground(Color.BLUE);
		about_4.setBounds(12, 157, 769, 36);
		

		
		JPanel photo_5 = new JPanel();
		photo_5.setBorder(new EmptyBorder(5, 5, 5, 5));
		photo_5.setBackground(new Color(250, 250, 250));
		photo_5.setBorder(new EmptyBorder(5, 5, 5, 5));
		photo_5.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
		photo_5.setBounds(766, 10, 176, 203);
		body.add(photo_5);
		photo_5.setLayout(null);
	
		// image section
		 ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Resources/inside_logo.jpg"));
	      Image bimg = img.getImage().getScaledInstance(202, 202, Image.SCALE_DEFAULT);
	      ImageIcon image = new ImageIcon(bimg);
	      
	      jl = new JLabel(image);
	      jl.setBounds(0, 0, 176, 202);
	      
	      photo_5.add(jl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.PINK));
		panel_1.setBounds(10, 10, 752, 203);
		panel_1.setBackground(new java.awt.Color(255, 252, 255));
		body.add(panel_1);
		panel_1.setLayout(null);
		panel_1.add(about);
		panel_1.add(about_1);
		panel_1.add(about_2);
		panel_1.add(about_3);
		panel_1.add(about_4);
		
		JLabel lblAndCreateA = new JLabel("and create a proper position in the field of computer science.It is not like a typical \r\n");
		lblAndCreateA.setForeground(Color.BLACK);
		lblAndCreateA.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 19));
		lblAndCreateA.setBackground(Color.BLACK);
		lblAndCreateA.setBounds(16, 32, 769, 36);
		panel_1.add(lblAndCreateA);
		
		JLabel lblNewLabel = new JLabel("_____________________________________________________________________________");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(22, 237, 924, 55);
		body.add(lblNewLabel);
		
		JPanel photo_1 = new JPanel();
		photo_1.setLayout(null);
		photo_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
		photo_1.setBackground(new Color(250, 250, 250));
		photo_1.setBounds(208, 283, 176, 201);
		body.add(photo_1);
		
		
//		
//		JLabel jl1_1 = new JLabel((Icon) null);
//		jl1_1.setBounds(1, 1, 175, 200);
//		photo_1.add(jl1_1);
//		
		 ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("Resources/tiasa2.jpeg"));
	      Image bimg2 = img2.getImage().getScaledInstance(195, 220, Image.SCALE_DEFAULT);
	      ImageIcon image2 = new ImageIcon(bimg2);
	      
	      jl2 = new JLabel(image2);
	      jl2.setBounds(1, 1, 195, 200);
	      
	      photo_1.add(jl2);
		
		
		JPanel photo_2 = new JPanel();
		photo_2.setLayout(null);
		photo_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
		photo_2.setBackground(new Color(250, 250, 250));
		photo_2.setBounds(394, 283, 176, 201);
		body.add(photo_2);
		
		
		 ImageIcon img3 = new ImageIcon(ClassLoader.getSystemResource("Resources/rupsha.jpg"));
	      Image bimg3 = img3.getImage().getScaledInstance(215, 215, Image.SCALE_DEFAULT);
	      ImageIcon image3 = new ImageIcon(bimg3);
	      
	      jl3 = new JLabel(image3);
	      jl3.setBounds(1, 1, 175, 200);
	      
	      photo_2.add(jl3);
		
		
		
		
		JLabel jl1_2 = new JLabel((Icon) null);
		jl1_2.setBounds(1, 1, 175, 200);
		photo_2.add(jl1_2);
		
		JPanel photo_3 = new JPanel();
		photo_3.setLayout(null);
		photo_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
		photo_3.setBackground(new Color(250, 250, 250));
		photo_3.setBounds(580, 283, 176, 201);
		body.add(photo_3);
		
		 ImageIcon img4 = new ImageIcon(ClassLoader.getSystemResource("Resources/sandy.jpg"));
	      Image bimg4 = img4.getImage().getScaledInstance(195, 200, Image.SCALE_DEFAULT);
	      ImageIcon image4 = new ImageIcon(bimg4);
	      
	      jl4 = new JLabel(image4);
	      jl4.setBounds(1, 1, 175, 200);
	      
	      photo_3.add(jl4);
		
		
		JLabel jl1_3 = new JLabel((Icon) null);
		jl1_3.setBounds(1, 1, 175, 200);
		photo_3.add(jl1_3);
		
		JPanel photo_4 = new JPanel();
		photo_4.setLayout(null);
		photo_4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
		photo_4.setBackground(new Color(250, 250, 250));
		photo_4.setBounds(766, 283, 176, 201);
		body.add(photo_4);
		
		
		 ImageIcon img5 = new ImageIcon(ClassLoader.getSystemResource("Resources/Arpan.jpg"));
	      Image bimg5 = img5.getImage().getScaledInstance(185, 200, Image.SCALE_DEFAULT);
	      ImageIcon image5 = new ImageIcon(bimg5);
	      
	      jl5 = new JLabel(image5);
	      jl5.setBounds(1, 1, 175, 200);
	      
	      photo_4.add(jl5);
		
		JLabel jl1_4 = new JLabel((Icon) null);
		jl1_4.setBounds(1, 1, 175, 200);
		photo_4.add(jl1_4);
		
		
		

        
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
	      jlreg.addMouseListener(new MouseAdapter() {
		      	@Override
		      	public void mouseClicked(MouseEvent e) {
		      		dispose();
		      		StudentRecord sr = new StudentRecord();
		      		sr.main(null);
		      	}
		      });
	     
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
	      
	      
	      navPanel = new JPanel();
	      navPanel.setBorder(null);
	      navPanel.setBackground(Color.WHITE);
	      navPanel.setBounds(0, 11, 67, 616);
	      contentPane.add(navPanel);
	      
	      
	      navPanel.add(jllogin);
	      navPanel.add(jlreg);
	      navPanel.add(jlforget);
	      navPanel.add(jllogout);
	      navPanel.add(jlcurri);
	      navPanel.add(jlpayment);
	      navPanel.add(jlpayment1);
	      navPanel.add(jlabout);
	      navPanel.add(jllog);
	      
	   
	  	panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLUE));
		panel_2.setBounds(22, 494, 176, 33);
		panel_2.setBackground(new java.awt.Color(53, 95, 212));
		panel_2.setLayout(null);
		
		JLabel supriyolabel = new JLabel("Ankit Chitrakar\r\n");
		supriyolabel.setBounds(15, 5, 152, 23);
		supriyolabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		supriyolabel.setForeground(new java.awt.Color(26, 117, 255));
		supriyolabel.setForeground(new java.awt.Color(250, 250, 250)); 
		panel_2.add(supriyolabel);
		
		body .add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLUE));
		panel_2_1.setBackground(new Color(53, 95, 212));
		panel_2_1.setBounds(208, 494, 176, 33);
		body.add(panel_2_1);
		
		JLabel supriyolabel_1 = new JLabel("Tiasa Ash");
		supriyolabel_1.setForeground(Color.WHITE);
		supriyolabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		supriyolabel_1.setBounds(42, 5, 152, 23);
		panel_2_1.add(supriyolabel_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLUE));
		panel_2_2.setBackground(new Color(53, 95, 212));
		panel_2_2.setBounds(394, 494, 176, 33);
		body.add(panel_2_2);
		
		JLabel supriyolabel_2 = new JLabel("Rupsha Debnath\r\n");
		supriyolabel_2.setForeground(Color.WHITE);
		supriyolabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		supriyolabel_2.setBounds(10, 5, 157, 23);
		panel_2_2.add(supriyolabel_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLUE));
		panel_2_3.setBackground(new Color(53, 95, 212));
		panel_2_3.setBounds(580, 494, 176, 33);
		body.add(panel_2_3);
		
		JLabel supriyolabel_3 = new JLabel("Soumen Mondal\r\n");
		supriyolabel_3.setForeground(Color.WHITE);
		supriyolabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		supriyolabel_3.setBounds(15, 5, 152, 23);
		panel_2_3.add(supriyolabel_3);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setLayout(null);
		panel_2_4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLUE));
		panel_2_4.setBackground(new Color(53, 95, 212));
		panel_2_4.setBounds(766, 494, 176, 33);
		body.add(panel_2_4);
		
		JLabel supriyolabel_4 = new JLabel("Arpan Ghosh");
		supriyolabel_4.setForeground(Color.WHITE);
		supriyolabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		supriyolabel_4.setBounds(30, 5, 152, 23);
		panel_2_4.add(supriyolabel_4);
		
		
		
	}
}