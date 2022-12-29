package ru.gb.jseminar.data;

public class Notebook {
    private int id;
    private String model;
    private String color;
    private double diagonal;
    private String processor;
    private int ram;
    private String os;
    private int price;

    public Notebook(int id, String model, String color, double diagonal, String processor, int ram, String os, int price) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.diagonal = diagonal;
        this.processor = processor;
        this.ram = ram;
        this.os = os;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print() {
        String res = "\nКод товара: " + this.id +
                "\nМодель: " + this.model +
                "\nЦвет модели: " + this.color +
                "\nДиагональ экрана(дюйм): " + this.diagonal +
                "\nМодель процессора: " + this.processor +
                "\nОбьём оперативной памяти(Гб): " + this.processor +
                "\nОперационная система: " + this.os +
                "\nЦена: " + this.price + " руб." +
                "\n-----------------------------\n";
        System.out.println(res);

    }
}
