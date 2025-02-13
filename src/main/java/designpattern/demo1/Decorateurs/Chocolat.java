package designpattern.demo1.Decorateurs;

import designpattern.demo1.Boisson.Boisson;

public class Chocolat extends AbstractDecorateur{

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Chocolat";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.8;
    }
}
