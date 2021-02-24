package shepin.patterns.prototype;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
public class Project implements Copyable {
    int    id;
    String projectName;
    String sourceCode;

    @Override
    public Object copy() {
        Project copyProject = new Project(id, projectName, sourceCode);
        return copyProject;
    }

    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", projectName='" + projectName + '\'' + ", sourceCode='" + sourceCode + '\'' + '}';
    }
}
