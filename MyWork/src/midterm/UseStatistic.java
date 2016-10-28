package midterm;

public class UseStatistic {
	public static void main(String[] args) {
		Statistic stat = new Statistic();
		UseStatistic.test(stat);
		
		SumStatistic sumStat = new SumStatistic();
		UseStatistic.test(sumStat);
		
		AverageStatistic avgStat = new AverageStatistic();
		UseStatistic.test(avgStat);
		
		System.out.println(""+avgStat.getSum()); // Prints: 15.0
		System.out.println(""+avgStat.getCount()); // Prints: 6
		System.out.println(""+avgStat.getValue()); // Prints: 2.5
		System.out.println();
		MaxStatistic maxStat=new MaxStatistic();
		UseStatistic.test(maxStat);
		// Prints ...
		// 0.0 1.0 2.0 3.0 4.0 5.0
	}
	
	
	public static void test(Statistic s){
		for(int i=0;i<=5;i++){
			s.addValue(i);
			System.out.println(s+"");
			
		}	s.addValue(1);
		System.out.println(s+"");
		System.out.println();
	}
}
