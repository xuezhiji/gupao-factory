package com.gupaotask.pattern.factory.simplefactory;

import com.gupaotask.pattern.factory.ICook;
import com.gupaotask.pattern.factory.MeatCook;
import com.gupaotask.pattern.factory.VegetableCook;

public class CookSimpleFactory {

    public ICook createFactoryByName(String name){
        if("vegetables".equals(name)){
            return new VegetableCook();
        }else if("meat".equals(name)){
            return new MeatCook();
        }else{
            return null;
        }
    }

    public ICook createFactoryByClassName(String className){
        try{
            return (ICook)Class.forName(className).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public ICook createFactoryByClass(Class classzz){
        try{
            return (ICook)classzz.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
