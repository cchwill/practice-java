// ���D - �_�����O

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;

class Data {
    private String name;
	private Test score;
	private int[] arrayScore = new int[2];
	private List<Integer> listScore = new ArrayList<>();
	
	public Data(String n, int eng, int m) {
	    name = n;
		score = new Test(eng, m);
	}
	
	public void show() {
	    System.out.println("�ǥͩm�W�G" + name);
		System.out.println("�^�妨�Z�G" + score.english);
		System.out.println("�ƾǦ��Z�G" + score.math);
		//System.out.println("�������Z�G" + ( new Test().avg(score.english, score.math)) ); 
		System.out.println("�������Z�G" + this.avg(score.english, score.math));
		System.out.println("�������Z_array�G" + Data.findAverageUsingStream(arrayScore));
		//System.out.println("�������Z_lambda�G" + (arrayScore.forEach(n -> {sum += n;}) / arrayScore.length) );
		System.out.println("�������Z_lambda�G" + ((double) Arrays.stream(arrayScore).sum() / arrayScore.length));
	}
	
	public int addIntData(int num1, int num2) {
	    return num1 + num2;
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
			listScore.add(eng);
			listScore.add(m);
		} 
		
		public double avg(int eng, int m) {
		    return (eng + m) / 2.0;
		}
	}
}

class app09_hw20_3 {
    public static void main(String args[]) {
	    Data stu = new Data("Annie", 85, 92);
		stu.show();
	}
}