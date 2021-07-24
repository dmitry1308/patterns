package shepin.patterns.behavioral.strategy;

public class DeveloperRunner {
	public static void main(String[] args) {
		Developer developer = new Developer();

		developer.setActivity(new Reading());
		developer.executeActivity();

		developer.setActivity(new Coding());
		developer.executeActivity();

		developer.setActivity(new Sleeping());
		developer.executeActivity();


		developer.executeActivity(new Sleeping());
	}
}
