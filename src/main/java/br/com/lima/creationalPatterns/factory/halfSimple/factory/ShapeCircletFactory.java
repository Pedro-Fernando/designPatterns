package br.com.lima.creationalPatterns.factory.halfSimple.factory;

import br.com.lima.creationalPatterns.factory.halfSimple.enumeration.ShapeType;
import br.com.lima.creationalPatterns.factory.halfSimple.model.Circle;
import br.com.lima.creationalPatterns.factory.halfSimple.model.Shape;


public class ShapeCircletFactory extends ShapeFactory{
    @Override
    protected Shape createShape(ShapeType shapeType) {
        if (ShapeType.CIRCLE.equals(shapeType)) {
            return new Circle();
        }
        return null;
    }
}
