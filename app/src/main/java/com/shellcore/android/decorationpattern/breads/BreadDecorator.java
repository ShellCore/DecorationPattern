package com.shellcore.android.decorationpattern.breads;

/**
 * Created by Shell on 02/12/2017.
 */

public abstract class BreadDecorator extends Bread {

    @Override
    public abstract String getDescription();

    @Override
    public abstract int getKcal();
}
