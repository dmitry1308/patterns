package shepin.patterns.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode=new Source;\n");

        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        projectFactory.cloneProject();

        Project copy = (Project) master.copy();
        System.out.println(copy);
    }
}
