package FactoryPattern;

import java.lang.reflect.InvocationTargetException;

public class FactoryWithClass {

    public static <T> T getClass(Class<? extends Shape> clazz) {
        T object = null;

        /**
         * @param clazz 是指传进来的class的类型;
         * this is old version
         */
//        try {
//            object = (T) Class.forName(clazz.getName()).getDeclaredConstructor().newInstance();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

        /**
         * this is new version for java 9
         */
        try {
            object = (T) clazz.getDeclaredConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }

        return object;
    }
}
