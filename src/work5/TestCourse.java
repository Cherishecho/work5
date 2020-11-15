package work5;

public class TestCourse {
	public static void main(String[] args) {
		Course course1=new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		coursel.addStudent("Peter Jones");
		coursel.addStudent("Kim Smith"); 
		coursel.addStudent("Anne Kennedy");
		course2.addStudentC("Peter Jones");
		course2.addStudent("MSteve Smith");
		System.out.println("Number of students in coursel: "+ course1.getNumberOfStudents());
		String[]students =course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i]+ ", ");
		System.out.println();
		System.out.print("Number of students in course2: "
				+ course2.getNumberOfStudents());
	}
}
