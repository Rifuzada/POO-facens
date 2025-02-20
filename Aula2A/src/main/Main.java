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
		Objeto[] objetos = {
				new Carro("Honda Civic", "Sedan")
		};
		for (Objeto obj: objetos) {
			obj.exibirDetalhes();
		}

	}
}
