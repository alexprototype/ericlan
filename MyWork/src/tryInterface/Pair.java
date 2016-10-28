package tryInterface;

public class Pair<Type> {
	private Type x;
	private Type y;
	private static int numOfPairs=0;
	public Pair(Type x, Type y){
		this.x = x;
		this.y = y;
		numOfPairs++;
	}
	
	public static int getNumOfPairs(){
		return Pair.numOfPairs;
	}
}
