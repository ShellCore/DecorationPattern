package com.shellcore.android.decorationpattern.breads;

/**
 * Created by Shell on 02/12/2017.
 */

public class Oil extends BreadDecorator {

    private Bread bread;

    public Oil(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return bread.getDescription() + " con Aceite";
    }

    @Override
    public int getKcal() {
        return bread.getKcal() + 60;
    }
}
