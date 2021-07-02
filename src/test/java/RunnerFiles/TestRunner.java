package RunnerFiles;

import org.testng.annotations.Test;

import Execution.HomePageFooter;
import Execution.HomePageTabs;

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
	}

}
