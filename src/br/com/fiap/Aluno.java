/*rm93939 Pedro henrique chueiri
  *rm95614 Marco Antonio Martinez
  *rm95084 Lucas Guerra*/
package br.com.fiap;

import java.time.LocalDate;

public class Aluno {
	private int rm;
	private String nome;
	private int anoNascimento;

	public Aluno() {

	}

	public Aluno(int rm, String nome, int anoNascimento) {
		setRm(rm);
		setAnoNascimento(anoNascimento);
		this.nome = nome;
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		try {
			if (rm >= 80000 && rm <= 99999) {
				this.rm = rm;
			} else {
				throw new Exception("Valor fora da faixa permitida (80000 - 99999)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		LocalDate anoAtual = LocalDate.now();
		try {
			if (anoNascimento >= 1900 && anoNascimento <= anoAtual.getYear()) {
				this.anoNascimento = anoNascimento;
			} else {
				throw new Exception("Valor fora da faixa permitida (>= 1900)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public int calculaIdade(int anoAtual) {
		int idade = anoAtual - anoNascimento;
		return idade;

	}
}
