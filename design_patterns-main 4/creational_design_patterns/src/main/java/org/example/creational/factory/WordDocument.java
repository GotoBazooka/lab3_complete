package org.example.creational.factory;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("document WORD ouvert");
    }
}