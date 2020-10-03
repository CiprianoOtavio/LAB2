package lab2;

/**
 * @author Ot�vio Cipriano
 * Matr�cula : 119210566
 * Define uma conta de um laborat�rio de Ci�ncia da Computa��o, de maneira que 
 * cada aluno tenha uma cota de armazenamento m�xima.
 */
public class ContaLaboratorio {
	/**
	 * Atributo que armazena o nome do laborat�rio em que 
	 * a conta do aluno vai estar cadastrada.
	 */
	private String lab;
	/**
	 * Atributo que define o espa�o total em MegaBytes. 
	 */
	private int espacoTotal;
	/**
	 *  Atributo que define o espa�o consumido da conta em MegaBytes.
	 */
	private int espacoConsumido;
	/**
	 * Constr�i uma conta no laborat�rio com 2000mb de armazenamento padr�o.
	 * @param nomeLaboratorio Recebe o nome do laborat�rio. 
	 */
	public ContaLaboratorio(String nomeLaboratorio){
		this.lab = nomeLaboratorio;
		this.espacoTotal = 2000;
		this.espacoConsumido = 0;
	}
	/**
	 * Constr�i uma conta no laborat�rio definindo a cota de armazenamento.
	 * @param nomeLaboratorio Recebe o nome do laborat�rio.
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
	 *Exibe o nome do laborat�rio, indicando a quantidade de armazenamento consumida
	 *em rela��o � quantidade de armazenamento total.
	 */
	public String toString() {
		return this.lab + " " + this.espacoConsumido + "/" + this.espacoTotal; 
	}
	
}