package valtech.tarung;

import com.pages.AboutPage;
import com.pages.contactUsPage;
import com.pages.homePage;
import com.pages.servicesPage;
import com.pages.theFutureForDevOps;
import com.pages.workPage;
import com.util.util;
import org.openqa.selenium.WebDriver;

public class PageObjectBaseClass {
	public static WebDriver driver;
	public static util utils = new util();
	public static homePage hp = new homePage();
	public static theFutureForDevOps fut = new theFutureForDevOps();
	public static AboutPage ap = new AboutPage();
	public static workPage wp = new workPage();
	public static servicesPage sp = new servicesPage();
	public static contactUsPage cp = new contactUsPage();
	
}
