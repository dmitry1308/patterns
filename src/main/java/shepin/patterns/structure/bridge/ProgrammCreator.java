package shepin.patterns.structure.bridge;

public class ProgrammCreator {

    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        CppDeveloper cppDeveloper = new CppDeveloper();

        BankSystem bankSystem = new BankSystem(javaDeveloper);
        StockExchange stockExchange = new StockExchange(cppDeveloper);

        Program[] programms = {bankSystem, stockExchange};

        for (Program program : programms) {
            program.developProgram();
        }
    }
}
