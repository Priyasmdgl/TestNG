package TestNG;

import org.testng.annotations.Test;

public class Grouping {
	/*Scenario: A basket contains diff types of mobiles like iphone,oneplus,redme,vivo.
	in that i need to run the test case for vivo and oneplus alone*/
	@Test(groups= {"iphone"})
	public void iphone() {
		System.out.println("Testing iphone");
	}
	@Test(groups= {"oneplus"})
	public void oneplus1() {
		System.out.println("Testing oneplus1");
	}
	@Test(groups= {"oneplus"})
	public void oneplus2() {
		System.out.println("Testing oneplus2");
	}
	@Test(groups= {"redme"})
	public void redme() {
		System.out.println("Testing redme");
	}
	@Test(groups= {"vivo"})
	public void vivo1() {
		System.out.println("Testing vivo1");
	}
	@Test(groups= {"vivo"})
	public void vivo2() {
		System.out.println("Testing vivo2");
	}

}
