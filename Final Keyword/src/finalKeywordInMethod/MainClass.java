// WE Can't OVERRIDE the Method "getDescription()" because it has been declared as final in Student class.
//Hence we can't overide if Methods is already declared as Final

package finalKeywordInMethod;


public class MainClass extends Student {
	public void getDescription() { //OVERRIDE Method is Not Allowed
		System.out.println("We are Inside the Main Class");
	}
	

	public static void main(String[] args) {
		Student s = new Student();
		s.getDescription();
		

	}

}
