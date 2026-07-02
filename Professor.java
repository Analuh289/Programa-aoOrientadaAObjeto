package classeseobjetos;

public class Professor extends Pessoa {
	//Atributos
	private double salario;
	
	public Professor(String nome, int matricula, Endereco end, 
			double salario) {
		super(nome, matricula, end);
		this.salario = salario;
	}

	//Get e Set
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	//Método que pertence à subclasse
	public void exibirMatricula() {
		//System.out.println(this.getMatricula());
		System.out.println(this.matricula); //Atributo protected
	}
}
