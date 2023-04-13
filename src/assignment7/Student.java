package assignment7;

public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int attemptedCredits;
	private int passingCredits;
	private double totalGrade;
	private double bearBucks;
	
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void submitGrade(double grade, int credit) {
		this.totalGrade += grade * credit; 
		this.attemptedCredits += credit; 
		if (grade >= 1.7){
			this.passingCredits += credit; 
		}
	}

	public int getTotalAttemptedCredits() {
		return this.attemptedCredits;
	}
	
	public int getTotalPassingCredits() {
		return this.passingCredits;
	}
	
	public double calculateGradePointAverage() {
		return this.totalGrade/this.getTotalAttemptedCredits();
	}
	
	public String getClassStanding() {
		if (this.passingCredits < 30) {
			return "First Year";
		}
		else if (this.passingCredits < 60) {
			return "Sophomore";
		}
		else if (this.passingCredits < 90) {
			return "Junior";
		}
		else {
			return "Senior";
		}
	}
	
	public boolean isEligibleForPhiBetaKappa() {
		if (this.passingCredits >= 98 && this.calculateGradePointAverage() >= 3.60) {
			return true;
		}
		else if (this.passingCredits >= 75 && this.calculateGradePointAverage() >= 3.80) {
			return true;
		}
		else {
			return false; 
		}
	}
	
	public double getBearBucksBalance() {
		return this.bearBucks;
	}
	
	public void depositBearBucks(double amount) {
		this.bearBucks += amount; 
	}
	
	public void deductBearBucks(double amount) {
		this.bearBucks -= amount;
	}
	
	public double cashOutBearBucks(){
		double money = this.getBearBucksBalance();
		this.bearBucks = 0; 
		if (money > 10) {
			return money - 10;
		}
		else {
			return 0;
		}
	}
	
	public Student createLegacy(String firstName, Student otherParent, boolean isHyphenated, int id) {
		Student baby;
		if (isHyphenated == true) {
			baby = new Student(firstName,this.lastName + '-' + otherParent.lastName, id);
		}
		else {
			baby = new Student(firstName, this.lastName, id);
		}
		baby.bearBucks = this.cashOutBearBucks() + otherParent.cashOutBearBucks();
		return baby;	
	}
	
	public String toString() {
		return this.getFullName() + " " + this.id;
	}
	
	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
