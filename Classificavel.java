package JogosEletronicos;

public interface Classificavel {
    // Constante pública para todas as classes
    int BONUS_PONTOS = 50;

    void classificar(int pontos);
    void exibirPlacar();
}