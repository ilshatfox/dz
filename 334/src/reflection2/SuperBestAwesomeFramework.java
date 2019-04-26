package reflection2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SuperBestAwesomeFramework {
    public static <T> List<T> getMany(Class<T> aClass, int count, Object... params) {
        ArrayList<T> files = new ArrayList<>();

        try {
            Constructor[] con = aClass.getConstructors();

            for (int i = 0; i < count; i++) {
                T s = (T) con[0].newInstance(params);
                files.add(i, s);
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return files;
    }
}
