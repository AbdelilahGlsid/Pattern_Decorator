package designpattern.demo1.Boisson;

public abstract class Boisson {
    protected String description;

    public abstract double cout();

    public String getDescription() {
        return description;
    }
}
