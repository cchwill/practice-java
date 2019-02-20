// 介面的實作
interface iShape2D {
    final double PI = 3.14;
	abstract void area();
}

class CRectangle implements iShape2D {
    int width, height;
	
	public CRectangle (int w, int h) {
	    width = w;
		height = h;
	}
	
	public void area() {
	    System.out.println("area = " + width*height);
	}
}

class CCircle implements iShape2D {
    double radius;
	public CCircle (double r) {
	    radius = r;
	}
	
	public void area() {
	    System.out.println("area = " + PI*radius*radius);
	}
}

public class app11_04 {
    public static void main(String args[]) {
	    CRectangle rect = new CRectangle(5, 10);
		rect.area();
		
		CCircle cir = new CCircle(2.0);
		cir.area();
	}
}
