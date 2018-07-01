package menu;



import entidade.JogoForca;

import java.util.List;
import java.util.Scanner;

public class Menu {

    JogoForca jogoForca = new JogoForca();
    Scanner scanner = new Scanner(System.in);



        public String menuInicial(){

            System.out.println("Digite a palavra que deverá ser adivinhada:");
            jogoForca.setPalavraEscolhida(scanner.nextLine().toUpperCase());
            String palavra = jogoForca.getPalavraEscolhida();

                for (int i = 0; i < 50; i++) {
                    System.out.println("");
                }


            System.out.println("Bem vindo ao jogo da forca");
            System.out.println("Digite seu nome:");
            jogoForca.setNomeJogador(scanner.nextLine());
            System.out.println("Boa sorte " + jogoForca.getNomeJogador());
            String nomeJogador = jogoForca.getNomeJogador();

            return palavra;
    }


    public void mensagemFinal(int qtdeTentativas,String palavra){

        if(qtdeTentativas != 0) {
            System.out.println("\n\n\t PARABÉNS!!!!!");
            System.out.println("\nVocê ainda tinha: " + qtdeTentativas + " tentativas");
        }else{
            System.out.println("\n\nA palavra era: "+palavra);
            System.err.println("PERDEU!!!");
        }

    }


}


