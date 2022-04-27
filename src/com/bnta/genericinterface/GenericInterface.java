package com.bnta.genericinterface;

public interface GenericInterface <X, Y> {

    // StringandInteger:  X = String, Y = Integer

    // IntegerandString: X = Integer, Y = String

    Y doSomeOperations(X x);

    X doReverseOperations(Y y);

}
