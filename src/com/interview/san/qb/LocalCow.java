package com.interview.san.qb;

public class LocalCow extends Cow implements Animal{
    @Override
    void moo() {
        System.out.println("moo");
    }

    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }
}
