package shepin.patterns.generating.builder.home.homeBuilder;

public class Client {
    public static void main(String[] args) {

        TreeHomeBuilder builder = new TreeHomeBuilder();
        Director director = new Director(builder);
        Home home = director.buildHome();
        System.out.println(home);
    }

}
