package main;

/**
 * src/main > contem a calsse principal do projeto 
 * src/main/Main.java > executa a aplicacao
 * src/model > contem as classes dos objetos (pessoa, bola, carro, etc)
 * exemplo: src/model/Carro.java
 * 
 * src/controller > contem a logica de negocios e manipulacao de objetos
 * src/view > contem a interface grafica do projeto
 * 
 * src/util > contem o armazenamento das classes utilitarias com metodos auxiliares, 
 * funcoes comuns ou operacoes genericas.
 * 
 * pom.xml > e o arquivo de configuracao principal do projeto java em maven
 * uma ferramena de automacao mutio util nos projetos
 * usabilidade:
 * gerenciamento de dependencias  > bibliotecas externas necessarias
 * configuracao de compilacao > vesao do java e plugin
 * empacotamento do projeto geracao do .jar ou .war
 * execucao de testes e outras tarefas automatizadas (conexao e versao do banco de dados)
 */


import model.*;

public class Main {
	public static void main(String[] args){
				Pessoa p1 = new Pessoa("Medico","48882671038", 94.3f ,173.4f);
				p1.exibirDetalhes();
				Bola b1 = new Bola(28,800, "Laranja", "Basquete");
				b1.exibirDetalhes();
				Animal a1 = new Animal("Panthera onca", 4, "Amarelo");
				a1.exibirDetalhes();
				Reuniao r1 = new Reuniao("dia 4 de outubro", "2 da tarde", "Facens");
				r1.exibirDetalhes();

	}
}
