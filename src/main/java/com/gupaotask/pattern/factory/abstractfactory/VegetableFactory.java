package com.gupaotask.pattern.factory.abstractfactory;

public class VegetableFactory implements CookFactoryAbstract {

    public CornOil cookByCornOil() {
        return new VegetanleCookByCornOil();
    }

    public SoyBeanOil cookBySoyBeanOil() {
        return new VegetableCookBySoyBeanOil();
    }
}
