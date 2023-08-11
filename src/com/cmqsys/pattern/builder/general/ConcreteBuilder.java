package com.cmqsys.pattern.builder.general;

public class ConcreteBuilder implements IBuilder {

    private Product product = new Product();

    @Override
    public Product build() {
        return product;
    }
}
