package br.com.lima.creationalPatterns.factory.simple.model;

public class Circle implements Shape {

    private Double raio;
    private Double PI = Math.PI;

    public Circle() {
        this.raio = 4.0;
    }

    @Override
    public void calculateArea() {
        Double area = this.PI * Math.pow(raio, 2);
        String template = "Circulo com raio: %f.\nÁrea: %f.";
        String mensagem = String.format(template, this.raio, area);

        System.out.println(mensagem);
    }
}
