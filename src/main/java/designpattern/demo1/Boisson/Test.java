package designpattern.demo1.Boisson;

import designpattern.demo1.Decorateurs.Caramel;
import designpattern.demo1.Decorateurs.Chocolat;

public class Test {
    public static void main(String[] args){
        Boisson b = new Espresso();
        System.out.println("**********");
        System.out.println(b.getDescription());
        System.out.println(b.cout());

        b = new Caramel(b);
        System.out.println("**********");
        System.out.println(b.getDescription());
        System.out.println(b.cout());

        b = new Chocolat(b);
        System.out.println("**********");
        System.out.println(b.getDescription());
        System.out.println(b.cout());

        Boisson b2 = new Chocolat(new Chocolat(new Caramel(new Deca())));
        System.out.println("*****Boisson N°2*****");
        System.out.println(b2.getDescription());
        System.out.println(b2.cout());
    }
}
