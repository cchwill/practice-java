class CCircle {
    private static double pi = 3.14;
	private double radius;
	
	public CCircle() {
	    System.out.println("CCircle() constructor called ");
	}
	
	public void setRadius(double r) {
	    radius = r;
	    System.out.println("raidus = " + radius);
	}
	
	public void show() {
	    System.out.println("area = " + pi*radius*radius);
	}
}

class CCoin extends CCircle {
    private int value;
	
	public CCoin() {
	    System.out.println("CCoin() constructor called ");
		// Java 在執行子類別的建構元之前，會先呼叫父類別的建構元，
		// 其目的是為了要幫助繼承自父類別的成員做初始化的動作。
	}
	
	public void setValue(int t) {
	    value = t;
		System.out.println("value = " + value);
	}
}

public class app10_01 {
    public static void main(String args[]) {
	    CCoin coin = new CCoin();
		coin.setRadius(2.0);
		coin.show();
		coin.setValue(5);
	}
}

/*
CCircle() constructor called
CCoin() constructor called
raidus = 2.0
area = 12.56
value = 5
*/