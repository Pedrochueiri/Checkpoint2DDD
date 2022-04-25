/*rm93939 Pedro henrique chueiri
  *rm95614 Marco Antonio Martinez
  *rm95084 Lucas Guerra*/
package br.com.fiap;

import java.time.LocalDate;

public class UsaAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno(93939, "Pedro", 2004);
		Aluno a4 = new Aluno(99696, "Magneto", 1980);
		LocalDate data = LocalDate.now();
		int anoAtual = data.getYear();

		a1.setRm(95084);
		a1.setNome("Lucas");
		a1.setAnoNascimento(2003);

		a2.setRm(95614);
		a2.setNome("Marco");
		a2.setAnoNascimento(1989);

		System.out.println("---------------------------------------------");
		System.out.println("RM: " + a1.getRm() + "\nNome: " + a1.getNome() + "\nIdade: " + a1.calculaIdade(anoAtual));
		System.out.println("---------------------------------------------");
		System.out.println("RM: " + a2.getRm() + "\nNome: " + a2.getNome() + "\nIdade: " + a2.calculaIdade(anoAtual));
		System.out.println("---------------------------------------------");
		System.out.println("RM: " + a3.getRm() + "\nNome: " + a3.getNome() + "\nIdade: " + a3.calculaIdade(anoAtual));
		System.out.println("---------------------------------------------");
		System.out.println("RM: " + a4.getRm() + "\nNome: " + a4.getNome() + "\nIdade: " + a4.calculaIdade(anoAtual));
		System.out.println("---------------------------------------------");
	}
}
