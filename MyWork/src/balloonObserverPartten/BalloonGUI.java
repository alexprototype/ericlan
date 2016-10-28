package balloonObserverPartten;
import java.awt.GridLayout;

import javax.swing.*;

public class BalloonGUI {
	
	
	public static void createAndShowGUI(){
		JFrame jf = new JFrame("Balloon Frame");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(300,100);
		jf.setVisible(true);
		jf.getContentPane().setLayout(new GridLayout(2,2));
		
		//two balloon
		Balloon b1 = new Balloon("Red");
		Balloon b2 = new Balloon("Yellow",200);
		
		//two Jbutton
		JButton jb1 = new JButton("RED");
		JButton jb2 = new JButton("YELLOW");
		
		//hook up
		//addObserver()
		BalloonObserver bo1 = new BalloonObserver();
		BalloonObserver bo2 = new BalloonObserver();
		b1.addObserver(bo1);
		b2.addObserver(bo2);
		
		jf.getContentPane().add(bo1);
		jf.getContentPane().add(jb1);
		jf.getContentPane().add(bo2);
		jf.getContentPane().add(jb2);
		
		BalloonInflateActionListener bListener1 = new BalloonInflateActionListener(b1);
		BalloonInflateActionListener bListener2 = new BalloonInflateActionListener(b2);
		
		jb1.addActionListener(bListener1);
		jb2.addActionListener(bListener2);
		b1.notifyObservers();
		b2.notifyObservers();
	}

	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}
}
