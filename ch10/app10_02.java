class CCircle {
    private static double pi = 3.14;
	private double radius;
	
	public CCircle() {
	    System.out.println("CCircle() constructor called ");
	}
	
	public CCircle(double r) {
	    System.out.println("CCircle(double r) constructor called ");
		radius = r;
	}
	
	public void show() {
	    System.out.println("area = " + pi*radius*radius);
	}
}

class CCoin extends CCircle {
    private int value;
	
	public CCoin() {
	    System.out.println("CCoin() constructor called ");
	}
	
	// 如果父類別內有多個建構元，可透過 super() 傳遞特定引數個數及其型態，
	// 來指定父類別內的特定建構子
	// super() 和 this() 都必須寫在子類別建構元內的第一行，故無法同時存在同一個建構元內
	// this() 可用來呼叫同一類別內的其他建構元
	public CCoin(double r, int v) {
	    super(r);
		value = v;
		System.out.println("CCoin(double r, int v) constructor called ");
	}
}

public class app10_02 {
    public static void main(String args[]) {
	    CCoin coin1 = new CCoin();
		CCoin coin2 = new CCoin(2.5, 10);
		coin1.show();
		coin2.show();
	}
}

/*
CCircle() constructor called
CCoin() constructor called
CCircle(double r) constructor called
CCoin(double r, int v) constructor called
area = 0.0
area = 19.625
*/