package br.com.lima.creationalPatterns.factory.shape.halfSimple.factory;

import br.com.lima.creationalPatterns.factory.shape.halfSimple.enumeration.ShapeType;
import br.com.lima.creationalPatterns.factory.shape.halfSimple.model.Circle;
import br.com.lima.creationalPatterns.factory.shape.halfSimple.model.Shape;


public class ShapeCircletFactory extends ShapeFactory{
    @Override
    protected Shape createShape(ShapeType shapeType) {
        if (ShapeType.CIRCLE.equals(shapeType)) {
            return new Circle();
        }
        return null;
    }
}
