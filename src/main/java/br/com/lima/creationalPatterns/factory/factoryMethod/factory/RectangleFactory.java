package br.com.lima.creationalPatterns.factory.factoryMethod.factory;

import br.com.lima.creationalPatterns.factory.factoryMethod.model.Rectangle;
import br.com.lima.creationalPatterns.factory.factoryMethod.model.Shape;

public class RectangleFactory extends ShapeFactory{


    @Override
    protected Shape createShape() {
        return new Rectangle();
    }
}
