// hw11_05, ������@���d��
interface Math {
    void show();   // �i�ٲ� public  �G�u��H��ơv�����u��ŧi�� public(�Τ��ŧi), ����ŧi�� protected �� private
	               //        abstract�G�u��H��ơv�u�n�w�q�W�١A���Ωw�q�B�z�覡
	               //           final�G��Ʀ��������]�w���
				   // �������ŧi���u��H��ơv�@�w���n�Q��@�A���M�|�����~(����@ div ���)�G
				   //  error: Compute is not abstract and does not override abstract method div(int,int) in Math
	void add(int a, int b);
	void sub(int a, int b);
	void mul(int a, int b);
	void div(int a, int b);
}

class Compute implements Math {
    int ans = 0;
	public void show(){
	    System.out.println("ans = " + ans);
	}
    public void add(int a, int b){
	    ans = a + b;
	}
	public void sub(int a, int b){
	    ans = a - b;
	}
	public void mul(int a, int b){
	    ans = a * b;
	}
	public void div(int a, int b){
	    ans = a / b;
	}
}

public class app11_hw05 {
    public static void main(String args[]) {
	    Compute cmp = new Compute();
		cmp.div(17, 5);
		cmp.show();
	}
}
