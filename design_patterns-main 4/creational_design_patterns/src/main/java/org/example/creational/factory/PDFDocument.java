package org.example.creational.factory;

public class PDFDocument implements Document {
    @Override
    public void open() {
        System.out.println("document PDF ouvert");
    }
}
