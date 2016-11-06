package paintTryout;

public class Rectangle {
	private Point centre;
	private int width;
	private int height;
	
	public Rectangle (Point centre, int height, int width){
		this.centre = centre;
		this.width = width;
		this.height = height;
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}