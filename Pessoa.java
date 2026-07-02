package classeseobjetos;

public class Pessoa {
	//Atributos
	private String nome; 
	protected int matricula = 1226;
	private boolean ativo; 
	public Endereco end= new Endereco("", 0, "");
	
	//Construtor
	public Pessoa() {
		super();
		System.out.println("Construiu da Object.");
	}
	
	public Pessoa(String nome, int matricula, Endereco end) {
		super();
		this.setNome(nome);
		this.setMatricula(this.calcularMatricula(matricula));
		this.ativo = true;
		this.end = end;
		System.out.println("Construiu da Pessoa.");
	}

	//Métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public int calcularMatricula(int matricula) {
		return matricula * 10;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + 
				", matricula=" + matricula + 
				", Cadastro ativo? " + (ativo ? "Sim" : "Não") + 
				", end=" + end + "]";
	}


	
	
	
	
	
}
