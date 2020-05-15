package br.com.aluno.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.aluno.dao.AlunoDAO;
import br.com.aluno.dao.DisciplinaDAO;
import br.com.aluno.model.Aluno;
import br.com.aluno.model.Disciplina;

import javax.swing.ImageIcon;
import java.awt.TextArea;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;
	private JSeparator separator;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField txtRgm;
	private JLabel lblNewLabel_1;
	private JTextField txtNome;
	private JLabel lblNewLabel_2;
	private JTextField txtData;
	private JLabel lblNewLabel_3;
	private JTextField txtCpf;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField txtEmail;
	private JTextField txtEndereco;
	private JTextField txtMuni;
	private JLabel lblNewLabel_7;
	private JComboBox cmbUF;
	private JLabel lblNewLabel_8;
	private JTextField txtCel;
	private JPanel panel_1;
	private JLabel lblNewLabel_9;
	private JComboBox cmbCurso;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JComboBox cmbCampus;
	private JRadioButton rbtMatutino;
	private JRadioButton rbtVespertino;
	private JRadioButton rbtNoturno;
	private JButton btnNovo;
	private JButton btnSalvar;
	private JButton btnExcluir;
	private JButton btnSair;
	private final ButtonGroup btgPeriodo = new ButtonGroup();
	private JPanel panel_2;
	private JLabel lblNewLabel_12;
	private JTextField txtRgmA;
	private JLabel lblAluno;
	private JLabel lblCurso;
	private JLabel lblNewLabel_13;
	private JComboBox cmbDisciplina;
	private Label label;
	private JComboBox cmbSemestre;
	private JLabel lblNewLabel_14;
	private JComboBox cmbNota;
	private JLabel lblNewLabel_15;
	private JTextField txtFalta;
	private JButton btnConsultar;
	private JButton btnSalvar2;
	private JButton btnAlterar2;
	private JButton btnExcluir2;
	private JButton btnLimpar2;
	private JPanel panel_3;
	private Aluno aluno;
	private AlunoDAO dao;
	private JButton btnAlterar;
	private DisciplinaDAO dao1;
	private Disciplina disciplina;
	private JButton btnSair2;
	private JButton btnConsultar3;
	private JLabel lblNewLabel_16;
	private JTextField txtRgmC;
	private JLabel lblNewLabel_17;
	private Label lblNomeA;
	private JLabel lblAlunoNome;
	private JLabel Curso;
	private JLabel lblCursoAluno;
	private JLabel lblNewLabel_18;
	private JLabel lblNota;
	private JLabel lblNewLabel_19;
	private JLabel lblDisciplina;
	private JLabel lblNewLabel20;
	private JLabel lblFalta;
	private JButton btnExit;
	private JButton btnLimpar3;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 337);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Aluno");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Salvar");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Alterar");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Consultar");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Excluir");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		separator = new JSeparator();
		mnNewMenu.add(separator);
		
		mntmNewMenuItem_4 = new JMenuItem("Sair");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.SHIFT_MASK));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		mnNewMenu_1 = new JMenu("Notas e Faltas");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_5 = new JMenuItem("Salvar");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		mntmNewMenuItem_6 = new JMenuItem("Alterar");
		mntmNewMenuItem_6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		mntmNewMenuItem_7 = new JMenuItem("Excluir");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_8 = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		mnNewMenu_2 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_9 = new JMenuItem("Sobre");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=========
				JOptionPane.showMessageDialog(null,"Informações do Menu");
				
				//=========
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_9);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(21, 23, 471, 229);
		contentPane.add(tabbedPane);
		
		panel = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panel, null);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("RGM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 32, 17);
		panel.add(lblNewLabel);
		
		txtRgm = new JTextField();
		txtRgm.setBounds(52, 11, 115, 20);
		panel.add(txtRgm);
		txtRgm.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(177, 15, 41, 17);
		panel.add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(228, 11, 228, 20);
		panel.add(txtNome);
		
		lblNewLabel_2 = new JLabel("Data de Nascimento");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 53, 138, 17);
		panel.add(lblNewLabel_2);
		
		txtData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		txtData.setBounds(152, 53, 69, 20);
		panel.add(txtData);
		txtData.setColumns(10);
		
		lblNewLabel_3 = new JLabel("CPF");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(226, 56, 27, 17);
		panel.add(lblNewLabel_3);
		
		txtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-#"));
		txtCpf.setColumns(10);
		txtCpf.setBounds(263, 53, 193, 20);
		panel.add(txtCpf);
		
		lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 92, 36, 17);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("End.");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 125, 31, 17);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Munic\u00EDpio");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(8, 161, 64, 17);
		panel.add(lblNewLabel_6);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(53, 92, 403, 20);
		panel.add(txtEmail);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(56, 125, 400, 20);
		panel.add(txtEndereco);
		
		txtMuni = new JTextField();
		txtMuni.setColumns(10);
		txtMuni.setBounds(78, 161, 137, 20);
		panel.add(txtMuni);
		
		lblNewLabel_7 = new JLabel("UF");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(224, 161, 18, 17);
		panel.add(lblNewLabel_7);
		
		cmbUF = new JComboBox();
		cmbUF.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cmbUF.setBounds(252, 158, 42, 20);
		panel.add(cmbUF);
		
		lblNewLabel_8 = new JLabel("Celular\r\n");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(298, 161, 47, 17);
		panel.add(lblNewLabel_8);
		
		txtCel = new JFormattedTextField(new MaskFormatter("(##)####-#####"));
		txtCel.setBounds(349, 158, 107, 20);
		panel.add(txtCel);
		txtCel.setColumns(10);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Curso", null, panel_1, null);
		panel_1.setLayout(null);
		
		lblNewLabel_9 = new JLabel("Curso");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(30, 11, 56, 17);
		panel_1.add(lblNewLabel_9);
		
		cmbCurso = new JComboBox();
		cmbCurso.setModel(new DefaultComboBoxModel(new String[] {"Analise e Desenvolvimento de Sistemas", "Redes de Computadores", "Sistemas de Informa\u00E7\u00E3o", "Ci\u00EAncias da Computa\u00E7\u00E3o"}));
		cmbCurso.setBounds(118, 10, 337, 20);
		panel_1.add(cmbCurso);
		
		lblNewLabel_10 = new JLabel("Campus");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(26, 50, 56, 17);
		panel_1.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Per\u00EDodo");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setBounds(29, 89, 53, 17);
		panel_1.add(lblNewLabel_11);
		
		cmbCampus = new JComboBox();
		cmbCampus.setModel(new DefaultComboBoxModel(new String[] {"Tatuap\u00E9", "An\u00E1lia Franco", "Barra Funda", "Centro - SP", "Cidade Tiradentes", "Freguesia do \u00D3", "Guaianazes", " Itaquera", "Jabaquara"}));
		cmbCampus.setBounds(118, 50, 337, 20);
		panel_1.add(cmbCampus);
		
		rbtMatutino = new JRadioButton("Matutino");
		rbtMatutino.setSelected(true);
		btgPeriodo.add(rbtMatutino);
		rbtMatutino.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbtMatutino.setBounds(117, 88, 87, 25);
		panel_1.add(rbtMatutino);
		
		rbtVespertino = new JRadioButton("Vespertino");
		btgPeriodo.add(rbtVespertino);
		rbtVespertino.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbtVespertino.setBounds(214, 88, 101, 25);
		panel_1.add(rbtVespertino);
		
		rbtNoturno = new JRadioButton("Noturno");
		btgPeriodo.add(rbtNoturno);
		rbtNoturno.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbtNoturno.setBounds(322, 88, 85, 25);
		panel_1.add(rbtNoturno);
		
		btnNovo = new JButton("");
		btnNovo.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Novo.png"));
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//================
				
				txtRgm.setText(null);
				txtNome.setText(null);
				txtData.setText(null);
				txtCpf.setText(null);
				txtEmail.setText(null);
				txtEndereco.setText(null);
				txtMuni.setText(null);
				cmbUF.setSelectedIndex(0);
				txtCel.setText(null);
				cmbCurso.setSelectedIndex(0);
				cmbCampus.setSelectedIndex(0);
				btgPeriodo.clearSelection();
			
				//===============
			}
		});
		btnNovo.setBounds(197, 142, 57, 47);
		panel_1.add(btnNovo);
		
		btnSalvar = new JButton("");
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Salvar.png"));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=================
				try {
				aluno = new Aluno();
				
				aluno.setRgm(Integer.parseInt(txtRgm.getText()));
				aluno.setNome(txtNome.getText());
				aluno.setDataNascimento(txtData.getText());
				aluno.setCpf(txtCpf.getText());
				aluno.setEmail(txtEmail.getText());
				aluno.setEndereco(txtEndereco.getText());
				aluno.setMunicipio(txtMuni.getText());
				aluno.setUf((String)cmbUF.getSelectedItem());
				aluno.setCelular(txtCel.getText());
				aluno.setCurso((String)cmbCurso.getSelectedItem());
				aluno.setCampus((String)cmbCampus.getSelectedItem());
				if(rbtMatutino.isSelected()) {aluno.setPeriodo("Manhã");}
				else if(rbtNoturno.isSelected()) {aluno.setPeriodo("Noite");}
				else {aluno.setPeriodo("tarde");}
				
				dao = new AlunoDAO();
				dao.Salvar(aluno);
				
				
				}catch(Exception e1){
					
					JOptionPane.showInputDialog(null,"Erro ao gravar aluno"+e1);
				
				}
				
				//================
			}
		});
		btnSalvar.setBounds(107, 142, 63, 47);
		panel_1.add(btnSalvar);
		
		btnExcluir = new JButton("");
		btnExcluir.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Excluir.png"));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=================
				try {
			
				
				
				int codigo = Integer.parseInt(txtRgm.getText());
				
				dao = new AlunoDAO();
				dao.Excluir(codigo);
				JOptionPane.showConfirmDialog(null,"Aluno Excluido com sucesso!");
				
				
				}catch(Exception e1){
					
					JOptionPane.showConfirmDialog(null,"Erro ao Excluir aluno"+e1);
				
				}
				
				//================
			}
		});
		btnExcluir.setBounds(367, 142, 63, 47);
		panel_1.add(btnExcluir);
		
		btnSair = new JButton("");
		btnSair.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Sair.png"));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//===========
				System.exit(0);
				//===========
			}
		});
		btnSair.setBounds(26, 142, 56, 47);
		panel_1.add(btnSair);
		
		btnAlterar = new JButton("");
		btnAlterar.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Alterar.png"));
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//=================
				try {
					
				aluno = new Aluno();
				
				aluno.setRgm(Integer.parseInt(txtRgm.getText()));
				aluno.setNome(txtNome.getText());
				aluno.setDataNascimento(txtData.getText());
				aluno.setCpf(txtCpf.getText());
				aluno.setEmail(txtEmail.getText());
				aluno.setEndereco(txtEndereco.getText());
				aluno.setMunicipio(txtMuni.getText());
				aluno.setUf((String)cmbUF.getSelectedItem());
				aluno.setCelular(txtCel.getText());
				aluno.setCurso((String)cmbCurso.getSelectedItem());
				aluno.setCampus((String)cmbCampus.getSelectedItem());
				if(rbtMatutino.isSelected()) {aluno.setPeriodo("Manhã");}
				else if(rbtNoturno.isSelected()) {aluno.setPeriodo("Noite");}
				else {aluno.setPeriodo("tarde");}
				
				dao = new AlunoDAO();
				dao.Alterar(aluno);
				
				
				}catch(Exception e1){
					
					JOptionPane.showInputDialog(null,"Erro ao Alterar aluno"+e1);
				
				}
				
				//================
			}
		});
		btnAlterar.setBounds(278, 142, 63, 47);
		panel_1.add(btnAlterar);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, panel_2, null);
		panel_2.setLayout(null);
		
		lblNewLabel_12 = new JLabel("RGM");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(10, 21, 46, 14);
		panel_2.add(lblNewLabel_12);
		
		txtRgmA = new JTextField();
		txtRgmA.setBounds(71, 18, 128, 20);
		panel_2.add(txtRgmA);
		txtRgmA.setColumns(10);
		
		lblAluno = new JLabel("");
		lblAluno.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 0, 0), Color.RED));
		lblAluno.setBounds(209, 18, 247, 20);
		panel_2.add(lblAluno);
		
		lblCurso = new JLabel("");
		lblCurso.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.RED, Color.RED));
		lblCurso.setBounds(69, 46, 387, 20);
		panel_2.add(lblCurso);
		
		lblNewLabel_13 = new JLabel("Disciplina");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13.setBounds(10, 81, 80, 14);
		panel_2.add(lblNewLabel_13);
		
		cmbDisciplina = new JComboBox();
		cmbDisciplina.setModel(new DefaultComboBoxModel(new String[] {"Programa\u00E7\u00E3o Orientada a Objetos", "Fundamentos de Estrutura de dados", "Projeto Interdiciplinar", "Banco de Dados", "T\u00E9cnicas de Programa\u00E7\u00E3o"}));
		cmbDisciplina.setBounds(94, 78, 362, 20);
		panel_2.add(cmbDisciplina);
		
		label = new Label("Semestre");
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		label.setBounds(10, 113, 80, 22);
		panel_2.add(label);
		
		cmbSemestre = new JComboBox();
		cmbSemestre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbSemestre.setModel(new DefaultComboBoxModel(new String[] {"2020-1", "2020-2", "2021-1", "2021-2"}));
		cmbSemestre.setBounds(94, 115, 73, 20);
		panel_2.add(cmbSemestre);
		
		lblNewLabel_14 = new JLabel("Nota");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_14.setBounds(188, 117, 46, 14);
		panel_2.add(lblNewLabel_14);
		
		cmbNota = new JComboBox();
		cmbNota.setModel(new DefaultComboBoxModel(new String[] {"0", "0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10"}));
		cmbNota.setBounds(236, 115, 46, 20);
		panel_2.add(cmbNota);
		
		lblNewLabel_15 = new JLabel("Faltas");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_15.setBounds(304, 118, 46, 14);
		panel_2.add(lblNewLabel_15);
		
		txtFalta = new JTextField();
		txtFalta.setBounds(354, 115, 102, 20);
		panel_2.add(txtFalta);
		txtFalta.setColumns(10);
		
		btnConsultar = new JButton("");
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Consulta.png"));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//===============
				
				try {
					dao = new AlunoDAO();
					int codigo = Integer.parseInt(txtRgmA.getText());
					aluno = dao.Consultar(codigo);
					lblAluno.setText(aluno.getNome());
					lblCurso.setText(aluno.getCurso());
			
					}catch (Exception e){
					
					lblAluno.setText("Aluno não existe");
					
					
				}
				
				//=============
			}
		});
		btnConsultar.setBounds(26, 141, 64, 49);
		panel_2.add(btnConsultar);
		
		btnSalvar2 = new JButton("");
		btnSalvar2.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Salvar.png"));
		btnSalvar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//=========
				
				try {
					
					disciplina = new Disciplina();
					
					disciplina.setRgm(Integer.parseInt(txtRgmA.getText()));
					disciplina.setDisciplina((String)cmbDisciplina.getSelectedItem());
					disciplina.setSemestre((String)cmbSemestre.getSelectedItem());
					disciplina.setNota((String)cmbNota.getSelectedItem());
					disciplina.setFalta((String)(txtFalta.getText()));
					
					dao1 = new DisciplinaDAO();
					dao1.Salvar(disciplina);
					
					
					}catch(Exception e1){
						
						JOptionPane.showInputDialog(null,"Erro ao gravar Disciplina"+e1);
						
					
					}
				
				
				//=========
			}
		});
		btnSalvar2.setBounds(98, 141, 63, 49);
		panel_2.add(btnSalvar2);
		
		btnAlterar2 = new JButton("");
		btnAlterar2.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Alterar.png"));
		btnAlterar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//============
				try {
					disciplina = new Disciplina();
					
					disciplina.setRgm(Integer.parseInt(txtRgmA.getText()));
					disciplina.setDisciplina((String)(cmbDisciplina.getSelectedItem()));
					disciplina.setSemestre((String)(cmbSemestre.getSelectedItem()));
					disciplina.setNota((String)(cmbNota.getSelectedItem()));
					disciplina.setFalta(txtFalta.getText());
					
					
					dao1 = new DisciplinaDAO();
					dao1.Alterar2(disciplina);
					
					
					}catch(Exception e1){
						
						JOptionPane.showInputDialog(null,"Erro ao Alterar aluno"+e1);
					
					}
				
				
				
				
				//============
				
			}
		});
		btnAlterar2.setBounds(167, 142, 63, 48);
		panel_2.add(btnAlterar2);
		
		btnExcluir2 = new JButton("");
		btnExcluir2.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Excluir.png"));
		btnExcluir2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//=================
				try {
			
				
				
				int codigo = Integer.parseInt(txtRgmA.getText());
				
				dao1 = new DisciplinaDAO();
				dao1.Excluir2(codigo);
				
				
				
				}catch(Exception e1){
					
					JOptionPane.showConfirmDialog(null,"Erro ao Excluir Disciplina"+e1);
				
				}
				
				//================
			}
		});
		btnExcluir2.setBounds(236, 143, 63, 47);
		panel_2.add(btnExcluir2);
		
		btnLimpar2 = new JButton("");
		btnLimpar2.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Novo.png"));
		btnLimpar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//================
				txtRgmA.setText(null);
				lblAluno.setText(null);
				lblCurso.setText(null);
				cmbDisciplina.setSelectedIndex(0);
				cmbSemestre.setSelectedIndex(0);
				cmbNota.setSelectedIndex(0);
				txtFalta.setText(null);
				//===============
			}
		});
		btnLimpar2.setBounds(304, 143, 63, 47);
		panel_2.add(btnLimpar2);
		
		btnSair2 = new JButton("");
		btnSair2.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Sair.png"));
		btnSair2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//============
				System.exit(0);
				//============
			}
		});
		btnSair2.setBounds(374, 143, 63, 47);
		panel_2.add(btnSair2);
		
		panel_3 = new JPanel();
		tabbedPane.addTab("Boletim", null, panel_3, null);
		panel_3.setLayout(null);
		
		lblNewLabel_16 = new JLabel("Boletim do Aluno");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_16.setBounds(10, 11, 151, 24);
		panel_3.add(lblNewLabel_16);
		
		btnConsultar3 = new JButton("");
		btnConsultar3.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Consulta.png"));
		btnConsultar3.setBounds(211, 11, 62, 47);
		panel_3.add(btnConsultar3);
		
		txtRgmC = new JTextField();
		txtRgmC.setBounds(104, 36, 89, 20);
		panel_3.add(txtRgmC);
		txtRgmC.setColumns(10);
		
		lblNewLabel_17 = new JLabel("Digite o RGM:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_17.setBounds(10, 40, 89, 14);
		panel_3.add(lblNewLabel_17);
		
		lblNomeA = new Label("Aluno:");
		lblNomeA.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNomeA.setBounds(20, 81, 62, 22);
		panel_3.add(lblNomeA);
		
		lblAlunoNome = new JLabel("");
		lblAlunoNome.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.RED, Color.RED));
		lblAlunoNome.setBounds(98, 81, 200, 22);
		panel_3.add(lblAlunoNome);
		
		Curso = new JLabel("Curso: ");
		Curso.setFont(new Font("Tahoma", Font.BOLD, 15));
		Curso.setBounds(20, 122, 62, 14);
		panel_3.add(Curso);
		
		lblCursoAluno = new JLabel("");
		lblCursoAluno.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.RED, Color.RED));
		lblCursoAluno.setBounds(97, 116, 200, 22);
		panel_3.add(lblCursoAluno);
		
		lblNewLabel_18 = new JLabel("Nota:");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_18.setBounds(308, 81, 50, 17);
		panel_3.add(lblNewLabel_18);
		
		lblNota = new JLabel("");
		lblNota.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.RED, Color.RED));
		lblNota.setBounds(365, 81, 56, 22);
		panel_3.add(lblNota);
		
		lblNewLabel_19 = new JLabel("Disciplina:");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_19.setBounds(10, 154, 79, 19);
		panel_3.add(lblNewLabel_19);
		
		lblDisciplina = new JLabel("");
		lblDisciplina.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.RED, Color.RED));
		lblDisciplina.setBounds(98, 147, 200, 22);
		panel_3.add(lblDisciplina);
		
		lblNewLabel20 = new JLabel("Faltas:");
		lblNewLabel20.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel20.setBounds(308, 147, 51, 19);
		panel_3.add(lblNewLabel20);
		
		lblFalta = new JLabel("");
		lblFalta.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.RED, Color.RED));
		lblFalta.setBounds(367, 147, 56, 22);
		panel_3.add(lblFalta);
		
		btnExit = new JButton("");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Sair.png"));
		btnExit.setBounds(283, 11, 62, 47);
		panel_3.add(btnExit);
		
		btnLimpar3 = new JButton("");
		btnLimpar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//===========
				txtRgmC.setText(null);
				lblAlunoNome.setText(null);
				lblCursoAluno.setText(null);
				lblDisciplina.setText(null);
				lblNota.setText(null);
				lblFalta.setText(null);
				//===========
				
			}
		});
		btnLimpar3.setIcon(new ImageIcon("C:\\Users\\NEXOS-PRO\\Desktop\\Icones\\Novo.png"));
		btnLimpar3.setBounds(355, 11, 66, 47);
		panel_3.add(btnLimpar3);
		btnConsultar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//==============
				try {
					
					dao1= new DisciplinaDAO();
					dao = new AlunoDAO();
					int codigo = Integer.parseInt(txtRgmC.getText());
					aluno = dao.Consultar(codigo);
					lblAlunoNome.setText(aluno.getNome());
					lblCursoAluno.setText(aluno.getCurso());
					lblDisciplina.setText(disciplina.getDisciplina());
					lblNota.setText(disciplina.getNota());
					lblFalta.setText(disciplina.getFalta());
					
					}catch (Exception e1){
					
					lblAlunoNome.setText("Aluno não encontrado");
					
					
				}
				
			}
			
			
			   //=============
		});
	}
}
