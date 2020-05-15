package br.com.aluno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.aluno.model.Aluno;
import br.com.aluno.model.Disciplina;
import br.com.aluno.util.ConnectionFactory;

public class DisciplinaDAO {
	private Disciplina disciplina;
	private Aluno aluno;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	public DisciplinaDAO() throws Exception {
		try {
			conn = ConnectionFactory.getConnection();
		}catch(Exception e) {
			throw new Exception("Erro "+e.getMessage());
		}
		
	}
	
	//Metodo para Inserir
		public void Salvar(Disciplina disciplina)throws Exception {
			try {
				String sql = "INSERT INTO tbdisciplina (rgm,disciplina,semestre,nota,falta) values (?,?,?,?,?)";
				
				ps = conn.prepareStatement(sql);
				ps.setInt(1, disciplina.getRgm());
				ps.setString(2, disciplina.getDisciplina());
				ps.setString(3, disciplina.getSemestre());
				ps.setString(4, disciplina.getNota());
				ps.setString(5, disciplina.getFalta());
			
				ps.executeUpdate();
				
				
			}catch(Exception e) {
			
				throw new Exception("Erro ao salvar " + e.getMessage());
			
				
			}

	}
		//Método para alterar Disciplina
		public void Alterar2(Disciplina disciplina) throws Exception{
			try {
				String sql = "UPDATE INTO tbdisciplina SET disciplina=?, semestre=?, nota=?, falta=? "+" WHERE rgm=?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, disciplina.getDisciplina());
				ps.setString(2, disciplina.getSemestre());
				ps.setString(3, disciplina.getNota());
				ps.setString(4, disciplina.getFalta());
				ps.setInt(5, disciplina.getRgm());
				
				ps.executeUpdate();

			}catch(Exception e) {
				throw new Exception("Erro ao alterar " + e.getMessage());
			}
		}
		
		public void Excluir2(int Rgm) throws Exception{
			try {
				String sql = "DELETE FROM tbdisciplina "+ "WHERE rgm=? ";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, Rgm);
				ps.executeUpdate();

			}catch(Exception e) {
				throw new Exception("Erro ao excluir " + e.getMessage());
			}
		}
		
		public Disciplina Consultar2(int Rgm) throws Exception {
			try {
			ps = conn.prepareStatement("SELECT * FROM tbdisciplina WHERE rgm=?");
			ps.setInt(1, Rgm);
			rs = ps.executeQuery();
			if(rs.next()) {
				String Disciplina = rs.getString("disciplina");
				String Semestre = rs.getString("semestre");
				String Nota = rs.getString("nota");
				String Falta = rs.getString("falta");
				

				disciplina = new Disciplina(Rgm, Disciplina, Semestre, Nota, Falta);
				
			}
			return disciplina;
			
				
			}catch(Exception e) {
				throw new Exception("Erro ao listar " + e.getMessage());
			}
		}
		
}
