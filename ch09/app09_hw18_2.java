// ���D - �ΦW�������O
public class app09_hw18_2 {
    public static void main(String args[]) {
	    System.out.println("�ꭱ�n���G " + 
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