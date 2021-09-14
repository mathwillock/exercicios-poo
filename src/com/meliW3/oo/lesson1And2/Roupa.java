package com.meliW3.oo.lesson1And2;

public class Roupa {

    //Atributos
    String nome;
    String colecao;
    String tamanho;
    String cor;
    String modelo;


    public Roupa() {
    }

    public Roupa (String name, String colletction, String size, String color, String model) {
        nome = name;
        colecao = colletction;
        tamanho = size;
        cor = color;
        modelo = model;

    }


    @Override
    public String toString() {
        return "Roupa{" +
                "nome='" + nome + '\'' +
                ", colecao='" + colecao + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
