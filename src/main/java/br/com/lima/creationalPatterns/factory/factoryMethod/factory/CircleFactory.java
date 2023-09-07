package br.com.lima.creationalPatterns.factory.factoryMethod.factory;


import br.com.lima.creationalPatterns.factory.factoryMethod.model.Circle;
import br.com.lima.creationalPatterns.factory.factoryMethod.model.Shape;

public class CircleFactory extends ShapeFactory{


    @Override
    protected Shape createShape() {
        return new Circle();
    }
}
