package br.com.aluno.model;

public class Disciplina {
	
	private int Rgm;
	private String Disciplina;
	private String Semestre;
	private String Nota;
	private String Falta;
	
	public Disciplina() {
		
	
	}

	public Disciplina(int rgm, String disciplina, String semestre, String nota, String falta) {
		this.Disciplina = disciplina;
		this.Semestre = semestre;
		this.Nota = nota;
		this.Falta = falta;
	}

	public String getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}

	public String getSemestre() {
		return Semestre;
	}

	public void setSemestre(String semestre) {
		Semestre = semestre;
	}

	public String getNota() {
		return Nota;
	}

	public void setNota(String nota) {
		Nota = nota;
	}

	public String getFalta() {
		return Falta;
	}

	public void setFalta(String falta) {
		Falta = falta;
	}

	public int getRgm() {
		return Rgm;
	}

	public void setRgm(int rgm) {
		Rgm = rgm;
	}

	
}
