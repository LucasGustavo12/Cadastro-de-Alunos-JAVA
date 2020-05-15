package br.com.aluno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.aluno.model.Aluno;
import br.com.aluno.util.ConnectionFactory;

public class AlunoDAO {
	
	private Aluno aluno;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public AlunoDAO() throws Exception {
		try {
			conn = ConnectionFactory.getConnection();
		}catch(Exception e) {
			throw new Exception("Erro "+e.getMessage());
		}
		
	}
	//Metodo para Inserir um novo aluno
	public void Salvar(Aluno aluno)throws Exception {
		try {
			String sql = "INSERT INTO tbaluno (rgm,nome,nascimento,cpf,email,endereco,municipio,uf,celular,curso,campus,periodo) values (?,?,?,?,?,?,?,?,?,?,?,?)";
			
			ps = conn.prepareStatement(sql);
			ps.setInt(1, aluno.getRgm());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getDataNascimento());
			ps.setString(4, aluno.getCpf());
			ps.setString(5, aluno.getEmail());
			ps.setString(6, aluno.getEndereco());
			ps.setString(7, aluno.getMunicipio());
			ps.setString(8, aluno.getUf());
			ps.setString(9, aluno.getCelular());
			ps.setString(10, aluno.getCurso());
			ps.setString(11, aluno.getCampus());
			ps.setString(12, aluno.getPeriodo());

			ps.executeUpdate();
			
			
		}catch(Exception e) {
		
			throw new Exception("Erro ao salvar " + e.getMessage());
			
		}

	}
	//Método para listar todos os Alunos
	public List listarTodos() throws Exception {
		try {
		List<Aluno> lista = new ArrayList<Aluno>();
		ps = conn.prepareStatement("SELECT * FROM tbaluno");
		rs = ps.executeQuery();
		while(rs.next()) {
			int Rgm = rs.getInt("rgm");
			String Nome = rs.getString("nome");
			String DataNascimento = rs.getString("data");
			String Cpf = rs.getString("cpf");
			String Email = rs.getString("email");
			String Endereco = rs.getString ("endereco");
			String Municipio = rs.getString("municipio");
			String Uf = rs.getString("uf");
			String Celular = rs.getString("celular");
			String Curso = rs.getString("curso");
			String Campus = rs.getString("campus");
			String Periodo = rs.getString("periodo");
			
			aluno = new Aluno(Rgm, Nome, DataNascimento, Cpf, Email, Endereco, Municipio, Uf, Celular, Curso, Campus, Periodo);
			lista.add(aluno);
		}
		return lista;
		
			
		}catch(Exception e) {
			throw new Exception("Erro ao listar " + e.getMessage());
		}
	}
	//Método Consultar 
	public Aluno Consultar(int Rgm) throws Exception {
		try {
		ps = conn.prepareStatement("SELECT * FROM tbaluno WHERE rgm=?");
		ps.setInt(1, Rgm);
		rs = ps.executeQuery();
		if(rs.next()) {
			String Nome = rs.getString("nome");
			String DataNascimento = rs.getString("nascimento");
			String Cpf = rs.getString("cpf");
			String Email = rs.getString("email");
			String Endereco = rs.getString ("endereco");
			String Municipio = rs.getString("municipio");
			String Uf = rs.getString("uf");
			String Celular = rs.getString("celular");
			String Curso = rs.getString("curso");
			String Campus = rs.getString("campus");
			String Periodo = rs.getString("periodo");

			aluno = new Aluno(Rgm, Nome, DataNascimento, Cpf, Email, Endereco, Municipio, Uf, Celular, Curso, Campus, Periodo);
			
		}
		return aluno;
		
			
		}catch(Exception e) {
			throw new Exception("Erro ao listar " + e.getMessage());
		}
	}
	//Método Excluir
	public void Excluir(int Rgm) throws Exception{
		try {
			String sql = "DELETE FROM tbaluno " + "WHERE rgm=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, Rgm);
			ps.executeUpdate();

		}catch(Exception e) {
			throw new Exception("Erro ao excluir " + e.getMessage());
		}
	}

	

	//Método para alterar alunos
	public void Alterar(Aluno aluno) throws Exception{
		try {
			String sql = "UPDATE tbaluno SET nome=?, nascimento=?, cpf=?, email=?, endereco=?, municipio=?, uf=?, celular=?, curso=?, campus=?, periodo=? WHERE rgm=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getDataNascimento());
			ps.setString(3, aluno.getCpf());
			ps.setString(4, aluno.getEmail());
			ps.setString(5, aluno.getEndereco());
			ps.setString(6, aluno.getMunicipio());
			ps.setString(7, aluno.getUf());
			ps.setString(8, aluno.getCelular());
			ps.setString(9, aluno.getCurso());
			ps.setString(10, aluno.getCampus());
			ps.setString(11, aluno.getPeriodo());
			ps.setInt(12, aluno.getRgm());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso!");
			
		}catch(Exception e) {
			throw new Exception("Erro ao alterar " + e.getMessage());
		
		}
	}
}
