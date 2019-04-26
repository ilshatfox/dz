
//package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class SuperBestAwesomeFramework {

    public static <T> List<T> getMany(Class<T> aClass, int count, Object... obj) {
        Class[] cl = createrClass(aClass, obj);

        try {
            List<T> list = new ArrayList<>();
            Constructor<T> con = aClass.getConstructor(cl);
            for (int i = 0; i < count; i++) {
                list.add(con.newInstance(obj));
            }
            return list;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new IllegalStateException(e);
        }
    }

    private static  <T> Class[] createrClass(Class<T> aClass, Object... obj) {
        Class[] classes = new Class[obj.length];
        Constructor[] constructors = aClass.getDeclaredConstructors();
        Class[] types = new Class[constructors.length];
        for(Constructor constructor: constructors){
            types = constructor.getParameterTypes();
            System.out.println(types);
        }

        for (int i = 0; i < obj.length; i++) {
            if (types[i].isPrimitive()) {
                System.out.println(types[i].getName());
//                if (types[i].getName() == 'int') {
//
//                }
                classes[i] = Integer.TYPE;
            } else {
                classes[i] = obj[i].getClass();
            }
        }
        return classes;
    }

}

