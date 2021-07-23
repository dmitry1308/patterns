package shepin.patterns.adapter;

public class AdapterJavaToDataBase extends JavaApplication implements DataBase {

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }

    @Override
    public void insert() {
        saveObject();
    }
}
