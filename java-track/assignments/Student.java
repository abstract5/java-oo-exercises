
public class Student {
	private String name;
	private int studentID, credits;
	private double GPA;
	
	public Student(String name, int studentID, int credits, double GPA){
		this.name = name;
		this.studentID = studentID;
		this.credits = credits;
		this.GPA = GPA;
	}
	
	public Student(String firstName, String lastName, int studentID){
		this.name= firstName + " " + lastName;
		this.studentID = studentID;
		this.credits = 0;
		this.GPA = 0;
	}
	
	public String getClassStanding(){
		if(this.credits < 30){
			return "Freshman";
		}else if(this.credits >= 30 && this.credits < 60){
			return "Sophomore";
		}else if(this.credits >=60 && this.credits < 90){
			return "Junior";
		}else{
			return "Senior";
		}
	}
	
	public double submitGrade(double grade, int credits){
		double qualityScore = (grade * credits) + (this.GPA * this.credits);
		this.credits+=credits;
		this.GPA = Math.round((qualityScore / (this.credits))*1000.0)/1000.0;
		return this.GPA;
	}
	
	public double computeTuition(){
		double cpc = 0.0;
		if(this.credits % 15 == 0){
			return (this.credits / 15.0) * 20000.0;
		}else if(this.credits < 15){
			cpc = 1333.33;
			return Math.round((cpc * this.credits) * 100.0)/100.0;
		}else{
			cpc = 1333.33;
			return (cpc * (this.credits - 15) + 20000.0);
		}
	}
	
	public Student createLegacy(Student s1, Student s2){
		String legName = s1.getName() + " " + s2.getName();
		int legStudentID = s1.getStudentID() + s2.getStudentID();
		double legGPA = (s1.getGPA() + s2.getGPA())/2.0;
		int legCredits = s2.getCredits();
		if(s1.getCredits() > s2.getCredits()){
			legCredits = s1.getCredits();
		}
		
		return new Student(legName, legStudentID, legCredits, legGPA);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	
	public String toString(){
		return this.name + " " + this.studentID;
	}
}
