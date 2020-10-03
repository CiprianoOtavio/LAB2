package lab2;

/**
 * @author Ot�vio Cipriano
 * Matr�cula : 119210566
 *Define o status de sa�de do aluno, baseado em sua sa�de mental e f�sica.
 */
public class Saude {
	
	/**
	 * Atributo que define a sa�de mental do aluno.
	 */
	private String mental;
	/**
	 * Atributo que define a sa�de f�sica do aluno. 
	 */
	private String fisica;
	/**
	 * Atributo que define um emoji a ser adicionado ao status da sa�de do aluno.
	 */
	private String emoji;
	/**
	 * Constr�i um objeto Saude que define a sa�de do aluno.
	 */
	public Saude() {
		this.mental = "";
		this.fisica = "";
		this.emoji = "";
	}
	/**
	 * Atribui o valor "boa" ou "fraca" � sa�de mental do aluno.
	 * @param valor recebe o valor de sa�de mental do aluno.
	 */
	public void defineSaudeMental(String valor) {
		this.mental = valor;
		this.emoji = "";
	}
	/**
	 * Atribui o valor "boa" ou "fraca" � sa�de f�sica do aluno.
	 * @param valor recebe o valor de sa�de f�sica do aluno.
	 */
	public void defineSaudeFisica(String valor) {
		this.fisica = valor;
		this.emoji = "";
	}
	/**
	 * Define um emoji para ser adicionado ao status geral de sa�de.
	 * @param valor recebe um emoji.
	 */
	public void definirEmoji(String valor) {
		this.emoji = valor;
	}
	/**
	 * Atribui a qualidade da sa�de geral do aluno.
	 * @return retorna o valor da sa�de geral do aluno.
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
