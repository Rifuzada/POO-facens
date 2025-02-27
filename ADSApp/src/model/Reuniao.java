package model;

//Classe Reuniao que herda de Objeto
public class Reuniao extends Objeto{
	private String Data;
	private String Horario;
	private String Local;
	
	public Reuniao(String nome, String Data, String Horario, String Local) {
		super(nome);
		this.Data = Data;
		this.Horario = Horario;
		this.Local = Local;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Reuniao: " + nome + ", Data: " + Data + ", Horario: " + Horario + ", Local: " + Local);
	}
}