package br.com.lima.creationalPatterns.factory.factoryMethod.model;

public class Square implements Shape {

    private Double side;

    public Square() {
        this.side = 2.0;
    }

    @Override
    public void calculateArea() {
        Double area = this.side * this.side;
        String template = "Quadrado com lados: %f.\nÁrea: %f.";
        String mensagem = String.format(template, this.side, area);

        System.out.println(mensagem);

    }
}
