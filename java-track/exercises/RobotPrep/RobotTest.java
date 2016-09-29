package RobotPrep;

public class RobotTest {

	public static void main(String[] args) {
		Robot r = new Robot("Chappy", 5, 5, 10, "North");
		r.Rotate("down");
		System.out.println(r.toString());
	}

}
