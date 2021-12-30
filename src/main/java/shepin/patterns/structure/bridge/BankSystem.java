package shepin.patterns.structure.bridge;

import shepin.patterns.structure.bridge.developer.Developer;

public class BankSystem extends Program {

    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress...");
        developer.writeCode();
    }
}
