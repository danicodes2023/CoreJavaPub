package com.functionalinterface;
@FunctionalInterface
public interface FunctionalParent {
    void test();
    default void calculate(){
        print();
    }
    default void doSomething(){
        print();
    }
    private void print(){
        System.out.println("One");
    }
}
