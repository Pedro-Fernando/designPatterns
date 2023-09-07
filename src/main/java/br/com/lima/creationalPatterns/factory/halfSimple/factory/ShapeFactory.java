package br.com.lima.creationalPatterns.factory.halfSimple.factory;

import br.com.lima.creationalPatterns.factory.halfSimple.enumeration.ShapeType;
import br.com.lima.creationalPatterns.factory.halfSimple.model.Shape;


public abstract class ShapeFactory {

    public Shape orderShape(ShapeType shapeType) {
        Shape shape = createShape(shapeType);

        shape.calculateArea();

        return shape;
    }

    protected abstract Shape createShape(ShapeType shapeType);

}
