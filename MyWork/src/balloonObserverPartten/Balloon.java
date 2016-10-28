package balloonObserverPartten;

import java.util.Observable;

public class Balloon extends Observable {
	private static int numPoppd = 0;
	private static int numBalloon = 0;

	public static int getNumPoppd() {
		return numPoppd;
	}

	public static int getNumBalloon() {
		return numBalloon;
	}

	private String color;
	private int capacity;
	private int amount;
	private boolean isPopped = false;

	public String getColor() {
		return color;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getAmount() {
		return amount;
	}

	public boolean isPopped(){
		return this.isPopped;
	}
	// constructor
	public Balloon(String color, int capacity) {
		this.color = color;
		if (capacity > 0) {
			this.capacity = capacity;
		} else {
			this.capacity = 100;
		}
		numBalloon++;
	}

	public Balloon(String color) {
		this(color, -1); // overload
	}

	public void pop() {
		if (this.isPopped)
			return;
		numPoppd++;
		this.amount = 0;
		this.capacity = 0;
		this.isPopped = true;
		this.setChanged();
		this.notifyObservers("This balloon is popped");

	}

	public void inflated(int amount) {
		if (amount <= 0) {
			return;
		} else if (this.amount + amount <= this.capacity) {
			this.amount += amount;
			this.setChanged();
			this.notifyObservers("This balloon is inflated by " + amount + ".");
		} else {
			this.pop();
		}
	}

	public void deflated(int amount) {
		if (amount <= 0) {
			return;
		} else if (this.amount - amount <= 0) {
			this.amount -= amount;
			this.setChanged();
			this.notifyObservers("This balloon is deflated by " + amount + ".");
		} else {
			this.amount = 0;
			this.setChanged();
			this.notifyObservers("This balloon is deflated by " + this.amount + ".");
		}
	}

	public String toString() {
		String s;
		if (!this.isPopped()) {
			s = "Balloon(" + this.getColor() + ",amount:" + this.amount + ",capacity:"
					+ this.capacity + ").";
		} else {
			s = "Balloon(" + this.getColor() + ") is popped.";
		}
		return s;
	}
}
