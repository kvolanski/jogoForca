import controller.JogoForcaController;
import entidade.JogoForca;
import menu.Menu;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        JogoForca jogoForca = new JogoForca();
        JogoForcaController jogoForcaController = new JogoForcaController();
        Menu menu = new Menu();
        String palavra = menu.menuInicial();
        jogoForca.setTentativas(palavra.length());
        int qtdeTentativas = jogoForca.getTentativas();
        char acertos[] = jogoForcaController.desenhaLinha(palavra);
        jogoForcaController.estrutura(qtdeTentativas,palavra,acertos);

    }

}
