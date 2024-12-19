package designpattern.demo1.Decorateurs;

import designpattern.demo1.Boisson.Boisson;

public class Caramel extends AbstractDecorateur{

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Caramel";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.5;
    }
}
