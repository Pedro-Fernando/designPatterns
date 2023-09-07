package br.com.lima.creationalPatterns.factory.halfSimple.model;

public class Rectangle implements Shape {

    private Double length;
    private Double width;

    public Rectangle() {
        this.length = 6.0;
        this.width = 4.0;
    }

    @Override
    public void calculateArea() {
        Double area = this.length * this.width;
        String template = "Retangulo com largura: %f, Comprimento: %f.\nÁrea: %f.";
        String mensagem = String.format(template, this.width, this.length, area);

        System.out.println(mensagem);

    }
}
