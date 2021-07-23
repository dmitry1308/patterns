package shepin.patterns.builder.home.homeBuilder;

public class Home {
     private  String       styleName;
     private  MaterialWall materialWall;
     private  Windows      windows;
     private  String       stages;

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public void setMaterialWall(MaterialWall materialWall) {
        this.materialWall = materialWall;
    }

    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    public void setStages(String stages) {
        this.stages = stages;
    }


    @Override
    public String toString() {
        return "Home{" + "styleName='" + styleName + '\'' + ", materialWall=" + materialWall + ", windows=" + windows + ", stages='" + stages + '\'' + '}';
    }
}
