package com.gupaotask.pattern.factory.factorymethod;

import com.gupaotask.pattern.factory.ICook;

public class FactoryMethodTest {
    public static void main(String[] args) {
        CookFactoryMethod meatCookFactory=new MeatCookFactory();
        ICook cook=meatCookFactory.cook();
        cook.createCook();
    }

}
