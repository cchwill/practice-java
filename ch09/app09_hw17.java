// 習題 - 內部類別：NameCard 
class NameCard {
    private String name = "";
	private String address = "";
	private Phone data;
	
	// 與類別同名的 "建構子"，可用來初始化物件並給值
	// 若直接 assign 值會出現： error: <identifier> expected
	//       name = n;
    //           ^
	// "建構子" 的名稱要跟類別名稱一樣，且以 public 當修飾子 
	// 若仍用 class 開頭，會誤以為宣告成類別，類別名稱之後要接大括號 "{" 
	// 錯誤訊息為 error: '{' expected
	public NameCard(String n, String a, String co, String ce) {
	    name = n;
		address = a;
		// 若 class member 宣告時未實體化，在此需先 new 一個實體出來
		// 若沒有 new 一個實體會出現：
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
		
		// Phone 類別中的方法 phone_show() 的另一種寫法，要搭配外部類別 NameCard 的方法 show()
		public void phone_show() {
		    System.out.println("公司電話: " + company + "\n手機號碼: " + cell);
		}
		
		//public String phone_show() {
		//    return("公司電話: " + company + "\n手機號碼: " + cell);
		//}
	}
	
	public void show() {
	    System.out.println("好友姓名: " + name);
		System.out.println("聯絡地址: " + address);
		data.phone_show();
		//System.out.println(data.phone_show());
	}
}

public class app09_hw17 {
    // 若 main 前面的修飾子 static, void 順序交換則會出現：
	//   error: invalid method declaration; return type required
    //     public void static main(String args[]) {
    //                        ^
	public static void main(String args[]) {
	    // 若以不存在的 class 宣告： Namecard first = new Namecard(...);  card 的 c 是小寫
		// 會出現 
		//   error: cannot find symbol
		//        Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");
        //        ^
        //   symbol:   class Namecard
        //   location: class app09_ex17
	    NameCard first = new NameCard("Andy", "123City", "2345-6789", "0911-336600");
		first.show();
	}
}