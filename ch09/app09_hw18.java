// 習題 - 匿名內部類別
public class app09_hw18 {
    public static void main(String args[]) {
	    System.out.println("圓面積為： " + 
		    ( 
			    new CCircle() { 
			        double show(double r){
                        radius = r;					
					    return pi*radius*radius;
					}
			    }
		    ).show(3)
		);
	}
	static class CCircle {
	    public double pi = 3.14;
		public double radius;
		
		public CCircle() {
		}
		
		public CCircle(double r) {
		    radius = r;
		}
	}
}