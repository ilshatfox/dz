package zabirov;

import java.lang.reflect.Field;

public class Main2 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class c = Student.class;
        System.out.println(c);
        Field f = c.getField("name");
        System.out.println(f.getType());
    }
}