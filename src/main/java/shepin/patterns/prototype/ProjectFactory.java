package shepin.patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Setter;
import shepin.patterns.singleton.ProgramLogger;


@Setter
public class ProjectFactory {
    Copyable project;

    public ProjectFactory(Copyable project) {
        this.project = project;
    }

    Project cloneProject() {
        return (Project) project.copy();
    }
}

