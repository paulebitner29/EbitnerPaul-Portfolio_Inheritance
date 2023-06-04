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
import javax.swing.JTextArea;

public class mySkills extends JFrame {

	private JPanel contentPane;
 
	static Skills obj = new Skills();//instantiate new object to inherit the classes of multilevel inheritance.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mySkills frame = new mySkills();
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
	public mySkills() {
		setTitle("My Portfolio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Back Icon
		JLabel backIconLabel = new JLabel(new ImageIcon(mySkills.class.getResource("/img/backIconUPdated copy.PNG")));
		backIconLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //Mouse listener to click the JLabel.
				personalInformation infos = new personalInformation(); //Instantiate new object to call another JFrame.
				infos.setVisible(true);
				infos.setLocationRelativeTo(null);// set the Frame to center.
				dispose(); //closing the Frame.
			}
		});
		backIconLabel.setBounds(10, 77, 30, 30);
		contentPane.add(backIconLabel);
		
		// back label
		JLabel backLabel = new JLabel("BACK");
		backLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //Mouse listener to click the JLabel.
				personalInformation infos = new personalInformation(); //Instantiate new object to call another JFrame.
				infos.setVisible(true);
				infos.setLocationRelativeTo(null); // set the Frame to center.
				dispose(); //closing the Frame.
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
		backLabel.setBounds(41, 80, 44, 24);
		contentPane.add(backLabel);
		//Personal skills
		JLabel personalSkill1 = new JLabel(obj.personalSkill1); //Personal Skill 1
		personalSkill1.setFont(new Font("Arial", Font.PLAIN, 15));
		personalSkill1.setBounds(126, 210, 167, 30);
		contentPane.add(personalSkill1);
		
		JLabel personalSkill2 = new JLabel(obj.personalSkill2); //Personal Skill 2
		personalSkill2.setFont(new Font("Arial", Font.PLAIN, 15));
		personalSkill2.setBounds(126, 278, 167, 30);
		contentPane.add(personalSkill2);
		
		JLabel personalSkill3 = new JLabel(obj.personalSkill3); //Personal Skill 3
		personalSkill3.setFont(new Font("Arial", Font.PLAIN, 15));
		personalSkill3.setBounds(126, 346, 167, 30);
		contentPane.add(personalSkill3);
		
		JLabel personalSkill4 = new JLabel(obj.personalSkill4);  //Personal Skill 4
		personalSkill4.setFont(new Font("Arial", Font.PLAIN, 15));
		personalSkill4.setBounds(126, 413, 167, 30);
		contentPane.add(personalSkill4);
		//technical skills
		JLabel technicalSkill1 = new JLabel(obj.technicalSkill1); //Technical Skill 1
		technicalSkill1.setFont(new Font("Arial", Font.PLAIN, 15));
		technicalSkill1.setBounds(460, 210, 167, 30);
		contentPane.add(technicalSkill1);
		
		JLabel technicalSkill2 = new JLabel(obj.technicalSkill2); //Technical Skill 2
		technicalSkill2.setFont(new Font("Arial", Font.PLAIN, 15));
		technicalSkill2.setBounds(460, 278, 167, 30);
		contentPane.add(technicalSkill2);
		
		JLabel technicalSkill3 = new JLabel(obj.technicalSkill3); //Technical Skill 3
		technicalSkill3.setFont(new Font("Arial", Font.PLAIN, 15));
		technicalSkill3.setBounds(460, 346, 167, 30);
		contentPane.add(technicalSkill3);
		
		JLabel technicalSkill4 = new JLabel(obj.technicalSkill4); //Technical Skill 4
		technicalSkill4.setFont(new Font("Arial", Font.PLAIN, 15));
		technicalSkill4.setBounds(460, 417, 167, 30);
		contentPane.add(technicalSkill4);
		
		JLabel lblNewLabel = new JLabel();// Background picture.
		lblNewLabel.setIcon(new ImageIcon(mySkills.class.getResource("/img/BGForSkills.jpg")));
		lblNewLabel.setBounds(-1, 0, 786, 561);
		contentPane.add(lblNewLabel);
		
		
	}

}
