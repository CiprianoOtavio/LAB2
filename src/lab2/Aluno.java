package lab2;

import java.util.HashMap;

/**
 * @author Otávio Cipriano
 *	Matrícula : 119210566
 *	Define o nome de um aluno e os detalhes a respeito dele, sua conta em um laboratório de 
 *	Ciência da Computação, detalhes de alguma disciplina em que está matriculado, sua conta 
 *	em alguma cantina e o status de sua Saúde.
 */
public class Aluno {
	
	/**
	 * Atributo que associa um nome ao objeto ContaLaboratório.
	 */
	private  HashMap<String, ContaLaboratorio> novaConta;
	/**
	 * Atributo que associa um nome ao objeto Disciplina.
	 */
	private  HashMap<String, Disciplina> materia;
	/**
	 * Atributo que associa um nome ao objeto ContaCantina.
	 */
	private  HashMap<String, ContaCantina> lanchonete;
	/**
	 * Atributo que define o Objeto Saude como variável saude.
	 */
	private  Saude saude;
	/**
	 * 
	 * Cria um Objeto Aluno que descreve dados a respeito de tal aluno.
	 */
	public Aluno() {
		this.novaConta = new HashMap<String, ContaLaboratorio>();
		this.materia = new HashMap<String, Disciplina>();
		this.lanchonete = new HashMap<String, ContaCantina>();
		this.saude = new Saude();

	}
		/**
		 * Cadastra uma conta indicando o laboratório em qual o aluno será cadastrado.
		 * @param nomeLaboratorio recebe o nome do laboratório.
		 */
		public void cadastraLaboratorio(String nomeLaboratorio) {
			ContaLaboratorio conta = new ContaLaboratorio(nomeLaboratorio);
			this.novaConta.put(nomeLaboratorio, conta);
		}
		/**
		 * Cadastra uma conta indicando o laboratório em qual o aluno será cadastrado e a quantidade
		 * máxima de armazenamento da conta.
		 * @param nomeLaboratorio recebe o nome do laboratório.
		 * @param cota recebe a quantidade máxima de armazenamento em MB.
		 */
		public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
			ContaLaboratorio conta = new ContaLaboratorio(nomeLaboratorio, cota);
			this.novaConta.put(nomeLaboratorio, conta);
		}
		/**
		 * Consome uma quantidade de armazenamento da cota máxima da conta do aluno.
		 * @param nomeLaboratorio recebe o nome do laboratório.
		 * @param mbytes recebe a quantidade de armazenamento a ser consumida da cota. 
		 */
		public void consomeEspaco(String nomeLaboratorio, int mbytes) {
			ContaLaboratorio conta = this.novaConta.get(nomeLaboratorio);
			conta.consomeEspaco(mbytes);
		}
		/**
		 * Decrementa a quantidade de armazenamento consumida da conta do aluno.
		 * @param nomeLaboratorio recebe o nome do laboratório.
		 * @param mbytes recebe a quantidade de armazenamento a ser decrementada do consumo. 
		 */
		public void liberaEspaco(String nomeLaboratorio, int mbytes) {
			ContaLaboratorio conta = this.novaConta.get(nomeLaboratorio);
			conta.liberaEspaco(mbytes);
		}
		/**
		 * Testa se a cota máxima da conta do aluno foi atingida.
		 * @param nomeLaboratorio recebe o nome do laboratório.
		 * @return Retorna valor verdadeiro caso a cota seja atingida.
		 */
		public boolean atingiuCota(String nomeLaboratorio) {
			ContaLaboratorio conta = this.novaConta.get(nomeLaboratorio);
			return conta.atingiuCota();
		}
		/**
		 * Exibe na saída detalhes a respeito da conta do aluno.
		 * @param nomeLaboratorio recebe o nome do laboratório.
		 * @return retorna detalhes da conta.
		 */
		public String laboratorioToString(String nomeLaboratorio){
			ContaLaboratorio conta = this.novaConta.get(nomeLaboratorio);
			return conta.toString();
		}
		/**
		 * Define o nome de uma disciplina em que o aluno está matriculado.
		 * @param nomeDisciplina recebe o nome da disciplina.
		 */
		public void cadastraDisciplina(String nomeDisciplina) {
			Disciplina cadeira = new Disciplina(nomeDisciplina);
			this.materia.put(nomeDisciplina, cadeira);
		}
		/**
		 * Adiciona as horas estudadas pelo aluno.
		 * @param nomeDisciplina recebe o nome da disciplina.
		 * @param horas recebe a quantidade de horas estudadas.
		 */
		public void cadastraHoras(String nomeDisciplina, int horas) {
			Disciplina cadeira = this.materia.get(nomeDisciplina);
			cadeira.cadastraHoras(horas);
		}
		/**
		 * Adiciona a nota obtida pelo aluno para a unidade referida.
		 * @param nomeDisciplina recebe o nome da disciplina.
		 * @param nota recebe a unidade à qual a nota se refere.
		 * @param valorNota recebe o valor da nota obtida pelo aluno.
		 */
		public void cadastraNota(String nomeDisciplina, int notaUnid, double valorNota) {
			Disciplina cadeira = this.materia.get(nomeDisciplina);
			cadeira.cadastraNota(notaUnid, valorNota);
		}
		/**
		 * Testa se a média do aluno é suficiente para aprovação.
		 * @param nomeDisciplina recebe o nome da disciplina.
		 * @return retorna valor True se o aluno for aprovado.
		 */
		public boolean aprovado(String nomeDisciplina) {
			Disciplina cadeira = this.materia.get(nomeDisciplina);
			return cadeira.aprovado();
		}
		/**
		 *  Imprime na saída detalhes a respeito do aluno cursando a disciplina em questão.
		 * @param nomeDisciplina recebe o nome da disciplina.
		 * @return retorna detalhes da disciplina.
		 */
		public String disciplinaToString(String nomeDisciplina) {
			Disciplina cadeira = this.materia.get(nomeDisciplina);
			return cadeira.toString();
		}
		/**
		 * Cadastra a conta de um aluno em uma determinada cantina.
		 * @param nomeCantina recebe o nome da cantina.
		 */
		public void cadastraCantina(String nomeCantina) {
			ContaCantina cantina = new ContaCantina(nomeCantina);
			this.lanchonete.put(nomeCantina, cantina);
		}
		/**
		 * Adiciona quantidade de itens e valor de débito à conta do aluno.
		 * @param nomeCantina recebe o nome da cantina.
		 * @param qtdItens recebe a quantidade de itens comprados.
		 * @param valorCentavos recebe o valor gasto pelo aluno.
		 */
		public void cadastraLanche(String nomeCantina, int qtdItens, int valorCentavos) {
			ContaCantina cantina = this.lanchonete.get(nomeCantina);
			cantina.cadastraLanche(qtdItens, valorCentavos);
		}
		/**
		 * Decrementa o valor de débito da conta do aluno.
		 * @param nomeCantina recebe o nome da cantina.
		 * @param valorCentavos recebe o valor a ser decrementado da conta do aluno. 
		 */
		public void pagarConta(String nomeCantina, int valorCentavos) {
			ContaCantina cantina = this.lanchonete.get(nomeCantina);
			cantina.pagaConta(valorCentavos);
		}
		/**
		 * Imprime na saída o valor restante a ser pago pelo aluno.
		 * @param nomeCantina recebe o nome da cantina.
		 * @return retorna o valor do débito restante da conta.
		 */
		public int getFaltaPagar(String nomeCantina) {
			ContaCantina cantina = this.lanchonete.get(nomeCantina);
			return cantina.getFaltaPagar();
		}
		/**
		 * Imprime na saída detalhes a respeito da conta do aluno.
		 * @param nomeCantina recebe o nome da cantina.
		 * @return retorna detalhes da conta do aluno.
		 */
		public String cantinaToString(String nomeCantina) {
			ContaCantina cantina = this.lanchonete.get(nomeCantina);
			return cantina.toString();
		}
		/**
		 * Define o status de saúde mental do aluno.
		 * @param valor recebe o valor da saúde mental do aluno.
		 */
		public void defineSaudeMental(String valor) {
			this.saude.defineSaudeMental(valor);
		}
		/**
		 * Define o status de saúde física do aluno.
		 * @param valor valor recebe o valor da saúde física do aluno.
		 */
		public void defineSaudeFisica(String valor) {
			this.saude.defineSaudeFisica(valor);
		}
		/**
		 * Define e imprime na saída o status de saúde geral do aluno.
		 * @return retorna o valor da saúde geral do aluno.
		 */
		public String getStatusGeral() {
			return this.saude.getStatusGeral();	
		}
}