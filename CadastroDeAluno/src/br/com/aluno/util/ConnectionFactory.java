package br.com.aluno.util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConnectionFactory {
	public static Connection getConnection() throws Exception{
		
		try {
			//indica o db e aponta para o driver
			Class.forName("com.mysql.jdbc.Driver");
			//conexao com o db
			String login = "root";
			String senha = "";
			String url = "jdbc:mysql://localhost:3306/cadastroaluno";
			return DriverManager.getConnection(url,login,senha);
			
			}
		catch(Exception e) {
			throw new Exception (e.getMessage());
			
			}
		
		}
	
	}


