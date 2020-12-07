package app;


public class MyGenericMethodClass {
    public static <T, T2> boolean isEqual(MyGenericClass<T> o1, MyGenericClass<T2> o2) {
        return o1.getAttr().equals(o2.getAttr());
    }
}
