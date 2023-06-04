import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class talentsAndAchievements extends JFrame {

	private JPanel contentPane;

	static Skills obj = new Skills();//instantiate new object to call the variables from multilevel inheritance classes. 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					talentsAndAchievements frame = new talentsAndAchievements();
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
	public talentsAndAchievements() {
		setResizable(false);
		setTitle("My Portfolio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//backIcon
		JLabel backIconLabel = new JLabel(new ImageIcon(talentsAndAchievements.class.getResource("/img/backIconUPdated copy.PNG")));
		backIconLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //mouse listener to click the JLabel.
				personalInformation infos = new personalInformation(); //Instantiate new object to call another Frame.
				infos.setVisible(true);
				infos.setLocationRelativeTo(null);// Set the Frame to the center.
				dispose(); //Closing the Frame.
			}
		});
		backIconLabel.setBounds(10, 79, 30, 30);
		contentPane.add(backIconLabel);

		// back label
		JLabel backLabel = new JLabel("BACK");
		backLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //mouse listener to click the JLabel.
				personalInformation infos = new personalInformation(); //Instantiate new object to call another Frame.
				infos.setVisible(true);
				infos.setLocationRelativeTo(null); // Set the Frame to the center.
				dispose(); //Closing the Frame.
			}

			@Override
			public void mouseEntered(MouseEvent e) { // changing color when hovering the hobbies JLabel.
				backLabel.setForeground(Color.GRAY); 
			}

			@Override
			public void mouseExited(MouseEvent e) {  // changing color when hovering the hobbies JLabel.
				backLabel.setForeground(Color.BLACK);
			}
		});
		backLabel.setForeground(new Color(0, 0, 0));
		backLabel.setFont(new Font("Arial", Font.BOLD, 12));
		backLabel.setBounds(41, 82, 44, 24);
		contentPane.add(backLabel);
		
		JLabel SHSGraduatedLabel = new JLabel(obj.SHSGraduated); //label for shs graduated.
		SHSGraduatedLabel.setForeground(new Color(0, 0, 0));
		SHSGraduatedLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		SHSGraduatedLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SHSGraduatedLabel.setBounds(82, 329, 266, 30);
		contentPane.add(SHSGraduatedLabel);
		
		JLabel playingInstrumentsLabel = new JLabel(obj.PlayingInstruments); //label for playing musical instruments.
		playingInstrumentsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		playingInstrumentsLabel.setForeground(new Color(0, 0, 0));
		playingInstrumentsLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		playingInstrumentsLabel.setBounds(433, 513, 266, 30);
		contentPane.add(playingInstrumentsLabel);
		
		JLabel talentsAchieventsBgLabel = new JLabel(); // Background picture.
		talentsAchieventsBgLabel.setIcon(new ImageIcon(talentsAndAchievements.class.getResource("/img/permanentBgForTalents&Achievements.JPG"))); //background
		talentsAchieventsBgLabel.setBounds(0, 0, 786, 561);
		contentPane.add(talentsAchieventsBgLabel);
	}

}
