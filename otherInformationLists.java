import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class otherInformationLists extends JFrame {

	private JPanel contentPane;

	static Skills obj = new Skills();//instantiate new object to call the variables from multilevel inheritance classes.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					otherInformationLists frame = new otherInformationLists(); 
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public otherInformationLists() {
		setResizable(false);
		setTitle("My Portfolio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//backIcon
		JLabel backIconLabel = new JLabel(new ImageIcon(otherInformationLists.class.getResource("/img/backIconUPdatedinvertedcolor copy.PNG")));
		backIconLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				personalInformation infos = new personalInformation(); // instantiate new object to call another JFrame.
				infos.setVisible(true);
				infos.setLocationRelativeTo(null); // putting the JFrame to the center.
				dispose(); //closing the frame.
			}

		});
		backIconLabel.setBounds(10, 11, 30, 30);
		contentPane.add(backIconLabel);

		JLabel backLabel = new JLabel("BACK");
		backLabel.addMouseListener(new MouseAdapter() { // mouse listener for clicking the JLabel.
			@Override
			public void mouseClicked(MouseEvent e) {
				personalInformation infos = new personalInformation(); // instantiate new object to call another JFrame.
				infos.setVisible(true);
				infos.setLocationRelativeTo(null); // putting the JFrame to the center.
				dispose(); // closing the JFrame.
			}

			@Override
			public void mouseEntered(MouseEvent e) {  // changing the color of the foreground when hovering.
				backLabel.setForeground(Color.GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) { // changing color of the foreground when you remove the hover.
				backLabel.setForeground(Color.WHITE);
			}
		});
		backLabel.setForeground(Color.WHITE);
		backLabel.setFont(new Font("Arial", Font.BOLD, 12));
		backLabel.setBounds(40, 15, 44, 24);
		contentPane.add(backLabel);
		
		JLabel ageLabel = new JLabel(obj.Age); //label for age
		ageLabel.setForeground(new Color(0, 0, 0));
		ageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		ageLabel.setBounds(516, 49, 46, 14);
		contentPane.add(ageLabel);
		
		JLabel birthdayLabel = new JLabel(obj.Birthday); //label for birthday
		birthdayLabel.setForeground(new Color(0, 0, 0));
		birthdayLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		birthdayLabel.setBounds(571, 149, 149, 24);
		contentPane.add(birthdayLabel);
		
		JLabel contactLabel = new JLabel(obj.Contact); //label for contact number
		contactLabel.setForeground(new Color(0, 0, 0));
		contactLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		contactLabel.setBounds(497, 348, 149, 24);
		contentPane.add(contactLabel);
		
		JLabel emailLabel = new JLabel(obj.Email); //label for email
		emailLabel.setForeground(new Color(0, 0, 0));
		emailLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		emailLabel.setBounds(497, 449, 210, 24);
		contentPane.add(emailLabel);
		
		JLabel addressLabel = new JLabel(obj.Address); //label for address
		addressLabel.setForeground(new Color(0, 0, 0));
		addressLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		addressLabel.setBounds(571, 199, 210, 24);
		contentPane.add(addressLabel);
		
		JLabel genderLabel = new JLabel(obj.Gender); //label for gender
		genderLabel.setForeground(new Color(0, 0, 0));
		genderLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		genderLabel.setBounds(516, 98, 210, 24);
		contentPane.add(genderLabel);
		
		JLabel religionLabel = new JLabel(obj.Religion); //label for religion
		religionLabel.setForeground(new Color(0, 0, 0));
		religionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		religionLabel.setBounds(571, 259, 210, 24);
		contentPane.add(religionLabel);
		
		JLabel facebookLabel = new JLabel(obj.Facebook); // label for facebook.
		facebookLabel.setForeground(Color.BLACK);
		facebookLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		facebookLabel.setBounds(497, 400, 239, 24);
		contentPane.add(facebookLabel);
		
		JLabel instagramLabel = new JLabel(obj.Instagram); // label for instagram.
		instagramLabel.setForeground(Color.BLACK);
		instagramLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		instagramLabel.setBounds(497, 499, 149, 24);
		contentPane.add(instagramLabel);
		JLabel BackGroundLabel = new JLabel(new ImageIcon(otherInformationLists.class.getResource("/img/PermanentBGOtherInfo.jpg")));
		BackGroundLabel.setBounds(0, 0, 786, 561);
		contentPane.add(BackGroundLabel);

	}
}
