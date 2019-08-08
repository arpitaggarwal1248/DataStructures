package selenium1;

public class BrowserInitialise {

	static String platform;
	static HomePage hp;
	public static void main(String[] args) {
		hp= new HomeFactory().getHomePage(platform);
		hp.clickSearchButton();
	}
}