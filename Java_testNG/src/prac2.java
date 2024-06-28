import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class prac2 {
	@BeforeSuite
	void Bsuite() {
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	void btest() {
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	void bclass() {
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	void bmethod() {
		System.out.println("@BeforeMethod");
	}
	@Test
	void add() {
		System.out.println(20+30);
	}
	@Test
	void sub() {
		System.out.println(20);
	}
	@AfterSuite
	void asuite() {
		System.out.println("@AfterSuite");
	}
	@AfterTest
	void atest() {
		System.out.println("@AfterTest");
	}
	@AfterClass
	void aclass() {
		System.out.println("@AfterClass");
	}
	@AfterMethod
	void amethod() {
		System.out.println("@AfterMethod");
	}
}
