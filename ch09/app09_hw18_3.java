// ���D - �ΦW�������O
// ���Ҥ��P�� app09_hw18, ���ݹw�]�� CCircle �غc�l, �u�O CCircle(double r) �� r �i�H�Τ���
public class app09_hw18_3 {
    public static void main(String args[]) {
	    System.out.println("�ꭱ�n���G " + 
		    ( 
			    // �ꭱ�n���G 78.5  <= �����ϥΫغc�l�N radius �]�w�� 5 �ӱo�쪺���n
			    new CCircle(5) { 
			        double show(double r){
					    // �ꭱ�n���G 28.259999999999998  <= �ϥΰΦW�������O�A�q show(3) �]�w radius �� 3
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