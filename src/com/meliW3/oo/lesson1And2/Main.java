package com.meliW3.oo.lesson1And2;

public class Main {
    public static void main(String[] args) {

        Roupa camisa = new Roupa("camisa Madara", "Otaku", "Extra Grande", "Preta e vermelha", "Unisex");

        Roupa calca = new Roupa("calca skinny", "Outono", "G", "Jeans", "Masculina" );

        Sapato saltoAgulha = new Sapato("Salto agulha", 34, "Rosa", "Agulha");

        Sapato bicofino = new Sapato("Bico Fino", 35, "Preto", "Bico fino");


        System.out.println(camisa.toString());
        System.out.println(calca.toString());

        System.out.println(bicofino.toString());
        System.out.println(saltoAgulha.toString());

    }
}
