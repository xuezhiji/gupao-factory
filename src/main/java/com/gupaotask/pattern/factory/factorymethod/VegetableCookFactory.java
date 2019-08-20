package com.gupaotask.pattern.factory.factorymethod;

import com.gupaotask.pattern.factory.ICook;
import com.gupaotask.pattern.factory.VegetableCook;

//蔬菜烹饪工厂
public class VegetableCookFactory implements CookFactoryMethod {

    public ICook cook() {
        return new VegetableCook();
    }
}
