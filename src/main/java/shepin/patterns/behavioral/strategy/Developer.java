package shepin.patterns.behavioral.strategy;

public class Developer {
	private Activity activity;

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public void executeActivity() {
		activity.justDoIt();
	}

	public void executeActivity(Activity activity) {
		activity.justDoIt();
	}
}
