package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Data 
{
	@Test( )
	public void test1()
	{
		Reporter.log("1", true);
	}
	@Test
		public void test2()
		{
			Reporter.log("2", true);
			Assert.fail();
		}
	@Test()
	public void test3()
	{
		Reporter.log("3", true);
	}
	
}

