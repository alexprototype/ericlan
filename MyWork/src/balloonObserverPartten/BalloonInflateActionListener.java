package balloonObserverPartten;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BalloonInflateActionListener implements ActionListener{
	private Balloon balloon;
	
	public BalloonInflateActionListener(Balloon b){
		this.balloon=b;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		balloon.inflated(10);
		if(balloon.isPopped()){
			JButton jb = (JButton)e.getSource();
			jb.setEnabled(false);
		}
	}

}
