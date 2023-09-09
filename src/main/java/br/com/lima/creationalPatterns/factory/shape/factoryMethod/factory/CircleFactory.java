package br.com.lima.creationalPatterns.factory.shape.factoryMethod.factory;


import br.com.lima.creationalPatterns.factory.shape.factoryMethod.model.Circle;
import br.com.lima.creationalPatterns.factory.shape.factoryMethod.model.Shape;

public class CircleFactory extends ShapeFactory{


    @Override
    protected Shape createShape() {
        return new Circle();
    }
}
