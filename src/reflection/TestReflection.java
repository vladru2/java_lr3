package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {

    public static void main(String[] args) {
        System.out.println("Выгрузить все поля и методы класса с помощью рефлексии Class1");
        fieldsAndMethods();
        System.out.println("Вызвать несколько методов класса Class1");
        invokeMethods();
        System.out.println("Вывести на экран всех предков класса Class3");
        writeSuperClasses();
    }

    public static void fieldsAndMethods() {
        try {
            Class c = Class.forName(Class1.class.getName());
            Field f[] = c.getDeclaredFields();
            for (int i = 0; i < f.length; i++)
                System.out.println(f[i].toString());

            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++)
                System.out.println(m[i].toString());
        } catch (Throwable e) {
            System.err.println(e);
        }
    }

    public static void invokeMethods() {
        try {
            Class c = Class.forName(Class1.class.getName());
            Class1 class1 = new Class1();

            Method meth = c.getMethod("getString1");

            Object res = meth.invoke(class1);
            String stringRes = (String) res;
            System.out.println(stringRes);

            Method meth2 = c.getMethod("setString1", String.class);
            meth2.invoke(class1, "changed by reflection");

            res = meth.invoke(class1);
            stringRes = (String) res;
            System.out.println(stringRes);
        } catch (Throwable e) {
            System.err.println(e);
        }
    }

    public static void writeSuperClasses() {
        try {
            Class c = Class.forName(Class3.class.getName());
            Class sClass = c.getSuperclass();
            while (sClass != null) {
                System.out.println(sClass.getName());
                c = sClass;
                sClass = c.getSuperclass();
            }
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}
