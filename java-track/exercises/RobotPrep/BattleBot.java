package RobotPrep;

public class BattleBot extends Robot{
	private String weapon;
	private int health;
	
	public BattleBot(String name, int xPos, int yPos, int speed, String direction, String weapon, int health){
		super(name, xPos, yPos, speed, direction);
		this.weapon = weapon;
		this.health = health;
	}
	
	public void Attack(BattleBot r){
		int damage = (int)Math.random()*5 +1;
		System.out.println("The bot attacks with it's " + this.weapon + " and deals " + damage + "!");
		r.setHealth(r.getHealth() - damage);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
}
