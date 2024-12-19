package designpattern.demo1.Decorateurs;

import designpattern.demo1.Boisson.Boisson;

public class Vanille extends AbstractDecorateur{

    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Vanille";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.4;
    }
}
