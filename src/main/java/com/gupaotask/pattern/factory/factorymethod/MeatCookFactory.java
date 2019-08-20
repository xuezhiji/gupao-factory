package com.gupaotask.pattern.factory.factorymethod;

import com.gupaotask.pattern.factory.ICook;
import com.gupaotask.pattern.factory.MeatCook;

//荤菜烹饪工厂
public class MeatCookFactory implements CookFactoryMethod {

    public ICook cook() {
        return new MeatCook();
    }
}
