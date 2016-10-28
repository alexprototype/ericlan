package midterm;

public class UseBalloon {
	private static Balloon[] balloons;
	
	public static Balloon[] bunchOfBalloon(int count, String color){
		balloons = new Balloon[count];
		for(int i=0;i<count;i++){
			balloons[i] = new Balloon(i,color);
		}
		return balloons;
	}
	
	public static void inflateAll(int amount){
		for(int i=0;i<balloons.length;i++){
			balloons[i].inflate(amount);
		}
	}
	
	public static void main(String [] arg){
		Balloon b1 = new Balloon(10,"red");
		Balloon b2 = new Balloon(20,"green");
		b1.inflate(5);
		b1.inflate(5);
		b2.inflate(10);
		b2.inflate(10);
		b2.inflate(5); //popped
		if(b1.isPopped()==true){
			System.out.println("This Balloon b1 is popped");
		}else{
			System.out.println("This Balloon b1 isn't popped");
		}
		if(b2.isPopped()==true){
			System.out.println("This Balloon b2 is popped");
		}else{
			System.out.println("This Balloon b2 isn't popped");
		}
		
		bunchOfBalloon(20, "red");
		inflateAll(10);
	}
}
