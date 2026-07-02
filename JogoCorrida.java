package JogosEletronicos;

public class JogoCorrida extends Jogo {
    private int totalPistas;

    // Construtor chamando a superclasse e incluindo o set
    public JogoCorrida(String nome, String plataforma, String id, int totalPistas) {
        super(nome, plataforma, id);
        this.setTotalPistas(totalPistas);
    }

    public int getTotalPistas() {
        return totalPistas;
    }

    public void setTotalPistas(int totalPistas) {
        if (totalPistas >= 0) {
            this.totalPistas = totalPistas;
        }
    }

    // Sobrescrita do método abstrato
    @Override
    public void exibirDetalhes() {
        System.out.println("--- DETALHES DO JOGO DE CORRIDA ---");
        System.out.println("ID: " + getId() + " | Nome: " + getNome() + " | Plataforma: " + getPlataforma());
        System.out.println("Pontuação Total: " + getTotalPontos() + " | Total de Pistas: " + this.totalPistas);
    }

    // Implementação da interface (acrescenta os pontos diretamente)
    @Override
    public void classificar(int pontos) {
        setTotalPontos(getTotalPontos() + pontos);
    }

    // Implementação da interface
    @Override
    public void exibirPlacar() {
        System.out.println("Placar Corrida -> [Pistas: " + this.totalPistas + "] " + getNome() + " - Pontos: " + getTotalPontos());
    }

    // Sobrecarga do método exibirPlacar
    public void exibirPlacar(String jogador) {
        System.out.println("🎮 Olá, " + jogador + "! Você recebeu o bônus lendário da plataforma de " + BONUS_PONTOS + " pontos!");
    }
}