package controller;

import entidade.JogoForca;

import menu.Menu;

import java.util.Scanner;

public class JogoForcaController {

    Scanner scanner = new Scanner(System.in);
    JogoForca jogoForca = new JogoForca();
    Menu menu = new Menu();




    public char [] desenhaLinha (String palavra){

        char acertos[] = new char[palavra.length()];
        for (int i = 0;i < acertos.length;i++){
            acertos[i] = 0;
        }

        for (int i = 0; i < palavra.length(); i++) {
            System.out.print(" _ ");
        }

        return acertos;
    }

    public void estrutura(int qtdeTentativas, String palavra, char acertos[]) {

        String letrasUtilizadas = jogoForca.getLetrasUtilizadas();

        do { //faça isso enquanto...

            System.out.println("\nVocê tem " + qtdeTentativas + " tentativas" ); //Exibe a quatidade de tentativas que você tem
            System.out.println("\nQual letra ou palavra quer chutar?");
            jogoForca.setLetra(scanner.next().toUpperCase().charAt(0)); //se digitar uma String,ele pega apenas o primeiro caracter
            char letraEscolhida = jogoForca.getLetra(); // pega a variavel que foi digitada e coloca em outra variavel pra ficar mais facil

            boolean perdeQtdeTentativas = true;


            letrasUtilizadas += " " + letraEscolhida;

            System.out.println(" Você já utilizou essas letras: " + letrasUtilizadas);




            System.out.println("\nA Palavra é ");
            for (int i = 0; i < palavra.length(); i++) {

                if (letraEscolhida == palavra.charAt(i)) {
                    acertos[i] = 1;  //se o usuario acertar a letra,é colocado 1 no lugar da letra que ta 0
                    perdeQtdeTentativas = false; //se o usuario acertar a letra,ele não perde nenhuma quantidade de tentativas
                }
            }

            if (perdeQtdeTentativas) {
                qtdeTentativas--; //executa só se o usuario não acertar a letra nessa rodada
            }

            jogoForca.setGanhou(true);

            for (int i = 0; i < palavra.length(); i++) {
                if (acertos[i] == 0) {
                    System.out.print(" _ "); //se a letra não estiver na posição certa vai desenhar um _
                    jogoForca.setGanhou(false);
                } else {
                    System.out.print(" " + palavra.charAt(i) + " "); //se a letra digitada está na posição certa,vai escrever a letra.
                }
            }
         } while (!jogoForca.getGanhou() && qtdeTentativas > 0);

        menu.mensagemFinal(qtdeTentativas,palavra);

    }

}



