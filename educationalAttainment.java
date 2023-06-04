import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class educationalAttainment extends JFrame {

	private JPanel contentPane;

	static Skills obj = new Skills();//instantiate new object to call the variables from multilevel inheritance classes.

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					educationalAttainment frame = new educationalAttainment();
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
	public educationalAttainment() {
		setResizable(false);
		setTitle("My Portfolio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//backIcon
		JLabel backIconLabel = new JLabel(new ImageIcon(myHobbies.class.getResource("/img/backIconUPdated copy.PNG")));
		backIconLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // mouse listener for clicking the JLabel.
				personalInformation infos = new personalInformation(); // Instantiate new object to call another JFrame.
				infos.setVisible(true);
				infos.setLocationRelativeTo(null); // Set the JFrame to the center,
				dispose(); //Closing the frame.
			}
		});
		backIconLabel.setBounds(10, 80, 30, 30);
		contentPane.add(backIconLabel);
		

		// back label
		JLabel backLabel = new JLabel("BACK");
		backLabel.addMouseListener(new MouseAdapter() { // mouse listener for clicking the JLabel.
			@Override
			public void mouseClicked(MouseEvent e) {
				personalInformation infos = new personalInformation(); // Instantiate new object to call another JFrame.
				infos.setVisible(true);
				infos.setLocationRelativeTo(null); // Set the JFrame to the center,
				dispose(); //Closing the frame.
			}

			@Override
			public void mouseEntered(MouseEvent e) { // changing the color of the foreground when hovering.
				backLabel.setForeground(Color.GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) { // changing color of the foreground when you remove the hover.
				backLabel.setForeground(Color.BLACK);
			}
		});
		backLabel.setForeground(new Color(0, 0, 0));
		backLabel.setFont(new Font("Arial", Font.BOLD, 12));
		backLabel.setBounds(41, 83, 44, 24);
		contentPane.add(backLabel);
		
		JLabel collegeShoolLabel = new JLabel(obj.TertiarySchool); //College school name.
		collegeShoolLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		collegeShoolLabel.setBounds(237, 175, 322, 30);
		contentPane.add(collegeShoolLabel);
		
		JLabel collegeYearLabel = new JLabel(obj.TertiaryYear); // College School Year.
		collegeYearLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		collegeYearLabel.setBounds(237, 220, 322, 30);
		contentPane.add(collegeYearLabel);
		
		JLabel highSchoolLabel = new JLabel(obj.SecondarySchool); //High School School Name.
		highSchoolLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		highSchoolLabel.setBounds(237, 306, 322, 30);
		contentPane.add(highSchoolLabel);
		
		JLabel highschoolYearLabel = new JLabel(obj.SecondaryYear); // High School School Year.
		highschoolYearLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		highschoolYearLabel.setBounds(237, 350, 322, 30);
		contentPane.add(highschoolYearLabel);
		
		JLabel elementarySchoolLabel = new JLabel(obj.PrimarySchool); //Elementary School Name.
		elementarySchoolLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		elementarySchoolLabel.setBounds(237, 431, 469, 30);
		contentPane.add(elementarySchoolLabel);
		
		JLabel elementaryYearLabel = new JLabel(obj.PrimaryYear); //Elementary School Year.
		elementaryYearLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		elementaryYearLabel.setBounds(237, 474, 322, 30);
		contentPane.add(elementaryYearLabel);
		
		JLabel educationBackgroundLabel = new JLabel(); //Background Picture.
		educationBackgroundLabel.setIcon(new ImageIcon(educationalAttainment.class.getResource("/img/educationBG.jpg")));
		educationBackgroundLabel.setBounds(0, 0, 786, 561);
		contentPane.add(educationBackgroundLabel);
	}
}
