// app09_17, �ΦW�������O(anonymous inner class)
public class app09_17 {
    public static void main(String args[]) {
	    (
		    new Caaa() {
		        void set_num (int n) {
			        num = n;
				    System.out.println("num = " + num);
			    }
		    }
		).set_num(5);
	}
	
	static class Caaa {
	    int num;
	}
}