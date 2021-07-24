package shepin.patterns.generating.builder.home.homeBuilder;

public abstract class HomeBuilder {
    protected Home home;

    void createHome() {
        home = new Home();
    }

   public Home getHome() {
        return home;
    }

    abstract void buildMaterial();

    abstract void buildName();

    abstract void buildStages();

    abstract void buildWindows();
}
