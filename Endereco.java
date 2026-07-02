package classeseobjetos;

public class Endereco {
	//Atributos
	private String logradouro;
	private int numero;
	private String bairro;
	
	//Construtor
	public Endereco(String logradouro, int numero, String bairro) {
		super();
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setBairro(bairro);
	}

	//Getters e Setters
	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		if (numero < 0) {
			System.out.println("Valor inválido.");
		} else {
			this.numero = numero;
		}
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "Endereco [getLogradouro()=" + getLogradouro() + 
				", getNumero()=" + getNumero() + 
				", getBairro()="
				+ getBairro() + "]";
	}


	//Métodos

}
