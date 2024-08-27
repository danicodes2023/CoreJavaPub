package com.interview.san.qb;

public class LocalCat extends Cat implements Animal{
    @Override
    void meow() {
        System.out.println("meow");
    }

    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }
}
