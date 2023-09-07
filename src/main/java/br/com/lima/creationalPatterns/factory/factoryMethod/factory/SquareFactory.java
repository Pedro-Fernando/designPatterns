package br.com.lima.creationalPatterns.factory.factoryMethod.factory;

import br.com.lima.creationalPatterns.factory.factoryMethod.model.Shape;
import br.com.lima.creationalPatterns.factory.factoryMethod.model.Square;

public class SquareFactory extends ShapeFactory {

    @Override
    protected Shape createShape() {
        return new Square();
    }
}
