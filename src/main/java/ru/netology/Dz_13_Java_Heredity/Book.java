package ru.netology.Dz_13_Java_Heredity;

public class Book extends Product {
    protected String author;

    public Book(int id, int price, String name, String author) {
        super(id, price, name);
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

