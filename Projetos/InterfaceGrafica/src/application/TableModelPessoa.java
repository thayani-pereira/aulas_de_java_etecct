package application;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TableModelPessoa extends AbstractTableModel{

	private ArrayList<Pessoa> pessoas;
	String[] titulo = new String[] {"Nome","E-mail","Telefone"};
	public TableModelPessoa(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	@Override
	public int getColumnCount() {
		return titulo.length;
	}

	@Override
	public int getRowCount() {
		return pessoas.size();
	}

	@Override
	public String getColumnName(int column) {
		return titulo[column];
	}
	@Override
	public Object getValueAt(int linha, int coluna) {
		switch (coluna) {
		case 0:
			return pessoas.get(linha).getNome();
		case 1:
			return pessoas.get(linha).getEmail();
		case 2:
			return pessoas.get(linha).getTelefone();
		default:
			break;
		}
		return null;
	}

}
