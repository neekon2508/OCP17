package Locale;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyProgramStrings", Locale.ENGLISH);
        String hello = bundle.getString("hello");
        System.out.println(hello);
        Locale.setDefault(Locale.CHINESE);
        bundle = ResourceBundle.getBundle("MyProgramStrings", Locale.CHINESE);
        hello = bundle.getString("hello");
        System.out.println(hello);
    }
}
