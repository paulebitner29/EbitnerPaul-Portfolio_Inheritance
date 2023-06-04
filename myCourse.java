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

public class myCourse extends JFrame {

	private JPanel contentPane;

	static Skills obj = new Skills();//instantiate new object to call the variables from multilevel inheritance classes.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myCourse frame = new myCourse();
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
	public myCourse() {
		setTitle("My Portfolio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Back Icon
		JLabel backIconLabel = new JLabel(new ImageIcon(myCourse.class.getResource("/img/backIconUPdated copy.PNG")));
		backIconLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				personalInformation infos = new personalInformation();
				infos.setVisible(true);
				infos.setLocationRelativeTo(null); // Putting to JFame to the center.
				dispose(); //closing the frame
			}
		});
		backIconLabel.setBounds(0, 77, 30, 30);
		contentPane.add(backIconLabel);

		// back label
		JLabel backLabel = new JLabel("BACK");
		backLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {  // mouse listener to click the JLabel.
				personalInformation infos = new personalInformation(); // Instantiate new object to call another JFrame.
				infos.setVisible(true);
				infos.setLocationRelativeTo(null); // Putting to JFame to the center.
				dispose();  //closing the frame
			}

			@Override
			public void mouseEntered(MouseEvent e) { // changing color of the foreground when hovering.
				backLabel.setForeground(Color.GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) { // changing color of the foreground when you remove the hover.
				backLabel.setForeground(Color.black);
			}
		});
		backLabel.setForeground(new Color(0, 0, 0));
		backLabel.setFont(new Font("Arial", Font.BOLD, 12));
		backLabel.setBounds(30, 80, 44, 24);
		contentPane.add(backLabel);
		
		JTextArea whyCourseTextArea = new JTextArea(); //TextArea for Why did you choose this course?
		whyCourseTextArea.setText(obj.WhyCourse);
		whyCourseTextArea.setEditable(false);
		whyCourseTextArea.setToolTipText("");
		whyCourseTextArea.setForeground(new Color(255, 255, 255));
		whyCourseTextArea.setOpaque(false);
		whyCourseTextArea.setFont(new Font("Arial", Font.PLAIN, 16));
		whyCourseTextArea.setBounds(69, 402, 457, 135);
		contentPane.add(whyCourseTextArea);
		
		JTextArea whatCourseTextArea = new JTextArea(); //What is your course course?
		whatCourseTextArea.setText(obj.WhatCourse);
		whatCourseTextArea.setEditable(false);
		whatCourseTextArea.setToolTipText("");
		whatCourseTextArea.setOpaque(false);
		whatCourseTextArea.setForeground(new Color(0, 0, 0));
		whatCourseTextArea.setFont(new Font("Arial", Font.PLAIN, 16));
		whatCourseTextArea.setBounds(315, 160, 428, 135);
		contentPane.add(whatCourseTextArea);
		
		//Course Background picture.
		JLabel courseBackgroundLabel = new JLabel();
		courseBackgroundLabel.setIcon(new ImageIcon(myCourse.class.getResource("/img/OriginalBackgroundForMyCourse.JPG")));
		courseBackgroundLabel.setBounds(0, 0, 786, 561);
		contentPane.add(courseBackgroundLabel);
	}
}
