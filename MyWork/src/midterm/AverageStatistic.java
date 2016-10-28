package midterm;

public class AverageStatistic extends Statistic {
	private float sum=0;
	private static int count;
	
	public AverageStatistic(){
		super();
	}
	
	public float addValue(float value){
		count++;
		return this.sum+=value;
	}
	public float getSum(){
		return this.sum;
	}
	
	public float getValue(){
		return this.sum/count;
	}
	
	public int getCount(){
		return count;
	}
	
	public String toString(){
		String s = this.sum+"/"+count+"="+this.sum/count;
		return s;
	}
}
