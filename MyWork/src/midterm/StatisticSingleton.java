package midterm;

public class StatisticSingleton {
	private float value=(float) 0;
	private StatisticSingleton(){};
	public synchronized float getValue(){
		return value;
	}
}
	