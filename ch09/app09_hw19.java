// ���D - �_�����O

class Data {
    private String name;
	private Test score;
	
	public Data(String n, int eng, int m) {
	    name = n;
		score = new Test(eng, m);
	}
	
	public void show() {
	    System.out.println("�ǥͩm�W�G" + name);
		System.out.println("�^�妨�Z�G" + score.english);
		System.out.println("�ƾǦ��Z�G" + score.math);
		System.out.println("�������Z�G" + ( new Test().avg(score.english, score.math)) ); 
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
		} 
		
		public double avg(int eng, int m) {
		    return (eng + m) / 2.0;
		}
	}
}

class app09_hw19 {
    public static void main(String args[]) {
	    Data stu = new Data("Annie", 85, 92);
		stu.show();
	}
}