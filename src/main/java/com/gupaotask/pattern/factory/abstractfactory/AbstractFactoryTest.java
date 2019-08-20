package com.gupaotask.pattern.factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        CookFactoryAbstract meatFactory=new MeatFactory();
        CornOil meatByCornOil= meatFactory.cookByCornOil();
        meatByCornOil.cookByCornOil();

        SoyBeanOil meatBySoyBeanOil= meatFactory.cookBySoyBeanOil();
        meatBySoyBeanOil.cookBySoyBeanOil();
    }
}
