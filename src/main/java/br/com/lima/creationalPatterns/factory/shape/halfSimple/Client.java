package br.com.lima.creationalPatterns.factory.shape.halfSimple;

import br.com.lima.creationalPatterns.factory.shape.halfSimple.enumeration.ShapeType;
import br.com.lima.creationalPatterns.factory.shape.halfSimple.factory.ShapeCircletFactory;
import br.com.lima.creationalPatterns.factory.shape.halfSimple.factory.ShapeFactory;
import br.com.lima.creationalPatterns.factory.shape.halfSimple.factory.ShapeStraightFactory;
import br.com.lima.creationalPatterns.factory.shape.halfSimple.model.Shape;

public class Client {

    public static void main(String[] args) {

        ShapeFactory shapeStraightFactory = new ShapeStraightFactory();
        Shape shape1 = shapeStraightFactory.orderShape(ShapeType.RECTANGULE);
        System.out.println(shape1);

        Shape shape2 = shapeStraightFactory.orderShape(ShapeType.SQUARE);
        System.out.println(shape2);
        System.out.println("-------------------------------");

        ShapeFactory shapeCircleFactory = new ShapeCircletFactory();
        Shape shape3 = shapeCircleFactory.orderShape(ShapeType.CIRCLE);
        System.out.println(shape3);


    }

}
