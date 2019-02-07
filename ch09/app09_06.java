class CCircle {
    private static int count = 0;
	private static double pi = 3.14; // �u���O�ܼơv(class variable)�G�ѩҦ�������@�ɡA
	                                 // �C�@�Ӫ��� class variable ���ۦP�A
									 // �Y�ܧ�Y�Ӫ��� class variable, 
									 // �䥦���� class variable �]�N�H�����C
									 // class variable �i�H²�ٰO����Ŷ��A�ר�O�j�q�إߪ��󪺮ɭ�
									 //
									 
	private double radius;           // �u����ܼơv(instance variable)�G�ܼƦU�ۿW�ߡA�s�󤣦P���O����
	
	public CCircle() {
	    this(1.0);
	}
	
	public CCircle(double r) {
	    radius = r;
		count++;
	}
	
	public void show() {
	    System.out.println("area = " + pi*radius*radius);
	}
	// �[�W static �ܦ����O���(class method), app09_07, �i�����O�����I�s�A���γz�L����
	public static void show_count() {
	    System.out.println(count + "object(s) created ");
									 // this �O�N��I�s�Ө�ƪ�����A
									 // �p�� class variable �J�w���ݭn����өI�s�A
									 // this �]�۵M������s�b�� class variable �������C
		// System.out.println(this.count + "object(s) created ");
		                             // app09_06.java:30: error: non-static variable this 
									 // cannot be referenced from a static context
	}
}

public class app09_06 {
    public static void main(String args[]) {
	    CCircle cir1 = new CCircle();
		cir1.show_count();
		CCircle cir2 = new CCircle(2.0);
		CCircle cir3 = new CCircle(4.3);
		cir1.show_count();
		cir2.show_count();
		cir3.show_count();
	}
}