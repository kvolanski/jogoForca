package menu;



import entidade.JogoForca;

import java.util.List;
import java.util.Scanner;

public class Menu {

    JogoForca jogoForca = new JogoForca();
    Scanner scanner = new Scanner(System.in);




        public Character chutaLetra(int qtdeTentativas){

            System.out.println("\nVocê tem " + qtdeTentativas + " tentativas" ); //Exibe a quatidade de tentativas que você tem
            System.out.println("\nQual letra ou palavra quer chutar?");
            jogoForca.setLetra(scanner.next().toUpperCase().charAt(0)); //se digitar uma String,ele pega apenas o primeiro caracter
            char letraEscolhida = jogoForca.getLetra(); // pega a variavel que foi digitada e coloca em outra variavel pra ficar mais facil

            return letraEscolhida;

        }


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
            System.out.println("Boa sorte " + jogoForca.getNomeJogador().toUpperCase());

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


