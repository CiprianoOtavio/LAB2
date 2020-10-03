package lab2;

import java.util.HashMap;

/**
 * @author Ot�vio Cipriano
 *	Matr�cula : 119210566
 *	Define o nome de um aluno e os detalhes a respeito dele, sua conta em um laborat�rio de 
 *	Ci�ncia da Computa��o, detalhes de alguma disciplina em que est� matriculado, sua conta 
 *	em alguma cantina e o status de sua Sa�de.
 */
public class Aluno {
	
	/**
	 * Atributo que associa um nome ao objeto ContaLaborat�rio.
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
	 * Atributo que define o Objeto Saude como vari�vel saude.
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
		 * Cadastra uma conta indicando o laborat�rio em qual o aluno ser� cadastrado.
		 * @param nomeLaboratorio recebe o nome do laborat�rio.
		 */
		public void cadastraLaboratorio(String nomeLaboratorio) {
			ContaLaboratorio conta = new ContaLaboratorio(nomeLaboratorio);
			this.novaConta.put(nomeLaboratorio, conta);
		}
		/**
		 * Cadastra uma conta indicando o laborat�rio em qual o aluno ser� cadastrado e a quantidade
		 * m�xima de armazenamento da conta.
		 * @param nomeLaboratorio recebe o nome do laborat�rio.
		 * @param cota recebe a quantidade m�xima de armazenamento em MB.
		 */
		public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
			ContaLaboratorio conta = new ContaLaboratorio(nomeLaboratorio, cota);
			this.novaConta.put(nomeLaboratorio, conta);
		}
		/**
		 * Consome uma quantidade de armazenamento da cota m�xima da conta do aluno.
		 * @param nomeLaboratorio recebe o nome do laborat�rio.
		 * @param mbytes recebe a quantidade de armazenamento a ser consumida da cota. 
		 */
		public void consomeEspaco(String nomeLaboratorio, int mbytes) {
			ContaLaboratorio conta = this.novaConta.get(nomeLaboratorio);
			conta.consomeEspaco(mbytes);
		}
		/**
		 * Decrementa a quantidade de armazenamento consumida da conta do aluno.
		 * @param nomeLaboratorio recebe o nome do laborat�rio.
		 * @param mbytes recebe a quantidade de armazenamento a ser decrementada do consumo. 
		 */
		public void liberaEspaco(String nomeLaboratorio, int mbytes) {
			ContaLaboratorio conta = this.novaConta.get(nomeLaboratorio);
			conta.liberaEspaco(mbytes);
		}
		/**
		 * Testa se a cota m�xima da conta do aluno foi atingida.
		 * @param nomeLaboratorio recebe o nome do laborat�rio.
		 * @return Retorna valor verdadeiro caso a cota seja atingida.
		 */
		public boolean atingiuCota(String nomeLaboratorio) {
			ContaLaboratorio conta = this.novaConta.get(nomeLaboratorio);
			return conta.atingiuCota();
		}
		/**
		 * Exibe na sa�da detalhes a respeito da conta do aluno.
		 * @param nomeLaboratorio recebe o nome do laborat�rio.
		 * @return retorna detalhes da conta.
		 */
		public String laboratorioToString(String nomeLaboratorio){
			ContaLaboratorio conta = this.novaConta.get(nomeLaboratorio);
			return conta.toString();
		}
		/**
		 * Define o nome de uma disciplina em que o aluno est� matriculado.
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
		 * @param nota recebe a unidade � qual a nota se refere.
		 * @param valorNota recebe o valor da nota obtida pelo aluno.
		 */
		public void cadastraNota(String nomeDisciplina, int notaUnid, double valorNota) {
			Disciplina cadeira = this.materia.get(nomeDisciplina);
			cadeira.cadastraNota(notaUnid, valorNota);
		}
		/**
		 * Testa se a m�dia do aluno � suficiente para aprova��o.
		 * @param nomeDisciplina recebe o nome da disciplina.
		 * @return retorna valor True se o aluno for aprovado.
		 */
		public boolean aprovado(String nomeDisciplina) {
			Disciplina cadeira = this.materia.get(nomeDisciplina);
			return cadeira.aprovado();
		}
		/**
		 *  Imprime na sa�da detalhes a respeito do aluno cursando a disciplina em quest�o.
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
		 * Adiciona quantidade de itens e valor de d�bito � conta do aluno.
		 * @param nomeCantina recebe o nome da cantina.
		 * @param qtdItens recebe a quantidade de itens comprados.
		 * @param valorCentavos recebe o valor gasto pelo aluno.
		 */
		public void cadastraLanche(String nomeCantina, int qtdItens, int valorCentavos) {
			ContaCantina cantina = this.lanchonete.get(nomeCantina);
			cantina.cadastraLanche(qtdItens, valorCentavos);
		}
		/**
		 * Decrementa o valor de d�bito da conta do aluno.
		 * @param nomeCantina recebe o nome da cantina.
		 * @param valorCentavos recebe o valor a ser decrementado da conta do aluno. 
		 */
		public void pagarConta(String nomeCantina, int valorCentavos) {
			ContaCantina cantina = this.lanchonete.get(nomeCantina);
			cantina.pagaConta(valorCentavos);
		}
		/**
		 * Imprime na sa�da o valor restante a ser pago pelo aluno.
		 * @param nomeCantina recebe o nome da cantina.
		 * @return retorna o valor do d�bito restante da conta.
		 */
		public int getFaltaPagar(String nomeCantina) {
			ContaCantina cantina = this.lanchonete.get(nomeCantina);
			return cantina.getFaltaPagar();
		}
		/**
		 * Imprime na sa�da detalhes a respeito da conta do aluno.
		 * @param nomeCantina recebe o nome da cantina.
		 * @return retorna detalhes da conta do aluno.
		 */
		public String cantinaToString(String nomeCantina) {
			ContaCantina cantina = this.lanchonete.get(nomeCantina);
			return cantina.toString();
		}
		/**
		 * Define o status de sa�de mental do aluno.
		 * @param valor recebe o valor da sa�de mental do aluno.
		 */
		public void defineSaudeMental(String valor) {
			this.saude.defineSaudeMental(valor);
		}
		/**
		 * Define o status de sa�de f�sica do aluno.
		 * @param valor valor recebe o valor da sa�de f�sica do aluno.
		 */
		public void defineSaudeFisica(String valor) {
			this.saude.defineSaudeFisica(valor);
		}
		/**
		 * Define e imprime na sa�da o status de sa�de geral do aluno.
		 * @return retorna o valor da sa�de geral do aluno.
		 */
		public String getStatusGeral() {
			return this.saude.getStatusGeral();	
		}
}