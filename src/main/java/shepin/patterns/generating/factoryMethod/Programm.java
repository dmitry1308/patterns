package shepin.patterns.generating.factoryMethod;

public class Programm {
    public static void main(String[] args) {
        DeveloperFactory factory = createDeveloperFactoryBySpecifity("java");
        Developer developer = factory.createDeveloper();
        developer.writeCode();

    }

    static DeveloperFactory createDeveloperFactoryBySpecifity(String name) {
        if (name.equals("java")) {
            return new JavaDeveloperFactory();
        }
        throw new RuntimeException(name + "is unknown!!!");
    }
}
