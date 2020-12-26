package MavenTestNGPackage;

import org.testng.annotations.Test;

public class TestngGroup {
	@Test(groups={"sanity"})
	public void TestCase1()
	{
		System.out.println("Test Case1 Execution");	
	}
	
	@Test(groups={"sanity","smoke"})
	public void TestCase2()
	{
		System.out.println("Test Case2 Execution");
	}
	
	@Test(groups={"sanity","regression"})
	public void TestCase3()
	{
		System.out.println("Test Case3 Execution");
	}
	@Test(groups={"sanity","regression"})
	public void TestCase4()
	{
		System.out.println("Test Case4 Execution");
	}
}
