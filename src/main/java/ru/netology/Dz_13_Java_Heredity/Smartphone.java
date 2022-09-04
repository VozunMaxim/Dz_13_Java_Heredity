package ru.netology.Dz_13_Java_Heredity;

public class Smartphone extends Product {
    protected String producer;

    public Smartphone(int id, int price, String name, String producer) {
        super(id, price, name);
        this.producer = producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }
}
