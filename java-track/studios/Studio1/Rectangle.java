package Studio1;

public class Rectangle {
	private int length, width;

	public Rectangle(int l, int w){
		this.length = l;
		this.width = w;
	}

	public boolean isSquare(){
		if(this.length == this.width){
			return true;
		}else{
			return false;
		}
	}

	public void compSize(Rectangle r){
		if(r.getArea() > this.getArea()){
			System.out.println("Your rectangle is smaller.");
		}else if(r.getArea() == this.getArea()){
			System.out.println("Both rectangles are of equal size.");
		}else{
			System.out.println("Your rectangle is larger.");
		}
	}

	public int getArea() {
		return this.length * this.width;
	}

	public int getPerimeter() {
		return 2 * this.length + 2 * this.width;
	}

	public static void main(String[] args){
		Rectangle r1 = new Rectangle(5, 5);
		Rectangle r2 = new Rectangle(5, 10);

		r1.compSize(r2);
		System.out.println(r1.getArea());
	}
}
