// ���D - �ΦW�������O
public class app09_hw18 {
    public static void main(String args[]) {
	    System.out.println("�ꭱ�n���G " + 
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