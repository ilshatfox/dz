package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main1 {
    public static void main(String[] args) {
//        MyClass myClass = new MyClass();
//        int number = myClass.getNumber();
//        String name = null; //no getter =(
//        System.out.println(number + name);//output 0null
//        try {
//            Field field = myClass.getClass().getDeclaredField("name");
//            System.out.println(field);
//            field.setAccessible(true);
//            name = (String) field.get(myClass);
//            System.out.println("123 " + name);
//            field.set(myClass, "new_my_value");
//            System.out.println((String) field.get(myClass));
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        System.out.println(number + name);//output 0default
//        printData(myClass);

//        ddd();
        eee();
    }

    public static void printData(Object myClass){
        try {
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void ddd() {
        MyClass myClass = null;
        try {
            System.out.println(MyClass.class.getName());
            Class clazz = Class.forName(MyClass.class.getName());
            myClass = (MyClass) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(myClass);//output created object reflection.MyClass@60e53b93
//        System.out.println(myClass.);
        printData(myClass);
    }

    public static void eee() {
        MyClass myClass = null;
        try {
            Class clazz = Class.forName(MyClass.class.getName());
            Class[] params = {int.class, String.class};
            myClass = (MyClass) clazz.getConstructor(params).newInstance(1, "default2");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(myClass);//output created object reflection.MyClass@60e53b93
        printData(myClass);
    }

}
