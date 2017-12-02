package com.shellcore.android.decorationpattern.breads;

/**
 * Created by Shell on 02/12/2017.
 */

public class Open extends BreadDecorator {

    private Bread bread;

    public Open(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return bread.getDescription() + " Abierto";
    }

    @Override
    public int getKcal() {
        return bread.getKcal() / 2;
    }
}
