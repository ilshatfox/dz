package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SuperBestAwesomeFramework {
    public static <T> List<T> getMany(Class<T> aClass, int count, Object... params) {

        try {
            List<T> list = new ArrayList<>();
            Class[] classFiles = createClass(aClass, params);
            Constructor<T> constr = aClass.getConstructor(classFiles);
            for (int i = 0; i < count; i++) {
                list.add(constr.newInstance(params));
            }
            return list;
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
//
//        try {
//            List<T> list = new ArrayList<>();
//            Constructor<T> con = aClass.getConstructor(cl);
//            for (int i = 0; i < count; i++) {
//                list.add(con.newInstance(params));
//            }
//            return list;
//        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
//            throw new IllegalStateException(e);
//        }
//
//        try {
//            createClass(aClass, params);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        return List<T>;
//        return new LinkedList<T>();
    }

    public static <T> Class[] createClass(Class<T> aClass, Object... params) throws ClassNotFoundException, IllegalAccessException {
//        SimpleStudent obj = new SimpleStudent();
//        Class classObj = aClass.forName(aClass.getSimpleName());
//
//        Field[] fields = aClass.getClass().getDeclaredFields();
//
//        for (int i = 0; i < fields.length; i++) {
//            fields[i].setAccessible(true);
//            System.out.println(fields[i]);
////            fields[i].set(classObj, (String) params[i]);
//        }

//        return classObj;


//        Class mClassObject = Class.forName()

//        aClass.getClass()


//        Constructor[] constrs = aClass.getDeclaredConstructors();
//        Class[] cs = new Class[constrs.length];
//        for(Constructor cons: constrs){
//            cs = cons.getParameterTypes();
//        }



        Class[] files = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            files[i] = params[i].getClass();
        }

        return files;
    }
}
