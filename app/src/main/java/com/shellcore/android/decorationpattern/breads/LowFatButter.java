package com.shellcore.android.decorationpattern.breads;

/**
 * Created by Shell on 02/12/2017.
 */

public class LowFatButter extends BreadDecorator {

    private Bread bread;

    public LowFatButter(Bread bread) {
        this.bread = bread;
    }


    @Override
    public String getDescription() {
        return bread.getDescription() + " con Margarina";
    }

    @Override
    public int getKcal() {
        return bread.getKcal() + 5;
    }
}
