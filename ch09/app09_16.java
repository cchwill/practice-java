// app09_16, �b�غc���̫إߤ������O������
public class app09_16 {
    public app09_16() {
	    Caaa aa = new Caaa();
		aa.set_num(5);
	}
	
	public static void main(String args[]) {
	    app09_16 obj = new app09_16();
	}
	
	class Caaa {
	    private int num = 0;
	    void set_num(int n) {
		    num = n;
			System.out.println("num = " + num);
		}
	}
}