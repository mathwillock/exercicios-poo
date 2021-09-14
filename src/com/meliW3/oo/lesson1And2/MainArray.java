package com.meliW3.oo.lesson1And2;

public class MainArray {

    public static void main(String[] args) {

        System.out.println("---------- instanciando Roupas com laço ---------------");


        Roupa [] guardaRoupa = new Roupa [4];


        for (int i = 0; i < 4; i++) {
            guardaRoupa[i] = new Roupa();
        }

        guardaRoupa[0].nome = "Camisa";
        guardaRoupa[0].colecao = "Outono";
        guardaRoupa[0].tamanho = "M";
        guardaRoupa[0].cor = "Preto";
        guardaRoupa[0].modelo = "Kirito";

        guardaRoupa[1].nome = "Calca";
        guardaRoupa[1].colecao = "Outono";
        guardaRoupa[1].tamanho = "M";
        guardaRoupa[1].cor = "Jeans";
        guardaRoupa[1].modelo = "Larga";

        guardaRoupa[2].nome = "Blusa";
        guardaRoupa[2].colecao = "Inverno";
        guardaRoupa[2].tamanho = "M";
        guardaRoupa[2].cor = "Laranja";
        guardaRoupa[2].modelo = "Naruto Shippuden";

        guardaRoupa[3].nome = "Meia";
        guardaRoupa[3].colecao = "Outono";
        guardaRoupa[3].tamanho = "p";
        guardaRoupa[3].cor = "Colorida";
        guardaRoupa[3].modelo = "Socket sport";

        for (Roupa roupa : guardaRoupa) {
            System.out.println(roupa);
        }

        System.out.println("---------- instanciando Sapatos sem laço ---------------");


        Sapato [] sapateira = new Sapato [4];

        sapateira[0] = new Sapato("nike", 40, "cinza", "Basketball");
        sapateira[1] = new Sapato("Moleca", 35, "vermalho", "sapatilha");
        sapateira[2] = new Sapato("Adidas", 40, "Branco", "Sport");
        sapateira[3] = new Sapato("Marisa", 36, "Preto", "Social Femme");


        for (Sapato calcado : sapateira) {
            System.out.println(calcado);
        }

    }

}
