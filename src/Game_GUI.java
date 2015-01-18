import javax.swing.*;

import java.awt.*;

public class Game_GUI extends JFrame{
	
	JButton [] buttons;
	ImageIcon icon;
	boolean setImage = true;
	JPanel buttonsPanel ;
	JPanel scorePanel ;
	String playerName = "";
	int score = 0;
	JLabel playerNameLabel;
	JLabel scoreLabel;
	JButton exiteButton;
	JButton startButton;
	JPanel endPanel;
	boolean gameStarted = false;
	
	Game_GUI()
	{
		setTitle("Bubbles Smash");
		setBounds(480, 100, 393, 435);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		//setSize(411,416);
		
		
		
		////////////////////////////////////////////////////
		scorePanel = new JPanel();
		
		scorePanel.setBounds(0, 0, 377, 96);
		scorePanel.setLayout(null);
		add(scorePanel);
		
		playerName = "player Name: " + JOptionPane.showInputDialog(this, "Enter Player Name");
		playerNameLabel = new JLabel(playerName);
		playerNameLabel.setForeground(Color.BLUE);
		playerNameLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		playerNameLabel.setBounds(10, 11, 185, 51);
		scorePanel.add(playerNameLabel);
		
		scoreLabel = new JLabel("Score: 0");
		scoreLabel.setForeground(Color.BLUE);
		scoreLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		scoreLabel.setBounds(200, 11, 185, 51);
		scorePanel.add(scoreLabel);
		////////////
		
		buttonsPanel = new JPanel();
		buttonsPanel.setBackground(Color.WHITE);
		buttonsPanel.setBounds(0, 96, 377, 238);
		buttonsPanel.setLayout(null);
		add(buttonsPanel);
		
		buttons = new JButton[9];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttonsPanel.add(buttons[i]);
		}
		buttons[0].setBounds(10, 11, 89, 50);
		buttons[1].setBounds(135, 11, 89, 50);
		buttons[2].setBounds(267, 11, 89, 50);
		buttons[3].setBounds(10, 89, 89, 50);
		buttons[4].setBounds(135, 89, 89, 50);
		buttons[5].setBounds(267, 89, 89, 50);
		buttons[6].setBounds(10, 163, 89, 50);
		buttons[7].setBounds(135, 163, 89, 50);
		buttons[8].setBounds(267, 163, 89, 50);

		
		
		
		endPanel = new JPanel();
		endPanel.setLayout(null);
		exiteButton = new JButton("Exit");
		startButton = new JButton("Start");
		
		endPanel.add(exiteButton);
		endPanel.add(startButton);
		
		
		// locations
		
		
		
		
		
		
		add(endPanel);
		
		initialize ();
		
	}
	
	private void initialize ()
	{
		icon = new ImageIcon(getClass().getResource("making_big_bubbles_dsc_2521.jpg") );
		Image img = icon .getImage();
		Image newimg = img.getScaledInstance(89, 50, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg); 
		
		
	}
	
}
