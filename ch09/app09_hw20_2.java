// 習題 - 巢狀類別

import java.util.Arrays;

class Data {
    private String name;
	private Test score;
	private int[] arrayScore = new int[2];
	
	public Data(String n, int eng, int m) {
	    name = n;
		score = new Test(eng, m);
	}
	
	public void show() {
	    System.out.println("學生姓名：" + name);
		System.out.println("英文成績：" + score.english);
		System.out.println("數學成績：" + score.math);
		//System.out.println("平均成績：" + ( new Test().avg(score.english, score.math)) ); 
		System.out.println("平均成績：" + this.avg(score.english, score.math));
		System.out.println("平均成績_array：" + Data.findAverageUsingStream(arrayScore));
	}
	
	public double avg(int eng, int m) {
	    return (eng + m) / 2.0;
	}
	
	public static double findAverageUsingStream(int[] array) {
	    return Arrays.stream(array).average().orElse(Double.NaN);
	}
	
	class Test {
	    private int english = 0;
		private int math = 0;
		private double avgScore = 0.0;
		
		public Test() {
		}
		
		public Test(int eng, int m) {
		    english = eng;
			math = m;
			arrayScore[0] = eng;
			arrayScore[1] = m;
		} 
		
		public double avg(int eng, int m) {
		    return (eng + m) / 2.0;
		}
	}
}

class app09_hw20_2 {
    public static void main(String args[]) {
	    Data stu = new Data("Annie", 85, 92);
		stu.show();
	}
}