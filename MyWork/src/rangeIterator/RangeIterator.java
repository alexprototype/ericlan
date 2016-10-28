package rangeIterator;
import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
	private int start,stop,current,step;
	
	public RangeIterator(int start, int stop, int step){
		this.start = start;
		this.stop = stop;
		this.step = step;
		this.current = start; 				//current is next object
	}
	
	//Multiple constructor 
	public RangeIterator(int start, int stop){
		this(start,stop,1);
	}
	
	public int getCurrent(){
		return this.current;
	}
	
	@Override
	public boolean hasNext(){
		return this.current<this.stop;
	}
	
	public Integer next(){
		int previous = this.current;
		this.current += this.step;	//keep update current
		return previous;
	}
	
}
