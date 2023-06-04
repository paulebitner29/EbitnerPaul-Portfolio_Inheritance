import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class personalInformation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					personalInformation frame = new personalInformation();
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
	public personalInformation() {
		setResizable(false);
		setTitle("My Portfolio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel HobbiesLabel = new JLabel("HOBBIES"); // hobbies JLabel with mouse clicked listener.
		HobbiesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		HobbiesLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myHobbies ex = new myHobbies(); // Instantiate new object to call another JFrame.
				ex.setVisible(true);
				ex.setLocationRelativeTo(null);
				dispose();

			}

			@Override
			public void mouseEntered(MouseEvent e) { // changing color when hovering the hobbies JLabel.
				HobbiesLabel.setForeground(Color.GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) { // changing color when hovering the hobbies JLabel.
				HobbiesLabel.setForeground(Color.WHITE);
			}
		});
		HobbiesLabel.setForeground(new Color(255, 255, 255));
		HobbiesLabel.setFont(new Font("Arial", Font.BOLD, 20));
		HobbiesLabel.setBounds(525, 466, 116, 34);
		contentPane.add(HobbiesLabel);

		JLabel backIconLabel = new JLabel();
		backIconLabel.setIcon(new ImageIcon(personalInformation.class.getResource("/img/backIconUPdatedinvertedcolor copy.PNG")));
		backIconLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				homePage home = new homePage();
				home.setVisible(true);
				home.setLocationRelativeTo(null);
				dispose();
			}

		});
		backIconLabel.setBounds(10, 11, 30, 30);
		contentPane.add(backIconLabel);

		JLabel backLabel = new JLabel("BACK");
		backLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { 
				homePage home = new homePage(); // Instantiate new object to call another JFrame.
				home.setVisible(true);
				home.setLocationRelativeTo(null);
				dispose();
			}

			@Override
			public void mouseEntered(MouseEvent e) {// for changing the color of the foreground when hovering.
				backLabel.setForeground(Color.GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) {// for changing the color of the foreground when exiting the hover.
				backLabel.setForeground(Color.WHITE);
			}
		});
		backLabel.setForeground(new Color(255, 255, 255));
		backLabel.setFont(new Font("Arial", Font.BOLD, 12));
		backLabel.setBounds(41, 15, 44, 24);
		contentPane.add(backLabel);

		JLabel TalentsAchievementsLabel = new JLabel("TALENTS & ACHIEVEMENTS"); // talents and achievements label with
		TalentsAchievementsLabel.setHorizontalAlignment(SwingConstants.CENTER);
																				// mouse clicked listener.

		TalentsAchievementsLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				talentsAndAchievements TalentsAchievements = new talentsAndAchievements(); // Instantiate new object to call another JFrame.
				TalentsAchievements.setVisible(true);
				TalentsAchievements.setLocationRelativeTo(null); // putting to the JFrame to the center of the screen.
				dispose();
			}

			@Override
			public void mouseEntered(MouseEvent e) { // changing color to yellow when hovering the talents and
														// achievements JLabel.

				TalentsAchievementsLabel.setForeground(Color.GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) { // changing color when hovering the talents and
													// achievements JLabel.
				TalentsAchievementsLabel.setForeground(Color.WHITE);
			}
		});
		TalentsAchievementsLabel.setForeground(new Color(255, 255, 255));
		TalentsAchievementsLabel.setFont(new Font("Arial", Font.BOLD, 15));
		TalentsAchievementsLabel.setBounds(468, 272, 238, 34);
		contentPane.add(TalentsAchievementsLabel);

		JCheckBox OtherInfosCheckBox = new JCheckBox("show more personal information."); // show other information check box.
		OtherInfosCheckBox.setFocusable(false); // removing the outline on foreground of the check box.
		OtherInfosCheckBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (OtherInfosCheckBox.isSelected()) {
					otherInformationLists List = new otherInformationLists(); // Instantiate new object to call another JFrame.
					List.setVisible(true);
					List.setLocationRelativeTo(null);
					dispose();
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) { // changing color of the foreground when hovering.
				OtherInfosCheckBox.setForeground(Color.GRAY);
			}

			public void mouseExited(MouseEvent e) { // changing color of the foreground when you remove the hover.
				OtherInfosCheckBox.setForeground(Color.WHITE);
			}
		});

		OtherInfosCheckBox.setOpaque(false);// for transparency of the check box.
		OtherInfosCheckBox.setForeground(new Color(255, 255, 255));
		OtherInfosCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		OtherInfosCheckBox.setBackground(new Color(255, 255, 255));
		OtherInfosCheckBox.setBounds(29, 525, 253, 23);
		contentPane.add(OtherInfosCheckBox);

		JLabel CourseLabel = new JLabel("COURSE");
		CourseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		CourseLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myCourse course = new myCourse(); // Instantiate new object to call another JFrame.
				course.setVisible(true);
				course.setLocationRelativeTo(null);
				dispose();
			}

			@Override
			public void mouseEntered(MouseEvent e) {  // changing color of the foreground.
				CourseLabel.setForeground(Color.GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				CourseLabel.setForeground(Color.WHITE);
			}
		});
		CourseLabel.setForeground(new Color(255, 255, 255));
		CourseLabel.setFont(new Font("Arial", Font.BOLD, 20));
		CourseLabel.setBounds(533, 367, 102, 34);
		contentPane.add(CourseLabel);

		JLabel skillsLabel = new JLabel("SKILLS");
		skillsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		skillsLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mySkills strengthweakness = new mySkills(); // Instantiate new object to call another JFrame.
				strengthweakness.setVisible(true);
				strengthweakness.setLocationRelativeTo(null);
				dispose();
			}

			public void mouseEntered(MouseEvent e) { // changing color of the foreground when hovering.
				skillsLabel.setForeground(Color.GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				skillsLabel.setForeground(Color.WHITE); // changing color of the foreground when you remove the hover.
			}
		});
		skillsLabel.setForeground(new Color(255, 255, 255));
		skillsLabel.setFont(new Font("Arial", Font.BOLD, 20));
		skillsLabel.setBounds(475, 183, 219, 34);
		contentPane.add(skillsLabel);
		
		JLabel educationalAttainmentLabel = new JLabel("EDUCATION");
		educationalAttainmentLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // mouse listener to click the JLabel.
				educationalAttainment education = new educationalAttainment(); // Instantiate new object to call another JFrame.
				education.setVisible(true);
				education.setLocationRelativeTo(null); // Putting to JFame to the center.
				dispose(); //closing the frame
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				educationalAttainmentLabel.setForeground(Color.GRAY); // changing color of the foreground when hovering.
			}
			@Override
			public void mouseExited(MouseEvent e) {
				educationalAttainmentLabel.setForeground(Color.white); // changing color of the foreground when you remove the hover.
			}
		});
		educationalAttainmentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		educationalAttainmentLabel.setForeground(Color.WHITE);
		educationalAttainmentLabel.setFont(new Font("Arial", Font.BOLD, 20));
		educationalAttainmentLabel.setBounds(475, 90, 219, 34);
		contentPane.add(educationalAttainmentLabel);
		
		JLabel backgroundLabel = new JLabel(new ImageIcon(personalInformation.class.getResource("/img/BgforPersonalInformation.jpg"))); // BackGround Picture.
		backgroundLabel.setForeground(new Color(255, 255, 255));
		backgroundLabel.setBounds(0, 0, 786, 561);
		contentPane.add(backgroundLabel);

	}
}
