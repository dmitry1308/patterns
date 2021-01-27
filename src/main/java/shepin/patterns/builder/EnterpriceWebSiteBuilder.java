package shepin.patterns.builder;

public class EnterpriceWebSiteBuilder extends WebSiteBuilder {
	@Override
	void buildName() {
		webSite.setName("Enterprice web site");
	}

	@Override
	void buildCms() {
		webSite.setCms(Cms.ALFRESCO);
	}

	@Override
	void buildPrice() {
		webSite.setPrice(1000);
	}
}
