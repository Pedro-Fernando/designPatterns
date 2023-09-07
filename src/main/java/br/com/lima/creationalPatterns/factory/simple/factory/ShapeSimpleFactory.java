package br.com.lima.creationalPatterns.factory.simple.factory;

import br.com.lima.creationalPatterns.factory.simple.enumeration.ShapeType;
import br.com.lima.creationalPatterns.factory.simple.model.Circle;
import br.com.lima.creationalPatterns.factory.simple.model.Rectangle;
import br.com.lima.creationalPatterns.factory.simple.model.Shape;
import br.com.lima.creationalPatterns.factory.simple.model.Square;

import static java.util.Objects.nonNull;


public class ShapeSimpleFactory {

    public static Shape orderShape(ShapeType shapeType) {
        Shape shape;

        switch (shapeType) {
            case CIRCLE:
                shape = new Circle();
                break;
            case RECTANGULE:
                shape = new Rectangle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            default:
                shape = null;
                break;
        }

        if (nonNull(shape)) {
            shape.calculateArea();
        }


        return shape;
    }


}
