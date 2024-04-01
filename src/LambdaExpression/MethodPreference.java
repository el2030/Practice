package LambdaExpression;

import ExceptionHandling.MethodException;

import java.util.function.Predicate;

public class MethodPreference {
    public static void learn(){
        System.out.println("static method");
    }

    public static void System(){
        System.out.println("System method");
    }

    public static boolean check(int num){
        return num%2==0?true:false;
    }

    public static void main(String[] args) {
//        Language l = () -> {
//            System.out.println("Static method");
//        };
//        l.communication();
//
//        Language lang = MethodExample::Learn;
//        lang.communication();
//        lang = MethodExample::System;

//        Predicate<Integer> predicate = MethodExample::check;
//        Language l = () -> {
//            System.out.println("Static method");
//        };
//        l.communication();
//
//        Language lang = MethodExample::Learn;n
//        lang.communication();
//        lang = MethodExample::System;

    }
}
