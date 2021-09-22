package com.projetono;

public class Main {
    public static void main(String[] args) {

        //instânciar o nó
        no no1 = new no("Conteúdo no1");

        no no2 = new no("Conteúdo no2");
        no1.setProximoNo(no2);
        //encadeamento do no1 com no2, e fazer a referência do no1 apontar para o no2

        no no3 = new no("Conteúdo no3");
        no2.setProximoNo(no3);
        //encadeamento do no2 com no3, e fazer a referência do no2 apontar para o no3
        no no4 = new no ("Conteudo no4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);
        System.out.println("--------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
