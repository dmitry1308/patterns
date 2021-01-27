package shepin.patterns.decorator;

public class Task {
	public static void main(String[] args) {
		SeniorJavaDeveloper seniorJavaDeveloper = new SeniorJavaDeveloper(new JavaDeveloper());
		System.out.println(seniorJavaDeveloper.makeJob());

		TeamLead lead = new TeamLead(seniorJavaDeveloper);
		System.out.println(lead.makeJob());
	}
}
