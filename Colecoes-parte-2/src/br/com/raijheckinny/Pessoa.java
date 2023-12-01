package br.com.raijheckinny;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    public static void main(String agrs []){
        Scanner s = new Scanner(System.in);
        boolean repetirCadastroDeNome = true;
        List<String> nomeMasculino = new ArrayList<String>();
        List<String> nomeFeminino = new ArrayList<String>();

        //Pedir para digitar o nome e gardar na lista do genero especifico
        while (repetirCadastroDeNome) {
            repetirCadastroDeNome = false;
            boolean repetir = true;

            System.out.println("Digite um Nome e Um Sexo Separado por virgua (Maria,F) : ");
            String nome = s.next();
            String[] nomeGenero;

            nomeGenero = nome.split(",");
            if(nomeGenero[1].equals("M")){
                nomeMasculino.add(nomeGenero[0]);
            } else if (nomeGenero[1].equals("F")) {
                nomeFeminino.add(nomeGenero[0]);

            } else {
                System.out.println("Genero Invalido");
                repetir= false;
                repetirCadastroDeNome = true;
            }
            //Verificar se deseija cadastrar outro aluno, e testar se ele escreveu a resposta errada
            while (repetir) {
                repetir = false;
                System.out.println("Deseija Cadastrar outro Nome? (Sim, Nao)");
                String testRepetirCadastroNome = s.next();

                if (testRepetirCadastroNome.equals("Sim")) {
                    repetirCadastroDeNome = true;
                } else if (testRepetirCadastroNome.equals("Nao")) {
                } else {
                    repetir = true;
                    System.out.println("Resposta Invalida");

                }
            }

        }

        //Imprimir as Listas
        System.out.println("________________________________");
        System.out.println("Lista Masculina");
        for (String nome : nomeMasculino){
            System.out.println(nome);
        }
        System.out.println("");

        System.out.println("________________________________");
        System.out.println("Lista Feminino");
        for (String nome : nomeFeminino){
            System.out.println(nome);
        }
    }
}
