// app09_15, ���g�������O
public class app09_15 {
    public static void main(String args[]) {
	    Caaa aa = new Caaa();
		aa.set_num(5);
	}
	
	// �b���O�������]�i�H�w�q�t�@�����O
	// �p�G�b���O A �����A�w�q�@�����O B, 
	// �o�ص��c�٬��_�����O (nested classes), 
	// ���ɪ����O A �٬��~�����O (outer class), �����O B �h�٬��������O (inner class)
	// 
	// �]���O�b static ��Ƥ��إߤ������O Caaa ������ aa (line 3: Caaa aa = Caaa();)�A
	// �ѩ� static ��ƥu��s�� static �����A�]���O�L��ܡA
	// �������O Caaa �����ŧi�� static �~��C
	static class Caaa {
	    int num;
		void set_num(int n) {
		    num = n;
			System.out.println("num = " + num);
		}
	}
}