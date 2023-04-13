package studio9;

import assignment7.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniversityDatabase {
	private final Map<String, Student> university = new HashMap<>();

	public void addStudent(String accountName, Student student) {
		university.put(accountName, student);
	}

	public int getStudentCount() {
		
		return university.size();
	}

	public String lookupFullName(String accountName) {
		
		if(university.containsKey(accountName))
			return university.get(accountName).getFullName();
		else
			return null;
	}

	public double getTotalBearBucks() {
		double total=0.0;
		for (Student student : university.values()){
			total +=student.getBearBucksBalance();
		}
		return total;
	}
}
