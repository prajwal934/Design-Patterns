package com.designpatterns;

public class ThreadSafeDoubleLockingSingleton {
    private static ThreadSafeDoubleLockingSingleton instance = null;

    private ThreadSafeDoubleLockingSingleton() {
        System.out.println("Singleton Constructor Called!");
    }

//    Double Check locking
    public static ThreadSafeDoubleLockingSingleton getInstance() {
        if(instance == null) { //first check(no locking)
            synchronized (ThreadSafeDoubleLockingSingleton.class) { // lock only if needed
                if(instance == null) { // second check (after acquiring lock)
                    instance = new ThreadSafeDoubleLockingSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeDoubleLockingSingleton t1 = new ThreadSafeDoubleLockingSingleton();
        ThreadSafeDoubleLockingSingleton t2 = new ThreadSafeDoubleLockingSingleton();

        System.out.println(t1 == t2);
    }
}
