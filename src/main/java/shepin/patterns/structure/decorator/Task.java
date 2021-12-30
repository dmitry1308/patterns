package shepin.patterns.structure.decorator;

import shepin.patterns.structure.decorator.developer.JavaDeveloper;
import shepin.patterns.structure.decorator.developer.SeniorJavaDeveloper;
import shepin.patterns.structure.decorator.developer.TeamLead;

public class Task {
	public static void main(String[] args) {
		SeniorJavaDeveloper seniorJavaDeveloper = new SeniorJavaDeveloper(new JavaDeveloper());
		System.out.println(seniorJavaDeveloper.makeJob());

		TeamLead lead = new TeamLead(seniorJavaDeveloper);
		System.out.println(lead.makeJob());
	}
}
