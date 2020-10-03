package lab2;

/**
 * @author Ot�vio Cipriano
 * Matr�cula : 119210566
 *Define o nome da disciplina estudada, juntamente com o desempenho e dedica��o do aluno.
 */
public class Disciplina {
	
	/**
	 * Atributo que armazena o nome da disciplina a ser analizada.
	 */
	private String nome;
	/**
	 * Atributo que armazena a quantidade de horas que o aluno estudou.
	 */
	private int horasEstudadas;
	/**
	 * Atributo que armazena em uma array as notas que o aluno obteve na disciplina.
	 */
	private double[] notas;
	/**
	 *  Atributo que armazena em uma array os pesos para cada nota.
	 */
	private int[] pesos;
	/**
	 * Constr�i um objeto Disciplina que indica dados sobre o aluno em rela��o � disciplina descrita. 
	 * Sendo 4 a quantidade padr�o de notas.
	 * @param nomeDisciplina recebe o nome da disciplina.
	 */
	public Disciplina(String nomeDisciplina) {
		
		this.nome = nomeDisciplina;
		this.horasEstudadas = 0;
		this.pesos = new int[1];
		this.notas = new double[4];	
	}
	
	/**
	 * Constr�i um objeto Disciplina que indica dados sobre o aluno em rela��o � disciplina descrita. 
	 * Sendo fornecida pelo usu�rio a quantidade padr�o de notas.
	 * @param nomeDisciplina recebe o nome da disciplina.
	 * @param quant recebe a quantidade de notas da disciplina.
	 */
	public Disciplina(String nomeDisciplina, int quant) {
		this(nomeDisciplina);
		this.pesos = new int[1];
		this.notas = new double[quant];
	}
	/**
	 * Constr�i um objeto Disciplina que recebe a quantidade de notas e uma array de pesos;
	 * @param quant Recebe a quantidade de pesos, e consequentemente de notas do aluno.
	 * @param listaPesos Recebe a array de pesos para as notas do aluno.
	 */
	public Disciplina(int quant, int[] listaPesos ) {
		this.pesos = listaPesos;
		this.notas = new double[quant];
		
	}
	
	/**
	 * Adiciona horas � contagem total de horas estudadas pelo aluno.
	 * @param horas recebe as horas estudadas pelo aluno.
	 */
	public void cadastraHoras(int horas) {
		this.horasEstudadas += horas;
	}
	
	/**
	 * Adiciona um valor de nota a uma lista contendo a sequ�ncia de unidades.
	 * @param nota recebe a unidade a qual a nota se refere.
	 * @param valorNota recebe a nota que o aluno obteve naquela unidade.
	 */
	public void cadastraNota(int notaUnid, double valorNota) {
		this.notas[notaUnid -1] = valorNota;
	}
	
	/**
	 * Faz o c�lculo da m�dia do aluno.
	 * @return retorna o valor da m�dia do aluno.
	 */
	private double media() {
		
		double soma = 0;
		
		for(int i = 0; i < this.notas.length ; i++ ) {
			soma += this.notas[i];
		}
		double media = soma/this.notas.length;
		
		return media;
	}
	/**
	 * Realiza o c�lculo da m�dia ponderada baseada em uma lista de pesos.
	 * @return Retorna a m�dia ponderada do aluno.
	 */
	public double mediaPonderada() {
		if(this.pesos.length == 1) {
			return media();
		}else {
			double ponderada = 0;
			for(int i = 0; i < this.notas.length ; i++) {
				ponderada += this.notas[i] * this.pesos[i];
			}
		return ponderada/10;
		}
	}
	
	/**
	 * Testa se a m�dia do aluno foi suficiente para obter aprova��o.
	 * @return retorna o valor booleano.
	 */
	public boolean aprovado() {
		return media() >= 7.0;
	}
	
	/**
	 * Cria uma sequ�ncia de caracteres para simular o boletim do aluno.
	 * @return retorna as notas do aluno em sequ�ncia.
	 */
	private String boletim() {
		String saida = "[";
		for(int i = 0; i < this.notas.length ; i++ ) {
			saida += this.notas[i];
			if(i != this.notas.length -1) {
				saida += ", ";
			}else {
				saida += "]";
			}
		}
		return saida;
	}
	
	/**
	 *Exibe o nome da disciplina, assim como as horas de estudo do aluno, sua m�dia
	 * e suas notas de cada unidade.
	 */
	public String toString() {
		return this.nome + " " + this.horasEstudadas + " " + media() + " " + boletim();
	}
}