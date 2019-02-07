// app09_15, 撰寫內部類別
public class app09_15 {
    public static void main(String args[]) {
	    Caaa aa = new Caaa();
		aa.set_num(5);
	}
	
	// 在類別的內部也可以定義另一個類別
	// 如果在類別 A 內部再定義一個類別 B, 
	// 這種結構稱為巢狀類別 (nested classes), 
	// 此時的類別 A 稱為外部類別 (outer class), 而類別 B 則稱為內部類別 (inner class)
	// 
	// 因為是在 static 函數內建立內部類別 Caaa 的物件 aa (line 3: Caaa aa = Caaa();)，
	// 由於 static 函數只能存取 static 成員，因此別無選擇，
	// 內部類別 Caaa 必須宣告成 static 才行。
	static class Caaa {
	    int num;
		void set_num(int n) {
		    num = n;
			System.out.println("num = " + num);
		}
	}
}