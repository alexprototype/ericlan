package midterm;

/**
 * We capture a Balloon which can be inflated, deflated and popped. A Balloon
 * has an amount and capacity. At all times, 0<=amount<=capacity. A Balloon can
 * be inflated only if it is not popped.
 * 
 * @author Eric
 * 
 *         We used this example to explain... IS-A (not really), HAS-A,
 *         RESPONDS-TO references, new and constructors constructors: initialize
 *         a new instance Unit Testing: test public methods JavaDoc public:
 *         other classes have access private: other classes can't access
 *         toString(): return a String representation of this overloading: many
 *         methods with the same name, different signatures
 */

public class Balloon {
	private static int numBalloons = 0;
	private static int numPopped = 0;
	private String color;
	private int amount; // 0<=amount<=capacity
	private int capacity; // 0<=capacity
	private boolean isPopped; // balloons can only be popped once and can never
								// be unpopped
	// if isPopped then capacity and amount should be 0
	
	public static final String[] CAMPUSES = {"a","b","c"};

	public static int getNumBalloons() {
		return numBalloons;
	}

	public static int getNumPopped() {
		return numPopped;
	}

	public String getColor() {
		return color;
	}

	public int getAmount() {
		return amount;
	}

	public int getCapacity() {
		return capacity;
	}

	public boolean isPopped() {
		return isPopped;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setIsPopped(boolean isPopped) {
		this.isPopped = isPopped;
	}

	// Initialization
	public Balloon(String c) {
		this.amount = 0;
		this.capacity = 100;
		this.isPopped = false;
		this.color = c;
		numBalloons++;
	}

	public Balloon(int capacity,String c) {
		this.amount = 0;
		this.capacity = capacity;
		this.isPopped = false;
		this.color = c;
		Balloon.numBalloons++;
	}

	public void inflate(int amount) {
		if(amount<0){
			return;
		}
		int current = this.amount + amount;
		if (current > capacity || isPopped() == true) {
			setIsPopped(true);
			setAmount(0);
			setCapacity(0);
			numPopped++;
			return;
		}
		this.setAmount(current);
		return;
	}

	public void deflated(int amount) {
		if (isPopped()) {
			return;
		}
		int current = this.amount - amount;
		if (current < 0) {
			setAmount(0);
			return;
		}
		setAmount(current);
		return;
	}

	public String toString() {
		String s = "";
		s = s + "amount=" + this.amount;
		s = s + " capacity=" + this.capacity;
		s = s + " color=" + this.color;
		s = s + " popped=" + this.isPopped;
		return s;
	}
}

