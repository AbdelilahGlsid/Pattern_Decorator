package designpattern.demo1.Decorateurs;

import designpattern.demo1.Boisson.Boisson;

public abstract class AbstractDecorateur extends Boisson{
    protected Boisson boisson;

    public AbstractDecorateur(Boisson boisson) {
        super();
        this.boisson = boisson;
    }

    public abstract String getDescription();
}
