// app09_19, �Ѫ����O
class CBox {
    private int length;
	private int width;
	private int height;
	private CColor cr;
	
	public CBox(int l, int w, int h, String col) {
	    length = l;
		width = w;
		height = h;
		cr = new CColor(col);
	}
	
	class CColor {                      // �������O
	    private String color;
		
		public CColor(String clr) {     // Color �غc��
		    color = clr;
		}
		
		public void show_color() {
		    System.out.println("color = " + color);
		}
	}
	
	public void show() {
	    System.out.println("length = " + length);
		System.out.println("width = " + width);
		System.out.println("height = " + height);
		cr.show_color();
	}
}

public class app09_19 {
    public static void main(String args[]) {
	    CBox box = new CBox(2, 3, 4, "Blue");
		box.show();
	}
}