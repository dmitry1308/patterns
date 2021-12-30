package shepin.patterns.structure.bridge;

import shepin.patterns.structure.bridge.developer.Developer;

public abstract class Program {
    protected Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
