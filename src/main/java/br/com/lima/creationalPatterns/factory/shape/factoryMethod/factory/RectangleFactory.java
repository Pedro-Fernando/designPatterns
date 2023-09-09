package br.com.lima.creationalPatterns.factory.shape.factoryMethod.factory;

import br.com.lima.creationalPatterns.factory.shape.factoryMethod.model.Rectangle;
import br.com.lima.creationalPatterns.factory.shape.factoryMethod.model.Shape;

public class RectangleFactory extends ShapeFactory{


    @Override
    protected Shape createShape() {
        return new Rectangle();
    }
}
