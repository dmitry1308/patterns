package shepin.patterns.structure.bridge.developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code..." + "\n");
    }
}
