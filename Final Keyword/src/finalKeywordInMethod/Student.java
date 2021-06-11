package finalKeywordInMethod;

public class Student {

	int roll = 1813331049;
	String name ="Harsh";
	
	public final void getDescription() {
		System.out.println("The Student Name is = " + name + " " + "and" + " "+ "Roll is="+" " + roll);
	}

}
