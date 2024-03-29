package shepin.patterns.structure.decorator;

import shepin.patterns.structure.decorator.developer.Developer;

public class DeveloperDecorator implements Developer {
	private final Developer developer;

	public DeveloperDecorator(Developer developer) {
		this.developer = developer;
	}

	@Override
	public String makeJob() {
		return developer.makeJob();
	}
}
