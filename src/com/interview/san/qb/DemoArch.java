package com.interview.san.qb;

import java.util.ArrayList;
import java.util.List;
//QB question
/*class Cow{
    void moo(){}
}
class Cat{
    void meow(){}
}
class Dog{
    void bark(){}
}
    Consider the above three classes. These belong to a third party jar and you cant modify them. I want to achieve
    the following thing:
    Create objects of Cow, Cat and Dog and add them to a List then stream it and use forEach to call its
    respective methods. You can't use casting but can use any design pattern*/

public class DemoArch {
    public static void main(String[] args) {
        LocalCat lc1 = new LocalCat();
        LocalDog ld1 = new LocalDog();
        LocalCow lcw1 = new LocalCow();
        List<Animal> animals = new ArrayList<>();
        AnimalVisitor animalVisitor = new AnimalVisitorImpl();
        animals.add(lc1);
        animals.add(lcw1);
        animals.add(ld1);
        animals.stream().forEach( animal -> {
                    animal.accept(animalVisitor);
                }
        );
    }

}
