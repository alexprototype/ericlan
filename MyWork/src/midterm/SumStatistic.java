package midterm;

public class SumStatistic extends Statistic{
	private float value;
	
	
	public SumStatistic(){
		this.value=0;
	}
	
	public float addValue(float value){
		return this.value+=value;
	}
	
	public String toString(){
		String s = this.value+"";
		return s;
	}
	
}
