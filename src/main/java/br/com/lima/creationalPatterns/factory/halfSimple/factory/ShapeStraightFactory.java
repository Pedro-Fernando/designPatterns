package br.com.lima.creationalPatterns.factory.halfSimple.factory;

import br.com.lima.creationalPatterns.factory.halfSimple.enumeration.ShapeType;
import br.com.lima.creationalPatterns.factory.halfSimple.model.Rectangle;
import br.com.lima.creationalPatterns.factory.halfSimple.model.Shape;
import br.com.lima.creationalPatterns.factory.halfSimple.model.Square;


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
