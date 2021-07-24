package shepin.patterns.structure.adapter;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDataBase();
        dataBase.delete();
    }
}
