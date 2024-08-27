package com.interview.san.qb;

public class AnimalVisitorImpl implements AnimalVisitor{
    @Override
    public void visit(LocalCat localCat) {
        localCat.meow();
    }

    @Override
    public void visit(LocalCow localCow) {
        localCow.moo();
    }

    @Override
    public void visit(LocalDog localDog) {
        localDog.bark();
    }
}
