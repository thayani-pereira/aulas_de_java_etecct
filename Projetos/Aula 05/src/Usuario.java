import javax.swing.JOptionPane;

public class Usuario {
	public static void main(String[] args) {
		String usuario = JOptionPane.showInputDialog("Olá usuário, por favor digite seu nome:");
		JOptionPane.showMessageDialog(null, "Seja bem-vindo " + usuario);
	}
}
