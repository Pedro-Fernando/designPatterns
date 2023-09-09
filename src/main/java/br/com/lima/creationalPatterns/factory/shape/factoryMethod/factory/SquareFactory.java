package br.com.lima.creationalPatterns.factory.shape.factoryMethod.factory;

import br.com.lima.creationalPatterns.factory.shape.factoryMethod.model.Shape;
import br.com.lima.creationalPatterns.factory.shape.factoryMethod.model.Square;

public class SquareFactory extends ShapeFactory {

    @Override
    protected Shape createShape() {
        return new Square();
    }
}
