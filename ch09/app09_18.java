// app09_18, �ΦW�������O�A
//           �ߺD�W�|��o�ǵ{���X"��"�b�u�u���X��
public class app09_18 {
    public static void main(String args[]) {
	    (new Caaa(){void set_num(int n) {int num = n; 
		 System.out.println("num = " + num);}}).set_num(5);
	}
	
	static class Caaa {
	    int num;
	}
}