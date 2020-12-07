package app;

public class MyGenericClass<T> {

    private T attr;

    public MyGenericClass(T attr) {
        this.attr = attr;
    }

    public T getAttr() {
        return attr;
    }
}
