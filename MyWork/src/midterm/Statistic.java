package midterm;

public class Statistic {
	private float value;
	public Statistic(){
		value=(float)0;
	}
	public float getValue(){
		return value;
	}
	public float addValue(float value){
		return this.value= value;
	}
	public String toString(){
		String s = this.getValue()+"";
		return s;
	}
}
