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

public class  myHobbies extends JFrame {

	private JPanel contentPane;

	static Skills obj = new Skills();//instantiate new object to call the variables from multilevel inheritance classes.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myHobbies frame = new myHobbies();
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
	public myHobbies() {
		setTitle("My Portfolio");
		setResizable(false);
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
			public void mouseClicked(MouseEvent e) { // mouse listener to click the JLabel.
				personalInformation infos = new personalInformation(); // Instantiate new object to call another JFrame.
				infos.setVisible(true);
				infos.setLocationRelativeTo(null); // Putting to JFame to the center.
				dispose(); //closing the frame
			}
		});
		backIconLabel.setBounds(10, 80, 30, 30);
		contentPane.add(backIconLabel);

		// back label
		JLabel backLabel = new JLabel("BACK");
		backLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // mouse listener to click the JLabel.
				personalInformation infos = new personalInformation(); // Instantiate new object to call another JFrame.
				infos.setVisible(true);
				infos.setLocationRelativeTo(null); // Putting to JFame to the center.
				dispose(); //closing the frame
			}

			@Override
			public void mouseEntered(MouseEvent e) { // changing color of the foreground when hovering.
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
		
		JLabel musicalInstrumentLabel = new JLabel(obj.MusicalInstrument); //label fo playing musical instruments
		musicalInstrumentLabel.setForeground(new Color(0, 0, 0));
		musicalInstrumentLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		musicalInstrumentLabel.setBounds(428, 318, 224, 24);
		contentPane.add(musicalInstrumentLabel);
				
		JLabel basketballLabel = new JLabel(obj.Basketball);//label for basketball
		basketballLabel.setForeground(new Color(0, 0, 0));
		basketballLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		basketballLabel.setBounds(160, 312, 224, 24);
		contentPane.add(basketballLabel);
						
		JLabel cyclingLabel = new JLabel(obj.Cycling); //label for cycling
		cyclingLabel.setForeground(new Color(0, 0, 0));
		cyclingLabel.setFont(new Font("Arial", Font.PLAIN, 16));
	    cyclingLabel.setBounds(237, 526, 224, 24);
		contentPane.add(cyclingLabel);
								
		JLabel lblWatching = new JLabel(obj.Watching); //label for watching.
		lblWatching.setForeground(new Color(0, 0, 0));
		lblWatching.setFont(new Font("Arial", Font.PLAIN, 16));
		lblWatching.setBounds(557, 526, 224, 24);
		contentPane.add(lblWatching);
								
		//background for myHobbies
		JLabel hobbiesBackgroundLabel = new JLabel(new ImageIcon(myHobbies.class.getResource("/img/permanentBGForHobbies.JPG")));
		hobbiesBackgroundLabel.setBounds(0, 0, 786, 561);
		contentPane.add(hobbiesBackgroundLabel);

	}
}
