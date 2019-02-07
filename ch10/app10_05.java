class CCircle {
    protected static double pi = 3.14;
	protected double radius;

    public void show() {
	    System.out.println("area = " + pi*radius*radius);
	}
}

class CCoin extends CCircle {
    private int value;
	
	public CCoin(double r, int v) {
	    radius = r;
		value = v;
		System.out.println("radius = " + radius + ", value = " + value);
	}
}

public class app10_05 {
    public static void main(String args[]) {
	    CCoin ccoin = new CCoin(2.5, 10);
		ccoin.show();
	}
}

/*
radius = 2.5, value = 10
area = 19.625
*/