package shepin.patterns.behavioral.observer;

public class JobSearch {
	public static void main(String[] args) {
		JavaDeveloperJobSite site = new JavaDeveloperJobSite();
		site.addVacances("First vacancy");
		site.addVacances("Second vacancy");

		Observer subscriber1 = new Subscriber("Igor");
		Observer subscriber2 = new Subscriber("Ivan");
		Observer subscriber3 = new Subscriber("Dima");

		site.addObserver(subscriber1);
		site.addObserver(subscriber2);
		site.addObserver(subscriber3);

		site.addVacances("Trird vacancy");
		site.removeVacancy("First vacancy");

	}
}
