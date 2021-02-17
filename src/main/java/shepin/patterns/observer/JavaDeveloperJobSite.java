package shepin.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {
	private List<String> vacances = new ArrayList<>();
	private List<Observer> observers = new ArrayList<>();


	public void addVacances(String vacancy) {
		this.vacances.add(vacancy);
		notifyObservers();
	}

	public void removeVacancy(String vacancy) {
		this.vacances.remove(vacancy);
		notifyObservers();
	}

	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.handleEvent(vacances);
		}
	}
}
