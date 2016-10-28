package GUI;

import java.util.*;

public class Subject implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(o +"has been" + arg);
		
	}

}
