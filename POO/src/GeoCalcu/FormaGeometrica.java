package GeoCalcu;

public class FormaGeometrica {
    private String cor;

    public FormaGeometrica(String cor) {
        this.cor = cor;
    }
    public FormaGeometrica() {

    }

    public abstract double calculaPermietro();

    public abstract double calculaArea();

    public abstract double calculaVolume();

    public double calculaPerimetro() {
        System.out.println("Não implementado!");
        return 0.0;
    }

    public double calculaArea() {
        System.out.println("Não implementado!");
        return 0.0;
    }

    public double calculaVolume() {
        System.out.println("Não implementado!");
        return 0.0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}