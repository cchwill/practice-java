// 習題 - 匿名內部類別
// 此例不同於 app09_hw18, 不需預設的 CCircle 建構子, 只是 CCircle(double r) 的 r 可以用不到
public class app09_hw18_3 {
    public static void main(String args[]) {
	    System.out.println("圓面積為： " + 
		    ( 
			    // 圓面積為： 78.5  <= 直接使用建構子將 radius 設定為 5 而得到的面積
			    new CCircle(5) { 
			        double show(double r){
					    // 圓面積為： 28.259999999999998  <= 使用匿名內部類別，從 show(3) 設定 radius 為 3
					    //radius = r;
					    return pi*radius*radius;
					}
			    }
		    ).show(3)
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