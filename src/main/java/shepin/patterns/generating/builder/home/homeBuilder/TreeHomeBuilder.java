package shepin.patterns.generating.builder.home.homeBuilder;

public class TreeHomeBuilder extends HomeBuilder{
    @Override
    protected void buildMaterial() {
        home.setMaterialWall(MaterialWall.Tree);
    }

    @Override
    protected void buildName() {
        home.setStyleName("Village");
    }

    @Override
    protected  void buildStages() {
        home.setStages("1");
    }

    @Override
    protected void buildWindows() {
        home.setWindows(Windows.TreeWindows);
    }
}
