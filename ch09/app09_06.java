class CCircle {
    private static int count = 0;
	private static double pi = 3.14; // 「類別變數」(class variable)：由所有的物件共享，
	                                 // 每一個物件的 class variable 均相同，
									 // 若變更某個物件的 class variable, 
									 // 其它物件的 class variable 也將隨之更改。
									 // class variable 可以簡省記憶體空間，尤其是大量建立物件的時候
									 //
									 
	private double radius;           // 「實例變數」(instance variable)：變數各自獨立，存於不同的記憶體
	
	public CCircle() {
	    this(1.0);
	}
	
	public CCircle(double r) {
	    radius = r;
		count++;
	}
	
	public void show() {
	    System.out.println("area = " + pi*radius*radius);
	}
	// 加上 static 變成類別函數(class method), app09_07, 可由類別直接呼叫，不用透過物件
	public static void show_count() {
	    System.out.println(count + "object(s) created ");
									 // this 是代表呼叫該函數的物件，
									 // 如今 class variable 既已不需要物件來呼叫，
									 // this 也自然不能夠存在於 class variable 的內部。
		// System.out.println(this.count + "object(s) created ");
		                             // app09_06.java:30: error: non-static variable this 
									 // cannot be referenced from a static context
	}
}

public class app09_06 {
    public static void main(String args[]) {
	    CCircle cir1 = new CCircle();
		cir1.show_count();
		CCircle cir2 = new CCircle(2.0);
		CCircle cir3 = new CCircle(4.3);
		cir1.show_count();
		cir2.show_count();
		cir3.show_count();
	}
}