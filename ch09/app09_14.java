// app09_14, 物件的複習
class Caaa {
    private int num = 0;
	
	void set_num(int n) {
	    num = n;
		System.out.println("num = " + num);
	}
}

// p2-3, 在一個附加檔名為 java 的檔案(*.java)裡只能有一個 public 類別
//       如果將一個類別宣告成 public, 就必須將檔案名稱命名為這個類別的名稱
public class app09_14 {
    public static void main(String args[]) {
	    Caaa aa = new Caaa();
        aa.set_num(5);		
	}
}