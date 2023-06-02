package learntestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KGF1 {
	@Test(priority = 4, dependsOnMethods = { "vanaram", "reena" }, invocationCount = 10)
	public void rocky() {
		Reporter.log("KGF is Controlled by rocky");
	}

	@Test
	public void reena() {
		int[] a = {1,2,3};
		System.out.println(a[2]);
		Reporter.log("KGF is Controlled by reena");
	}

	@Test(priority = 1, dependsOnMethods = { "vanaram" })
	public void garuda() {
		Reporter.log("KGF is Controlled by garuda");
	}

	@Test(priority = 2, dependsOnMethods = { "vanaram" })
	public void adheera() {
		Reporter.log("KGF is Controlled by adheera");
	}

	@Test(dependsOnMethods = { "garuda" })
	public void rajendraDesai() {
		Reporter.log("KGF is Controlled by rajendraDesai");
	}

	@Test(priority = 5)
	public void ramikaSen() {
		Reporter.log("KGF is Controlled by ramikaSen");
	}

	@Test
	public void vanaram() {
		int[] a = {1,2,3};
		System.out.println(a[2]);
		Reporter.log("KGF is Controlled by vanaram");
	}

	@Test(priority = 3)
	public void mumbaiShetty() {
		Reporter.log("KGF is Controlled by mumbaiShetty");
	}

}