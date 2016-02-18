import javax.swing.JFrame;

public class Bullseye{
	//creates the main frame of the bullseye
	public static void main(String [] args){
		JFrame bs = new JFrame("Bullseye");
		bs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BullseyePanel panel = new BullseyePanel();
		
		bs.getContentPane().add(panel);
		bs.pack();
		bs.setVisible(true);
		
	}
}