package shepin.patterns.observer;

import java.util.List;

public class Subscriber implements Observer{
	private String name;

	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void handleEvent(List<String> vacances) {
		System.out.println("Dear "+ name+ "\nWe have some changes in vacancies: \n" + vacances+
				"\n=============================================\n");
	}
}
