// app09_18, 匿名內部類別，
//           習慣上會把這些程式碼"擠"在短短的幾行
public class app09_18 {
    public static void main(String args[]) {
	    (new Caaa(){void set_num(int n) {int num = n; 
		 System.out.println("num = " + num);}}).set_num(5);
	}
	
	static class Caaa {
	    int num;
	}
}