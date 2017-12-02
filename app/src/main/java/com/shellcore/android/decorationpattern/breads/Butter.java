package com.shellcore.android.decorationpattern.breads;

/**
 * Created by Shell on 02/12/2017.
 */

public class Butter extends BreadDecorator {

    private Bread bread;

    public Butter(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return bread.getDescription() + " con Mantequilla";
    }

    @Override
    public int getKcal() {
        return bread.getKcal() + 80;
    }
}
