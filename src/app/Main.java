package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //nonGenericDemo();
        genericMethodDemo();
        Map<String, String> map = new HashMap<>();
    }

    private static void nonGenericDemo() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("java");
        arrayList.add(10); // hovsa, det tillades da det er unchecked - fanges først i runtime

        // skal caste da der ikke er angivet type for listen - typen er Object
        String s = (String) arrayList.get(0);
        String s1 = (String) arrayList.get(1);
        System.out.println(s);
        System.out.println(s1);
    }

    private static void genericMethodDemo() {
        MyGenericClass<String> class1 = new MyGenericClass<>("This is a string.");
        MyGenericClass<String> class2 = new MyGenericClass<>("This is a string.");

        boolean isEqual = MyGenericMethodClass.isEqual(class1, class2);
        System.out.println(isEqual);
    }

}
