package br.com.lima.creationalPatterns.factory.shape.halfSimple.factory;

import br.com.lima.creationalPatterns.factory.shape.halfSimple.enumeration.ShapeType;
import br.com.lima.creationalPatterns.factory.shape.halfSimple.model.Rectangle;
import br.com.lima.creationalPatterns.factory.shape.halfSimple.model.Shape;
import br.com.lima.creationalPatterns.factory.shape.halfSimple.model.Square;


public class ShapeStraightFactory extends ShapeFactory{
    @Override
    protected Shape createShape(ShapeType shapeType) {
        switch (shapeType){
            case SQUARE:
                return new Square();
            case RECTANGULE:
                return new Rectangle();
            default:
                return null;
        }
    }
}
