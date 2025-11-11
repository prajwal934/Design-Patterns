package com.designpatterns;

public class ThreadSafeEagerSingleton {
    private static ThreadSafeEagerSingleton instance = new ThreadSafeEagerSingleton();

    private ThreadSafeEagerSingleton() {
        System.out.println("Singleton Constructor called!");
    }

    public static ThreadSafeEagerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeEagerSingleton ts1 = ThreadSafeEagerSingleton.getInstance();
        ThreadSafeEagerSingleton ts2 = ThreadSafeEagerSingleton.getInstance();

        System.out.println(ts1 == ts2);
    }
}
