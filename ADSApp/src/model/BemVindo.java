package model;

public class BemVindo {

	//bemvindo a aluno com parametros
	public void OlaAluno(String nome) {
		System.out.println("Bem vindo, aluno " + nome);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BemVindo Aluno = new BemVindo();
		Aluno.OlaAluno("daniel");
	}

}
