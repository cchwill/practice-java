// ���D - �������O�GNameCard 
class NameCard {
    private String name = "";
	private String address = "";
	private Phone data;
	
	// �P���O�P�W�� "�غc�l"�A�i�ΨӪ�l�ƪ���õ���
	// �Y���� assign �ȷ|�X�{�G error: <identifier> expected
	//       name = n;
    //           ^
	// "�غc�l" ���W�٭n�����O�W�٤@�ˡA�B�H public ��׹��l 
	// �Y���� class �}�Y�A�|�~�H���ŧi�����O�A���O�W�٤���n���j�A�� "{" 
	// ���~�T���� error: '{' expected
	public NameCard(String n, String a, String co, String ce) {
	    name = n;
		address = a;
		// �Y class member �ŧi�ɥ�����ơA�b���ݥ� new �@�ӹ���X��
		// �Y�S�� new �@�ӹ���|�X�{�G
		// error: cannot find symbol
		//        data = Phone(co, ce);
        //               ^
        // symbol:   method Phone(String,String)
        // location: class NameCard
		data = new Phone(co, ce);
	}
	
	class Phone {
	    private String company = "";
		private String cell = "";
		
		public Phone (String s1, String s2) {
		    company = s1;
			cell = s2;
		}
		
		// Phone ���O������k phone_show() ���t�@�ؼg�k�A�n�f�t�~�����O NameCard ����k show()
		public void phone_show() {
		    System.out.println("���q�q��: " + company + "\n������X: " + cell);
		}
		
		//public String phone_show() {
		//    return("���q�q��: " + company + "\n������X: " + cell);
		//}
	}
	
	public void show() {
	    System.out.println("�n�ͩm�W: " + name);
		System.out.println("�p���a�}: " + address);
		data.phone_show();
		//System.out.println(data.phone_show());
	}
}

public class app09_hw17 {
    // �Y main �e�����׹��l static, void ���ǥ洫�h�|�X�{�G
	//   error: invalid method declaration; return type required
    //     public void static main(String args[]) {
    //                        ^
	public static void main(String args[]) {
	    // �Y�H���s�b�� class �ŧi�G Namecard first = new Namecard(...);  card �� c �O�p�g
		// �|�X�{ 
		//   error: cannot find symbol
		//        Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");
        //        ^
        //   symbol:   class Namecard
        //   location: class app09_ex17
	    NameCard first = new NameCard("Andy", "123City", "2345-6789", "0911-336600");
		first.show();
	}
}