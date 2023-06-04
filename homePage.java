import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class homePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homePage homeFrame = new homePage();
					homeFrame.setVisible(true);
					homeFrame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	/**
	 * Create the frame.
	 */
	public homePage() {
		setResizable(false);
		setTitle("My Portfolio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel(); // JPanel for setting the background.
		panel.setBackground(new Color(45, 45, 45)); 
		panel.setBounds(0, 0, 784, 561); 
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel myPortfolioTitleLabel = new JLabel("My Portfolio"); // title of the frame
		myPortfolioTitleLabel.setBackground(new Color(0, 0, 0));
		myPortfolioTitleLabel.setForeground(new Color(0, 0, 0)); // set the color of the foreground on the title MY Portfolio. 
		myPortfolioTitleLabel.setFont(new Font("Arial Black", Font.BOLD, 65)); // setting the font.
		myPortfolioTitleLabel.setBounds(171, 154, 488, 113); 
		panel.add(myPortfolioTitleLabel);
		// button to enter in portfolio.
		JButton ENTERButton = new JButton("ENTER");
		ENTERButton.setFocusable(false); // to remove the outline from the foreground of the button.
		ENTERButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // for clicking the enter button.
				personalInformation infos = new personalInformation(); //instantiate new object for  calling another class.
				infos.setVisible(true); 
				infos.setLocationRelativeTo(null); // To make the frame to the center.
				dispose(); // closing the Frame.
			}

			@Override
			public void mouseEntered(MouseEvent e) { // changing color of the foreground when hovering.
				ENTERButton.setForeground(Color.lightGray); // setting the color of the text.
				ENTERButton.setBackground(Color.GRAY); //setting the color of the back ground.
			}

			@Override
			public void mouseExited(MouseEvent e) { // changing color of the foreground of enter button when you remove hover.
				ENTERButton.setForeground(Color.WHITE);
				ENTERButton.setBackground(new Color(45, 45, 45)); 
			}
		});

		ENTERButton.setForeground(Color.white); 
		ENTERButton.setFont(new Font("Arial", Font.PLAIN, 16)); 
		ENTERButton.setBackground(new Color(45, 45, 45));
		ENTERButton.setBounds(309, 422, 165, 52); 
		panel.add(ENTERButton);
		
		JLabel iconPortfolioLabel = new JLabel("");
		iconPortfolioLabel.setIcon(new ImageIcon(homePage.class.getResource("/img/officialBgForMyPortfolio.PNG")));
		iconPortfolioLabel.setBounds(84, 62, 621, 448);
		panel.add(iconPortfolioLabel);
	}
}
