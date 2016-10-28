package midterm;

public class MaxStatistic extends Statistic{
	private float max=super.getValue();
	public MaxStatistic(){
		super();
	}	
	public float addValue(float value){
		
		if(this.max>value){
		}else{//max<value
			this.max = value;
		}
		return this.max;
	}
	
	public String toString(){
		String s = this.max+"";
		return s;
	}
}
