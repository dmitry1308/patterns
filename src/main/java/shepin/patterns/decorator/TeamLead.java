package shepin.patterns.decorator;

public class TeamLead extends DeveloperDecorator{
	public TeamLead(Developer developer) {
		super(developer);
	}

	public String sendWeekReport() {
		return " Send week report.";
	}

	@Override
	public String makeJob() {
		return super.makeJob()+sendWeekReport();
	}
}
