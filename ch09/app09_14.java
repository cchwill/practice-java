// app09_14, ���󪺽Ʋ�
class Caaa {
    private int num = 0;
	
	void set_num(int n) {
	    num = n;
		System.out.println("num = " + num);
	}
}

// p2-3, �b�@�Ӫ��[�ɦW�� java ���ɮ�(*.java)�̥u�঳�@�� public ���O
//       �p�G�N�@�����O�ŧi�� public, �N�����N�ɮצW�٩R�W���o�����O���W��
public class app09_14 {
    public static void main(String args[]) {
	    Caaa aa = new Caaa();
        aa.set_num(5);		
	}
}