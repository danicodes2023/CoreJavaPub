package com.interview.san.qb;

public interface AnimalVisitor {
    void visit(LocalCat localCat);
    void visit(LocalCow localCow);
    void visit(LocalDog localDog);
}
