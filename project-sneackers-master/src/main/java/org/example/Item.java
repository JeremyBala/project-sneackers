package org.example;

public abstract class Item {

    public enum State{
        New,
        inProgress,
        Finished,
        Canceled,
    }

    protected String brand;
    protected State state = State.New;

    public abstract String getTypeName();
    public abstract String getDescription();

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public State getState() { return state; }
    public void setState(State state) { this.state = state; }
}
