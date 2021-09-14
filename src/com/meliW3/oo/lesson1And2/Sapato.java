package com.meliW3.oo.lesson1And2;

public class Sapato {

    String marca;
    int tamanho;
    String cor;
    String modelo;

    public Sapato(String name, int size, String color, String model) {
        marca = name;
        tamanho = size;
        cor = color;
        modelo = model;
    }


    @Override
    public String toString() {
        return "Sapato{" +
                "marca='" + marca + '\'' +
                ", tamanho=" + tamanho +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
