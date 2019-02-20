// hw11_05, 介面實作的範例
interface Math {
    void show();   // 可省略 public  ：「抽象函數」成員只能宣告為 public(或不宣告), 不能宣告為 protected 或 private
	               //        abstract：「抽象函數」只要定義名稱，不用定義處理方式
	               //           final：資料成員必須設定初值
				   // 介面內宣告的「抽象函數」一定都要被實作，不然會有錯誤(未實作 div 函數)：
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
