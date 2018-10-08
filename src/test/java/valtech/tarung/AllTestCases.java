package valtech.tarung;

import org.testng.annotations.Test;

public class AllTestCases extends Hooks {

	@Test(priority =1)
	public void assertRecentBlogs(){
		hp.acceptCookies();
		utils.waitForMilliseconds();
		hp.assertRecentBlogs();
		System.out.println("Exe-2.a : Test Pass");
	}

	@Test (priority =2)
	public void assertFirstBlog() {
		hp.acceptCookies();
		hp.clickOnFirstBlog();
		fut.assertFutureForDevOps();
		System.out.println("Exe-2.b : Test Pass");
	}

	@Test (priority = 3)
	public void assertAbout() {
		hp.acceptCookies();
		hp.clickOnAbout();
		String relavantURL = utils.getRelaventURL();
		ap.assertAbout(relavantURL);
		System.out.println("Exe-3.a.about : Test Pass");
	}

	@Test (priority = 4)
	public void assertWork() {
		hp.acceptCookies();
		hp.clickOnWork();
		String relavantURL = utils.getRelaventURL();
		wp.assertWork(relavantURL);
		System.out.println("Exe-3.a.work : Test Pass");
	}

	@Test (priority = 5)
	public void assertservices() {
		hp.acceptCookies();
		hp.clickOnServices();
		String relavantURL = utils.getRelaventURL();
		sp.assertServices(relavantURL);
		System.out.println("Exe-3.a.services : Test Pass");
	}

	@Test (priority = 6)
	public void totalOffices() {
		hp.acceptCookies();
		hp.clickOnAbout();
		ap.clickOnOurOffices();
		int totalOffices = cp.totalValtechOffices();
		System.out.println("<------ Total No of Valtech Offices -----> " +totalOffices);
		System.out.println("Exe-3.b - Navigate to contact page and count total office: Test Pass");
	}
}
