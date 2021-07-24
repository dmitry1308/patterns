package shepin.patterns.generating.builder;

public class VisitCardWebSiteBuilder extends WebSiteBuilder {
	@Override
	void buildName() {
		webSite.setName("Visit card");
	}

	@Override
	void buildCms() {
		webSite.setCms(Cms.WordPress);
	}

	@Override
	void buildPrice() {
		webSite.setPrice(5000);
	}
}
