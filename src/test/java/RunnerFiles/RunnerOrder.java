package RunnerFiles;

import org.testng.annotations.Test;

import OrderProduct.OrderSpecificMobile;

public class RunnerOrder {

	@Test
	public void OrderMobile() throws Exception{
		OrderSpecificMobile.GotoMobilePage();
		OrderSpecificMobile.FilterMobile();
		OrderSpecificMobile.Close();
		//System.out.println("Thread id" +Thread.currentThread().getId());
	}
}
