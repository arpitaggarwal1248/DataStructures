/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  designPattern.Product
 *  designPattern.ProductBuilder
 */
package designPattern;

import designPattern.Product;

public class ProductBuilder {
    private String name;
    private String age;
    private String email;

    public String getName() {
        return this.name;
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return this.age;
    }

    public ProductBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public ProductBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Product build() {
        return new Product(this.name, this.age, this.email);
    }
}

