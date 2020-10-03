package lab2;
import java.util.Scanner;
public class Coisa {

	public static void main(String[] args) {
		Aluno estudante = new Aluno();
		Scanner ler = new Scanner(System.in);
		/**
		 * Mantém o programa recebendo dados enquanto não seja a palavra "SAIR".
		 */
		while(true) {
			String dados = ler.nextLine();
			if(dados.equals("SAIR")) {
				ler.close();
				break;
			}else {
				String[] info = dados.split(" ");
				/**
				 * Define e exibe informações a respeito da conta do laboratório do aluno.
				 */
				if(info[0].equals("LABORATORIO")){
					if(info.length == 2) {
						estudante.cadastraLaboratorio(info[1]);
					}else {
						estudante.cadastraLaboratorio(info[1], Integer.parseInt(info[2]));
					}
				}else if(info[0].equals("CONSOME")) {
					estudante.consomeEspaco(info[1], Integer.parseInt(info[2]));
				}else if(info[0].equals("LIBERA")) {
					estudante.liberaEspaco(info[1], Integer.parseInt(info[2]));
				}else if(info[0].equals("ATINGIU")) {
					System.out.println(estudante.atingiuCota(info[1]));
				}else if(info[0].equals("TOSTRINGLAB")) {
					System.out.println(estudante.laboratorioToString(info[1]));
				}
				/**
				 * Define e exibe informações sobre as notas e o desempenho de determinada
				 *  disciplina na qual o aluno está matriculado.
				 */
				else if(info[0].equals("DISCIPLINA")) {
					estudante.cadastraDisciplina(info[1]);
				}else if(info[0].equals("HORAS")) {
					estudante.cadastraHoras(info[1], (Integer.parseInt(info[2])));
				}else if(info[0].equals("NOTA")) {
					estudante.cadastraNota(info[1], Integer.parseInt(info[2]), Integer.parseInt(info[3]));
				}else if(info[0].equals("APROVAÇÃO")) {
					System.out.println(estudante.aprovado(info[1]));
				}else if(info[0].equals("TOSTRINGDISCIPLINA")){
					System.out.println(estudante.disciplinaToString(info[1]));
				}
				/**
				 * Define e exibe informações sobre uma conta do aluno em uma determinada cantina. 
				 */
				else if(info[0].equals("CANTINA")) {
					estudante.cadastraCantina(info[1]);
				}else if(info[0].equals("LANCHE")) {
					estudante.cadastraLanche(info[1], Integer.parseInt(info[2]), Integer.parseInt(info[3]));
				}else if(info[0].equals("PAGAR")) {
					estudante.pagarConta(info[1], Integer.parseInt(info[2]));
				}else if(info[0].equals("FALTA")) {
					System.out.println(estudante.getFaltaPagar(info[1]));
				}else if(info[0].equals("TOSTRINGCANTINA")) {
					System.out.println(estudante.cantinaToString(info[1]));
				}
				/**
				 * Define e exibe informações sobre a saúde do aluno, tanto física como mental.
				 */
				else if(info[0].equals("MENTAL")) {
					estudante.defineSaudeMental(info[1]);
				}else if(info[0].equals("FISICA")) {
					estudante.defineSaudeFisica(info[1]);
				}else if(info[0].equals("SAUDEGERAL")) {
					System.out.println(estudante.getStatusGeral());
				}
			}
		}
	}
}