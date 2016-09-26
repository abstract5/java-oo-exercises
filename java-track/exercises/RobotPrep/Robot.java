package RobotPrep;

public class Robot {
	private String name, direction;
	private int xPos, yPos, speed;
	
	public Robot(String name, int xPos, int yPos, int speed, String direction){
		this.name = name;
		this.xPos = xPos;
		this.yPos = yPos;
		this.speed = speed;
		this.direction = direction;
	}
	
	public void Move() {
		switch(this.direction){
		case "North": this.yPos+=this.speed;
					  break;
		case "East": this.xPos+=this.speed;
					 break;
		case "South": this.yPos-=this.speed;
					   break;
		case "West": this.xPos-=this.speed;
					 break;
		}
	}
	
	public String toString() {
		return "Name: " + name + ", Position: " + "(" + xPos + ", " + yPos + "), " +
				"Speed: " + speed + ", Direction: " + direction;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getPos() {
		return "(" + xPos + ", " + yPos + ")";
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}
}
