package br.com.lima.creationalPatterns.factory.shape.simple;


import br.com.lima.creationalPatterns.factory.shape.simple.enumeration.ShapeType;
import br.com.lima.creationalPatterns.factory.shape.simple.factory.ShapeSimpleFactory;
import br.com.lima.creationalPatterns.factory.shape.simple.model.Shape;

public class Client {

    public static void main(String[] args) {
       Shape shape1 = ShapeSimpleFactory.orderShape(ShapeType.RECTANGULE);
        System.out.println(shape1);
        System.out.println("---------------------------");

        Shape shape2 = ShapeSimpleFactory.orderShape(ShapeType.SQUARE);
        System.out.println(shape2);
        System.out.println("---------------------------");

        Shape shape3 = ShapeSimpleFactory.orderShape(ShapeType.CIRCLE);
        System.out.println(shape3);
        System.out.println("---------------------------");





    }

}
