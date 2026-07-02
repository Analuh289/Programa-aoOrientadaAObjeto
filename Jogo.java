package JogosEletronicos;

public abstract class Jogo implements Classificavel {
   
    // Atributos de instância encapsulados
    private String nome;
    private String plataforma;
    private int totalPontos;
    private final String id; // Constante/Imutável

    // Atributo de classe (static)
    private static int contadorJogos = 0;

    // Construtor
    public Jogo(String nome, String plataforma, String id) {
        this.setNome(nome);
        this.setPlataforma(plataforma);
        this.id = id; // Atributo final é atribuído diretamente
        this.totalPontos = 0; // Inicializa com zero
        contadorJogos++; // Incrementa a cada nova instância
    }

    // Validação no set do totalPontos
    public void setTotalPontos(int totalPontos) {
        if (totalPontos >= 0) {
            this.totalPontos = totalPontos;
        } else {
            System.out.println("Erro: Total de pontos não pode ser menor que zero.");
        }
    }

    // Getters e Setters para aplicar o encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getTotalPontos() {
        return totalPontos;
    }

    public String getId() {
        return id;
    }

    public static int getContadorJogos() {
        return contadorJogos;
    }

    // Método abstrato (apenas assinatura, sem corpo)
    public abstract void exibirDetalhes();

    // Método final (não permite sobrescrita nas subclasses)
    public final void registrar() {
        System.out.println("Registrando jogo -> Nome: " + this.nome + " | ID: " + this.id);
    }
}

