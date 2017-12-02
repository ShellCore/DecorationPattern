package com.shellcore.android.decorationpattern.fillings;

/**
 * Created by Shell on 02/12/2017.
 */

public class DoublePortion extends FillingDecorator {

    private Filling filling;

    public DoublePortion(Filling filling) {
        this.filling = filling;
    }

    @Override
    public String getDescription() {
        return filling.getDescription() + " en ración doble";
    }

    @Override
    public int getKcal() {
        return filling.getKcal() * 2;
    }
}
