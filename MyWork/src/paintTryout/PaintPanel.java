package paintTryout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

// https://docs.oracle.com/javase/8/docs/api/java/awt/Graphics2D.html
// https://docs.oracle.com/javase/tutorial/2d/

class PaintPanel extends JPanel implements Observer, MouseMotionListener, MouseListener {
	private int i = 0;
	private PaintModel model; // slight departure from MVC, because of the way
								// painting works
	private View view; // So we can talk to our parent or other components of
						// the view

	private String mode; // modifies how we interpret input (could be better?)
	private Circle circle; // the circle we are building
	private Rectangle rectangle; //the rectangle we are building
	private int oldX,oldY,currentX,currentY;

	public PaintPanel(PaintModel model, View view) {
		this.setBackground(Color.black);
		this.setPreferredSize(new Dimension(300, 300));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.model = model;
		this.model.addObserver(this);

		this.view = view;
	}

	/**
	 * View aspect of this
	 */
	public void paintComponent(Graphics g) {
		// Use g to draw on the JPanel, lookup java.awt.Graphics in
		// the javadoc to see more of what this can do for you!!

		super.paintComponent(g); // paint background
		Graphics2D g2d = (Graphics2D) g; // lets use the advanced api
		// setBackground (Color.blue);
		// Origin is at the top left of the window 50 over, 75 down
		g2d.setColor(Color.white);
		g2d.drawString("i=" + i, 50, 75);
		i = i + 1;

		// Draw Lines
		ArrayList<Point> points = this.model.getPoints();
		for (int i = 0; i < points.size() - 1; i++) {
			Point p1 = points.get(i);
			Point p2 = points.get(i + 1);
			g2d.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
		}

		// Draw Circles
		ArrayList<Circle> circles = this.model.getCircles();
		for (Circle c : this.model.getCircles()) {
			int x = c.getCentre().getX();
			int y = c.getCentre().getY();
			int radius = c.getRadius();
			g2d.drawOval(x, y, radius, radius);
		}

		// Draw Rectangle
		ArrayList<Rectangle> rectangles = this.model.getRetangel();
		for (Rectangle r : this.model.getRetangel()) {
			int height, width, x, y;
			x = r.getCentre().getX();
			y = r.getCentre().getY();
			height = r.getHeight();
			width = r.getWidth();
			g2d.drawRect(x, y, width, height);

		}

		g2d.dispose();
	}

	@Override
	public void update(Observable o, Object arg) {
		// Not exactly how MVC works, but similar.
		this.repaint(); // Schedule a call to paintComponent
	}

	/**
	 * Controller aspect of this
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	// MouseMotionListener below
	@Override
	public void mouseMoved(MouseEvent e) {
		if (this.mode == "Squiggle") {

		} else if (this.mode == "Circle") {

		} else if (this.mode == "Rectangle") {

		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
		if (this.mode == "Squiggle") {
			this.model.addPoint(new Point(e.getX(), e.getY()));
		} else if (this.mode == "Circle") {

		} else if (this.mode == "Rectangle") {

		}
	}

	// MouseListener below
	@Override
	public void mouseClicked(MouseEvent e) {
		if (this.mode == "Squiggle") {

		} else if (this.mode == "Circle") {

		} else if (this.mode == "Rectangle") {

		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		oldX = e.getX();
		oldY=e.getY();
		if (this.mode == "Squiggle") {

		} else if (this.mode == "Circle") {
			// Problematic notion of radius and centre!!
			Point centre = new Point(e.getX(), e.getY());
			this.circle = new Circle(centre, 0);
		} else if (this.mode == "Rectangle") {
			Point centre = new Point(e.getX(),e.getY());
			this.rectangle = new Rectangle(centre,0,0);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (this.mode == "Squiggle") {

		} else if (this.mode == "Circle") {
			if (this.circle != null) {
				// Problematic notion of radius and centre!!
				int radius = Math.abs(this.circle.getCentre().getX() - e.getX());
				this.circle.setRadius(radius);
				this.model.addCircle(this.circle);
				this.circle = null;
			}
		} else if (this.mode == "Rectangle") {
			//允许 负值?
			if(this.rectangle!=null){
				//从左往右画 可以理解为 shift centre
				int rectX,rectY,mouseX,mouseY;
				Point centre;
				rectX = this.rectangle.getCentre().getX();
				rectY = this.rectangle.getCentre().getY();
				mouseX = e.getX();
				mouseY = e.getY();
				centre=new Point(Math.min(rectX, mouseX),Math.min(rectY,mouseY));
				int width = Math.abs(rectX-mouseX);
				int height =Math.abs(rectY-mouseY);
				this.rectangle.setHeight(height);
				this.rectangle.setWidth(width);
				this.rectangle.setCentre(centre);
				this.model.addRetangel(this.rectangle);
				this.rectangle=null;
			}
		}
                      
	}

	
	//FeedBacks
	@Override
	public void mouseEntered(MouseEvent e) {
		if (this.mode == "Squiggle") {

		} else if (this.mode == "Circle") {

		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (this.mode == "Squiggle") {

		} else if (this.mode == "Circle") {

		}
	}
}
