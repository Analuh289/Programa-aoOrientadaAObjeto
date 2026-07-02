package JogosEletronicos;

public class JogoRpg extends Jogo {
    private String classsePersonagem;

    // Construtor chamando a superclasse e incluindo o set
    public JogoRpg(String nome, String plataforma, String id, String classePersonagem) {
        super(nome, plataforma, id);
        this.setClasssePersonagem(classePersonagem);
    }

    public String getClasssePersonagem() {
        return classsePersonagem;
    }

    public void setClasssePersonagem(String classsePersonagem) {
        this.classsePersonagem = classsePersonagem;
    }

    // Sobrescrita do método abstrato
    @Override
    public void exibirDetalhes() {
        System.out.println("--- DETALHES DO JOGO RPG ---");
        System.out.println("ID: " + getId() + " | Nome: " + getNome() + " | Plataforma: " + getPlataforma());
        System.out.println("Pontuação Total: " + getTotalPontos() + " | Classe Selecionada: " + this.classsePersonagem);
    }

    // Implementação da interface (acrescenta pontos multiplicado por 2)
    @Override
    public void classificar(int pontos) {
        setTotalPontos(getTotalPontos() + (pontos * 2));
    }

    // Implementação da interface
    @Override
    public void exibirPlacar() {
        System.out.println("Placar RPG -> [Classe: " + this.classsePersonagem + "] " + getNome() + " - Pontos: " + getTotalPontos());
    }

    // Sobrecarga do método classificar
    public void classificar(String conquista, int pontos) {
        System.out.println("🏆 Nova Conquista Desbloqueada: [" + conquista + "]!");
        setTotalPontos(getTotalPontos() + pontos);
    }
}