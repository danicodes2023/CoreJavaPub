package com.interview.san.qb;

public class LocalDog extends Dog implements Animal{
    @Override
    void bark() {
        System.out.println("bark");
    }

    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }
}
