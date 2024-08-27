package com.interview.san.qb;

import java.util.ArrayList;
import java.util.List;
//QB question




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
