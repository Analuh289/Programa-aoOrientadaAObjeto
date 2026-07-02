package JogosEletronicos;

// Classe final (não permite herança)
public final class PlataformaGames {
    public static void main(String[] args) {
        // Instanciando os objetos
        JogoRpg rpg = new JogoRpg("The Witcher 3", "PC", "RPG-001", "Bruxo");
        JogoCorrida corrida = new JogoCorrida("Mario Kart 8", "Nintendo Switch", "COR-042", 48);

        // Exibindo as informações iniciais de ambos
        rpg.exibirDetalhes();
        System.out.println();
        corrida.exibirDetalhes();
        System.out.println();

        // Executando métodos sobrescritas da interface / lógica de pontos
        rpg.classificar(100); // Deve somar 100 * 2 = 200 pontos
        corrida.classificar(100); // Deve somar 100 pontos

        System.out.println("--- Após a primeira classificação ---");
        rpg.exibirPlacar();
        corrida.exibirPlacar();
        System.out.println();

        // Executando os métodos sobrecarregados
        rpg.classificar("Mestre das Poções", 50); // Soma mais 50 pontos e exibe texto
        corrida.exibirPlacar("Ana Luiza"); // Exibe mensagem personalizada com a constante BONUS_PONTOS
        System.out.println();

        // Exibindo o placar final atualizado
        System.out.println("--- Placar Final Atualizado ---");
        rpg.exibirPlacar();
        corrida.exibirPlacar();
        System.out.println();

        // Executando o método final (não sobrescritível)
        rpg.registrar();
        corrida.registrar();
        System.out.println();

        // Exibindo o total de jogos cadastrados utilizando o atributo static
        System.out.println("Total de jogos cadastrados no sistema: " + Jogo.getContadorJogos());
    }
}