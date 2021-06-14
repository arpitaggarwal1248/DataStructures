/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  designPattern.Product
 */
package designPattern;

public class Product {
    private String name;
    private String age;
    private String email;

    public Product(String name, String age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getUrl() {
        return String.valueOf(this.name) + this.age + this.email;
    }
}

