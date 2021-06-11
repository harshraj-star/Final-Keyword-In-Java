package finalKeywordInJava;

public class FinalKeywordProperties {

	public static void main(String[] args) {
		final String name = "Harsh";
		System.out.println("name" + "=" + name);
		 //name= "Kunal";  We Can't Change the Variable Value after Using fianl Keyword 
		
		final int roll = 1813331049;
		System.out.println("roll" + "=" + roll);
		
		final int STUDENT_MARKS = 100; 
		System.out.println("STUDENT_MARKS" + "=" + STUDENT_MARKS);
		// It is better Practice to use Variable names in caps 
		
		final int roll1 ;
		{
			roll1 =1813331049;
			System.out.println("roll1" + "=" + roll1);
		}
		
		final String Teacher;
		{
			String Teacher1 ="Bindal Sir";
			System.out.println("Teacher" + "=" + Teacher1);
		}
		

	}

}
