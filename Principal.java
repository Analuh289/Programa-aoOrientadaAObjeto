package classeseobjetos;

import classeseobjetos.Pessoa;

import classeseobjetos.Endereco;

public class Principal {

	public static void main(String[] args) {
		//Criar objeto
		Pessoa aluno = new Pessoa();
		aluno.setNome("Pedro");
		aluno.setMatricula(aluno.calcularMatricula(65));
		System.out.println(aluno);
		
		Endereco endereco = new Endereco("Rua Cobre", -200, "Atlético");
		Pessoa professor = new Pessoa("Amanda", 9874, endereco);
//		Pessoa professor = new Pessoa("Amanda", 9874, 
//									new Endereco("Rua Cobre", 200, "Atlético"));
		professor.setMatricula( 
				professor.calcularMatricula(professor.getMatricula()));

		
		professor.setMatricula( 
				professor.calcularMatricula(professor.getMatricula()));
		System.out.println(professor);
		
		
		//Objeto do tipo Professor
		Professor prof2 = new Professor("Amanda", 5246, null, 10000);
		System.out.println(prof2);
		
	}

}
