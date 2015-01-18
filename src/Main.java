import javax.swing.JOptionPane;


public class Main {
	public static void main (String []args)
	{
		String p="0";
		p = JOptionPane.showInputDialog(null, "Enter Player Name", "Player1");
		Game_GUI g = new Game_GUI( p);
		
		
		
	}
}
