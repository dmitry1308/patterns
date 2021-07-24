package shepin.patterns.generating.builder;

public abstract class WebSiteBuilder {
	protected WebSite webSite;

	void createWebSite() {
		webSite = new WebSite();
	}

	abstract void buildName();

	abstract void buildCms();

	abstract void buildPrice();

	WebSite getWebSite() {
		return webSite;
	}
}
