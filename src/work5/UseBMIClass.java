package work5;

public class UseBMIClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMI bmi1= new BMI("Kim Yang",18,145,70);
		System.out.println("The BMI for"+bmi1.getName()+"is"+bmi1.getBMI()+""+bmi1.getStatus());
		BMI bmi2 = new BMI("Susan King", 215, 70);
		System.out.println("The BMI for " + bmi2.getName()+ + bmi2.getBMI() + " "+bmi2.getStatus());
	}
}
