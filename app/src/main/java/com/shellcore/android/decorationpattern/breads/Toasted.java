package com.shellcore.android.decorationpattern.breads;

/**
 * Created by Shell on 02/12/2017.
 */

public class Toasted extends BreadDecorator {

    private Bread bread;

    public Toasted(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return bread.getDescription() + " Tostado";
    }

    @Override
    public int getKcal() {
        return bread.getKcal() + 0;
    }
}
