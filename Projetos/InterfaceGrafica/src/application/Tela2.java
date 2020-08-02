package application;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tela2 extends JFrame{

	public Tela2() {
		setSize(600, 600);
		setTitle("Tela 2");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//fechar ao sair
		setLocationRelativeTo(null);
		init();
		setVisible(true);
	}

	JTable tabela;
	private void init() {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		for (int i = 0; i < 100; i++) {			
			pessoas.add(new Pessoa("Erico", "ericoveriscimo@gmail.com", "(11) 98324-3947"));
			pessoas.add(new Pessoa("Erico", "ericoveriscimo@gmail.com", "(11) 98324-3947"));
			pessoas.add(new Pessoa("Erico", "ericoveriscimo@gmail.com", "(11) 98324-3947"));
			pessoas.add(new Pessoa("Erico", "ericoveriscimo@gmail.com", "(11) 98324-3947"));
		}
		
		TableModelPessoa model = new TableModelPessoa(pessoas);
		tabela = new JTable();
		tabela.setModel(model);
		tabela.setBounds(20, 100, getWidth()-50, getHeight()-155);
		
		JScrollPane scroll = new JScrollPane(tabela);
		scroll.setBounds(20, 100, getWidth()-50, getHeight()-155);
		add(scroll);
	}
}

