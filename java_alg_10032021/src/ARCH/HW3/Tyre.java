package ARCH.HW3;

public class Tyre {
    private final String manufacturer; //Must have this parameter
    private final String model; // Must have this parameter
    private int dia;
    private int width;
    private int height;
    private int loadIndex;
    private int speedIndex;

    public Tyre(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Tyre dia(int dia) {
        this.dia = dia;
        return this;
    }

    public Tyre width(int width) {
        this.width = width;
        return this;
    }

    public Tyre height(int height) {
        this.height = height;
        return this;
    }

    public Tyre loadIndex(int loadIndex) {
        this.loadIndex = loadIndex;
        return this;
    }

    public Tyre speedIndex(int speedIndex) {
        this.speedIndex = speedIndex;
        return this;
    }

    public static void main(String[] args) {
        Tyre tyre = new Tyre("KAMA", "Euro")
                .dia(15)
                .width(220)
                .height(70)
                .loadIndex(120);
    }
}
