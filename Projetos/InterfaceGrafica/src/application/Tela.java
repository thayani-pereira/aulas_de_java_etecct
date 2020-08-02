package application;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Tela extends JFrame implements ActionListener,	MouseListener{

	public Tela() {
		 JButton cancelar = new JButton("Cancelar");  
		    JButton ok = new JButton("ok");  
		    JTextField login = new JTextField();  
		    JPasswordField senha = new JPasswordField();  

	}
	
	JButton btnClique;
	JButton btnClique2;
	JTextField txtNome;
	JComboBox<String> combo1;
	JList<String> lista;
	JLabel imagem;
	private void init() {
		
		
		
		combo1 = new JComboBox<String>();
		combo1.setBounds(250, 200, 200, 50);
		combo1.addItem("SP");
		combo1.addItem("RJ");
		combo1.addItem("CE");
		add(combo1);
	
		
		imagem  = new JLabel();
		imagem.setBounds(350, 300, 200, 200);
//		imagem.setBackground(Color.BLACK);
//		imagem.setOpaque(true);
		ImageIcon icon = new ImageIcon("foto.png");
		Image bufferImage = icon.getImage().getScaledInstance(200, 200, Image.SCALE_FAST);
		
		imagem.setIcon(new ImageIcon(bufferImage));
		add(imagem);
		
		lista = new JList<String>();
		lista.setBounds(20, 300, 300, 250);
		add(lista);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		model.addElement("Elemento 1");
		
		lista.setModel(model);
		
		txtNome = new JTextField();
		//txtNome.setBounds(x, y, largura, altura);
		txtNome.setBounds(20, 200, 200, 50);
		add(txtNome);
		
		JLabel fundo = new JLabel();
		fundo.setBounds(0, 0, getWidth(), getHeight());
		fundo.setOpaque(true);
		fundo.setBackground(Color.BLUE);
		add(fundo);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String nome = txtNome.getText();
		String estado = combo1.getSelectedItem().toString();
		if(arg0.getSource().equals(btnClique)) {
			JOptionPane.showMessageDialog(null, "ola "+nome+" "+estado);
			DefaultListModel<String> model = (DefaultListModel) lista.getModel();
			model.addElement(nome+" "+estado);
		
		
		}else if(arg0.getSource().equals(btnClique2)) {
			JOptionPane.showMessageDialog(null, "Bem vindo(a) "+nome+" "+estado);		
			Tela2 t = new Tela2();
			dispose();// fechar apenas a tela atual
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		btnClique.setVisible(false);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		btnClique.setVisible(true);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
}

