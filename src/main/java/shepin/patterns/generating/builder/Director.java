package shepin.patterns.generating.builder;

public class Director {
	WebSiteBuilder webSiteBuilder;

	public void setWebSiteBuilder(WebSiteBuilder webSiteBuilder) {
		this.webSiteBuilder = webSiteBuilder;
	}

	WebSite buildWebSite() {
		webSiteBuilder.createWebSite();

		webSiteBuilder.buildName();
		webSiteBuilder.buildCms();
		webSiteBuilder.buildPrice();

		return webSiteBuilder.getWebSite();
	}
}
