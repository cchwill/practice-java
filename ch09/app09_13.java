// app09_13, 傳遞物件陣列到函數
class CCircle {
    private static double pi = 3.14;
    private double radius = 0.0;
    public CCircle(double r) {
	    radius = r;
		//System.out.println("radius = " + r);
	}
	
	public static double compare(CCircle c[]) {
	    double max = 0.0;
		for (int i = 0; i < c.length; i++) {
		    if (c[i].radius > max)
			    max = c[i].radius;
		}
		return max;
	}
}

class app09_13 {
    public static void main(String args[]) {
        CCircle cir[];
	    cir = new CCircle[3];
	    cir[0] = new CCircle(1.0);
	    cir[1] = new CCircle(4.0);
	    cir[2] = new CCircle(2.0);
		
		// compare method 直接宣告成 static, 方便由 CCircle 類別來呼叫
		System.out.println("Largest radius = " + CCircle.compare(cir));
	}
}