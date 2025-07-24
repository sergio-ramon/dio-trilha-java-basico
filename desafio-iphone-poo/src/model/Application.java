package model;

public abstract class Application {
    private final String name;
    private boolean executing;

    public Application(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    void setExecuting(boolean state) {
        executing = state;
    }

    boolean getExecuting() {
        return executing;
    }
}
