package shepin.patterns.builder.home.homeBuilder;

import shepin.patterns.builder.home.homeBuilder.HomeBuilder;

public class Director {
    private HomeBuilder builder;

    public Director(HomeBuilder builder) {
        this.builder = builder;
    }

    public Home buildHome() {
        builder.createHome();
        builder.buildMaterial();
        builder.buildStages();
        builder.buildName();
        builder.buildWindows();

        return builder.getHome();
    }
}
