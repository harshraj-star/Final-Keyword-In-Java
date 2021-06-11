// We Can't extends final Class "Student" because it is already declared as final class earlier.

package finalKeywordInClass;

public class MainClass extends Student {  // Here we see we get Error in this Line because final class never allow to extend it self

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name;  //we cant create object also because the class can't extend hence to create object is not possible
		s.roll;  //Similialry we cant extend property of any  final keyword objects
		// TODO Auto-generated method stub

	}

}
