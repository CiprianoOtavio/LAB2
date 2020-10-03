package lab2;

/**
 * @author Otávio Cipriano
 * Matrícula : 119210566
 *Define o status de saúde do aluno, baseado em sua saúde mental e física.
 */
public class Saude {
	
	/**
	 * Atributo que define a saúde mental do aluno.
	 */
	private String mental;
	/**
	 * Atributo que define a saúde física do aluno. 
	 */
	private String fisica;
	/**
	 * Atributo que define um emoji a ser adicionado ao status da saúde do aluno.
	 */
	private String emoji;
	/**
	 * Constrói um objeto Saude que define a saúde do aluno.
	 */
	public Saude() {
		this.mental = "";
		this.fisica = "";
		this.emoji = "";
	}
	/**
	 * Atribui o valor "boa" ou "fraca" à saúde mental do aluno.
	 * @param valor recebe o valor de saúde mental do aluno.
	 */
	public void defineSaudeMental(String valor) {
		this.mental = valor;
		this.emoji = "";
	}
	/**
	 * Atribui o valor "boa" ou "fraca" à saúde física do aluno.
	 * @param valor recebe o valor de saúde física do aluno.
	 */
	public void defineSaudeFisica(String valor) {
		this.fisica = valor;
		this.emoji = "";
	}
	/**
	 * Define um emoji para ser adicionado ao status geral de saúde.
	 * @param valor recebe um emoji.
	 */
	public void definirEmoji(String valor) {
		this.emoji = valor;
	}
	/**
	 * Atribui a qualidade da saúde geral do aluno.
	 * @return retorna o valor da saúde geral do aluno.
	 */
	public String getStatusGeral() {
		if(this.mental.equals("fraca") && this.fisica.equals("boa")) {
			return "ok " + this.emoji;
		}else if(this.mental.equals("fraca") && this.fisica.equals("fraca")) 
		{
			return "fraca " + this.emoji;
		}else if(this.mental.equals("boa") && this.fisica.equals("fraca")) {
			return "ok " + this.emoji;
		}else {
			return "boa " + this.emoji;
		}
	}
}
