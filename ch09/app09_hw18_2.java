// 習題 - 匿名內部類別
public class app09_hw18_2 {
    public static void main(String args[]) {
	    System.out.println("圓面積為： " + 
		    ( 
			    new CCircle(5) { 
			        void show(){
                        //radius = r;					
					    System.out.print(pi*radius*radius);
					}
			    }
		    )
		);
	}
	static class CCircle {
	    public double pi = 3.14;
		public double radius;
		
		//public CCircle() {
		//}
		
		public CCircle(double r) {
		    radius = r;
		}
	}
}