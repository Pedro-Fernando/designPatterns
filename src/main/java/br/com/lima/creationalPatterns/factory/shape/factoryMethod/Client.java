package br.com.lima.creationalPatterns.factory.shape.factoryMethod;

import br.com.lima.creationalPatterns.factory.shape.factoryMethod.factory.CircleFactory;
import br.com.lima.creationalPatterns.factory.shape.factoryMethod.factory.RectangleFactory;
import br.com.lima.creationalPatterns.factory.shape.factoryMethod.factory.ShapeFactory;
import br.com.lima.creationalPatterns.factory.shape.factoryMethod.factory.SquareFactory;
import br.com.lima.creationalPatterns.factory.shape.factoryMethod.model.Shape;

public class Client {

    public static void main(String[] args) {

        ShapeFactory circleFactory = new CircleFactory();
        Shape shapeCircle = circleFactory.orderShape();
        System.out.println(shapeCircle);
        System.out.println("-------------------------------");

        RectangleFactory rectangleFactory = new RectangleFactory();
        Shape shapeRectangle = rectangleFactory.orderShape();
        System.out.println(shapeRectangle);
        System.out.println("-------------------------------");

        SquareFactory squareFactory = new SquareFactory();
        Shape shapeSquare = squareFactory.orderShape();
        System.out.println(shapeSquare);

    }

}
