package Studio1;

public class BaseballPlayer {
	private String name, swing;
	private int jNumber, runs, rbis, games;

	public BaseballPlayer(String name, String swing, int jNumber, int runs, int rbis, int games) {
		this.name = name;
		this.swing = swing;
		this.jNumber = jNumber;
		this.runs = runs;
		this.rbis = rbis;
		this.games = games;
	}
	
	public String playedGame(int pRbis, int pRuns){
		this.games+=1;
		this.runs+=pRuns;
		this.rbis+=pRbis;
		
		return this.name + " scored " + pRbis + " rbi's and " + pRuns + " runs this game.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSwing() {
		return swing;
	}

	public void setSwing(String swing) {
		this.swing = swing;
	}

	public int getjNumber() {
		return jNumber;
	}

	public void setjNumber(int jNumber) {
		this.jNumber = jNumber;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getRbis() {
		return rbis;
	}

	public void setRbis(int rbis) {
		this.rbis = rbis;
	}

	public int getGames() {
		return games;
	}

	public void setGames(int games) {
		this.games = games;
	}
	
	public String toString(){
		return "Name: " + this.name + ", Jersey number: " + this.jNumber + ", Swing: " +
				this.swing + ", Runs: " + this.runs + ", RBI's: " + this.rbis + ", Games: " + this.games;
	}

	public static void main(String[] args) {
		BaseballPlayer bP = new BaseballPlayer("Shane", "Right-handed", 12, 5, 17, 9);
		System.out.println(bP.playedGame(12, 5));
		System.out.println(bP.toString());
	}

}
