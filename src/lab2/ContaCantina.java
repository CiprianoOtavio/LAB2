package lab2;

/**
 * @author Otávio Cipriano
 * Matrícula : 119210566
 * Define o nome de uma cantina, juntamente com os dados de despesa do usuário.
 */
public class ContaCantina {
	
	/**
	 * Atributo que define o nome da cantina.
	 */
	private String nome;
	/**
	 * Atributo que indica a quantidade de itens consumidos pelo dono da conta.
	 */
	private int quantidade;
	/**
	 * Atributo que indica o débito existente na conta.
	 */
	private int conta;
	/**
	 * Atributo que indica o débito total do usuário, incluindo o que já foi pago. 
	 */
	private int contaTotal;
	/**
	 * Atributo que contém uma array com mensagens sobre os produtos consumidos.
	 */
	private String[] mensagens;
	/**
	 * Atributo que conta as compras realizadas com detalhes.
	 */
	private int compras;
	/**
	 * Constrói um objeto ContaCantina que contém os dados de débito da conta.
	 * @param nomeDaCantina recebe o nome da cantina.
	 */
	public ContaCantina(String nomeDaCantina) {
		this.nome = nomeDaCantina;
		this.quantidade = 0;
		this.conta = 0;
		this.contaTotal = 0;
		this.mensagens = new String[5];
		this.compras = -1;
	}
	/**
	 * Adiciona a quantidade de lanches e o valor de débito à conta.
	 * @param qtdItens recebe a quantidade de itens que o usuário comprou em sua conta.
	 * @param valorCentavos recebe o valor em centavos do débito que o usuário criou.
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.quantidade += qtdItens;
		this.conta += valorCentavos;
		this.contaTotal += valorCentavos;
	}
	/**
	 * Adiciona a quantidade de lanches e o valor de débito à conta, além de registrar um 
	 * comentário a respeito do(s) produto(s) consumido(s).
	 * @param qtdItens recebe a quantidade de itens que o usuário comprou em sua conta.
	 * @param valorCentavos recebe o valor em centavos do débito que o usuário criou.
	 * @param detalhes recebe uma mensagem com detalhes do produto consumido.
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos, String detalhes) {
		this.quantidade += qtdItens;
		this.conta += valorCentavos;
		this.contaTotal += valorCentavos;
		this.compras += 1;
		setMensagens(detalhes);
	}
	/**
	 * Adiciona detalhes, e atualiza para que os 5 mais recentes sejam mantidos.
	 * @param detalhes recebe uma mensagem com detalhes do produto consumido.
	 */
	private void setMensagens(String detalhes) {
		if(this.mensagens[mensagens.length -1] == null) {
			this.mensagens[compras] = detalhes;
		}else {
			for(int i = 0; i < this.mensagens.length ; i++ ) {
				if(i == this.mensagens.length -1) {
					this.mensagens[i] = detalhes;
				}else {
					this.mensagens[i] = this.mensagens[i+1];
				}
			}
		}
	}
	/**
	 * Decrementa o valor do débito na conta do usuário, se o valor a ser pago for
	 * inferior ou igual ao valor do débito.
	 * @param valorCentavos recebe o valor em centavos de quanto será pago da conta.
	 */
	public void pagaConta(int valorCentavos) {
		if(valorCentavos <= conta) {
			this.conta -= valorCentavos;
		}
	}
	/**
	 * Imprime o valor que o usuário ainda deve pagar.
	 * @return retorna o débito restante da conta.
	 */
	public int getFaltaPagar() {
		return this.conta;
	}
	/**
	 * Gera uma string com todas as mensagens da lista em linhas separadas.
	 * @return retorna a saída das ultimas 5 mensagens em linhas separadas.
	 */
	public String listarDetalhes() {
		String saida = "";
		for(int i = 0; i < this.mensagens.length ; i++) {
			if(i == this.mensagens.length -1) {
				saida += this.mensagens[i];
			}else {
				saida +=  this.mensagens[i] + "\n";
			}
		}
		return saida;
	}
	/**
	 *Exibe o nome da cantina, a quantidade de itens consumidos e o valor total gasto na cantina.
	 */
	public String toString() {
		return this.nome + " " + this.quantidade + " " + this.contaTotal;
	}
}