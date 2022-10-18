package oop;

import java.util.Random;

public class ImplementInterface implements TestInterface{
    @Override
    public boolean test() {
        return new Random().nextBoolean();
    }
}
