package shepin.patterns.generating.builder;

public class BuildWebSiteRunner {
	public static void main(String[] args) {
		Director director = new Director();

		director.setWebSiteBuilder(new EnterpriceWebSiteBuilder());
		WebSite webSite = director.buildWebSite();
		System.out.println(webSite);

		director.setWebSiteBuilder(new VisitCardWebSiteBuilder());
		WebSite webSite1 = director.buildWebSite();
		System.out.println(webSite1);

		director.setWebSiteBuilder(new IfdWebSiteBuilder());
		WebSite webSite2 = director.buildWebSite();
		System.out.println(webSite2);
	}
}
