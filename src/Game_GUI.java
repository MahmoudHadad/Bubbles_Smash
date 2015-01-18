import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game_GUI extends JFrame implements Runnable{
	JLabel leveLabel;
	private JButton [] buttons;
	private ImageIcon icon;
	private boolean setImage = true;
	private JPanel buttonsPanel ;
	private JPanel scorePanel ;
	private String playerName ;
	private int score = 0;
	private JLabel playerNameLabel;
	private JLabel scoreLabel;
	private JButton exiteButton;
	private JButton startButton;
	private JPanel endPanel;
	private boolean gameStarted = false;
	private boolean isClicked;
	private int buttonNumber;
	private Game_GUI gui;
	Thread t;
	int level = 1;
	int time = 1000;
	Game_GUI(String p)
	{
		if(p !=null)
			playerName = p;
		else
			playerName = "Player1";
		
		gui = this;
		
		
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
		
		endPanel = new JPanel();
		endPanel.setLayout(null);
		endPanel.setBounds(0, 338, 377, 56);
		add(endPanel);
		
		buttonsPanel = new JPanel();
		buttonsPanel.setBackground(Color.WHITE);
		buttonsPanel.setBounds(0, 96, 377, 238);
		buttonsPanel.setLayout(null);
		add(buttonsPanel);
		
		exiteButton = new JButton("Exit");
		exiteButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		exiteButton.setBounds(48, 12, 101, 23);
		endPanel.add(exiteButton);

		
		startButton = new JButton("Start");
		startButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		startButton.setBounds(200, 12, 101, 23);
		endPanel.add(startButton);
		
		
		////////////////////////////////////////////
		
		leveLabel = new JLabel("Level: 1");
		leveLabel.setForeground(Color.BLUE);
		leveLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		leveLabel.setBounds(10, 57, 185, 28);
		scorePanel.add(leveLabel);
		
		playerNameLabel = new JLabel("Player Name: " + playerName );
		playerNameLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		playerNameLabel.setForeground(Color.BLUE);
		playerNameLabel.setBounds(10, 11, 185, 51);
		scorePanel.add(playerNameLabel);
		
		scoreLabel = new JLabel("Score: 0");
		scoreLabel.setForeground(Color.BLUE);
		scoreLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		scoreLabel.setBounds(220, 11, 185, 51);
		scorePanel.add(scoreLabel);
		////////////
		
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
		
		////////////////// Actions
		
		exiteButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();				
			}
		});
		
		startButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(startButton.getText().equals("Start"))
				{
					t = new Thread(gui);
					t.start();
					startButton.setText("Pause");
				}
				else if(startButton.getText().equals("Pause"))
				{
					t.interrupt();
					startButton.setText("Resume");
				}
				else 
				{
					startButton.setText("Pause");
					t.notify();			
				}
			}
		});
		
		buttons[0].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(buttonNumber == 0 )
					isClicked = true;
			}
		});
		
		buttons[1].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(buttonNumber == 1 )
					isClicked = true;
			}
		});
		
		buttons[2].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(buttonNumber == 2)
					isClicked = true;
			}
		});
		
		buttons[3].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(buttonNumber == 3)
					isClicked = true;
			}
		});
		
		
		buttons[4].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(buttonNumber == 4)
					isClicked = true;
			}
		});
		
		buttons[5].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(buttonNumber == 5)
					isClicked = true;
			}
		});
		
		buttons[6].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(buttonNumber == 6)
					isClicked = true;
			}
		});
		
		buttons[7].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(buttonNumber == 7)
					isClicked = true;
			}
		});
		
		buttons[8].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(buttonNumber == 8)
					isClicked = true;
			}
		});
		//////////////////////////		

		
		initialize ();
		startButton.doClick();
	}
	
	private void initialize ()
	{
		icon = new ImageIcon(getClass().getResource("making_big_bubbles_dsc_2521.jpg") );
		Image img = icon .getImage();
		Image newimg = img.getScaledInstance(89, 50, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg); 
		
		
	}
	
	public void run ()
	{
		try {
			 java.lang.Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0 ; i<10;i++)
		{
			int rand = getRandom();
			rand = getRandom();
			isClicked = false;
			buttonNumber = rand;
			
			buttons[rand].setIcon(icon);
			
			try {
				 java.lang.Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			buttons[rand].setIcon(null);
			if(isClicked)
			{
				score ++;
				updateScore ();
			}
			try {
				 java.lang.Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		if(score >= 9)
		{
			score = 0;
			JOptionPane.showMessageDialog(this, "Congratulations you win go to next level");
			time -=100;
			level++;
			updateLevel();
			updateScore ();
		}
		else
		{
			score = 0;
			JOptionPane.showMessageDialog(this, "You didn't smash enough bubbles try again");
			updateScore ();
		}
		startButton.setText("Start");
	}
	
	private int getRandom ()
	{
		return (int) (9*Math.random()); 
	}
	private void updateScore ()
	{
		scoreLabel.setText("Your Score is " + score + " / 10");
	}
	private void updateLevel ()
	{
		leveLabel.setText("Your level is " + level );
	}
}
