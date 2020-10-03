package lab2;

/**
 * @author Otávio Cipriano
 * Matrícula : 119210566
 * Define uma conta de um laboratório de Ciência da Computação, de maneira que 
 * cada aluno tenha uma cota de armazenamento máxima.
 */
public class ContaLaboratorio {
	/**
	 * Atributo que armazena o nome do laboratório em que 
	 * a conta do aluno vai estar cadastrada.
	 */
	private String lab;
	/**
	 * Atributo que define o espaço total em MegaBytes. 
	 */
	private int espacoTotal;
	/**
	 *  Atributo que define o espaço consumido da conta em MegaBytes.
	 */
	private int espacoConsumido;
	/**
	 * Constrói uma conta no laboratório com 2000mb de armazenamento padrão.
	 * @param nomeLaboratorio Recebe o nome do laboratório. 
	 */
	public ContaLaboratorio(String nomeLaboratorio){
		this.lab = nomeLaboratorio;
		this.espacoTotal = 2000;
		this.espacoConsumido = 0;
	}
	/**
	 * Constrói uma conta no laboratório definindo a cota de armazenamento.
	 * @param nomeLaboratorio Recebe o nome do laboratório.
	 * @param cota Recebe a cota de armazenamento da conta.
	 */
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this(nomeLaboratorio);
		this.espacoTotal = cota;
	}
	/**
	 * Incrementa a quantidade de armazenamento consumida.
	 * @param mbytes Recebe a quantidade de MegaBytes a ser consumida. 
	 */
	public void consomeEspaco(int mbytes) {
		this.espacoConsumido += mbytes;
	}
	/**
	 * Decrementa a quantidade de armazenamento consumida.
	 * @param mbytes Recebe a quantidade de MegaBytes a ser recuperada.
	 */
	public void liberaEspaco(int mbytes) {
		this.espacoConsumido -= mbytes;
	}
	/**
	 * Testa se a cota de armazenamento foi atingida.
	 * @return  Retorna valor verdadeiro caso a cota seja atingida.
	 */
	public boolean atingiuCota() {
		return this.espacoConsumido >= this.espacoTotal; 
	}
	/**
	 *Exibe o nome do laboratório, indicando a quantidade de armazenamento consumida
	 *em relação à quantidade de armazenamento total.
	 */
	public String toString() {
		return this.lab + " " + this.espacoConsumido + "/" + this.espacoTotal; 
	}
	
}