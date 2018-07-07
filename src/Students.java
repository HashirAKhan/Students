import java.util.ArrayList;
import java.util.List;

public class Students {
	private Student[] students;
	
	public Students(Student[] theStudents) {
		students = theStudents;
	}
	
	public String toString() {
		String output = "";
		
		for (Student s : students) {
			output += s.toString() + "\n";
		}
		
		return output;
	}
	
	public void alpha(){
	    for (int i = 0; i < students.length - 1; i++) {
	        for (int j = i + 1; j < students.length; j++) {
	            if (students[i].compareTo(students[j]) > 0) {
	                Student temp = students[i];
	                students[i] = students[j];
	                students[j] = temp;
	            }
	        }
	    }
	}
	
	public List<Student> getStudentInMajor(String major){
		List<Student> theStudents = new ArrayList<Student>();
		for (Student s : students) {
			if (s.getMajor() == major) {
				theStudents.add(s);
			}
		}
		
		return theStudents;
	}
}
