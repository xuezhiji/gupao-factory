package com.gupaotask.pattern.factory.abstractfactory;

public class MeatFactory implements CookFactoryAbstract {

    public CornOil cookByCornOil() {
        return new MeatCookByCornOil();
    }

    public SoyBeanOil cookBySoyBeanOil() {
        return new MeatCookBySoyBeanOil();
    }
}
