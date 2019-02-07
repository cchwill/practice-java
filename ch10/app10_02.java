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
	
	// �p�G�����O�����h�ӫغc���A�i�z�L super() �ǻ��S�w�޼ƭӼƤΨ䫬�A�A
	// �ӫ��w�����O�����S�w�غc�l
	// super() �M this() �������g�b�l���O�غc�������Ĥ@��A�G�L�k�P�ɦs�b�P�@�ӫغc����
	// this() �i�ΨөI�s�P�@���O������L�غc��
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