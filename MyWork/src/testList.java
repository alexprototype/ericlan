import java.util.ArrayList;

public class testList {
	private static ArrayList<Integer> List;
	public static void main(String[] args) {
		List = new ArrayList<Integer>();
		for(int i=1; i<=3; i++){
			List.add(i);
		}
		
		System.out.println(List);
		
		int[] numList = new int[10]; 
		for(int i=1;i<=10;i++){
			numList[i-1]=i;
		}
		for(int e: numList){
			System.out.println(e);
			
		}
	}
}
