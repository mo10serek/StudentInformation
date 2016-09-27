import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StudentInformantion {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Scanner reader = new Scanner(System.in);
		InputStreamReader r = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(r);
		
		String firstName = null;
		String lastName = null;
		char initial = 0;
		GRADES grade;
		String gradeList;
		boolean identify = false; 
		
		System.out.println("write your first name");	
		firstName = input.nextLine();
		
		System.out.println("write your last name");	
		lastName = input.nextLine();
		
		System.out.println("write your initial");	
		initial = reader.next().charAt(0);
		
		System.out.println("write your grade");	
		gradeList = br.readLine();
		
		System.out.println("write your identify");	
		identify = input.nextBoolean();
		
		grade = GRADES.valueOf(gradeList);
		
		//System.out.println(newStudent.setfirstName(firstName), newStudent.setlastName(lastName), newStudent.setinitial(initial), newStudent.setgrade(grade), newStudent.setidentify(identify));
		Student newStudent = new Student(firstName, lastName, initial, grade, identify);
		
		System.out.println(newStudent.getfirstName() + " " + newStudent.getlastName() + " "  + newStudent.getinitial() + " " + newStudent.getgrade() + " " + newStudent.getidentify());
		
	}

}

class Student {
    private String firstName;
    private String lastName;
    private char initial;
    private GRADES grade;
    private boolean identify;
    

    // constructor
    public Student(String firstName, String lastName, char initial, GRADES grade, boolean identify) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.initial = initial;
    	this.grade = grade;
    	this.identify = identify;
    }

    // getter
    public String getfirstName() { return firstName; }
    public String getlastName() { return lastName; }
    public char getinitial() { return initial; }
    public GRADES getgrade() { return grade; }
    public boolean getidentify() { return identify; }
    
    // setter
    public void setfirstName(String firstName) { this.firstName = firstName; }
    public void setlastName(String lastName) { this.lastName = lastName; }
    public void setinitial(char initial) { this.initial = initial; }
    public void setgrade(GRADES grade) { this.grade = grade; }
    public void setidentify(boolean identify) { this.identify = identify; }
    
 }

enum GRADES { 
	  grade12("grade 12"),
	  grade11("grade 11"),
	  grade10("grade 10"),
	  grade9("grade 9"),
	  grade8("grade 8"),
	  grade7("grade 7"),
	  grade6("grade 6"),
	  grade5("grade 5"),
	  grade4("grade 4"),
	  grade3("grade 3"),
	  grade2("grade 2"),
	  grade1("grade 1"),
	  kindergarden("kindergarden");
	  
	  private final String stringGrade;
	  
	  GRADES(String grade){
		  	this.stringGrade = grade;
	  }
	 
	  public String setGrade(){
		  return this.stringGrade;
	  }
}