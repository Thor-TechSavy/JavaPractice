package corejava.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Three ways:
 * 1 - Reflection - constructor.setAccessible(true)
 * 2 - By cloning
 * 3 - Serializing - Deserializing
 */
public class BreakSingleton {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        PublicFinalField singleton = PublicFinalField.INSTANCE;
        System.out.println(singleton.hashCode());

        Class<PublicFinalField> aClass = (Class<PublicFinalField>) Class.forName("corejava.designpatterns.creational.singleton.PublicFinalField");
        Constructor<PublicFinalField> declaredConstructors = (Constructor<PublicFinalField>) aClass.getDeclaredConstructor();
        declaredConstructors.setAccessible(true);

        PublicFinalField breakSingleton = declaredConstructors.newInstance();
        System.out.println(breakSingleton.hashCode());





    }
}

