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

        String letrasUtilizadas = "";

        do { //faça isso enquanto...


           char letraEscolhida =  menu.chutaLetra(qtdeTentativas);

            boolean perdeQtdeTentativas = true;

            String letraEscolhidaString = Character.toString(letraEscolhida);

            for (int i = 0; i < palavra.length(); i++) {

                if (letraEscolhida == palavra.charAt(i)) {
                    acertos[i] = 1;  //se o usuario acertar a letra,é colocado 1 no lugar da letra que ta 0
                    perdeQtdeTentativas = false; //se o usuario acertar a letra,ele não perde nenhuma quantidade de tentativas
                }
            }

            if (letrasUtilizadas.contains(letraEscolhidaString)){
                System.out.println("Você já utilizou essa letra antes");
            }else
            if (perdeQtdeTentativas) {
                qtdeTentativas--; //executa só se o usuario não acertar a letra nessa rodada
            }

            if(letrasUtilizadas.contains(letraEscolhidaString)){

            }else {
                letrasUtilizadas += " " + letraEscolhida;
            }
            System.out.println(" Você já utilizou essas letras: " + letrasUtilizadas);



            jogoForca.setGanhou(true);


            System.out.println("\nA Palavra é ");

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



