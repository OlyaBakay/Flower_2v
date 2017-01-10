package com.bakay.observe;

abstract class Observer {
    CustomObservable subject;

    abstract void update();
}