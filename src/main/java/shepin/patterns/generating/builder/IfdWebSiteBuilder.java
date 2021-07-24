package shepin.patterns.generating.builder;

public class IfdWebSiteBuilder extends WebSiteBuilder {
	@Override
	void buildName() {
		webSite.setName("IFD web site");
	}

	@Override
	void buildCms() {
		webSite.setCms(Cms.ALFRESCO);
	}

	@Override
	void buildPrice() {
		webSite.setPrice(46);
	}
}
