package br.com.lima.creationalPatterns.factory.shape.factoryMethod.factory;


import br.com.lima.creationalPatterns.factory.shape.factoryMethod.model.Shape;

public abstract class ShapeFactory {

    public Shape orderShape() {
        Shape shape = createShape();

        shape.calculateArea();

        return shape;
    }

    protected abstract Shape createShape();

}
