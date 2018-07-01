package entidade;

public class JogoForca {


    private String palavraEscolhida;
    private char letra;
    private String nomeJogador;
    private boolean ganhou;
    private int tentativas;
    private String letrasUtilizadas = "";

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public boolean getGanhou() {
        return ganhou;
    }

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getPalavraEscolhida() {
        return palavraEscolhida;
    }

    public void setPalavraEscolhida(String palavraEscolhida) {
        this.palavraEscolhida = palavraEscolhida;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String getLetrasUtilizadas() {
        return letrasUtilizadas;
    }

    public void setLetrasUtilizadas(String letrasUtilizadas) {
        this.letrasUtilizadas = letrasUtilizadas;
    }
}
