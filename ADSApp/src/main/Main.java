/**
 scr/main > Contem a classe principal do projeto
 src/main/Main.java > Executa a aplicação
 src/model > Contem as classes dos objetos (Pessoa, Bola, Carro, etc)
 			 Exemplo: src/model/Carro.java
 			 
 src/controller > Contem a lógica de negócios e manipulação de objetos
 
 src/view > Contem a interface gráfica (Front-end)
 			Exemplo: FrontEnd.java
 			
 src/util > Contem o armazenamento das classes utilitarias com metodos auxiliares,
 			funcoes comuns ou operações genericas.
 			
 pom.xml > é o arquivo de configuração principal do Projeto Java em Maven
 			Uma ferramente de automação muito útil nos projetos.
 			Usabilidade:
 			Gerenciamento de Dependecias > Bibliotecas externas necessárias
 			Configuração de compilação > versão do Java, plugins)
 			Empacotamento do projeto (geração do .jar ou .war)
 			Execução de testes e outras tarefas automatizadas (conexão e versão do banco de dados)
 
 
 */

package main;
import model.*;

//Classe principal que contem o metodo main (ponto de entrada do programa)
public class Main {
	public static void main(String[] args) {
		//Criando a Lista (array) de objetos diferentes
		Objeto[] objetos = {
				new Carro(" Honda Civic", "Sedan"),
				new Pessoa(" Augusto", "054.245.652-95", "1,75m", "75kg", "Arquiteto"),
				new Bola("Basquete", "30cm", "1,5kg", "Laranja"),
				new Animal("Bertolomeu", "Leao", "4 patas", "Amarelo"),
				new Reuniao("equipe de vendas", "dia 04", "as 10:00", "na Sala de Reuniao 04")
		};
		for (Objeto obj : objetos) {
			obj.exibirDetalhes();
		}
		
	}

}