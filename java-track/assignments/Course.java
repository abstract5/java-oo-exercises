
public class Course {
	private String name;
	private int credits, remainingSeats;
	private Student[] roster;
	
	public Course(String name, int credits, int seats){
		this.name = name;
		this. credits = credits;
		this.remainingSeats = seats;
		this.roster = new Student[seats];
	}

	public String generateRoster(){
		String ros = "";
		for(int i = 0; i < this.roster.length; i++){
			if(this.roster[i] == null){
				return ros;
			}
			ros+=this.roster[i].getName() + "; ";
		}
		return ros;
	}
	
	public boolean addStudent(Student s){
		for(int i = 0; i < this.roster.length; i++){
			if(this.roster[i] == null){
				this.roster[i] = s;
				remainingSeats-=1;
				return true;
			}else if(this.roster[i].getName().equals(s.getName())){
				return false;
			}
		}
		return false;
	}
	
	public double averageGPA(){
		double avgGPA = 0.0;
		int students = 0;
		
		for(int i = 0; i < this.roster.length; i++){
			if(this.roster[i] != null){
				students++;
				avgGPA+=this.roster[i].getGPA();
			}
		}
		return avgGPA/students;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getRemainingSeats() {
		return remainingSeats;
	}

	public void setRemainingSeats(int remainingSeats) {
		this.remainingSeats = remainingSeats;
	}
	
	public String toString(){
		return this.name + " " + this.credits;
	}
}
