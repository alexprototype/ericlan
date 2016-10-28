package rangeIterator;

public class RangeMain {
	public static void main(String[] args) {
		RangeIterator range= new RangeIterator(0,10);
		while(range.hasNext()){
			System.out.println(range.next());
		}
	}
}
