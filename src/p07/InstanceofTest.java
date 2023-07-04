package p07;

class Pen{
	public void write() {
		System.out.println("펜");
	}
	
}
class BallPen extends Pen{
	public void write() {
		System.out.println("볼펜");
	}
}

public class InstanceofTest {
	public static void main(String[] args) {
	Pen p1=new Pen();
	Pen p2=new BallPen();// 둘다 펜이라고 부를 수 있음
	
	System.out.println(p1 instanceof Pen);//true
	System.out.println(p2 instanceof Pen);//true
	
	System.out.println(p1 instanceof BallPen);//false
	System.out.println(p2 instanceof BallPen);//true
	}
	
}
