import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import jdk.nashorn.internal.scripts.JO;


public class MainWindow extends JFrame{
	private JTextField playerName;
	private JLabel playerNameLabel;
	private JButton playButton;
	private JPanel mainPanel; 
	
	MainWindow()
	{

		super("Bubbles Smash");
		setBounds(480, 100, 420, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		//setResizable(false);
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBounds(0, 0, 420, 180);
		mainPanel.setLayout(null);
		add(mainPanel);
		
		playerNameLabel = new JLabel("Enter Player Name:");
		playerNameLabel.setBounds(10, 11, 155, 51);
		playerNameLabel.setForeground(Color.BLUE);
		playerNameLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		mainPanel.add(playerNameLabel);
		
		
		playButton = new JButton("Play");
		playButton.setForeground(Color.BLUE);
		playButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		playButton.setBounds(142, 87, 109, 23);
		mainPanel.add(playButton);
		
		
		playerName = new JTextField("Player1");
		playerName.setBounds(180, 23, 200, 28);
		playerName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		mainPanel.add(playerName);
		playerName.setColumns(20);
		playerName.requestFocus();
		
		
		
		
		playButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				hide();
				new Game_GUI(playerName.getText());
			}
		});
	}

}
