package balloonObserverPartten;
import java.util.*;
import javax.swing.*;

public class BalloonObserver extends JLabel implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(o.toString()+arg);
		Balloon balloon=(Balloon)o;
		this.setText(balloon.getAmount()+" of "+ balloon.getCapacity());
		
	}
	

}
