package GUI;

import javax.swing.*;

public class Frame {

	public static void createAndShowGUI(){
		JFrame jf = new JFrame("Show Case Frame");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(100,100);
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				createAndShowGUI();
			}
		});
	}
}
