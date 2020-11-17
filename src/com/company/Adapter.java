package com.company;

public class Adapter implements Standard{
    private AncienImpl ancien= new AncienImpl();
    @Override
    public void operation(int nb1, int nb2) {
        double res = ancien.calcul(nb1,nb2);
        ancien.print(res);

    }
}
