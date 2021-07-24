package RunnerFiles;

import org.testng.annotations.Test;

import com.Execution.HomePageFooter;
import com.Execution.HomePageTabs;

public class TestRunner {
	
	@Test(priority=1)
	public void Test1() {
		HomePageTabs.HomeTabs();
	}
	
	@Test(priority=2)
	public void Test2() {
		HomePageFooter.HomeFooters();
		
	}
	@Test(priority=3)
	public void Test3() {
		HomePageTabs.CloseTab();
		//System.out.println("Thread id" +Thread.currentThread().getId());
	}

}
