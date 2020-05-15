package br.com.aluno.model;

public class Aluno {
	
	private int Rgm;
	private String Nome;
	private String DataNascimento;
	private String Cpf;
	private String Email;
	private String Endereco;
	private String Municipio;
	private String Uf;
	private String Celular;
	private String Curso;
	private String Campus;
	private String Periodo;
	
	public Aluno() {
		
	
	}

	public Aluno(int rgm, String nome, String dataNascimento, String cpf, String email, String endereco, String municipio, String uf,
			String celular, String curso, String campus, String periodo) {
		
		super();
		this.Rgm = rgm;
		this.Nome = nome;
		this.DataNascimento = dataNascimento;
		this.Cpf = cpf;
		this.Email = email;
		this.Endereco = endereco;
		this.Municipio = municipio;
		this.Uf = uf;
		this.Celular = celular;
		this.Curso = curso;
		this.Campus = campus;
		this.Periodo = periodo;
	}

	public int getRgm() {
		return Rgm;
	}

	public void setRgm(int rgm) {
		Rgm = rgm;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getMunicipio() {
		return Municipio;
	}

	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}

	public String getUf() {
		return Uf;
	}

	public void setUf(String uf) {
		Uf = uf;
	}

	public String getCelular() {
		return Celular;
	}

	public void setCelular(String celular) {
		Celular = celular;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}

	public String getCampus() {
		return Campus;
	}

	public void setCampus(String campus) {
		Campus = campus;
	}

	public String getPeriodo() {
		return Periodo;
	}

	public void setPeriodo(String periodo) {
		Periodo = periodo;
	}


	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}


}
