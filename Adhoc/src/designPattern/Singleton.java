/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  designPattern.Singleton
 */
package designPattern;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new Singleton();
        return instance;
    }
}

