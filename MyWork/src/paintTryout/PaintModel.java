package paintTryout;


import java.util.ArrayList;
import java.util.Observable;

public class PaintModel extends Observable {
	private ArrayList<Point> points=new ArrayList<Point>();
	private ArrayList<Circle> circles=new ArrayList<Circle>();
	private ArrayList<Rectangle> rectangle = new ArrayList<Rectangle>();
	
	public void addPoint(Point p){
		this.points.add(p);
		this.setChanged();
		this.notifyObservers();
	}
	public ArrayList<Point> getPoints(){
		return points;
	}
	
	public void addCircle(Circle c){
		this.circles.add(c);
		this.setChanged();
		this.notifyObservers();
	}
	public ArrayList<Circle> getCircles(){
		return circles;
	}
	
	public void addRetangel(Rectangle r){
		this.rectangle.add(r);
		this.setChanged();
		this.notifyObservers();
	}
	
	public ArrayList<Rectangle> getRetangel(){
		return rectangle;
	}
}
