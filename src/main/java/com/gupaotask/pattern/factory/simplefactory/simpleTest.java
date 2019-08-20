package com.gupaotask.pattern.factory.simplefactory;

import com.gupaotask.pattern.factory.ICook;
import com.gupaotask.pattern.factory.MeatCook;

public class simpleTest {

    public static void main(String[] args) {
//        CookSimpleFactory cookSimpleFactory=new CookSimpleFactory();
//        ICook iCook=cookSimpleFactory.createFactoryByName("vegetables");
//        iCook.createCook();


//        CookSimpleFactory cookSimpleFactory=new CookSimpleFactory();
//        ICook iCook=cookSimpleFactory.createFactoryByClassName("com.gupaotask.pattern.factory.MeatCook");
//        iCook.createCook();

        CookSimpleFactory cookSimpleFactory=new CookSimpleFactory();
        ICook iCook=cookSimpleFactory.createFactoryByClass(MeatCook.class);
        iCook.createCook();

    }
}
